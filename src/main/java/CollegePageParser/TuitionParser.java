package CollegePageParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TuitionParser {
	
	public TuitionParser() {
		
	}
	public void scrapeUWTuition(String fileName) throws IOException {
		String html = FileUtility.FileUtility.readFile(fileName);
		Document doc = Jsoup.parse(html);
		Elements elements = doc.getElementsByAttribute("headers");
		String title = new String();
		HashMap<String, ArrayList<String>> costs = new HashMap<String, ArrayList<String>>();
		for(Element element : elements) {
			if(element.hasText()) {
				String current = element.text();
				System.out.println(current);
				if(!hasDigit(current)) {
					title = current;
					costs.put(current, new ArrayList<String>());
				} else {
					ArrayList<String> temp = costs.get(title);
					temp.add(current);
					costs.put(title, temp);
				}
			}
		}
	}
	public boolean hasDigit(String input) {
		char[] array = input.toCharArray();
		for(int i = 0; i < array.length; i++) {
			if(Character.isDigit(array[i])) {
				return true;
			}
		}
		return false;
	}
	
	

}
