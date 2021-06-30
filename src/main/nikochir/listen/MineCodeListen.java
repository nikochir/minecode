/* package */
package nikochir.listen;
import org.bukkit.entity.Player;
/* include */
/** bukkit **/
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
/* typedef */
/* MineCodeListener class
 * > Description:
 * -> default event processor;
*/
public class MineCodeListen implements Listener {
    /* actions */
    private void ologPlayer(Player objPlayer) {
        System.out.format(
            "onPlayerJoin: { name: %s; time: %d; };\n",
            objPlayer.getName(),
            objPlayer.getPlayerTime()
        );
    }
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent objEvent) {
        ologPlayer(objEvent.getPlayer());
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent objEvent) {
        ologPlayer(objEvent.getPlayer());
    }
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent objEvent) {
        ologPlayer(objEvent.getPlayer());
    }
}
/* endfile */