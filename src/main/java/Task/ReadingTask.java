package Task;

import ServerReading.ServerReading;
import cn.nukkit.Player;
import cn.nukkit.scheduler.PluginTask;
import cn.nukkit.utils.TextFormat;
import me.onebone.economyapi.EconomyAPI;

public class ReadingTask extends PluginTask<ServerReading> {

	public ReadingTask(ServerReading plugin// ,Player player
	) {
		super(plugin);
		// this.player = player;
	}

	@Override
	public void onRun(int currentTick) {

		for (Player player : this.getOwner().getServer().getOnlinePlayers().values()) {

			String Name = player.getName();
			double UserMoney = EconomyAPI.getInstance().myMoney(player);
			int ServerPlayers = this.getOwner().getServer().getOnlinePlayers().size();
			int MaxSize = this.getOwner().getServer().getMaxPlayers();
			player.sendPopup(this.getOwner().getServer().getMotd() + "\n" + TextFormat.GOLD + "[ Name ]  : " + Name
					+ "\n" + TextFormat.GOLD + "[ MyMoney ]  : " + UserMoney + "   [ ServerUser ]  : " + ServerPlayers
					+ " / " + MaxSize);
		}
	}
}
