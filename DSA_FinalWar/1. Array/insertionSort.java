import java.util.*;
class insertionSort {
    public static void main(String[] args) {
        int arr[]={5,3,7,5,8,1,9};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
