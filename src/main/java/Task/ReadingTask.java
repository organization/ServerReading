package Task;

import ServerReading.ServerReading;
import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.scheduler.PluginTask;
import cn.nukkit.utils.TextFormat;
import me.onebone.economyapi.EconomyAPI;

public class ReadingTask extends PluginTask<ServerReading> {

	public ReadingTask(ServerReading plugin) {
		super(plugin);

	}

	@Override
	public void onRun(int currentTick) {
		for (Player player : this.getOwner().getServer().getOnlinePlayers().values()) {

			String Name = player.getName();
			double UserMoney = EconomyAPI.getInstance().myMoney(player);
			int ServerPlayers = this.getOwner().getServer().getOnlinePlayers().size();
			int MaxSize = this.getOwner().getServer().getMaxPlayers();
			int MaxHp = player.getMaxHealth();
			int Hp = player.getHealth();
			Item item = player.getInventory().getItemInHand();
			
			
			player.sendPopup(TextFormat.GOLD + "[ Player View ] \n" + TextFormat.GOLD + "[ Name ]  : " + Name
					+ "\n" + TextFormat.GOLD + "[ MyMoney ]  : " + UserMoney + "   [ ServerUser ]  : " + ServerPlayers
					+ " / " + MaxSize + "\n" + TextFormat.GOLD + "[ HP / HandItem ]  : " + Hp + " / " + MaxHp + " , " + item);
		}
		}

}
