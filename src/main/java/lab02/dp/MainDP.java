package main.java.lab02.dp;

import main.java.lab02.dp.factories.BrowserAnalyzer;

public class MainDP {

    public static void main(String[] args) {
        BrowserAnalyzer browserAnalyzer = new BrowserAnalyzer();
        System.out.println(browserAnalyzer.analyze());
    }
}
