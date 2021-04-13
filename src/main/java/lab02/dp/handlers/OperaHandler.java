package main.java.lab02.dp.handlers;

import java.util.List;
import java.util.Random;

public class OperaHandler implements BrowserHandler {
	
	private static Random random = new Random();
	
	@Override
	public String getName() {
		return "Opera";
	}

	@Override
	public int openPages(List<String> urls) {
		if (urls != null && urls.size() > 0) {
			return random.nextInt(100) + urls.size();
		} else {
			return 0;	
		}
	}

}
