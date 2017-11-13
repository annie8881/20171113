import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int counter=1;
        int grade,sum=0;
        while(counter<=10) {
            grade=in.nextInt();
            sum=sum+grade;
            counter=counter+1;
        }
        System.out.print(sum/10);
    }
}
