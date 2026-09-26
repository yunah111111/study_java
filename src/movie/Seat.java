package movie;

public class Seat implements Reservable{
    public String seatNumber;
    public boolean reserved;


    @Override
    public void reserve() {
        reserved = true;
    }

    @Override
    public void cancel() {
        reserved = false;
    }

    public void showInfo() {
        System.out.println("좌석번호: " + seatNumber);
        System.out.println("예약여부: " + reserved);
    }
}
