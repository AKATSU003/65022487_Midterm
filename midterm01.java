public class midterm01 {
    public static void main(String[] args) {
        Product P = new Product("chair", 500.0);
        Electronics E = new Electronics("Television", 20000.0, "Samsung", "Neo QLED");
        Smartphone S = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book B = new Book("OOP Programming", 250.0, "John Doe", 300);

        P.getName();
        P.getPrice();
        System.out.println("*****************");
        
        E.getName();
        E.getPrice();
        E.getBrand();
        E.getModel();
        System.out.println("*****************");

        S.getName();
        S.getPrice();
        S.getBrand();
        S.getModel();
        S.getOperatingSystem();
        System.out.println("*****************");

        B.getName();
        B.getPrice();
        B.getAuthor();
        B.getPages();
        
    }
}

class Product{
    private String name;
    private double price;

    Product(String Name,double Price){
        this.name = Name;
        this.price = Price;
    }
    
    public String getName(){
        System.out.println("Produce Name : "+ this.name);
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public double getPrice(){
        System.out.println("Price : " + this.price);
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }
} 

class Electronics extends Product{
    private String brand;
    private String model;

    Electronics(String Name,double Price,String Brand,String Model){
        super(Name,Price);
        this.brand = Brand;
        this.model = Model;
    }

    public String getBrand(){
        System.out.println("Brand : "+ this.brand);
        return this.brand;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public String getModel(){
        System.out.println("Model : "+this.model);
        return this.model;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }
}

class Smartphone extends Electronics{
    private String Operating_System;

    Smartphone(String Name,double Price,String Brand,String Model,String O_S){
        super(Name, Price, Brand, Model);
        this.Operating_System = O_S;
    }

    public String getOperatingSystem(){
        System.out.println("Operating System : " + this.Operating_System);
        return this.Operating_System;
    }

}

class Book extends Product{
    private String author;
    private int pages;

    Book(String name,double price,String Author,int Pages){
        super(name, price);
        this.author = Author;
        this.pages = Pages;
    }

    public String getAuthor(){
        System.out.println("Author : " + this.author);
        return this.author;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public int getPages(){
        System.out.println("Number of Pages : " + this.pages);
        return this.pages;
    }

    public void setAuthor(int newPages){
        this.pages = newPages;
    }
}

