package com.floreo.bbah.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Token {


    public static String findApiToken() {

        String apiKey = "xoxb-993126746963-1079637772162-dql31ZvMA1Y5A0gW0GTlWjh6";

        File file = new File("api_token.txt");
        System.out.println(file.getAbsolutePath());

        try {

            Scanner scanner = new Scanner(file);

            apiKey = scanner.next();

            scanner.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        return apiKey;
    }
}
