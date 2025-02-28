class swap{
    static void swap1(int a, int b){
        System.out.println("a was "+a);
        System.out.println("b was "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
    public static void main(String[] args) {
        swap1(5, 6);
    }
}