import java.awt.*;
import java.util.Scanner;

/**
 * @author izumiChan16
 */
public class In {

    int[] begin(){
        int[] reminder = new int[1000];
        int i=0;
        System.out.print("请输入检测点总数及您当前的位置（以空格隔开）：");
        Scanner scan = new Scanner(System.in);
        while ( i < 3 ){
            //3次输入
            reminder[i] = scan.nextInt();
            i++;
        }
        return reminder;
    }
    int[][] input (int n) {
        String[] str;
        int[][] num = new int[n][2];
        int k = n;
        n = 0;
        for (int i=0; i < k; i++) {
            System.out.print("请继续键入坐标，格式为（xi yi）：");
            Scanner scan = new Scanner(System.in);
            str = scan.nextLine().split(" ");
            //字符串以空格分割
            int j = 0;
            while (j < 2){
                for (String s : str) {
                    num[i][j] = Integer.parseInt(String.valueOf(s));
                    //将字符串的数字保存到整型数组里
                    j++;
                }
            }
        }
        return num;
    }

}
