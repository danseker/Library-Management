package iBook;

import java.util.Scanner;

public class Main {
	private static void menu() {
		System.out.println("I.     Books");
		System.out.println("1. insert a new book.");
		System.out.println("2. delete a book.");
		System.out.println("3. update a book.");
		System.out.println("4: display all");
		System.out.println("\nII.     Tools");
		System.out.println("5: filter by author");
		System.out.println("6: filter by language");
		System.out.println("7: filter by price");
		System.out.println("8: filter by price desc");
		System.out.println("9: exit.");

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Library myLibrary = new Library();
		// add some try-catch
		int option = -1;
		do {
			menu();
			System.out.print("\nEnter selection: ");
			try {

				option = Integer.parseInt(in.nextLine());
				switch (option) {
				case 1:
					Books item = new Books();
					System.out.println("Name: ");
					item.setName(in.nextLine());
					System.out.println("The author: ");
					item.setAuthor(in.nextLine());
					System.out.println("Language: ");
					item.setLanguage(in.nextLine());
					System.out.println("Price: ");
					item.setPrice(Double.parseDouble(in.nextLine()));
					System.out.println("Publish Date (YYYY-MM-DD): ");
					item.setPublishDate(in.nextLine());
					System.out.println("ISBN: ");
					item.setIsbn(in.nextLine());
					System.out.println("________________________\n");
					myLibrary.insertBooks(item);
					break;
				case 2:
					myLibrary.deleteBooks();
					break;
				case 3:
					myLibrary.updateBooks();
					break;
				case 4:
					myLibrary.viewListBooks();
					break;
				case 5:
					myLibrary.filterAuthor();
					break;
				case 6:
					myLibrary.filterLanguage();
					break;
				case 7:
					myLibrary.filterPrice();
					break;
				case 8:
					myLibrary.filterPriceDesc();
					break;
				default:
					throw new IllegalArgumentException();
				}
			} catch (Exception e) {
				System.out.println("Unexpected value: " + option);
			}
		} while (option != 9);
		in.close();

	}

}
