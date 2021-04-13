package main.java.lab02.dp.factories;

import main.java.lab02.dp.handlers.BrowserHandler;

public interface BrowserHandlerFactory {
    BrowserHandler createHandler();
}
