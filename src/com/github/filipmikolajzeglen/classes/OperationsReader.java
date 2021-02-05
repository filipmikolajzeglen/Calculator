package com.github.filipmikolajzeglen.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static com.github.filipmikolajzeglen.classes.Calculator.operations;

public class OperationsReader {

    private static final Path path = Paths.get("qinput.txt");

    static Operator operator = new Operator();

    public static void checkMathOperationsFromFile() {
        BufferedReader reader = null;
        ArrayList<String> inputOperations = operations();
        try {
            reader = new BufferedReader(new FileReader(String.valueOf(path)));
            String line = reader.readLine();

            while (line != null) {
                String finalLine = line;
                inputOperations.forEach((operation) -> {
                    if (finalLine.contains(operation.toUpperCase())) {
                        String value = finalLine.replaceAll("[^-0-9]", "");
                        operator.doOperation(operation, Double.parseDouble(value));
                    }
                });

                if (!line.contains("APPLY")) {
                    line = reader.readLine();
                } else {
                    line = null;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File \"" + path + "\" doesn't exist!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
