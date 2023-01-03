import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album emptyAlbum = new Album();
//        (int id, String artist, String name, Date releaseDate, String genre, double sales)
        Album hitAlbum = new Album(1, "Michael Jackson", "Thriller", 1982, "Pop, post-disco, funk, rock", 50.2);

        Author WD = new Author(1, "Walt");
        Author TR = new Author(2, "Tony");

        Quote TRQ = new Quote(1, "The way to get started is to quit talking and begin doing.", TR);
        Quote WDQ = new Quote(2, "The only impossible journey is the one you never begin.", WD);

        ArrayList<Quote> someQuotes = new ArrayList<>();
        someQuotes.add(TRQ);
        someQuotes.add(WDQ);

        for (Quote quote : someQuotes){
            System.out.println(quote.getContent() + "\n - " + quote.getAuthor().getFirstname());
        }

    }
}
