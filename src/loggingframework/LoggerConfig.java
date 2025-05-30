package loggingframework;

import loggingframework.logappender.LogAppender;

public class LoggerConfig {
    private LogLevel level;
    private LogAppender logAppender;

    public LoggerConfig(LogLevel logLevel, LogAppender logAppender){
        this.level=logLevel;
        this.logAppender=logAppender;
    }

    public LogLevel getLogLevel(){
        return this.level;
    }

    public void setLogLevel(LogLevel level){
        this.level = level;
    }

    public LogAppender getLogAppender(){
        return this.logAppender;
    }

    public void setLogAppender(LogAppender appender){
        this.logAppender=appender;
    }
}
