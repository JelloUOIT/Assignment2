

package assignment2;
import java.util.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author Jelani
 */
 /*
 * This application will read from an input file which contains proposed designs
 */
   
     
public class CircuitApp{
    public static void main(String args[]){
        
        try{
            FileReader fr = new FileReader(args[0]);// this line a code reads data from the given file
            FileWriter fw = new FileWriter("good.txt");// this line allows the file writer to output code
                    
            BufferedWriter bw = new BufferedWriter(fw);// data from the File Writer is stored within this buffer
            BufferedReader br = new BufferedReader(fr);//data from the File Reader is stored in this buffer
            
            String line;
            
            System.out.println("Reading File: "+args[0]);
            System.out.println("These designs are not acceptable");
            while((line=br.readLine())!=null);{
                String[] data = line.split("\\s+");//gets input data from the line
                double l1 = Double.parseDouble(data[0]);
                double l2 = Double.parseDouble(data[0]);
                double l3 = Double.parseDouble(data[0]);
                double l4 = Double.parseDouble(data[0]);
                double l5 = Double.parseDouble(data[0]);
                double l6 = Double.parseDouble(data[0]);//this line and the 5 lines above it convert the data into a double
                
                double denominator = (l1+l2)*l4*l6;
                double numerator = (l3+l4)*l1*l5;
                DecimalFormat df = new DecimalFormat("#.0");// this line of code formats the numbers calculated in the given resistance equation
                
                double FinalResistance = numerator/denominator;// calculates the final resistances
                
                String j = df.format(FinalResistance);
                
                if(j.equals("7.5"))
                {
                    for(int w = 0; w<data.length; w++)
                    {
                        bw.write(data[w]+"  ");
                    }
                    bw.newLine();
                }
                else{
                    for(int w = 0; w<data.length; w++){
                        System.out.print(data[w]+"\t");
                    }
                    System.out.println("");
                }
        }
            bw.close();
            br.close();
            fr.close();
            fw.close();
        }
        catch(Exception Error)
        {
            System.out.println(Error);
        }
        
    }
}
