package ca.unknown.replayparser.packets;

import java.nio.ByteBuffer;

public class Packet00 extends Packet {
    public Packet00(PacketType type, int length, float clock, ByteBuffer byteBuffer) {
        super(type, length, clock, byteBuffer);
    }

    @Override
    public void toReadableFormat() {

    }
}
