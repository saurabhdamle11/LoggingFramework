package loggingframework;

public class LogMessage {
    private final LogLevel level;
    private final String threadName;
    private final String message;
    private final long timestamp;

    public LogMessage(LogLevel level, String message){
        this.level=level;
        this.threadName=Thread.currentThread().getName();
        this.timestamp=System.currentTimeMillis();
        this.message=message;
    }

    public LogLevel getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public String toString() {
        return "[" + level + "] " + timestamp + " - " + message;
    }
}
