package src;

public class FizzBuzz {

    public static void main(String[] args){
        for(int i = 1; i < 101; i++){
            String fizzzbuzz = "";
            fizzzbuzz+= (i%5 == 0)? "fizz" :"";
            fizzzbuzz+= (i%3 == 0)? "buzz" :"";
            System.out.printf("%d %s\n", i, fizzzbuzz);
        }

    }

}
