package com.file.handler;

import java.io.IOException;

public class Main {

	public static final String FILES_DIR = "files-directory";
	
	public static void main(String[] args) throws IOException {
		
		showMainMenu();

	}

	private static void showMainMenu() throws IOException {
		
		MenuManager.menuList();
		
	}

}
