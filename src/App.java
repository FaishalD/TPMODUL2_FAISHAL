public class App {
    public static void main(String[] args) {
        //Perangkat
        Perangkat perangkat = new Perangkat("Mac",8,4.2f);
        perangkat.informasi();
        System.out.println();

        //Laptop
        Laptop laptop = new Laptop("Acer",16,4.2f,true);
        laptop.informasi();
        laptop.bukaGame("GTAVI");
        laptop.informasi("faishaldzk@gmail.com");
        laptop.informasi("rockstar@gmail.com", "steam@gmail.com");
        System.out.println();

        //Handphone
        Handphone handphone = new Handphone("Samsung", 4, 2.4f, false);
        handphone.informasi();
        handphone.telfon(628909809);
        handphone.kirimSMS(628898756);
        handphone.kirimSMS(628532145, 628167890);
        System.out.println();

    }
}
