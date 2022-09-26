package network.packet.protocol;

import network.packet.Clientbound;
import network.packet.DataPacket;
import network.packet.PacketDecoder;
import network.packet.PacketEncoder;

public class LoginStatusPacket extends DataPacket implements Clientbound {

	public static final int REQUEST_PROTOCOL = 0;
	public static final int REQUEST_CLIENT_INFO = 1;
	public static final int FINISH = 16;

	public int status;

	@Override
	protected void decodePayload(PacketDecoder in) throws Exception {
		this.status = in.readInt();
	}

	@Override
	protected void encodePayload(PacketEncoder out) throws Exception {
		out.writeInt(this.status);
	}

	@Override
	public String getName() {
		return "LoginStatusPacket";
	}

	@Override
	public ProtocolIds getProtocolId() {
		return ProtocolIds.LOGIN_STATUS_PACKET;
	}
}
