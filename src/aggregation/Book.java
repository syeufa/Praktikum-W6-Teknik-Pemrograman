package aggregation;

/**
 * PRAKTIKUM W6 TEKPRO (AGGREGATION)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */

public class Book {
  String name;
  int price;
  // author details
  Author author;
  Book(String n, int p, Author author)
  {
    this.name = n;
    this.price = p;
    this.author = author;
  }
  public static void main(String[] args) {
    Author author = new Author("Karen Mayer", 38 , "USA");
    Book b = new Book("How To Make a Perfect Steak", 47 , author);
    System.out.println("Book Name: "+b.name);
    System.out.println("Book Price: "+b.price);
    System.out.println("------------Author Details----------");
    System.out.println("Author Name: "+b.author.authorName);
    System.out.println("Author Age: "+b.author.age);
    System.out.println("Author place: "+b.author.place);
  }  
}
