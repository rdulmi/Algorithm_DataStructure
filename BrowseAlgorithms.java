import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrowseAlgorithms {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		
		Desktop d = Desktop.getDesktop();
		d.browse(new URI("https://www.geeksforgeeks.org/fundamentals-of-algorithms/"));

	}

}
