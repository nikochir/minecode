/* package */
package nikochir;
/* include */
import nikochir.execut.*;
import nikochir.listen.*;
import nikochir.permit.*;
/** bukkit **/
import org.bukkit.plugin.java.JavaPlugin;
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
    public static MineCode get() { return objInstance; }
    /* setters */
    /* vetters */
    /* command */
    /* onevent */
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
/* end_of_file */