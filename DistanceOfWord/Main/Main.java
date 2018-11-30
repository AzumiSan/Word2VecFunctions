import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new WordReadFile("file://C:/Users/DELL/IdeaProjects/Project/src/main/java/DistanceOfWord/ReadFile/wn20_bc.csv");
        } catch (FileNotFoundException e) {
            System.out.println("not found file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassCastException e){
            e.getMessage();
        }
    }
}
