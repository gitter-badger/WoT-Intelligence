package ca.intelliagent.replaydecoder;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Path;

public class ReplayDecoderWithOneBlock extends ReplayDecoder {


    public ReplayDecoderWithOneBlock(ReplayFileReader fileReader, Path outputDirectory) {
        super(fileReader, outputDirectory);
    }

    @Override
    public ByteBuffer decode() {
        String replayExtracted =
                replayFileReader.getReplayName().substring(0, replayFileReader.getReplayName().indexOf(".wotreplay"));

        String JSON = "C:\\replays\\" + replayExtracted + ".json";
        File file = new File(JSON);
        try {
            FileOutputStream jsonData = new FileOutputStream(file);
            jsonData.write(replayFileReader.getFirstBlock().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.decode();
    }
}
