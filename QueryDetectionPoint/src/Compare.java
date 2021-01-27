/**
 * @author izumiChan16
 */
public class Compare {
    public int[] compare(int[] dist){
        int[] min = new int[10];
        int minIndex=0;
        int j = 0;
        int reminder = 0;
        for (int i = 0; i < dist.length; i++){
            if (dist[i] > dist[reminder]) {
                reminder = i;
            }
        }
        int max = reminder;
        while(j < 3) {
            for (int i = 0; i < dist.length; i++) {
                if (dist[i] < dist[minIndex] && dist[i] != dist[reminder]) {
                    minIndex = i;
                }
            }
            min[j] = minIndex;
            dist[min[j]] = dist[reminder];
            j++;
        }
        return min;
    }
}
