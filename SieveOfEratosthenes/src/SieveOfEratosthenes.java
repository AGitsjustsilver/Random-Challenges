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
        List<Integer> nonPrimes = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();
        int p = 2, i = 2, n = list.size()+1;
        boolean flag2 = true;
        while(list.size() != 0){
            while(i!=n && (i*p)<=n){//enumerate the multiples of the prime
                if(!nonPrimes.contains(i*p)){
                    nonPrimes.add(i*p);
                }
                list.remove(new Integer(i*p));
                i++;
            }
            while(flag2){//next prime or bust
                for(int nextPrime: list){
                    if(p < nextPrime && !nonPrimes.contains(nextPrime)){
                        primes.add(p);
                        list.remove(new Integer(p));
                        p = nextPrime;
                        flag2 = false;
                        break;
                    }
                }
            }
            n = list.size()+1;
            i = 2;
            flag2 = true;
        }
        System.out.print("Numbers: ");
        printArray(list);
        System.out.print("Non-Prime Numbers: ");
        printArray(nonPrimes);
        System.out.print("Prime Numbers: ");
        printArray(primes);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        SieveOfEratosthenes a = new SieveOfEratosthenes(size);
        in.close();
    }

    private SieveOfEratosthenes(int size){
        this.seiveOfEratosthenes(this.initArrayList(size));
    }

    private ArrayList<Integer> initArrayList(int size){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 2; i <= size; i++){
            a.add(i);
        }
        return a;
    }

    private void printArray(List<Integer> a){
        System.out.println();
        for(int i: a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
