import java.util.*;

public class btrees09 {
    // word ladder

    public static int ladderlength(String beginword, String endword, List<String> wordlist) {
        if (!wordlist.contains(endword)) {
            return 0;
        }
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginword);
        int length = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            length++;

            for (int i = 0; i < size; i++) {
                String current = q.poll();

                for (int j = 0; j < current.length(); j++) {
                    char[] temp = current.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        temp[j] = c;
                        String newword = new String(temp);
                        if (newword.equals(endword)) {
                            return length + 1;

                        }
                        if (wordlist.contains(newword) && !visited.contains(newword)) {
                            q.offer(newword);
                            visited.add(newword);
                        }
                    }
                }

            }
        }
        return 0;

    }

}
