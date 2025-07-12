package Supercar;

public class MobilSport {
    //atribute dan encapsulation
    private String nama;
    private String merk;
    private double harga;
    private int kecepatan;
    
    //constructor
    public MobilSport(String nama, String merk, double harga, int kecepatan ){
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
        this.kecepatan = kecepatan;
    }
    
    //accessor(getter)
    public String getNama(){return nama;}
    public String getMerk(){return merk;}
    public double getHarga(){return harga;}
    public int getKecepatan(){return kecepatan;}
    
    //mutator (setter)
    public void setHarga(double harga){this.harga= harga;}
    
    //polymorphism (method bisa dioverride)
    public void tampilInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Kecepatan Maksimum: " + kecepatan + " km/jam");
    }
   
}
