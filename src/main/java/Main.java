import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main ( String[] args )  {

        // Create a new file
            // If file exists, wipe the file
            // If it doesn't, create the file

        // Load the HTML Page
        // Possible write something to scrape with a headless browser to keep the list fresh

        // Parse, loop and iterate on the book names
            // Write the names to file

        try {

            List<String> content = Files.readAllLines(Paths.get("src/main/java/LNDB.html"));
            String LNDB = content.toString();

            Document doc = Jsoup.parse(LNDB);

            Element lTable = doc.getElementById("lightnovels_tbl");
            Elements links = lTable.getElementsByTag("a");

            File bookFile = new File("LN.txt");

            if ( bookFile.createNewFile() ) {
                for ( Element item : links ) {
                    String bookTitle = item.text();

                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
