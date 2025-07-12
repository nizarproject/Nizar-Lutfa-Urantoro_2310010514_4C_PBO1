package Supercar;

//subclass(inheritance)
public class MobilSportListrik extends MobilSport {
    private int kapasitasBaterai;
    
    public MobilSportListrik(String nama, String merk, double harga, int kecepatan, int kapasitasBaterai){
        super(nama, merk, harga,kecepatan);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai  + "kWh");
    }
    
}
