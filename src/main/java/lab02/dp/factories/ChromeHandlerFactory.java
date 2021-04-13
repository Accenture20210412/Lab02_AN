package main.java.lab02.dp.factories;

import main.java.lab02.dp.handlers.BrowserHandler;
import main.java.lab02.dp.handlers.ChromeHandler;
import main.java.lab02.dp.handlers.FirefoxHandler;

public class ChromeHandlerFactory implements BrowserHandlerFactory {

    @Override
    public BrowserHandler createHandler() {
        return new ChromeHandler();
    }
}
