import java.util.Scanner;
class Wordle{

    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        String[] words={"Can","May","Say","Who","Why","Pen","Sim"};
        Boolean[] flag={false,false,false};
        String guessWord="XXX";

        int guessCount=6;
        for(int i=0;i<6;i++){
            System.out.println(guessWord);
            System.out.println("Enter index: ");
            int index=read.nextInt();

        }
        
        System.out.println();
        for(String word: words){
            System.out.println(word);
        }
    }

}