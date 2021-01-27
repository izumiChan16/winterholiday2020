/**
 * @author izumiChan16
 */
public class Start {


    public static void main(String[] args){
        In begin = new In();
        int[] reminder;
        reminder = begin.begin();
        int n = reminder[0];
        int x = reminder[1];
        int y = reminder[2];

        In next = new In();
        int[][] num;
        num = next.input(n);

        Out next1 = new Out();
        boolean result;
        result = next1.check( n, x, y, num);

        if(result){
            Calculate next2 = new Calculate();
            int[] dist;
            dist = next2.distance( num, x, y, n);

            Compare next3 = new Compare();
            int[] min;
            min = next3.compare( dist );

            Out end = new Out();
            end.end(min);
        } else {
            System.out.println("您的输入有误，请检查数据重新启动程序！");
        }
    }
}