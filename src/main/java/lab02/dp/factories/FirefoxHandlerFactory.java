package main.java.lab02.dp.factories;

import main.java.lab02.dp.handlers.BrowserHandler;
import main.java.lab02.dp.handlers.FirefoxHandler;

public class FirefoxHandlerFactory implements BrowserHandlerFactory {

    @Override
    public BrowserHandler createHandler() {
        return new FirefoxHandler();
    }
}
