/* package */
package nikochir.minecode.execut;
/* include */
import nikochir.minecode.Main;
/** bukkit **/
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/** jbrain **/
import org.jetbrains.annotations.NotNull;
/* typedef */
/** Executor class
 * > Description:
 * -> main command to call any other main command of sub plugins;
*/
public class Execut implements CommandExecutor {
    /* handles */
    @Override
    public boolean onCommand(
        @NotNull CommandSender objSender,
        @NotNull Command objCommand,
        @NotNull String strLabel,
        @NotNull String[] strArgs
    ) {
        if ((objSender instanceof Player) == false) {
            Main.get().doLogO("not a player!");
            return false;
        }
        Player objPlayer = (Player) objSender;
        return true;
    }
}