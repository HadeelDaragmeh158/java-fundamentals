import java.lang.String;
import java.util.Random;
import java.time.LocalDateTime;
class Main{

    public static void main(String[] args) {
        System.out.println(pluralize("Hello,",5 ));
        flipNHeads(1);
        clock();
    }
    public static String pluralize(String word , int num ){
        if (num == 1 || num >0)
            return word+"s";
        else return word;
    }
    public static void flipNHeads(int n){
        double nhead=0.0;
        int FLIPS=0,N=0;
        Random random = new Random();
        do{
            nhead=random.nextFloat();
            if (nhead<0.5) {
                System.out.println("tails");
                FLIPS++;
            }
            else {
                System.out.println("heads");

                N++;
                FLIPS++;
            }
        }while(N<n);
        System.out.println("It took "+ FLIPS+ " flips to flip "+N+ " heads in a row.");
    }
    public static void clock() {
        LocalDateTime  theDate = LocalDateTime.now();
        int hour = theDate.getHour();
        int minute = theDate.getMinute();
        int second = theDate.getSecond();
        System.out.println(hour + ":" + minute + ":" + second);

        while (true) {
            theDate = LocalDateTime.now();
            if (theDate.getSecond() != second) {
                hour = theDate.getHour();
                minute = theDate.getMinute();
                second = theDate.getSecond();
//                String finalDate=
                System.out.println(hour + ":" + minute + ":" + second);
            }}}
}
















