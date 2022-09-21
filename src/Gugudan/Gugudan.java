package Gugudan;

public class Gugudan {
    public static void main(String[] args){
        System.out.println("[구구단 출력]");
        for(int i = 2; i < 10; i++) {
            for(int j = 2; j < 10; j++) {
                System.out.println(String.format("%02dX%02d=%02d",i,j,i*j));
                //System.out.println(String.format("%02d", i,j));
            }
            System.out.println();
        }
    }
}
