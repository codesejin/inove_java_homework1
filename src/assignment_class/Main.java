package assignment_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("[     버스 시나리오     ]");
        Bus mybus1 = new Bus(1234); // 객체 생성 시 데이터를 바로 입력 받음
        Bus mybus2 = new Bus(5678);

        mybus1.maxPassenger = 30;
        mybus1.currentFuel = 100;
        mybus1.price = 1000;

        System.out.println("첫 번째 버스 고유 번호는 "+mybus1.busNum+"입니다.");
        System.out.println("두 번째 버스 고유 번호는 "+mybus2.busNum+"입니다.");
        // 승객 탑승
        mybus1.plusPassenger(2);
        // 주유량 변경
        mybus1.changeFuel(-50);
        mybus1.changeStatus("차고지행");
        mybus1.changeFuel(10);
        mybus1.changeStatus("운행중");
        mybus1.plusPassenger(45);
        mybus1.plusPassenger(5);
        mybus1.changeFuel(-55);

        System.out.println("[     택시 시나리오     ]");
        Taxi mytaxi1 = new Taxi(1111);
        Taxi mytaxi2 = new Taxi(2222);

        mytaxi1.maxPassenger = 4;
        mytaxi1.currentFuel = 100;
        mytaxi1.price = 3000;

        System.out.println("첫 번째 택시 고유 번호는 "+mytaxi1.taxiNum+"입니다.");
        System.out.println("두 번째 택시 고유 번호는 "+mytaxi2.taxiNum+"입니다.");

        mytaxi1.taxiInfo();
        mytaxi1.plusPassenger(2, "서울역", 2);
        mytaxi1.changeFuel(-80);
        mytaxi1.paid();
        mytaxi1.plusPassenger(5);
        mytaxi1.plusPassenger(3, "구로디지털단지역", 12);
        mytaxi1.paid();
        mytaxi1.changeFuel(-20);
    }
}
