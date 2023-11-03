import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int [] array = new int[10];
        Random rand = new Random();
        for(int i = 0; i< array.length; i++){
            array[i]=rand.nextInt(100)+1;

        }
        int smallest =array [0];
        int largest =array[0];

        for( int i =0; i<array.length;i++){
            if (array[i]<smallest){
                smallest= array[i];
            }
            if(array[i]>largest){
                largest = array[i];
            }
        }
        System.out.println("Smalles number is: "+ smallest);
        System.out.println("Largest number is: "+ largest);
    }
}