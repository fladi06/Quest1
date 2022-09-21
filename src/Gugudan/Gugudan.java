package Gugudan;

import java.util.concurrent.SynchronousQueue;

public class Gugudan {
    public static void main(String[] args){
        System.out.println("[구구단 출력]");
        //1. 1단부터 시작함에 따라 첫 시작 숫자는 1로 설정함
        //2. 가로정렬하는 방법을 찾지 못해서 처음 증가하는 숫자를 i로 설정함
        // ex. 1 * 1 , 2* 1, 3 *1 ,,, 이런식으로 i 변수가 먼저 증가하게 설정
        //3. println을 썼을 때 줄이 아예 끝나버려서 printf로 변경하여 출력함.
        //4. String.format("%02d X %02d = %02d""로 출력할 수 있게 설정함.

        for(int j = 1; j < 10; j++) {
            for(int i = 1; i < 10; i++) {
                System.out.printf(String.format("%02d X %02d = %02d",i,j,i*j));
                System.out.printf("    ");
            }
            System.out.println();
        }
    }
}
