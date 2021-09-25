
public class DemoForPaperIterator {
	
	public static void main(String[] args) {  
        PaperColection paperCollection = new PaperColection();  
        System.out.println("Types of papers:\n************************************** \n");  
        for(Iterator iter = paperCollection.getIterator(); iter.hasNext();){  
            String paper = (String)iter.next();  
            System.out.println(paper);  
         }      
  }  

}
