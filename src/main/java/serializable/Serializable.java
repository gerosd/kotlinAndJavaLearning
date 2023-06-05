package serializable;

import java.io.*;

public class Serializable {
    public static void main(String[] args) throws InterruptedException {
        serialization();
        Thread.sleep(2000);
        unSerialization();
    }
    private static void serialization() {
        try (FileOutputStream fos = new FileOutputStream("src\\main\\resources\\serializable.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            FileForSerialization ffs = new FileForSerialization();
            oos.writeObject(ffs);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void unSerialization() {
        try (FileInputStream fis = new FileInputStream("src\\main\\resources\\serializable.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            FileForSerialization ffs = (FileForSerialization) ois.readObject();
            System.out.println(ffs);
        } catch(ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
