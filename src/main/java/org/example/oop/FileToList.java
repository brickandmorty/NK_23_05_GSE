package org.example.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileToList {

    // nur zu Demozwecken


    //Es gibt mehrere Möglichkeiten, die Inhalte einer Datei in einer Java-Liste zu speichern, je nachdem, wie
    // die Daten in der Datei organisiert sind. Hier sind einige Beispiele:
    //1. Wenn jede Zeile in der Datei ein separates Element in der Liste sein soll, kann man BufferedReader
    // verwenden, um die Datei zeilenweise zu lesen, und die gelesenen Zeilen in eine ArrayList speichern:



    public static void main(String[] args) {
            String filename = "input.txt";
            List<String> lines = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // die Liste der Zeilen ausgeben
            for (String line : lines) {
                System.out.println(line);
            }
        }
    }

