package com.alessiodp.parties.bukkit.commands.list;

import com.alessiodp.parties.bukkit.configuration.data.BukkitConfigMain;
import com.alessiodp.parties.bukkit.configuration.data.BukkitMessages;
import com.alessiodp.parties.common.commands.list.PartiesCommand;
import lombok.Getter;

public enum BukkitCommands implements PartiesCommand {
	CLAIM,
	CONFIRM,
	HOME,
	SETHOME,
	TELEPORT;
	
	@Getter private String command;
	@Getter private String help;
	
	BukkitCommands() {
		command = "";
		help = "";
	}
	
	public static void setup() {
		BukkitCommands.CLAIM.command = BukkitConfigMain.COMMANDS_CMD_CLAIM;
		BukkitCommands.CLAIM.help = BukkitMessages.HELP_ADDCMD_CLAIM;
		BukkitCommands.CONFIRM.command = BukkitConfigMain.COMMANDS_CMD_CONFIRM;
		BukkitCommands.HOME.command = BukkitConfigMain.COMMANDS_CMD_HOME;
		BukkitCommands.HOME.help = BukkitMessages.HELP_ADDCMD_HOME;
		BukkitCommands.SETHOME.command = BukkitConfigMain.COMMANDS_CMD_SETHOME;
		BukkitCommands.SETHOME.help = BukkitMessages.HELP_ADDCMD_SETHOME;
		BukkitCommands.TELEPORT.command = BukkitConfigMain.COMMANDS_CMD_TELEPORT;
		BukkitCommands.TELEPORT.help = BukkitMessages.HELP_ADDCMD_TELEPORT;
	}
	
	public String getType() {
		return this.name();
	}
}
