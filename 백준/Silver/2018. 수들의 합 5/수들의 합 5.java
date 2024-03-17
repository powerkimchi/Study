// 수들의 합 5
// 어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
// 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다.
// 이때, 사용하는 자연수는 N이하여야 한다.
// 예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.
// N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {
    Scanner kb;

    int N;
    private void Sum(){
        kb = new Scanner(System.in);
        N = kb.nextInt();

        int start = 1;
        int end = 1;
        int count = 1;
        int sum = 1;

        while(end != N){
            if(sum == N){
                count++;
                end++;
                sum += end;
            }else if(sum > N){
                sum -= start;
                start++;
            }else if(sum < N){
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Main App = new Main();

        App.Sum();
    }
}
