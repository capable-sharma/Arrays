public class Array{
    public static int Largest(int number[]) {
        int Largest = Integer.MIN_VALUE; 

        for (int i=0; i<number.length; i++){
            if(Largest < number[i]){
                Largest = number[i];
            }
        }
        return Largest;
    }
    public static void main(String args[]){
            int number[]  = {2,3,4,5,6,18,20,6,9};
            System.out.println("largest no. in this array: "+ Largest(number));
            }       
}
