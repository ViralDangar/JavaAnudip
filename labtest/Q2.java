// Viral Dangar
// make a program with "FileReader" and "FileWriter" classes?

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Writing
{
 public void writefile(){
    {
        try {
           FileWriter fw = new FileWriter("abc.txt");
           fw.write("Hello My name is viral and i am writing in the file..");
           fw.close();
        } catch (IOException e) {
            System.out.println("Unable to write in the file");
        }
    }
}}

class Reading
{
    public void readfile(){
    {
        try {
            FileReader fr=new FileReader("abc.txt");
             int i;
             while((i=fr.read()) != -1)
             {
                 System.out.println(i);
             }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}}


public class Q2 {
    public static void main(String[] args) {
        Writing w=new Writing();
        Reading r=new Reading();
        w.writefile();
        r.readfile();
    }
}
