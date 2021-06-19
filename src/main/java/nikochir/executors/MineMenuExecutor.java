/* package */
package nikochir.executors;
/* include */
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.jetbrains.annotations.NotNull;
/* typedef */
/* MineMenuExecutor class
*/
public class MineMenuExecutor implements CommandExecutor {
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
