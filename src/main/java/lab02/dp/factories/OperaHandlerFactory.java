package main.java.lab02.dp.factories;

import main.java.lab02.dp.handlers.BrowserHandler;
import main.java.lab02.dp.handlers.ChromeHandler;
import main.java.lab02.dp.handlers.OperaHandler;

public class OperaHandlerFactory implements BrowserHandlerFactory {

    @Override
    public BrowserHandler createHandler() {
        return new OperaHandler();
    }
}
