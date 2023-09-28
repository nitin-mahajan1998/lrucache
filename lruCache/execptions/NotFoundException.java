package src.lruCache.execptions;

public class NotFoundException extends Exception {

    String errorLevel;
    String message;
    String errorCode;

    public NotFoundException(String errorLevel, String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
        this.errorLevel = errorLevel;
    }
}