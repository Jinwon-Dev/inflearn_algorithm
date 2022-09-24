package flip_word;

import java.util.*;

public class Main {
    private static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString(); // StringBuilder와 reverse()를 이용한 방법
            answer.add(tmp);
        }
//        for (String x : str) { // 직접 인덱스에 접근하여 문자를 바꿔주는 방법
//            char[] s = x.toCharArray();
//            int lt = 0;
//            int rt = x.length() - 1;
//
//            while (lt < rt) { // 문자(글자)들을 서로 바꿔주는 작업
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;
//            }
//            String tmp = String.valueOf(s); // 문자열로 변경
//            answer.add(tmp);
//        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : solution(n, str)) {
            System.out.println(x);
        }
    }
}
