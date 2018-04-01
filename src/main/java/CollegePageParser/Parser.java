package CollegePageParser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.core.io.ClassPathResource;

public class Parser {
	public Parser(String fileName) throws IOException {
		File file = new ClassPathResource(fileName).getFile();
		Path readFromFile = Paths.get(file.getPath());
		String html = new String(Files.readAllBytes(readFromFile));
		Document doc = Jsoup.parse(html);
		Elements allUWEquivs = doc.getElementsByClass("uwequiv");
		Elements allPierce = doc.getElementsByClass("cccourse");
		HashMap<String, String> pierceToUW = new HashMap<String, String>();
		HashMap<String, String> uwToPierce = new HashMap<String, String>();
		for(int i = 0; i < allPierce.size(); i++) {
			System.out.println(allUWEquivs.get(i).text());
			System.out.println(allPierce.get(i).text());
			pierceToUW.put(allPierce.get(i).text(), allUWEquivs.get(i).text());
			uwToPierce.put(allUWEquivs.get(i).text(), allPierce.get(i).text());
		}
	}
	
	

}
