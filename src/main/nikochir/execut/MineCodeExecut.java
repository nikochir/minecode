/* package */
package nikochir.execut;
/* include */
import nikochir.MineCode;
/** bukkit **/
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/** jbrain **/
import org.jetbrains.annotations.NotNull;
/* typedef */
/* MineCodeExecutor class
 * > Description:
 * -> main command to call any other main command of sub plugins;
*/
public class MineCodeExecut implements CommandExecutor {
    /* handles */
    @Override
    public boolean onCommand(
        @NotNull CommandSender objSender,
        @NotNull Command objCommand,
        @NotNull String strLabel,
        @NotNull String[] strArgs
    ) {
        if ((objSender instanceof Player) == false) {
            MineCode.get().doLog("not a player!");
            return false;
        }
        Player objPlayer = (Player) objSender;
        return true;
    }
}