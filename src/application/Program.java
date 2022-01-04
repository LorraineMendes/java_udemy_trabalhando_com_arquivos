package src.application;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Hi! I'm learning Java", "I love python", "I study physics"};

        //Criar um arquivo e gravar os dados nesse arquivo
        String path = "out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write((line));
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
