package com.sebone.helpcenter.entityclasses;

/**
 * @interfaceName Room
 * @objective   This class contains all chat room details.
 * @author VivekSharma
 * @date 24march 2022
 */

public class Room {
              
	  private int roomId;
	  private String roomName;
	/**
	 * @param roomId
	 * @param roomName
	 */
	public Room(int roomId, String roomName) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
	}
	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}
	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}
	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	  
	
	  

	
}
