package main.java.lab02.dp.handlers;

import java.util.List;
import java.util.Random;

public class ChromeHandler implements BrowserHandler {
	
	private static Random random = new Random();
	
	@Override
	public String getName() {
		return "Chrome";
	}

	@Override
	public int openPages(List<String> urls) {
		if (urls != null && urls.size() > 0) {
			return random.nextInt(10) + urls.size();
		} else {
			return 0;	
		}
	}

}
