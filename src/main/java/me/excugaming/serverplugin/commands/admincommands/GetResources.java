package me.excugaming.serverplugin.commands.admincommands;

import me.excugaming.serverplugin.items.Items;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetResources implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("getresources")) {
            if (sender instanceof Player) {
                if (sender.hasPermission("game.admin")) {
                    Player player = (Player) sender;
                    if (args.length == 1) {
                        if (args[0].equals("iron")) {
                            player.getInventory().addItem(Items.iron);
                        }
                    } else {
                        player.sendMessage(ChatColor.RED+"Invalid usage of command.  Usage: /getresources <resource>");
                    }
                }
            }
        }
        return true;
    }
}