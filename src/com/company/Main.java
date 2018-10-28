package com.company;

import java.io.*;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        try {
//            System.out.println(divide(2, 0));
//        }
//        catch(ArithmeticException e){
//            e.printStackTrace();
        /******************************************************/
//        FileOutputStream out = null;
//        try{
//            out = new FileOutputStream("test.txt");
//            out.write("hello World!".getBytes());
//        }
//        catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//        finally {
//            if(out != null){
//                try {
//                    out.close();
//                }
//                catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//        }
        /*********************************************************************/

        //Drugi sposób
//        try(FileOutputStream out1 = new FileOutputStream("test2.txt")){
//            out1.write("Hej, this is me".getBytes());
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
/*********************************************************************/
//        try(FileInputStream in = new FileInputStream("test2.txt")){
//            int bait = in.read();
//            while(bait >=0) {
//                System.out.println((char)bait);
//                bait = in.read();
//            }
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch(IOException e){
//            e.printStackTrace();
//        }

/**********************************************************************/
/***************Zapisywanie do pliku znakowego******************************/
//        try(BufferedWriter buffer = new BufferedWriter(new FileWriter("test2.txt"))){
//            buffer.write("Java is the best");
//            buffer.newLine();
//            buffer.write("New line");
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        try(PrintWriter buffer = new PrintWriter(new FileWriter("test2.txt"))){
//            buffer.println("Java is the best");
//            buffer.println("New print line");
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        /************************Odczytywanie z pliku**************************/
        try(BufferedReader in = new BufferedReader(new FileReader("test2.txt"))){
            String line = null;
            while((line = in.readLine())!=null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static double divide (double a, double b) throws ArithmeticException{ //uprzedzamy, że metoda może wyrzucić wyjątek
        if(b == 0){
            throw new ArithmeticException("Nie dziel przez zero");
        }
        return a/b;


    }
}
