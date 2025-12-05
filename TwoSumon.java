import java.util.*;
public class TwoSumon{
    public static int[] index(int[]num,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<num.length;i++){
            int needed = target-num[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(num[i],i);
        }
        return new int[]{-1,-1};


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String line =sc.nextLine();
        String[] parts = line.trim().split("\\s+");
        int[] num = new int[parts.length];
        for(int i=0;i<parts.length;i++){
             num[i] = Integer.parseInt(parts[i]);
        }
        int target = sc.nextInt();
        int[] result = index(num,target);
        System.out.println(Arrays.toString(result));


    }


    
}
