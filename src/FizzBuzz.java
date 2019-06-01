
//uses for loop and if statements to write fizz for numbers divisible by 3 and 
//buzz for numbers divisible by 5 and 
//fizzbuzz for numbers divisible by 3 and 5. 
public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            if(i%3==0) {//mult of 3, fizz
                System.out.print("fizz");
                if(i%5==0) {//mult of 3 and 5, fizzbuzz
                    System.out.print("buzz");
                }
            }
            else if(i%5==0) {//mult of 5, buzz
                System.out.print("Buzz");
            }
            else {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}