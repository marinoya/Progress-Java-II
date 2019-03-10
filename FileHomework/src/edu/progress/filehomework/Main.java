package edu.progress.filehomework;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\C17942A\\Desktop\\TEMP\\System.2019-03-10.log");
        System.out.println("Is directory: " +f.isDirectory());

        System.out.println("Is file: " + f.isFile());

        System.out.println("It exists: " + f.exists());

        try {
            FileInputStream fis = new FileInputStream(f);
            FileReader fir = new FileReader(f);
//            System.out.println((char)fir.read());
//            System.out.println((char)fir.read());
//            System.out.println((char)fir.read());
//            System.out.println((char)fir.read());
//            System.out.println((char)fir.read());
//            System.out.println((char)fir.read());
//            System.out.println((char)fir.read());
//
            //char[] charar = new char[100];
            //fir.read(charar);
            //System.out.println(Arrays.toString(charar));

            BufferedReader bufr = new BufferedReader(fir);
            while (true){
                String line = bufr.readLine();
                if (line==null)
                    break;
                if (line.contains("inboundmovesuccessful")){
                    System.out.println(line);




                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
