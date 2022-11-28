package com.tres.network.packet.protocol;

public enum ProtocolIds {
	UNKNOWN(-1),
	TEXT_PACKET(1),
	DISCONNECT_PACKET(2),
	ALIVE_SIGNAL_PACKET(3),
	LOGIN_STATUS_PACKET(4),
	PROTOCOL_PACKET(5),
	CLIENT_INFO_PACKET(6),
	PLAYER_INITIALIZED_PACKET(7),
	PLAYER_INFO_REQUEST_PACKET(8),
	GAME_EVENT_PACKET(9),
	GAME_LEVEL_PACKET(10),
	ADD_PLAYER_PACKET(11),
	CARD_ACTION_PACKET(12),
	REQUEST_GAME_LEVEL_PACKET(13);

	public static final int PROTOCOL = 3;
	public static final int VERSION = 1;

	public int id;

	ProtocolIds(int id) {
		this.id = id;
	}
}
