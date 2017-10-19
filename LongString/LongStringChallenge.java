import java.util.Scanner;

public class LongStringChallenge{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a large String: ");
        String inp = scan.next();
        doTheThing(inp);
        scan.close();
    }
    
    /**
     * 
     * The longString gets turned into a giant ArrayList
     * a loop will find the first character and will subsequentially go through the ArrayList to find, count, and remove that character at those indexes in the ArrayList
     * 
     * 
     * A new ArrayList will be created
     * The key with the highest value will be put in first into the new ArrayList
     * Thus sorted from the numer of ocurrences
     * 
     * Finally starting from the end of the ArrayList, remove every entry until it hits the _ character and then finally removes that character 
     */
    
    public void doTheThing(String ls){
        
    }
     
    /**
     * 
     * @param String longString - a long string of random characters from a to z including _
     * 
     * @return ArrayList<char> - an arraylist containing every character of the string longString
     *
     **/
    public ArrayList<char> stringToArrayList(String longString){
        ArrayList<char> conv = new ArrayList<char>();
        for(int i = 0; i < longString.length(); i++){
                conv.add(i, longString.charAt(i));
            }
    	return conv;
    }
    
}