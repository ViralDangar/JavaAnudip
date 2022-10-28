// name=viral danhar

import java.io.File;      // package for file creation
import java.io.FileWriter;   // package for file CRUD
import java.io.IOException;   // package for exception handling

public class FileHandeling1 {
    public static void main(String[] args) {
        String eid="45";                  // input data in file
        String ename="viral";              //  input data in file
        String esalary="45000";            //   input data in file
        File mf=new File("emp.txt");  // creating new file with file name emp
        try {               // to handle the unexpected file error
            mf.createNewFile();
            FileWriter output=new FileWriter("emp.txt");  // creating object to input data in emp.txt file
            output.write(eid);     // input data in file using write method
            output.write(ename);    // input data in file using write method
            output.write(esalary);    // input data in file using write method
            System.out.println("Data inserted in file");
            output.close();

        } catch (IOException e) {
            System.out.println("Unable To found file");
            System.out.println("Unable to input data");
        }
    }
}
