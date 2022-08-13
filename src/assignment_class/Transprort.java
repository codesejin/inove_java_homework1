package assignment_class;

//다중상속이 안되는 이유..되는 언어는 뭔지,, 차이,,
//자바에는 의존성주입을 표현하기 어렵다
public abstract class Transprort {
    int uniqueNum;
    int currentFuel = 100;
    int currentVelocity = 0;
    int chagneVelocity;
    int maxPassenger;
    int price;
    String status = "";
    Transprort() {}
    Transprort(int uniqueNum, int currentFuel, int maxPassenger, int price, int currentVelocity, int chagneVelocity) {
        this.uniqueNum = uniqueNum;
        this.currentFuel = currentFuel;
        this.maxPassenger = maxPassenger;
        this.price = price;
        this.currentVelocity = currentVelocity;
        this.chagneVelocity = chagneVelocity;

    }
//    버스 상태 변경
    abstract void changeStatus(String inputstatus);


}
