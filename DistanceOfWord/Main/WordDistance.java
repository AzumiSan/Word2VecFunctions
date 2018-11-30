import edu.cmu.lti.lexical_db.ILexicalDatabase;
import edu.cmu.lti.lexical_db.NictWordNet;
import edu.cmu.lti.ws4j.impl.WuPalmer;
import edu.cmu.lti.ws4j.util.WS4JConfiguration;

public class WordDistance {

    /*
     * харьцуулах хоёр үг хадгалах хүснэгт
     */
    String []words = new String[2];
    /*
     * Wordnet db
     */
    public ILexicalDatabase db;

    WordDistance(){
        /*
         *Wordnet db - ийн бэлэн сан
         */
        db = new NictWordNet();
    }
    /*
    *Хоёр үг өгөхөд тухайн үгйин зайг олох
    Wordnet - ийн өөрийнх нь сангийн үг зайг олох функц
    */
    public double compute(String word1, String word2) {
        WS4JConfiguration.getInstance().setMFS(true);
        double distance = new WuPalmer(db).calcRelatednessOfWords(word1, word2);
        return distance;
    }
}
