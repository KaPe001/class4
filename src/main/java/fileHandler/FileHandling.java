package fileHandler;

import java.io.*;

public class FileHandling {
    public static void main(String[] args){
//        System.out.println(System.getProperty("file-separator"));
//        System.out.println(System.getProperty("user.dir"));
//
//        //file
//        File file = new File("src/main/java/fileHandler/plik.txt");
//
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//
//        //zapis do pliku
//
//        String[] uczestnicy = {"dsa", "djos", "djisa"};
//        FileWriter fileWriter = null;
//        try{
//            fileWriter = new FileWriter("src/main/java/fileHandler/plik.txt");
//            for (String u : uczestnicy){
//                fileWriter.write(u + "\n");
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }finally {
//            try{
//                fileWriter.close();
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//            System.out.println("Zapis do pliku - SUCCESS");
//        }

        //zapis do pliku 2

        String content = "This is the content to write into file\n";

        // If the file doesn't exist, create and write to it
        // If the file exists, truncate (remove all content) and write to it

        try (FileWriter writer = new FileWriter("src/main/java/fileHandler/plik.txt");  //żeby dopisywać do pliku append, dodaj true jako drugi parametr do FileWriter
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(content);
            bw.append("darek");

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        //czytanie z pliku
        //try with resources
        // BuffedReader
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/fileHandler/plik.txt"))) {
            String input;
            while ((input = br.readLine()) != null) {
                System.out.println(input);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
