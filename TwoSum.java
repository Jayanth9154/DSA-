import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] Sum(int [] num , int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    return new int[]{i,j};
                }

            }
        }return new int[]{-1,-1};
    }
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String  line = sc.nextLine();
String [] parts = line.trim().split("\\s+");
int [] num = new int[parts.length];
for(int i=0;i<parts.length;i++){
    num[i] = Integer.parseInt(parts[i]);
    }
    int target = sc.nextInt();
int [] result =Sum( num ,target);
System.out.println(Arrays.toString(result));
sc.close();
}
}    

