// import java.util.Scanner;

// // import TestFiles.Node;

// class Node {
// Node prev_node;
// Node next_node;
// int isbn, edition;
// String title, author, publisher;

// }

// public class LinkedList {

// Node head;

// public LinkedList() {
// head = null;
// }

// public void insert(int isbn, String title, int edition, String author, String
// publisher) {
// if (head == null) {
// Node node = new Node();

// node.isbn = isbn;
// node.title = title;
// node.edition = edition;
// node.author = author;
// node.publisher = publisher;

// head = node;
// } else {
// Node node = new Node();

// node.prev_node = head;
// head.next_node = node;
// head = node;
// }
// }

// public int getSize() {
// return 20;
// }

// public void searchAll() {

// Node temp = new Node();
// temp = head;

// for (; temp.prev_node != null; temp = temp.prev_node) {

// System.out.println("ISBN: " + head.isbn);
// System.out.println("Title: " + head.title);
// System.out.println("Author: " + head.author);
// System.out.println("publisher: " + head.publisher);

// System.out.println("");
// System.out.println("");
// }

// }

// public void searchByIsbn() {
// @SuppressWarnings("resource")
// Scanner sc = new Scanner(System.in);
// int isbn = sc.nextInt();

// Node temp = new Node();
// temp = head;

// for (; temp.prev_node != null; temp = temp.prev_node) {

// if (head.isbn == isbn) {
// System.out.println("ISBN: " + head.isbn);
// System.out.println("Title: " + head.title);
// System.out.println("Author: " + head.author);
// System.out.println("publisher: " + head.publisher);

// break;
// }
// }
// }

// public void searchByTitle() {
// @SuppressWarnings("resource")
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter title of the book you want to search: ");
// String title = sc.nextLine();

// Node temp = new Node();

// int[] edition = new int[10];
// Node[] book = new Node[edition.length];

// int i = 0;

// // store all the books with the same titles in a book array
// for (; temp.prev_node != null; temp = temp.prev_node) {

// if (temp.title == title) {
// book[i] = temp;
// i++;
// }
// }

// // print all the books that are in the array
// for (int j = 0; j < book.length; j++) {

// if (book[j] == null) {
// break;
// }
// System.out.println("ISBN: " + book[j].isbn);
// System.out.println("Title: " + book[j].title);
// System.out.println("Author: " + book[j].author);
// System.out.println("publisher: " + book[j].publisher);
// }
// }

// public void searchByAuthor() {
// @SuppressWarnings("resource")
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter author name: ");
// String author = sc.nextLine();

// Node temp = new Node();

// int count = 0;

// for (; temp.prev_node != null; temp = temp.prev_node) {
// if (temp.author == author) {
// count++;
// }
// }

// Node[] book = new Node[count];
// temp = head;

// for (int i = 0; temp.prev_node != null; temp = temp.prev_node, i++) {
// if (temp.author == author) {
// book[i] = temp;
// }
// }

// for (int j = 0; j < book.length; j++) {

// if (book[j] == null) {
// break;
// }
// System.out.println("ISBN: " + book[j].isbn);
// System.out.println("Title: " + book[j].title);
// System.out.println("Author: " + book[j].author);
// System.out.println("publisher: " + book[j].publisher);

// System.out.println();
// System.out.println();
// }

// }

// public void searchByPublisher() {
// @SuppressWarnings("resource")
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter author name: ");
// String publisher = sc.nextLine();

// Node temp = new Node();

// int count = 0;

// for (; temp.prev_node != null; temp = temp.prev_node) {
// if (temp.publisher == publisher) {
// count++;
// }
// }

// Node[] book = new Node[count];
// temp = head;

// for (int i = 0; temp.prev_node != null; temp = temp.prev_node, i++) {
// if (temp.publisher == publisher) {
// book[i] = temp;
// }
// }

// for (int j = 0; j < book.length; j++) {

// if (book[j] == null) {
// break;
// }
// System.out.println("ISBN: " + book[j].isbn);
// System.out.println("Title: " + book[j].title);
// System.out.println("Author: " + book[j].author);
// System.out.println("publisher: " + book[j].publisher);

// System.out.println();
// System.out.println();
// }

// }

// }
