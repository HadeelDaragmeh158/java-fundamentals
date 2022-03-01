import java.lang.String;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main{

    public static void main(String[] args) {
        System.out.println(pluralize("Hello,",5 ));
        flipNHeads(1);
        clock();
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////// Method pluralize  ///////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    public static String pluralize(String word , int num ){
        if (num == 1 || num >0)
            return word+"s";
        else return word;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////// Method flipNHeads  //////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
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
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////// Method clock  ///////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////

    public static void clock() {
int counter =0;
        while (true) {
            counter++;
            LocalDateTime  theDate = LocalDateTime.now();
            DateTimeFormatter MyFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
            String TheFormat = theDate.format(MyFormat);
            System.out.println(TheFormat);
        }
    }
}

















