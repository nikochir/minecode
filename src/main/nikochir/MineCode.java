/* package */
package nikochir;
/* include */
import nikochir.execut.*;
import nikochir.listen.*;
import nikochir.permit.*;
/** javkit - standard utilities **/
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/** bukkit **/
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
/* typedef */
/*
 * MineCode class
 * > Description:
 * -> main plugin entry point;
*/
public final class MineCode extends JavaPlugin {
    /* members */
    private static MineCode objInstance;
    /* getters */
    public static MineCode get()                       { return objInstance; }
    public Player          getPlayer(String strPlayer) { return this.getServer().getPlayer(strPlayer); }
    public Boolean         getConfigBit(String strKey) { return this.getConfig().getBoolean(strKey); }
    public Integer         getConfigInt(String strKey) { return this.getConfig().getInt(strKey); }
    public Double          getConfigNum(String strKey) { return this.getConfig().getDouble(strKey); }
    public String          getConfigStr(String strKey) { return this.getConfig().getString(strKey); }
    public List<String>    getConfigArr(String strKey) { return this.getConfig().getStringList(strKey); }
    /* setters */
    /* vetters */
    /* actions */
    public void doLog(String strLog) {
        System.out.println(String.format("[%s]: %s", getConfigStr("nameof_main"), strLog));
    }
    /* handles */
    @Override
    public void onEnable() {
        /* init */
        objInstance = this;
        /* work */
        /** execut **/
        getServer().getPluginCommand("minecode").setExecutor(new MineCodeExecut());
        /** listen **/
        getServer().getPluginManager().registerEvents(new MineCodeListen(), this);
        /** permit **/
        getServer().getPluginManager().addPermission(new MineCodePermit());
        /* quit */
    }
    @Override
    public void onDisable() {
        /* init */
        /* work */
        /* quit */
        objInstance = null;
    }
}
/* endfile */