package com.cgi.boat.interview;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.ConsoleAppender;

public class LogCollectorLogbackAppender extends ConsoleAppender {

    private static Queue<String> logMessages = new LinkedList<>();
    @Override
    protected void writeOut(Object event) throws IOException {
        if(event instanceof LoggingEvent){
            final String message = ((LoggingEvent) event).getMessage();
            logMessages.add(message);
        }
        super.writeOut(event);
    }

    static Queue<String> getLogMessages() {
        return logMessages;
    }
}
