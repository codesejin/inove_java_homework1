package assignment_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("[     버스 시나리오     ]");
        // 객체 생성 시 데이터를 바로 입력 받음
        Bus mybus1 = new Bus(1234, 100, 30, 1000, 0, 0,"운행");
        Bus mybus2 = new Bus(5678, 100, 30, 1000, 0, 0,"운행");

        System.out.println("첫 번째 버스 고유 번호는 "+mybus1.uniqueNum+"입니다.");
        System.out.println("두 번째 버스 고유 번호는 "+mybus2.uniqueNum+"입니다.");
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


        System.out.println();
        System.out.println("[     택시 시나리오     ]");
        Taxi mytaxi1 = new Taxi(1111, 100, 4, 3000, 0, 0, "일반");
        Taxi mytaxi2 = new Taxi(2222, 100, 4, 3000, 0, 0, "일반");

        System.out.println("첫 번째 택시 고유 번호는 "+mytaxi1.uniqueNum+"입니다.");
        System.out.println("두 번째 택시 고유 번호는 "+mytaxi2.uniqueNum+"입니다.");
        mytaxi1.status = "일반";

        mytaxi1.taxiInfo();
        mytaxi1.plusPassenger(2, "서울역", 2);
        mytaxi1.changeFuel(-80);
        mytaxi1.paid(2);
        mytaxi1.plusPassenger(5);
        mytaxi1.plusPassenger(3, "구로디지털단지역", 12);
        mytaxi1.paid(12);
        mytaxi1.changeFuel(-20);
    }
}
