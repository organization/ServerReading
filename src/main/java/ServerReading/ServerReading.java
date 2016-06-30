package ServerReading;

import cn.nukkit.plugin.PluginBase;
import Task.ReadingTask;
//import cn.nukkit.Player;
//import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
//import cn.nukkit.event.player.PlayerJoinEvent;

public class ServerReading extends PluginBase implements Listener {

	@Override
	public void onEnable() {
		this.getLogger().info("ServerReading플러그인 활성화!");
		this.getServer().getPluginManager().registerEvents(this, this);
this.getServer().getScheduler().scheduleRepeatingTask(new ReadingTask(this//, player
				), 10);
	}

	//@EventHandler
	//public void onJoin(PlayerJoinEvent event) {
		//Player player = event.getPlayer();
		

	//}

}
