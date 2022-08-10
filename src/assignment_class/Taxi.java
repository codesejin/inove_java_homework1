package assignment_class;

public class Taxi {
    int maxPassenger = 4;
    int currentPassenger;
    int price = 3000;
    int perprice = 1000;
    int taxiNum;
    int currentFuel = 100;
    int currentVelocity;
    String status = "일반";
    int totalpaid;

    Taxi (int taxiNum) {
        this.taxiNum = taxiNum; // 생성자
    }
    //택시상태
    public void taxiInfo () {
        System.out.println("현재 택시의 주유량은 " + currentFuel + "입니다.");
        System.out.println("현재 택시의 상태는 " + status + "입니다.");
    }
    // 오버로딩 : 한 클래스 내에 같은 이름이 메소드를 여러개 정의
    // 매개변수의 개수나 타입이 달라야한다
    // 특정 함수에서 매개변수 일부만 받아서 함수를 실행하고 싶을 때 사용 가능
    public void plusPassenger(int passenger) {
        System.out.println("==== 승객 탑승 ====");
        if (passenger > 0) {
            currentPassenger += passenger;
            status = "운행중";
        } else {
            currentPassenger -= passenger;
        }
        if (!status.equals("일반")) {
            status = "‼ 탑승 불가 ‼ ";
        }
        System.out.println(status + "입니다.");
        currentPassenger -= passenger;
    }
    // 승객탑승
    public void plusPassenger(int passenger, String destination, int todestination) {
        System.out.println("==== 승객 탑승 ====");
        if (passenger > 0) {
            currentPassenger += passenger;
            status = "운행중";
        } else {
            currentPassenger -= passenger;
        }

        if (currentPassenger <= maxPassenger) {
//            status = "운행 중";
            System.out.println("탑승 승객 수는 " + passenger + "명 입니다.");
            System.out.println("잔여 승객 수는 " + (maxPassenger - currentPassenger) + "명 입니다.");
            System.out.println("기본 요금은 " + price + "원 입니다.");
            System.out.println("목적지는 " + destination + "입니다.");
            System.out.println("목적지까지거리는 " + todestination + "km 입니다.");
            System.out.println("지불할 요금은 " + (price + (perprice*(todestination-1))) + "원 입니다.");
        } else {
            System.out.println("‼ 최대 승객 수 초과입니다 ‼");
            currentPassenger -= passenger;
        }

        System.out.println("현재 택시의 상태는 " + status + "입니다.");
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
            status = "운행 불가";
        }
        System.out.println("현재 주유량은 " + currentFuel + "입니다.");
        System.out.println("현재 상태는 " + status + "입니다.");

    }

    public void paid () {
        totalpaid += (price + (perprice));
        System.out.println("==== 요금 결제 ====");
        System.out.println("현재 누적요금은 " + totalpaid + "원 입니다.");
        currentPassenger = 0;
        status = "일반";

    }
}

