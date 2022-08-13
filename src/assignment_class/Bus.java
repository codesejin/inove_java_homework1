package assignment_class;

public class Bus extends Transprort {
    int currentPassenger; // 선언..
    //constant 클래스안에절대변하지 않을값을 넣어줌..색깔등등
    //static 메모리올라가는 위치가달라짐..(스프링에서 많이쓰임)!!!
    Bus(int uniqueNum, int currentFuel, int maxPassenger, int price, int currentVelocity, int chagneVelocity,String status) {
        super(uniqueNum,
                currentFuel,
                maxPassenger,
                price,
                currentVelocity,
                chagneVelocity);
        changeStatus(status);
        // 바뀌지 않는 값의 용도로 생성자를 사용

    }

    @Override
    void changeStatus(String status) {
        System.out.println("==== 버스 상태 변경 ====");
        if (status.equals("차고지행")) {
            super.status = "차고지행";
            System.out.println("이 버스는 " + status + "입니다.");
        } else if (status.equals("운행중")) {
            super.status = "운행중";
            System.out.println("이 버스는 " + status + "입니다.");
        }
    }

    // 주유량 변경
    public void changeFuel(int gas) {
        System.out.println("==== 주유량 변경 ====");
        if (gas > 0) {
            currentFuel += gas;
        } else {
            currentFuel += gas;
        }
        if (currentFuel < 10) {
            System.out.println("‼ 주유가 필요합니다 ‼");
            status = "차고지행";
        }
        System.out.println("현재 주유량은 " + currentFuel + "입니다.");
        if (status.equals("차고지행")) {
            System.out.println("현재 상태는 " + status + "입니다.");
        }
    }

    // 승객탑승
    public void plusPassenger(int passenger) {
        System.out.println("==== 승객 탑승 ====");
        if (passenger > 0) {
            currentPassenger += passenger;
        } else {
            currentPassenger -= passenger;
        }
        price = (currentPassenger <= maxPassenger) ? price * passenger : 1000;
        if (currentPassenger <= maxPassenger) {
            status = "운행 중";
            System.out.println("탑승 승객 수는 " + passenger + "명 입니다.");
            System.out.println("잔여 승객 수는 " + (maxPassenger - currentPassenger) + "명 입니다.");
            System.out.println("요금은 " + price + "원 입니다.");
        } else {
            status = "차고지행";
            System.out.println("‼ 최대 승객 수 초과입니다 ‼");
            currentPassenger -= passenger;
        }
    }
}

