package javafiles;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;


public class DB4oCore {
	
	public static  ObjectContainer db = null;
	private static ObjectSet result = null;
	public static Query q = null;
	public static Class<?> VarClass = null;

	public DB4oCore() {
		
	}
	
    public static <ClassName> void query4ox(String filename, Class ClassName){
        ObjectSet result = null;
        
        // Open database
        if(db == null){
            db = Db4oEmbedded.openFile(filename);
            }
        // Create query
        Query q = db.query();
    
        // Constrain query to Player objects
        q.constrain(ClassName);
        
        // Descend to battingAverage field and constrain value to be > 0.3
       // q.descend("battingAverage").constrain(new Float(0.3f)).greater();
        //q.descend("battingAverage").constrain(new Float(0.2f)).smaller();
        
        // Execute query
        result = q.execute();
        
        // List results
        System.out.println(result.size());
        while(result.hasNext()) {
            System.out.println(result.next());
        	ClassName p = (ClassName) result.next();
        }
        result.reset();
        
        // Close database
        db.close(); 
        db = null;
    }
	
    
    public static <ClassName> ObjectSet query4o(String filename, Class ClassName){
        ObjectSet result = null;
        
        // Open database
        if(db == null){
            db = Db4oEmbedded.openFile(filename);
            }
        // Create query
        Query q = db.query();
    
        // Constrain query to Player objects
        q.constrain(ClassName);
        
        // Descend to battingAverage field and constrain value to be > 0.3
      //  q.descend("battingAverage").constrain(new Float(0.3f)).greater();
        //q.descend("battingAverage").constrain(new Float(0.2f)).smaller();
        
        // Execute query
        result = q.execute();
        
        // Close database
//        db.close(); 
//        db = null;
        
        return result;
    }

}
