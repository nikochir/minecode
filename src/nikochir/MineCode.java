/* package */
package nikochir;
import nikochir.execut.*;
import nikochir.listen.*;
import nikochir.permit.*;
/** bukkit **/
import org.bukkit.plugin.java.JavaPlugin;
/* typedef */
/* MineCode class
 * Description:
 * > main plugin entry point;
*/
public final class MineCode extends JavaPlugin {
    /* codetor */
    /* getters */
    /* setters */
    /* vetters */
    /* command */
    /* onevent */
    @Override
    public void onEnable() {
        getServer().getPluginCommand("minecode").setExecutor(new MineCodeExecut());
        getServer().getPluginManager().registerEvents(new MineCodeListen(), this);
        getServer().getPluginManager().addPermission(new MineCodePermit());
    }
    @Override
    public void onDisable() {
    }
}