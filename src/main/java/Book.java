public class Book {
    private String name;
    private String author;
    public Book(){

    }
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getName(){
        return name;
    }
     public void setName(String name){
        this.name = name;
     }

     public String getAuthor(){
        return author;
     }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookInfo(){
        System.out.println(name + " " + author);
    }

    public void wearOut(){
        System.out.println(name + " is wearing out");
    }

    public String toString(){
        return "Book(name=" + this.name + ", author=" + this.author + ")";
    }

}
