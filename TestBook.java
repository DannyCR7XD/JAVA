//Danny Castaneda SP21 JAVA
//The Author class is designed to model a book's author
//Book Java class which uses the Author class
//TestBook to test all the public methods in the class Book



import java.util.Scanner;
class Author{
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public String toString(){
	System.out.println("\n");
        return "Author [name= " + this.name + ", email= " + this.email + ", gender= " + this.gender + "\n";
    }
}


class Book{
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }

    public String toString(){
        return "Book [name= " + this.name + "," + author + " price= " + this.price + ", qty= " + this.qty + "\n";
    }
}

public class TestBook
{
    public static void main(String[] args){
        Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
	System.out.println("\n");
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

// Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'M'), 29.95, 28);
        System.out.println(anotherBook);
	System.out.println("Author Name: " + anotherBook.getAuthorName());
	System.out.println("Author Email: " + anotherBook.getAuthorEmail());
	System.out.println("\n");
    }
}