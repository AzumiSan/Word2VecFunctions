import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FindSenseID {
    //байгуулагч функц
    FindSenseID() {

        OpenFile();
    }

    public void OpenFile() {
        //файл унших хэсэг
        try{
            Scanner scanner = new Scanner(new File("file://C:/Users/DELL/IdeaProjects/Project/src/main/java/FindID-wnc/ReadFile/dic_sense.tsv"));
            //жагсаалт болгох хэсэг
            LinkedList<String> list = new LinkedList<String>();

            while (scanner.hasNext()){
                list.add(scanner.next());
            }

            // хайх ID-гаа тэнцүүлэн хайх
            for(int i=0; i < list.size(); i++){
                if(list.get(i).equals("10001301") && i+4 < list.size()){
                    // тухайн ID байгаа газраас нь урд ба хойдох утгыг хэвлэх
                    System.out.println(list.get(i) +" --> "+ list.get(i-1)  +" "+ list.get(i+1) +" "+ list.get(i+2) +" "+ list.get(i+3)+ list.get(i+4));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("not found file");
        }
    }
    public static void main(String[] args)
    {
        new FindSenseID();
    }
}