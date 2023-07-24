package BaekJoon;

import java.util.Scanner;

/*
* 일단, f(n) = (a1 * n) + a0
* O(g(n)) = O(n) => g(n) = n
* f(n) <= c * g(n) (여기서 n은 n0보다 크거가 같다는 전제하에)
* 위 식에서 알 수 있는 사실은 (a1*n)+a0 <= c*n 에서 무조건 정의에 만족하려면 c는 a1보다 커야 한다!
* 따라서 c >= a1
 */
public class BJ_24313 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int fn = (a1 * n0) + a0;

        if(fn <= c * n0 && c>= a1){
            //O(n)정의를 만족하므로 1출력
            if(c == a1 && a0 >0) {
                System.out.println("0");
                return;
            }
            System.out.println("1");
        }else{
            //O(n)정의를 만족하지 않으므로 0출력
            System.out.println("0");
        }
    }
}
