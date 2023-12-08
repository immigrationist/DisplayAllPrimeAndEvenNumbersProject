public class DisplayAllPrimeAndEvenNumbers {

    public static boolean numberEven(int num){
        boolean isEven;

        if (num % 2 == 0)
            isEven = true;
        else
            isEven = false;
        return isEven;
    }

    public static boolean numberPrime(int num){
        boolean isPrime = true;
        int count = 2;

        while(count < num && isPrime == true){
            if(num % count == 0)
                isPrime = false;
            count = count + 1;
        }

        return isPrime;
    }
    public static void main(String[] args) {
        int number = 0;
        int count = 1;
        boolean isEven;
        boolean isPrime;

        System.out.println("Enter a number");
        number = 100;
        
        while(count < number){
            isPrime = numberPrime(count);
            isEven = numberEven(count);

            if(isPrime == true || isEven == true)
                System.out.println(count);

            count = count + 1;
        }

    }
}
