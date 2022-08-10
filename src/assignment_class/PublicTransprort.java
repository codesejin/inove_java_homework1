package assignment_class;

public class PublicTransprort {
    int num;
    int fuel = 100;
    int velocity;
    int Maxpassenger;

    public void move(){

    }
    public void changeStatus() {
        if ( fuel < 10 ) {
            System.out.println("주유가 필요합니다");
        }
        // 주유량이 떨어지거나, 운행을 종료할 때,
    }

    public void getPassenger() {
        System.out.println("승객이 탑승합니다");
    }

    public void changeVelocity(){
        System.out.println("속도 변경합니다");
    }
}
