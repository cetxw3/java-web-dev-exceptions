package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        System.out.println(Divide(10,2));
        //System.out.println(Divide(10,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.jav");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> x : studentFiles.entrySet()) {
            System.out.println(x.getKey() + " receives " + CheckFileExtension(x.getValue()) + " points for file extention.");
        }
}

    public static double Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x / y;
    }

    public static int CheckFileExtension(String fileName) {
        String lastFive;
        if (fileName.equals(null) || fileName.equals("")) {
            lastFive = fileName;
        } else {
            lastFive = fileName.substring(fileName.length()-5);
        }

        if (lastFive.equals(".java")) {
            return 1;
        } else if (fileName.equals(null) || fileName.equals("")) {
            try {
                throw new FileExtensionException("File name is blank or null");
            } catch (FileExtensionException e) {
                e.printStackTrace();
            }
            return -1;
        } else {
            return 0;
        }
    }

}
