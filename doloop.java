import java.util.*;

import java.util.*;
public class doloop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        do{
            sum += num;
            num = sc.nextInt();
        }

        while(num != -1);
            //sum += num;
            //num = sc.nextInt();
    
    System.out.println(sum);
}
}
