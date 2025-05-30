package loggingframework;

import loggingframework.logappender.FileAppender;

public class App {

    public static void run(){
        Logger logger = Logger.getInstance();

        logger.info("This is an information message");
        logger.warning("This is a warning message");
        logger.error("This is an error message");

        // Changing log level and appender
        LoggerConfig config = new LoggerConfig(LogLevel.DEBUG, new FileAppender("app.log", new Defaultformatter()));
        logger.setConfig(config);

        logger.debug("This is a debug message");
        logger.info("This is an information message");
    }

    public static void main(String[] args) throws Exception {
        run();
    }
}
