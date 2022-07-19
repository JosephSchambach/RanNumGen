// Generates a number, specified by user, of random numbers between 1 and 100

public class RanNumGen
{
    public static void main(String[] args)
    {
        // Determine number of random numbers to be generated 
        int num = Integer.parseInt(args[0]);
        int i = 0;
        // Specify max number for random numbers
        int max = 100;
        // Specify min number for random numbers 
        int min = 1;
        int range = max - min + 1;
        // Loop that runs until it reaches number of random numbers desired 
        while (i < num)
        {
            // Multiply random number by range and add the minimum
            int ranNum = (int)(Math.random() * range) + min;
            // Print out random number 
            System.out.println(ranNum);
            // Update i after each loop until it is equal to the number of random numbers and breaks out loop
            i = i + 1;
        }
    }
}