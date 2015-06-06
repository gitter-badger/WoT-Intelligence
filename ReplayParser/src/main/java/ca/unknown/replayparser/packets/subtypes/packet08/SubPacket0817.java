package ca.unknown.replayparser.packets.subtypes.packet08;

import ca.unknown.replayparser.packets.Packet08;
import ca.unknown.replayparser.packets.PacketType;
import ca.unknown.replayparser.packets.RawPacket;

import java.nio.ByteBuffer;

public class SubPacket0817 extends Packet08 {

    private int target;

    public SubPacket0817(PacketType type, int length, float clock, ByteBuffer payload) {
        super(type, length, clock, payload);
    }

    public SubPacket0817(RawPacket rawPacket) {
        super(rawPacket);
    }

    @Override
    protected void parse(ByteBuffer payload) {
        target = payload.getInt(4);
    }
}
