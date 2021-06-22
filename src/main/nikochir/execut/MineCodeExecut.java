/* package */
package nikochir.execut;
/* include */
/** bukkit **/
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/** jbrain **/
import org.jetbrains.annotations.NotNull;
/* typedef */
/*
 * MineCodeExecutor class
 * > Description:
 * -> ;
*/
public class MineCodeExecut implements CommandExecutor {
    /* onevent */
    @Override
    public boolean onCommand(
        @NotNull CommandSender objSender,
        @NotNull Command objCommand,
        @NotNull String strLabel,
        @NotNull String[] strArgs
    ) {
        if (objSender instanceof Player) {
            Player objPlayer = (Player) objSender;
        } else { /* not player click */
        }
        return true;
    }
}