package ca.unknown.replaydecoder.exception;

public class CannotDecodeReplayException extends RuntimeException {
    public CannotDecodeReplayException(String message, Exception e) {
        super(message, e);
    }
}


