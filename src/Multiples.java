public class Multiples {
    public static void main(String[] args){
        int a = 0;
        for (int i = 1; i < 1000; i++) {
            boolean dby3 = i % 3 == 0;
            boolean dby5 = i % 5 == 0;
            if (dby3 || dby5) {
                a++;
            }
        }
        System.out.println(a);
    }
}
