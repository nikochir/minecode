/* package */
package nikochir.executors;
/* include */
import co.aikar.timings.TimingHistory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
/* typedef */
/* PlayTimeCommand class
 * Description:
 * -> ;
*/
public class MineCodeExecutor implements CommandExecutor {
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