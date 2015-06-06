package ca.unknown.replayparser.reader;

import ca.unknown.replayparser.packets.RawPacket;

import java.nio.ByteBuffer;
import java.util.Iterator;

public interface PacketReader extends Iterator<RawPacket> {

    ByteBuffer getRawData();
}
