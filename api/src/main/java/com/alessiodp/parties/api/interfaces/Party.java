package com.alessiodp.parties.api.interfaces;

import java.util.List;
import java.util.UUID;

public interface Party {
	
	/**
	 * Get the party name
	 * 
	 * @return Returns the name of the party
	 */
	String getName();
	
	/**
	 * Set the party name
	 * 
	 * @param name
	 *            The name to set
	 */
	void setName(String name);
	
	/**
	 * Get the party members executors
	 * 
	 * @return Returns the members executors of the party
	 */
	List<UUID> getMembers();
	
	/**
	 * Set the party members executors
	 * 
	 * @param members
	 *            The executors composed by members UUIDs
	 */
	void setMembers(List<UUID> members);
	
	/**
	 * Get the party leader
	 * 
	 * @return Returns the {@link UUID} of the party leader
	 */
	UUID getLeader();
	
	/**
	 * Set the party leader
	 * 
	 * @param leader
	 *            The {@link UUID} of the leader
	 */
	void setLeader(UUID leader);
	
	/**
	 * Is the party fixed?
	 * 
	 * @return Returns if the party is fixed
	 */
	boolean isFixed();
	
	/**
	 * Toggle a fixed party
	 * 
	 * @param fixed
	 *            {@code True} to be fixed
	 */
	void setFixed(boolean fixed);
	
	/**
	 * Get the party description
	 * 
	 * @return Returns party description
	 */
	String getDescription();
	
	/**
	 * Set the party description
	 * 
	 * @param description
	 *            The description of the party
	 */
	void setDescription(String description);
	
	/**
	 * Get the Message Of The Day of the party
	 * 
	 * @return Returns the MOTD of the party
	 */
	String getMotd();
	
	/**
	 * Set the Message Of The Day of the party
	 * 
	 * @param motd
	 *            The MOTD of the party
	 */
	void setMotd(String motd);
	
	/**
	 * Get the home of the party
	 * 
	 * @return Returns the {@link HomeLocation} of the party home
	 */
	HomeLocation getHome();
	
	/**
	 * Set the home of the party
	 * 
	 * @param home
	 *            The {@code HomeLocation} of the party home
	 */
	void setHome(HomeLocation home);
	
	/**
	 * Get the party prefix
	 * 
	 * @return Returns the prefix of the party
	 */
	String getPrefix();
	
	/**
	 * Set the party prefix
	 * 
	 * @param prefix
	 *            The prefix of the party
	 */
	void setPrefix(String prefix);
	
	/**
	 * Get the party suffix
	 * 
	 * @return Returns the suffix of the party
	 */
	String getSuffix();
	
	/**
	 * Set the party suffix
	 * 
	 * @param suffix
	 *            The suffix of the party
	 */
	void setSuffix(String suffix);
	
	/**
	 * Get the party color
	 * 
	 * @return Returns the {@code Color} of the party
	 */
	Color getColor();
	
	/**
	 * Set the party color
	 * 
	 * @param color
	 *            The {@code Color} of the party
	 */
	void setColor(Color color);
	
	/**
	 * Get the kills number of the party
	 * 
	 * @return The number of kills of the party
	 */
	int getKills();
	
	/**
	 * Set the number of kills of the party
	 * 
	 * @param kills
	 *            The number of kills of the party
	 */
	void setKills(int kills);
	
	/**
	 * Get the party password
	 * 
	 * @return Returns the password of the party, HASHED
	 */
	String getPassword();
	
	/**
	 * Set the party password
	 * 
	 * @param password
	 *            The password of the party, HASHED
	 */
	void setPassword(String password);
}
