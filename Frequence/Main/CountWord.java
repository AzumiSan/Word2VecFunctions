/*
 *Файл уншин үг хэдэн удаа давтагдаж байгааг тоолох
 * Read a text file that count the number of occurrences each word
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {

    static void countofword(String filename, Map<String, Integer> wordCount) throws FileNotFoundException {
        Scanner file = new Scanner(new File(filename));
        while (file.hasNext()) {
            String word = file.next();
            Integer count = wordCount.get(word);
            if (count != null)
                count++;
            else
                count = 1;
            wordCount.put(word, count);
        }
        file.close();
    }
    public static void main(String[]args) throws FileNotFoundException {
        Map<String, Integer>wordCount = new HashMap<String, Integer>();
        countofword("C:\\Users\\DELL\\IdeaProjects\\Frequence\\ReadFile\\wn20_bc.csv", wordCount);
        System.out.println(wordCount);
    }
}
