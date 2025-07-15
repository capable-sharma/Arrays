public class Array{
    public static int LinearSearch(int number[], int key) {
        for(int i=0; i<number.length; i++){
            if(number[i]== key){
                return i;
                }
            }
            return -1;
    }
    public static void main(String args[]){
            int number[]  = {2,3,4,5,6,11,13,14,18,20};
            int key = 14;
            
            int index = LinearSearch(number, key);
            if(index== -1){
                System.err.println("NOT FOUND");
            }
            else{
                System.out.println("Key is at index:" +index);
            }

        }

    }
