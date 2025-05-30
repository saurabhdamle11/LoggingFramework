package loggingframework.logappender;

import java.io.FileWriter;
import java.io.IOException;

import loggingframework.LogFormatter;
import loggingframework.LogMessage;

public class FileAppender implements LogAppender{
    private FileWriter writer;
    private final LogFormatter formatter;

    public FileAppender(String filePath, LogFormatter formatter){
        this.formatter=formatter;
        try{
            this.writer = new FileWriter(filePath,true);
        } catch(Exception e){
            System.out.println("Failed to create writer for file logs, exception: " + e.getMessage());
        }
    }

    @Override
    public synchronized void append(LogMessage message){
        try{
            writer.write(this.formatter.format(message)+ "\n");
            writer.flush();
        } catch(IOException e){
            System.out.println("Failed to write logs to file, exception: " + e.getMessage());
        }
    }
}
