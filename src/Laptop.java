//Sub Class
public class Laptop extends Perangkat{
    protected boolean webcam;

    //Atribute
    Laptop (String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam    = webcam; 
    }
    
    //Method
    void informasi() {
        if (webcam) {
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu Laptop ini memiliki webcam");
        }
        else {
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu Laptop ini TIDAK memiliki webcam");   
        }
    }
    
    void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game "+nama_game);
        
    }
    void informasi(String email) {
        System.out.println("Laptop berhasil mengirim Email ke "+email);
        
    }
    void informasi(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim Email ke "+email1+" dan ke "+email2);
        
    }
}
