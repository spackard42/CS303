package Final_Project;
import java.io.*;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args){
        System.out.println("Processicing coded in file:");
        readFile("built_in_example_1");
        boolean running = true;
        while(running){
            System.out.println("name a file you want to process");
        }
    }
    public static Stack<Character> readFile(String fileName){
        try{
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            String line;
            Stack<Character> stk = new Stack<Character>();
            while ((line = file.readLine()) != null){
                for (int i = 0; i < line.length(); i++){
                    if (isValid(line.charAt(i)));
                }
            }

            file.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Program could not find file + " + fileName);
        }
        catch(IOException e){
            System.out.println("error with file \'"+ fileName +"\': " + e);
        }
    }
    public boolean isValid(Character ch){
        if(Character.isDigit(ch)
            || ch == '{'|| ch == '}'|| ch == '['|| ch == ']'|| ch == '('|| ch == ')'
            || ch == '+'|| ch == '-'|| ch == '/'|| ch=='*'|| ch == '%'
            || ch == '<'|| ch == '>'|| ch == '='|| ch == '!'|| ch == '|'|| ch == '&'){
            return true;
        }
        return false;
    }
    
}
