import java.util.PriorityQueue;

public class addingarrayelements {
    int minOperations(int[] arr, int n, int k) {
        PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
        for(int i = 0;i<n;++i)
            prq.add(arr[i]);
        int ans = 0;
        while(prq.size() >= 1)
        {
            if(prq.peek() >= k)
                return ans;
            int sum = prq.poll() ;
            //null pointer exception may occur (to avoid it we re-check)
            if(prq.size() >= 1)
            {
                sum += prq.poll();
                ++ans;
                prq.add(sum);
            }
        }
        return -1;
    }
}