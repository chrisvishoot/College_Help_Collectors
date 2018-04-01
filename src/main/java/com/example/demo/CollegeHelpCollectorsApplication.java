package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import CollegePageParser.Parser;

@SpringBootApplication
public class CollegeHelpCollectorsApplication {

	public static void main(String[] args) throws IOException {
		Parser parse = new Parser("UniversityOfWashington/UW.html");

	}
}
