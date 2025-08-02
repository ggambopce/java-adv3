package lambda.start;

public class Ex0RefMain {

    /**
     * 값 매개변수화
     * 매개변수를 사용해서 문자값을 매개변수로 만들었다.
     * 구체적인 값을 메서드안에 두는 것이아니라 매개변수를 통해 외부에서 전달받도록해서
     * 메서드의 동작을 달리하고 재사용성을 높이는 방법을 값 매개변수화라 한다.
     * @param str
     */
    public static void hello(String str) {
        System.out.println("프로그램 시작");      // 변하지 않는 부분
        // 변하는 부분 시작
        System.out.println(str);
        // 변하는 부분 끝
        System.out.println("프로그램 종료");      // 변하지 않는 부분
    }

    public static void helloJava() {
        System.out.println("프로그램 시작");      // 변하지 않는 부분
        // 변하는 부분 시작
        System.out.println("Hello Java");
        // 변하는 부분 끝
        System.out.println("프로그램 종료");      // 변하지 않는 부분
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        hello("Hello java");
        hello("Hello Spring ");
    }
}
