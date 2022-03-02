package com.company;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String capletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        try {
            FileWriter writer = new FileWriter("Alphabet.txt");
            for (int i = 0; i < capletters.length(); i++) {
                writer.write(capletters.charAt(i) +" "+ letters.charAt(i) + "\n");
            }
            for (int i = 0; i < num.length(); i++) {
                writer.write(num.charAt(i) + "\n");
            }
            writer.close();

        }catch (Exception t) {
            t.getStackTrace();
        }
        FileReader reader = new FileReader("Alphabet.txt");
            Scanner scanner = new Scanner(reader);
            int i = 0;
            while(scanner.hasNextLine()){
                i++;
                System.out.println((i + ":" + " " + scanner.nextLine()));
            }

        reader.close();

        }
    }