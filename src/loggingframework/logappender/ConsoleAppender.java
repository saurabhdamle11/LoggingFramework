package loggingframework.logappender;

import loggingframework.LogFormatter;
import loggingframework.LogMessage;

public class ConsoleAppender implements LogAppender{

    private final LogFormatter logFormatter;

    public ConsoleAppender(LogFormatter formatter){
        this.logFormatter=formatter;
    }

    @Override
    public void append(LogMessage message){
        System.out.println(logFormatter.format(message));
    }
}
