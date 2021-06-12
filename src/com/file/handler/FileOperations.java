package com.file.handler;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperations {
	
	public static void listFilesAsc() throws IOException {
		String[] files;
		File file = new File(Main.FILES_DIR);
		//System.out.println(file.getAbsolutePath());
		files = file.list();
		Arrays.sort(files);
		for (String fileName : files) {
			System.out.println(fileName);
		}
	}

	public static void addFile() throws IOException {
		System.out.println("Enter file name to add\n");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		File file = new File(Main.FILES_DIR, fileName);

		if (file.createNewFile()) {
			System.out.println("File ("+fileName+") added");
		} else {
			System.out.println("File ("+fileName+") not added");
		}
	}

	public static void deleteFile() throws IOException {
		System.out.println("Enter file name to delete\n");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		File file = new File(Main.FILES_DIR, fileName);

		if (file.delete()) {
			System.out.println("File ("+fileName+") deleted");
		} else {
			System.out.println("File ("+fileName+") not found for delete");
		}
	}

	public static void searchFile() throws IOException {
		System.out.println("Enter file name to search\n");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		File file = new File(Main.FILES_DIR, fileName);

		if (file.exists()) {
			System.out.println("File ("+fileName+") exists");
		} else {
			System.out.println("File ("+fileName+") not exists");
		}
	}

}
