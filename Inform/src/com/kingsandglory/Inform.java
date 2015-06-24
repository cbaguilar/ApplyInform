package com.kingsandglory;


//import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Inform extends JavaPlugin implements Listener {
	  	@Override
		public void onEnable() {
		  getServer().getPluginManager().registerEvents(this, this);
		  getLogger().info("ApplyInform has been enabled");
		  
	    }
	 
	    public void onDisable() {
	        getLogger().info("Rp Roll has been disabled");
	    }
	
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    	if (cmd.getName().equalsIgnoreCase("wut")) { // If the player typed /basic then do the following...
	    		sender.sendMessage("yolo dude");
	    			    		
	    		return true;
	    	} //If this has happened the function will return true. 
	            // If this hasn't happened the value of false will be returned.
	    	return false; 
	    }
	    
	    @EventHandler
	    public void onJoin(PlayerJoinEvent join){
	    	getLogger().info("Hey! some noob joined!");
	    	Player p =  join.getPlayer();
	    	if (p.hasPermission("Inform.recieve")){
	    	p.sendMessage("§6§lGo to §cwww.KingAndGlory.com §6to Apply, check updates, and browse the forums!");
	    	}
	    }
}



