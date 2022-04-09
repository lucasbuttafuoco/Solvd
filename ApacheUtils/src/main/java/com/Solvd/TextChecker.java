package com.Solvd;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class TextChecker {
    private static final Logger LOGGER = LogManager.getLogger(TextChecker.class);

    public static void main(String[] args) {
        String articleText = ""; //declaration of an empty string, this variable will contain de string created with readFileToString method
        try {
            articleText = FileUtils.readFileToString(new File("resources/article.txt"), "UTF-8");
        } catch (IOException e) {
            LOGGER.error(e);
        }

        //Get rid of dots, commas replacing them for spaces in articleText using StringUtils, then create an array
        articleText = StringUtils.replaceChars(articleText,',',' ');
        articleText = StringUtils.replaceChars(articleText,'.',' ');
        articleText = StringUtils.replaceChars(articleText, '"',' ');
        String[] words = StringUtils.split(articleText, " ");


        //Count the number of unique words, using Set collection
        Set<String> unique = new HashSet<>();
        HashMap<String, Integer> occurrences = new HashMap<>();
        for (String word : words) {
            unique.add(word);
            if (occurrences.containsKey(word)) {
                occurrences.put(word, occurrences.get(word) + 1);
            } else {
                occurrences.put(word, 1);
            }
        }
        LOGGER.info("Number of unique words: " + unique.size());

        //Create a new file with: word - count (occurrences of each word)
        try (FileWriter wordCounter = new FileWriter("resources/wordCounter")){
            for(String word: occurrences.keySet()){
                wordCounter.write(word + " - " + occurrences.get(word) + "\n");
            }
        } catch (IOException e) {
            LOGGER.error(e);
        }

    }
}
