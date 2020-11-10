public class creating_object {
    public static int x= -327696;
    public static long y=63214585;
    public static void main(String[] args) {
        int z= x+y;
        System.out.println(x);
        System.out.println(y);
        creating_object obj1 = new creating_object();
        creating_object obj2 = new creating_object();
        System.out.println(obj1.x);
        System.out.println(obj2.y);
    }
}
