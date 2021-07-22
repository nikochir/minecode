/* package */
package src.test.nikochir.minecode;
/* include */
/** mongodb **/
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
/** bson **/
import org.bson.Document;
/* typedef */
/* endfile */
/* Main
 * > Description:
 * -> ;
*/
public class Main {
    
    /* members */

    private static String strURI = ""
    + "mongodb://keeper:db9314671364@"
    + "unit0-shard-00-00.19rj5.mongodb.net:27017,"
    + "unit0-shard-00-01.19rj5.mongodb.net:27017,"
    + "unit0-shard-00-02.19rj5.mongodb.net:27017"
    + "/mdbstore?"
    + "ssl=true"
    + "&replicaSet=atlas-94hogs-shard-0"
    + "&authSource=admin"
    + "&retryWrites=true"
    + "&w=majority";

    /** mongodb **/
    private static MongoClient objClient = null;
    private static MongoDatabase objDatabase = null;
    private static MongoCollection<Document> objCollection = null;

    /* getters */
    
    /* setters */

    private static boolean setClient() {
        
        if (false) {
        } else if (setClientWithURI()) {
            return true;
        }

        return true;
    }

    private static boolean setDatabase() {
        objDatabase = objClient.getDatabase("room0");

        return true;
    }

    private static boolean setCollection() {
        objCollection = objDatabase.getCollection("chest0");

        return true;
    }

    private static boolean setClientWithURI() {
        
        /* create uniform resource identfier connection string */
        MongoClientURI objURI = new MongoClientURI(strURI);
        objClient = new MongoClient(objURI);
        
        return true;
    }

    /* vetters */


    /* actions */
    
    private static boolean doInit() {
        
        setClient();
        setDatabase();
        setCollection();

        return true;
    }

    private static boolean doWork() {
        
        Document objDoc = new Document("type", "message");
        objDoc.append("name", "success");
        objDoc.append("data", "we did it!");
        objDoc.append("date", "{22/07/21}:[12:12]");
        
        objCollection.insertOne(objDoc);

        return true;
    }

    private static boolean doQuit() {
        
        objClient.close();

        return true;
    }

    public static void main(String[] strArgs) {
        
        doInit();
        doWork();
        doQuit();

    }
}
/* endfile */