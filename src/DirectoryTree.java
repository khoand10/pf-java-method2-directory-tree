import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryTree {
    public static void directoryTree(String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Folder " + path + " does not exist");
        }
        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null) {
                for (File f : list) {
                    System.out.println(f.getCanonicalPath());
                    directoryTree(f.getCanonicalPath());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        directoryTree("F:\\CodeGym\\Conell Note");
    }
}
