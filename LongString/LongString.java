import java.util.Scanner;

import java.util.Map;

import java.util.ArrayList;


// https://dev.to/benhayehudi/solving-a-job-application-code-challenge-30d


public class MyClass {


    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a large String: ");

        String inp = scan.next();

        
        scan.close();

    }



    /**

     *
 
    * The longString gets turned into a giant ArrayList

     * a loop will find the first character and will subsequentially go through the ArrayList find, count,
 
    * and remove that character at those indexes in the ArrayLsit

     *
 
    * The character and the amount of that character then get put into our complicated structure
 
 
   * ArrayList<ArrayList<Object>> main storge of the variables

     *      Stores ArrayLists of Objects

     * ArrayList<Character> will be the index 0 of the main storage o

     *      The 'keys'

     *      since char is a primitive we use Character because it is an object

     * ArrayList<Integer> will be the index 1 of the main storage

     *      The 'Amount of chars in the '

     *      in this instance we use Integer instead of int

     *
 
    *
 
    * A new ArrayList will be created.

     * The key with the highest value will be put in first into the new ArrayList

     * Thus sorted from the number of ocurrences

     * 

     * Finnaly Starting from the end of the ArrayList, remove every entry until it it hits the _ character

     * and then removes that character 

     * 

     */


    public String sortLongString(String longString){

        //Structures yay
        ArrayList<ArrayList<Object>> srtChars = new ArrayList<ArrayList<Object>>();

        ArrayList<Character> charsLst = new ArrayList<Character>();

        ArrayList<Integer> intLst = new ArrayList<Integer>();
	srtChars.add(0,charsLst);
        srtChars.add(1,intLst);

        //finding, counting, and removing the characters of longString

        for(int b = 0; b < preMap.size(); b++){

            char currentChar = preMap.get(b);

            int numOfChars = 0;

            for(int c = 0; c < preMap.size(); c++){

                //since char is a primative you can check for equality with ==

                if(preMap.get(c) == currentChar){

                    numOfChars++;

                    preMap.remove(c);

                }
            



            }

         }

        // key with the highest value will be put first


        for(int d = 0; d < unsrtMap.size(); d++){

            
        }

    }


    /**
     * 
     * @param String longString - a long string of random characters from a to z including _
     * 
     * @return ArrayList<char> - an arraylist containing every character of the string longString
     *
     **/

    public ArrayList<char> stringToArrayList(String longString){
        ArrayList<char> conv = new ArrayList<>();
	for(int i = 0; i < longString.length(); i++){
            conv.add(i, longString.charAt(i));
        }
	return conv;
    }

    /**
     * 
     * @param ArrayList<char> cList - An arraylist containing every character of the string longString
     * 
     * @return ArrayList<ArrayList<Object>>
     *
     **/

    public ArrayList<ArrayList<Object>> sortOutCharsAndValues(ArrayList<char> cList){

    } 


}
