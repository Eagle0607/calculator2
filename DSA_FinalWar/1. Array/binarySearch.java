class binarySearch {
    static int search(int arr[],int target){
        int high=arr.length-1,low=0;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int target=5;
        System.out.println(search(a, target));
    }
}
