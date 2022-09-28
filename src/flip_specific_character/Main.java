package flip_specific_character;

import java.util.Scanner;

public class Main {
    private static String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) { // lt가 알파벳이 아닐 경우
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) { // rt가 알파벳이 아닐 경우
                rt--;
            } else {
                char tmp = s[lt]; // 위치 바꾸기
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); // char 타입 배열을 문자열로 변경

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
