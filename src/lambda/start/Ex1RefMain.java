package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex1RefMain {

    /**
     * 동작 매개변수화
     * 코드 조각을 전달하기 위해서는 메서드가 필요.
     * 메서드만 전달할 수 있는 방법이 없다.
     * 대신에 인스턴스를 전달하고 인스턴스에 있는 메서드를 호출하면 된다.
     * 인터페이스를 매개변수로 인스턴스를 전달
     * @param procedure
     */
    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        //코드 조각 시작
        procedure.run();
        //코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }


    static class Dice implements Procedure{

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Procedure{

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Procedure dice = new Dice();
        Procedure sum = new Sum();

        dice.run();
        sum.run();
    }
}
