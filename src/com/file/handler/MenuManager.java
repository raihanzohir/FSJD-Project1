package com.file.handler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MenuManager {

	public static void menuList() throws IOException {
		System.out.println("1. List the files\n");
		System.out.println("2. File Operations\n");
		System.out.println("3. Exit\n");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		switch (option) {
		case 1:
			FileOperations.listFilesAsc();
			break;
		case 2:
			subMenuList();
			break;
		case 3:
			System.out.println("Exited\n");
			System.exit(0);			
			break;
		default:
			System.out.println("Enter a valid option\n");
			menuList();
			break;
		}
	}

	private static void subMenuList() throws IOException {
		System.out.println("1. Add file\n");
		System.out.println("2. Delete file\n");
		System.out.println("3. Search file\n");
		System.out.println("4. Main Menu\n");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				FileOperations.addFile();
				subMenuList();
				break;
			case 2:
				FileOperations.deleteFile();
				subMenuList();
				break;
			case 3:
				FileOperations.searchFile();
				subMenuList();
				break;
			case 4:
				menuList();
				break;
			default:
				System.out.println("Enter a valid option\n");
				subMenuList();
				break;
			}
		} catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
