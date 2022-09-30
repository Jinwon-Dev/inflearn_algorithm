package visible_students;

import java.util.Scanner;

public class Main {
    private static int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0]; // 앞에 있는 학생들 중에 가장 큰 키

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i]; // max를 변경
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
