package main.java.lab02.dp.factories;

import main.java.lab02.dp.handlers.BrowserHandler;

import java.util.List;

public class BrowserAnalyzer {

    public int analyze() {
        BrowserHandlerFactory browserHandlerFactory = new ChromeHandlerFactory();
        BrowserHandler browserHandler = browserHandlerFactory.createHandler();
        return browserHandler.openPages(List.of("www.google.pl", "www.google.pl", "www.google.pl", "www.google.pl", "www.google.pl"));


    }



}
