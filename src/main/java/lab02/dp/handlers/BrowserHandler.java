package main.java.lab02.dp.handlers;

import java.util.List;

public interface BrowserHandler {

	public String getName();
	
	/**
	 * Returns time in seconds
	 * 
	 * @param urls
	 * @return
	 */
	public int openPages(List<String> urls);
}
