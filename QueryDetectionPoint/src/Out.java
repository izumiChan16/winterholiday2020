/**
 * @author izumiChan16
 */
public class Out {
    int xi;
    int yi;
    public void end(int[] min){
        System.out.println("距离您最近的检测点如下，请尽快预约核酸检测！");
        for (int i = 0; i < 3; i++) {
            System.out.println(min[i]+1);
        }

    }

    boolean check(int n,int x,int y,int[][] num) {
        boolean def;
        boolean defn;
        boolean defx;
        boolean defy;
        boolean xyi = true;
        boolean defxi;
        boolean defyi;
        Out[] ck = new Out[n];
        for (int i = 0; i < n; i++) {
            ck[i] = new Out();
        }
        for (int i = 0; i < n; i++) {
            ck[i].xi = num[i][0];
            ck[i].yi = num[i][1];
        }

        defn = (3 <= n && n <= 200);
        for (int i = 0; i < n; i++){
            defxi = (Math.pow(ck[i].xi,2) < 1000000);
            defyi = (Math.pow(ck[i].yi,2) < 1000000);
            if (!defxi || !defyi){
                xyi = false;
                break;
            }
        }
        defx = (Math.pow(x,2) < 1000000);
        defy = (Math.pow(y,2) < 1000000);
        
        if (defn && defx && xyi && defy){
            def = true;
        } else {
            def = false;
        }
        
        return def;
    }
}
