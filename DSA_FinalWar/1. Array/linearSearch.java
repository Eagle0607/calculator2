class linearSearch {
    public static void main(String[] args) {
        int a[]={3,6,1,8,6,4,9};
        int target=4;
        for(int i=0;i<a.length;i++){
            if(a[i]==target) {
                System.out.println(i);
            }
        }
    }
}
