package com.github.zathrus_writer.commandsex.helpers;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import com.github.zathrus_writer.commandsex.CommandsEX;
import static com.github.zathrus_writer.commandsex.Language._;

public class LogHelper {
	// the logger
	public final static Logger LOGGER = Logger.getLogger("Minecraft");
	
	public static void logWarning(String msg) {
		LOGGER.warning(msg);
	}
	
	public static void logSevere(String msg) {
		LOGGER.severe(msg);
	}
	
	public static void logInfo(String msg) {
		LOGGER.info(msg);
	}
	
	public static void logDebug(String msg) {
		if (CommandsEX.plugin.getConfig().getBoolean("debugMode")) {
			LOGGER.info(msg);
		}
	}
	
	public static void showWarning(String msg, CommandSender sender) {
		sender.sendMessage(ChatColor.RED + _(msg, sender.getName()));
	}
	
	public static void showWarnings(CommandSender sender, String... msg) {
		String sName = sender.getName();
		for (String s : msg) {
			sender.sendMessage(ChatColor.RED + _(s, sName));
		}
	}
}