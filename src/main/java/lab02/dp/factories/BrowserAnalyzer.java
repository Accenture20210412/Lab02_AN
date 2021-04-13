package main.java.lab02.dp.factories;

import main.java.lab02.dp.handlers.BrowserHandler;

import java.util.List;

public class BrowserAnalyzer {

    public int analyze() {

        BrowserHandlerFactory chromeHandlerFactory = new ChromeHandlerFactory();
        BrowserHandler chromeHandler = chromeHandlerFactory.createHandler();
        int chrome = chromeHandler.openPages(List.of("www.google.pl", "www.google.pl", "www.google.pl", "www.google.pl", "www.google.pl"));

        BrowserHandlerFactory firefoxHandlerFactory = new FirefoxHandlerFactory();
        BrowserHandler firefoxHandler = firefoxHandlerFactory.createHandler();
        int firefox = firefoxHandler.openPages(List.of("www.google.pl", "www.google.pl", "www.google.pl", "www.google.pl", "www.google.pl"));

        BrowserHandlerFactory operaHandlerFactory = new OperaHandlerFactory();
        BrowserHandler operaHandler = operaHandlerFactory.createHandler();
        int opera = operaHandler.openPages(List.of("www.google.pl", "www.google.pl", "www.google.pl", "www.google.pl", "www.google.pl"));

        int count = chrome + firefox + opera;
        return count;


    }



}
