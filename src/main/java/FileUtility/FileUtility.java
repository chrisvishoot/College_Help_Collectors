package FileUtility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.ClassPathResource;

public class FileUtility {
	public static String readFile(String fileName) throws IOException {
		File file = new ClassPathResource(fileName).getFile();
		Path readFromFile = Paths.get(file.getPath());
		String html = new String(Files.readAllBytes(readFromFile));
		return html;
	}
}
