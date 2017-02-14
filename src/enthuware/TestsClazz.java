package enthuware;

class TestsClazz{
    void probe(int... x) { System.out.println("In ..."); }  //1
    
    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(long x) { System.out.println("In long"); } //3 
    
    void probe(Long x) { System.out.println("In LONG"); } //4
    
    public static void main(String[] args){
        Integer a = 4; new TestsClazz().probe(a); //5
        int b = 4; new TestsClazz().probe(b); //6
    }
}

//public class DatabaseWrapper { 
//	static String url = "jdbc://derby://localhost:1527//mydb";   
//	
//	static DatabaseWrapper getDatabase()   {     
//		 System.out.println("Getting DB");      
//		return null;   
//		}   
//public static void main(String[] args)   { 
//			    System.out.println( getDatabase().url );   } }
