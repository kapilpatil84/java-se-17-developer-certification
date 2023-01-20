package chapter14.javaio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileVsPath {
    public static void main(String[] args) {
        //To do anything with filesytem, we need to create object that represents the path to a particular file or directory.
        //Using Legacy I/O, this is java.io.File
        //Using NIO 2.0, this is java.nio.file.Path

        {//Legacy I/O

            File zooFile1 = new File("E:/Projects/GitHub/java-se-17-developer-certification/data/stripes.txt");
            File zooFile2 = new File("E:/Projects/GitHub/java-se-17-developer-certification/", "data/stripes.txt");

            File parent = new File("E:/Projects/GitHub/java-se-17-developer-certification/");
            File zooFile3 = new File(parent, "data/stripes.txt");

            System.out.println(zooFile1.exists());
            System.out.println(zooFile2.exists());
            System.out.println(zooFile3.exists());
        }
        {//Using NIO 2.0
            Path zooFile1 = Path.of("E:/Projects/GitHub/java-se-17-developer-certification/data/stripes.txt");
            Path zooFile2 = Path.of("E:/Projects/GitHub/java-se-17-developer-certification", "data", "stripes.txt");
            Path zooFile3 = Paths.get("E:/Projects/GitHub/java-se-17-developer-certification/data/stripes.txt");
            Path zooFile4 = Paths.get("E:/Projects/GitHub/java-se-17-developer-certification", "data", "stripes.txt");
            System.out.println(Files.exists(zooFile1));
            System.out.println(Files.exists(zooFile2));
            System.out.println(Files.exists(zooFile3));
            System.out.println(Files.exists(zooFile4));
        }
    }
}

