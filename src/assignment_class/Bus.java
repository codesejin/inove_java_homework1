package assignment_class;

public class Bus {
    int maxPassenger = 30;
    int currentPassenger;
    int price = 1000;
    int busNum;
    int currentFuel = 100;
    int currentVelocity;
    String status = "운행";

    public void printBusInfo() {
        System.out.println("=== Bus Info ===");
        System.out.println("busNum = " + busNum);
        System.out.println("status = " + status);
        System.out.println("currentVelocity = " + currentVelocity);
        System.out.println("currentPassenger = " + currentPassenger);
    }
    //버스 상태 변경
    public void changeStatus(String inputstatus ) {
        System.out.println("==== 버스 상태 변경 ====");
        if (inputstatus.equals("차고지행")){
            status = "차고지행";
            System.out.println("이 버스는 " + status + "입니다.");
        } else if (inputstatus.equals("운행중")) {
            status = "운행중";
            System.out.println("이 버스는 " + status + "입니다.");
        }
    }
    // 주유량 변경
    public void changeFuel(int gas ) {
        System.out.println("==== 주유량 변경 ====");
        if (gas > 0) {
            currentFuel += gas;
        } else {
            currentFuel += gas;
        }
        if ( currentFuel < 10 ) {
            System.out.println("‼ 주유가 필요합니다 ‼");
            status = "차고지행";
        }
        System.out.println("현재 주유량은 " + currentFuel + "입니다.");
        if ( status.equals("차고지행")) {
            System.out.println("현재 상태는 " + status + "입니다.");
        }
    }

    // 승객탑승
    public void plusPassenger(int passenger ) {
        System.out.println("==== 승객 탑승 ====");
        if (passenger > 0) {
            currentPassenger += passenger;
        } else {
            currentPassenger -= passenger;
        }
        price = (currentPassenger <= maxPassenger) ? price * passenger : 1000;
        if ( currentPassenger <= maxPassenger ) {
            status = "운행 중";
            System.out.println("탑승 승객 수는 " + passenger + "명 입니다.");
            System.out.println("잔여 승객 수는 " + (maxPassenger-currentPassenger) + "명 입니다.");
            System.out.println("요금은 " + price + "원 입니다.");
        } else {
            status = "차고지행";
            System.out.println("‼ 최대 승객 수 초과입니다 ‼");
            currentPassenger -= passenger;
        }
    }
    // 속도변경
    public void changeVelocity(int gas, int Velocity){
        System.out.println("==== 속도 변경 ====");
        while ( gas >= 10 ){
            status = "운행";
            if ( gas < 10 ) {
                System.out.println("주유량을 확인해 주세요");
            }
        }
        if (Velocity > 0) {
            currentVelocity += Velocity;
        } else {
            currentVelocity -= Velocity;
        }
        System.out.println("currentVelocity = " + currentVelocity);
    }
}
