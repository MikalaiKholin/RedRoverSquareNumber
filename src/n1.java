public class n1 {
    public static void main(String[] args) {
        int number = 9;
        int start = 1;
        while (start * start < number){
            start++;
        }
        System.out.println(start + " after while"); ///сколько прошло циклов

        if (number == start*start) {
            System.out.println(start * start + " == ");
        }else if ((start*start - number) < (number-(start -1)*(start -1))) {
            System.out.println(start * start );
        }else {
            System.out.println((start - 1) * (start - 1) + " result");
        }
    }
}
