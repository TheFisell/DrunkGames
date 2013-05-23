package de.Fisell.DrunkGames;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DrunkGames extends JavaPlugin {
	
	
	@Override
	public void onEnable(){
		System.out.println("[DrunkGames] Plugin enabled!");
	}

	@Override
	public void onDisable(){
		System.out.println("[DrunkGames] Plugin disabled!");
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args){
		
		
		if(!(sender instanceof Player)){
			sender.sendMessage("Command can only run by a player!");
		} else {

			//defining the player
			Player p = (Player) sender;

		//main command
		if (cmd.getName().equalsIgnoreCase("dg")) {
			//main permissions
			if (p.hasPermission("drunkgames.*")) {
				//length of args
				if (args.length == 0) {
					p.sendMessage(ChatColor.GOLD + "[DrunkGames] " + ChatColor.GRAY + "Plugin on version: 1.0");
					p.sendMessage(ChatColor.GREEN + "Type " + ChatColor.GRAY + "/" + ChatColor.GOLD + "drunkgames help" + " for help");
					//additional here

					return true;
				}

				if (args.length == 1 && args[0].equalsIgnoreCase("help")){
					p.sendMessage(ChatColor.GREEN + "-----==[DrunkGames help page 1/1]==-----");
					p.sendMessage(ChatColor.GREEN + "/dg - Shows the version of the plugin");
					p.sendMessage(ChatColor.GREEN + "/dgreload - Reloads the plugin");
					p.sendMessage(ChatColor.GREEN + "/dg help - Shows the help pages of drunkgames");
					p.sendMessage(ChatColor.GREEN + "/dgaddgame <name> - Adds an new game");
					p.sendMessage(ChatColor.GREEN + "/dgsetgameregion <game> - Sets the region where the players can jump");
					p.sendMessage(ChatColor.GREEN + "/dgsetloseregion <game> - Sets the region where the players fall in");
					p.sendMessage(ChatColor.GREEN + "/dgsetjoin <game> - Sets the join point of the game");
					p.sendMessage(ChatColor.GREEN + "/dgsetlose <game> - Sets the point where the players teleport to if they are out");
					p.sendMessage(ChatColor.GREEN + "/dgsetwinregion <game>");
					p.sendMessage(ChatColor.GREEN + "/dgsetspectate <game> - Sets the spectate point where the players can spectate to game");
					p.sendMessage(ChatColor.GREEN + "/dgsetwin <game> - Sets the win point where the players teleport if they win the game");
					p.sendMessage(ChatColor.GREEN + "/dgenable <game> - Enables the specified game");
					p.sendMessage(ChatColor.GREEN + "/dgdisable <game> - Disables the specified game");
					p.sendMessage(ChatColor.GREEN + "/dgjoin <game> - Joins the specified game");
					p.sendMessage(ChatColor.GREEN + "/dgleave - Leave the game");
					p.sendMessage(ChatColor.GREEN + "/dgstart <game> - Starts the game");
					p.sendMessage(ChatColor.GREEN + "/dgkick <player> - Kicks a player out of the game");
					return true;
				}
			}
		}
		}
		
		
		return false;
	}
	
}
