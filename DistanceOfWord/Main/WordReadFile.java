import edu.cmu.lti.lexical_db.ILexicalDatabase;
import edu.cmu.lti.ws4j.impl.Lin;
import edu.cmu.lti.ws4j.impl.WuPalmer;
import edu.cmu.lti.ws4j.util.WS4JConfiguration;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WordReadFile {

    public WordReadFile(String filename) throws IOException {
        List<String> list = new LinkedList<>(fileToList(filename));

        listToDistance((LinkedList) list);

    }

    /*
     *Файлд байгаа бүх үг болон векторыг зөвхөн үгийг жагсаалт болгон хувиргах
     */
    public List fileToList(String filename) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(filename);
        DataInputStream data_input = new DataInputStream(fileInputStream);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(data_input));

        List<String> list = new LinkedList<>();
        String str_line;

        while ((str_line = buffer.readLine()) != null){
            String []line_array = str_line.split(" ");

            for(int i=0; i < line_array.length; i++){
                if(isString(line_array[i]))
                    list.add(line_array[i]);
            }
        }
        return list;
    }

    /*
     * Glove.txt дотор байгаа үг болон тухайн үгийн вектор утгуудаас үг мөн эсэхийг олох
     */
    public boolean isString(String text){
        String tmp = new String(text);
        try{
            Double.parseDouble(tmp);
        }catch (Exception ex){
            return true;
        }
        return false;
    }

    /*
     *Жагсаалт дотор байгаа бүх үгийн ( n!/(c-k)! * k! ) хослолын distance-ийг олох
     */
    public void listToDistance(LinkedList list) throws ClassCastException{
        for(int i=0; i < list.size(); i++){
            for(int j=i; j < list.size(); j++){
                System.out.println( new WordDistance().compute((String) list.get(i),(String) list.get(j)));
            }
        }
    }
}
