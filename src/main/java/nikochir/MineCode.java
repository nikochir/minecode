/* package */
package nikochir;
/* include */
import org.bukkit.plugin.java.JavaPlugin;
import nikochir.executors.*;
import nikochir.listeners.*;
/* typedef */
/* PlayTime class
 * Description:
 * -> ;
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
        getServer().getPluginManager().registerEvents(new MineCodeListener(), this);
        getServer().getPluginCommand("open_guis").setExecutor(new MineMenuExecutor());
    }
    @Override
    public void onDisable() {
    }
}