// CHECKING IF THE NUMBER IS PRIME

public class ThursdayAssigment{
    public static void main(String [] args){
        Scanner input = new scanner(System.in);

        boolean isPrime = true;

        System.out.print("Enter a number : ");
        Int num = input.nextInt();

        if (num <= 1){
            isPrime = false;
        }
        else{
            for (Int i = 2 ; i<= num / 2; i++){
                if( num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime);
        System.out.println(num + " is a prime number. ");
        else
        System.out.println(num + "is NOT a prime. ");
    }
}