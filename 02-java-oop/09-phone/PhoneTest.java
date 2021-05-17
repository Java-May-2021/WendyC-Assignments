public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s7 = new Galaxy("S7", 70, "Verizon", "Today is great!");
        IPhone iphone7 = new IPhone("IPhone7", 90, "AT&T", "Tomorow is always better!");
        
        s7.displayInfo();
        System.out.println(s7.ring());
        System.out.println(s7.unlock());

        iphone7.displayInfo();
        System.out.println(iphone7.unlock());
        System.out.println(iphone7.ring());


    }
}