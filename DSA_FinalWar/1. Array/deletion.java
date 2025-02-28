class deletion {
    static void deletion1(int arr[],int index){
        for(int i=0;i<arr.length;i++){
            if(i==index){
                continue;
            }else{
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,6,3,8,9};
        deletion1(arr, 2);
    }
}
