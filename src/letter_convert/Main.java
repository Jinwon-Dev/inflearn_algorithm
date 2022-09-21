package letter_convert;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        
        for (char x : str.toCharArray()) { // 문자를 문자열로 변경
            if (Character.isLowerCase(x)) { // 소문자 일시
                answer += Character.toUpperCase(x); // 대문자로 변경
            } else {
                answer += Character.toLowerCase(x); // 소문자로 변경
            }

//            if (x >= 97 && x <= 122) { // 아스키 코드를 이용한 방법
//                answer += (char) (x - 32);
//            } else {
//                answer += (char) (x + 32);
//            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
