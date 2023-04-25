package org.launchcode.exercises;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        System.out.println(Divide(5,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java ");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Bob", "CoolProgram.txt");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String,String> studentSubmission: studentFiles.entrySet()){
            System.out.println(studentSubmission.getKey()+" received "+CheckFileExtension(studentSubmission.getValue()));
        }
    }

    public static int Divide(int x, int y) throws ArithmeticException
    {
        if(y == 0)
        try{
            throw new ArithmeticException("Cannot divide by zero!");
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        // Write code here!
        return x/y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!

        if(fileName.trim().isEmpty() || fileName.trim().isBlank()){
            return -1;
        }else if(fileName.trim().endsWith(".java")){
            return 1;
        }else{
            return 0;
        }


    }

}
