package assignment_class;

public class PublicTransprort {
    int uniqueNum;
    int currentFuel = 100;
    int currentVelocity = 0;
    int chagneVelocity;
    int maxPassenger;
    int price;
    String status = "";
    PublicTransprort() {}
    PublicTransprort(int uniqueNum, int currentFuel,int maxPassenger, int price, int currentVelocity, int chagneVelocity,String status) {
        this.uniqueNum = uniqueNum;
        this.currentFuel = currentFuel;
        this.maxPassenger = maxPassenger;
        this.price = price;
        this.currentVelocity = currentVelocity;
        this.chagneVelocity = chagneVelocity;
    }
//    버스 상태 변경
    public void changeStatus(String inputstatus) {
        System.out.println("==== 버스 상태 변경 ====");
        if (inputstatus.equals("차고지행")) {
            status = "차고지행";
            System.out.println("이 버스는 " + status + "입니다.");
        } else if (inputstatus.equals("운행중")) {
            status = "운행중";
            System.out.println("이 버스는 " + status + "입니다.");
        }
    }
}
