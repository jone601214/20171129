import java.util.Scanner;

public class ｈｗ２ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入身高及性別:");
        int b =scn.nextInt();
        int h =scn.nextInt();
        int g =scn.nextInt();
        int i =scn.nextInt();
        if (h==1){
            System.out.println(Math.round((b-80)*0.7*10)/10f);
        }else if (h==2){
            System.out.println(Math.round((b-70)*0.6*10)/10f);

        }
        if (i==1){
            System.out.println(Math .round((g-80)*0.7*10)/10f);
        }else if (i==2){
            System.out.println(Math.round((g-70)*0.6*10)/10f);
        }
    }
}
