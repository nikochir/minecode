/* package */
package nikochir.execut;
/* include */
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
/* typedef */
/* MineCodeExecutor class
 * Description:
 * > ;
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
        return true;
    }
}