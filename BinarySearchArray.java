public class Array{
    public static int BinarySearch(int number[], int key) {
        int start = 0; int end = number.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if (number[mid] == key){
                return mid;
            } 
            if (number[mid]< key){
            start = mid+1;
            }
            else{
                start = mid-1;
        }
        }
        return -1;
        }
    public static void main(String args[]){
            int number[]  = {2,3,4,5,6,18,20};
            int key = 18; 
            System.out.println("no." +key +" in this array is at: "+ BinarySearch(number, key));
            }       
}
