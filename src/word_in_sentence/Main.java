package word_in_sentence;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE; // 0으로 초기화히여도 무방
        int pos;

        String[] s = str.split(" "); // split()을 이용한 방법
        for (String x : s) {
            int len = x.length();
            if (len > max) { // 긴 단어가 복수 일시, 앞 단어가 출력되게 하기 위해 >=이 아닌 >
                max = len;
                answer = x;
            }
        }

//        while ((pos = str.indexOf(' ')) != -1) { // indexOf()와 substring()을 이용하는 방법
//            String tmp = str.substring(0, pos);
//            int len = tmp.length();
//            if (len > max) {
//                max = len;
//                answer = tmp;
//            }
//            str = str.substring(pos + 1);
//        }
//        if (str.length() > max) {
//            answer = str; // 마지막 단어도 검토
//        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
