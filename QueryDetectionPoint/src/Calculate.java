/**
 * @author izumiChan16
 */
public class Calculate {
    int xi;
    int yi;
    public int[] distance(int[][] num, int x, int y, int n) {
        Calculate[] cal = new Calculate[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            cal[i] = new Calculate();
        }
        for (int i = 0; i < n; i++) {
            cal[i].xi = num[i][0];
            cal[i].yi = num[i][1];
        }
        int distance;
        for (int i = 0; i < n; i++){
            distance = (int) Math.pow(x-cal[i].xi,2) + (int) Math.pow(x-cal[i].yi,2);
            dist[i] = distance;
        }
    return dist;
    }
}
