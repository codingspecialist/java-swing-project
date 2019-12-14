package starz502Client.models;

import java.util.Vector;

import starz502Client.data.DataTypes;

public class LobbyModel {	
	private Integer datatype = DataTypes.LOBBY;
	private Vector<LobbyModelUser> lobbyModelUser;
	
	public LobbyModel() {
		// TODO Auto-generated constructor stub
	}

	public LobbyModel(Integer datatype, Vector<LobbyModelUser> lobbyModelUser) {
		super();
		this.datatype = datatype;
		this.lobbyModelUser = lobbyModelUser;
	}

	public Integer getDatatype() {
		return datatype;
	}

	public void setDatatype(Integer datatype) {
		this.datatype = datatype;
	}

	public Vector<LobbyModelUser> getLobbyModelUser() {
		return lobbyModelUser;
	}

	public void setLobbyModelUser(Vector<LobbyModelUser> lobbyModelUser) {
		this.lobbyModelUser = lobbyModelUser;
	}

}
