import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class TestID {
    //байгуулагч функц
    TestID() {

        OpenFile();
    }

    public void OpenFile() {
        //файл унших хэсэг
        try{
            Scanner scanner = new Scanner(new File("C:\\Users\\DELL\\IdeaProjects\\FindID\\ReadFile\\dic_head.tsv"));
            //жагсаалт болгох хэсэг
            LinkedList<String> list = new LinkedList<String>();

            while (scanner.hasNext()){
                list.add(scanner.next());
            }

            // хайх ID-гаа тэнцүүлэн хайх
            for(int i=0; i < list.size(); i++){
                if(list.get(i).equals("100004") && i+2 < list.size()){
                    // тухайн ID байгаа газраас нь урд ба хойдох утгыг хэвлэх
                    System.out.println(list.get(i) +" --> "+ list.get(i-1) +" "+ list.get(i-2) +" "+ list.get(i+1) +" "+ list.get(i+2) +" ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("not found file");
        }
    }
    public static void main(String[] args)
    {
        new TestID();
    }
}