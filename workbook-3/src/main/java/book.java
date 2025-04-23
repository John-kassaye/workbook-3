
public class book {
    private String author;
    private String title;

    public book(String author, String title) {
        this.title = title;
        this.author = author;
    }
    public void babe(){
        System.out.println("this is "+ title + author);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
