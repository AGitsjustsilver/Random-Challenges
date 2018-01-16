package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * To find all the prime numbers less than or equal to a given integer n by Eratosthenes' method:
 *
 * Create a list of consecutive integers from 2 through n: (2, 3, 4, ..., n).
 * Initially, let p equal 2, the smallest prime number.
 * Enumerate the multiples of p by counting to n from 2p in increments of p, and mark them in the list (these will be 2p,
 * 3p, 4p, ...; the p itself should not be marked).
 * Find the first number greater than p in the list that is not marked. If there was no such number, stop. Otherwise, let
 * p now equal this new number (which is the next prime), and repeat from step 3.
 * When the algorithm terminates, the numbers remaining not marked in the list are all the primes below n.
 **/

public class SieveOfEratosthenes{

    public void seiveOfEratosthenes(ArrayList<Integer> l){
        List<Integer> list = l;
        List<Integer> marked = new ArrayList<>();
        List<Integer> unmarked = new ArrayList<>();
        for(int item: list){//for every number in list
            int cons = 2;//the beginning multiple
            for(int i  = 1; i < list.size(); i++){//every position in list
                int mult = item*cons;// multiple being checked
                int pos = list.get(i);//item at the position i being checked
                if(mult == pos
                        && !marked.contains(pos)){
                    // if the multiple of the item is at the position of i being checked and if it is not already marked
                    marked.add(pos);//the position is marked
                    cons++;//multiple is increased
                }else if(!unmarked.contains(pos)){
                    unmarked.add(pos);
                }
            }
        }
        System.out.print("Numbers: ");
        for(int a : list){//prints final prime numbers
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("Positions Marked: ");
        for(int a: marked){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("Prime Numbers: ");
        for(int a : unmarked){//prints final prime numbers
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        SieveOfEratosthenes a = new SieveOfEratosthenes(size);
        in.close();
    }

    public SieveOfEratosthenes(int size){
        this.seiveOfEratosthenes(this.initArrayList(size));
    }

    public ArrayList<Integer> initArrayList(int size){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 2; i <= size; i++){
            a.add(i);
        }
        return a;
    }
}
