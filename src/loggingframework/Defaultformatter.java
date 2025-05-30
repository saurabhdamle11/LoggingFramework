package loggingframework;

public class Defaultformatter implements LogFormatter{
    @Override
    public String format(LogMessage message){
        return String.format("[%s] [%s] [%s] %s",
                message.getTimestamp(), message.getThreadName(), message.getLevel(), message.getMessage());
    }
}
