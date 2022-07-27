package iBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Library {
	private ArrayList<Books> listBooks;
	Scanner scn = new Scanner(System.in);

	public Library() {
		listBooks = new ArrayList<>();
	}

	public ArrayList<Books> getListBooks() {
		return listBooks;
	}

	public void insertBooks(Books item) {
		listBooks.add(item);
	}

	public void deleteBooks() {
		System.out.println("Enter the id of the book to delete: ");
		try {
			String idCheck = scn.nextLine();
			int tt = Integer.parseInt(idCheck);
			for (Books books : listBooks) {
				if (books.getId() == tt) {
					System.out.println("Deleted!!! ");
					listBooks.remove(books);
					return;
				}
			}
			System.out.println("Sorry no book found with name: " + idCheck);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateBooks() {
		System.out.print("Enter the id of the book to edit: ");
		try {
			int idCheck = Integer.parseInt(scn.nextLine());
			System.out.println(idCheck);
			for (int i = 0; i < listBooks.size(); i++) {
				if (listBooks.get(i).getId() == idCheck) {
					System.out.println("New name: ");
					String newName = scn.nextLine();
					listBooks.get(idCheck).setName(newName);
					System.out.println("New author: ");
					String newAuthor = scn.nextLine();
					listBooks.get(idCheck).setAuthor(newAuthor);
					System.out.println("New language: ");
					String newLanguage = scn.nextLine();
					listBooks.get(idCheck).setLanguage(newLanguage);
					System.out.println("New price: ");
					Double newPrice = scn.nextDouble();
					listBooks.get(idCheck).setPrice(newPrice);
					System.out.println("Change successful !!");
					return;
				}
			}
			System.out.println("Sorry no book found with id: " + idCheck);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void display(ArrayList<Books> listBooksDisplay) {

		if (listBooksDisplay.size() == 0) {
			System.out.println("Emty list");
			return;
		}
		for (Books books : listBooksDisplay) {
			System.out.println(books.toString());
		}
	}

	public void viewListBooks() {
		display(listBooks);
	}

	public void filterAuthor() {
		System.out.println("Enter the author of the book: ");
		try {
			String authorCheck = scn.nextLine();
			System.out.println();
			for (int i = 0; i < listBooks.size(); i++) {
				if (listBooks.get(i).getAuthor().equals(authorCheck)) {
					System.out.println(listBooks.stream().filter(n -> n.getAuthor().contains(authorCheck)).collect(Collectors.toList()));
					return;
				}
			} System.out.println("Sorry no book found with author: " + authorCheck);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void filterLanguage() {
		System.out.println("Enter the language of the book: ");
		try {
			String languageCheck = scn.nextLine();
			System.out.println();
			for (int i = 0; i < listBooks.size(); i++) {
				if (listBooks.get(i).getLanguage().equals(languageCheck)) {
					System.out.println(listBooks.stream().filter(n -> n.getLanguage().contains(languageCheck)).collect(Collectors.toList()));
					return;
				}
			} System.out.println("Sorry no book found with language: " + languageCheck);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void filterPrice() {
		System.out.println("Enter the price of the book: ");
		try {
			double priceCheck = Double.parseDouble(scn.nextLine());
			System.out.println();
			for (int i = 0; i < listBooks.size(); i++) {
				if (listBooks.get(i).getPrice()==priceCheck) {
					System.out.println(listBooks.stream().filter(n -> n.getPrice()== priceCheck).collect(Collectors.toList()));
					return;
				}
			} System.out.println("Sorry no book found with price: " + priceCheck);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void filterPriceDesc() {
		@SuppressWarnings("unchecked")
		ArrayList<Books> listBooksCopy = (ArrayList<Books>) listBooks.clone();
		listBooksCopy.sort(Comparator.comparing(Books::getPrice).reversed());
		display(listBooksCopy);
	}
}
