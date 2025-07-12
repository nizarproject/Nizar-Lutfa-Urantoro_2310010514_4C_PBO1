package Supercar;

import java.util.Scanner;

public class ShowroomMobilSport {
    public static void main(String[] args) {
        
        //IO sederhana
        Scanner input = new Scanner(System.in);
        
        //array dan object
        MobilSport[] daftarMobil = new MobilSport[3];

        System.out.println("=== Input Data Mobil Sport ===");
        
        //perulangan
        for (int i = 0; i < daftarMobil.length; i++) {
            
            //error handling
            try {
                System.out.println("\nMobil ke-" + (i + 1));
                System.out.print("Nama Mobil: ");
                String nama = input.nextLine();

                System.out.print("Merk: ");
                String merk = input.nextLine();

                System.out.print("Harga: ");
                double harga = Double.parseDouble(input.nextLine());

                System.out.print("Kecepatan Maksimum: ");
                int kecepatan = Integer.parseInt(input.nextLine());

                System.out.print("Apakah mobil ini listrik? (y/n): ");
                String jawab = input.nextLine();

                //Seleksi
                if (jawab.equalsIgnoreCase("y")) {
                    System.out.print("Kapasitas Baterai (kWh): ");
                    int baterai = Integer.parseInt(input.nextLine());
                    daftarMobil[i] = new MobilSportListrik(nama, merk, harga, kecepatan, baterai);
                } else {
                    daftarMobil[i] = new MobilSport(nama, merk, harga, kecepatan);
                }
                
                //error handling
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input! " + e.getMessage());
                i--; // ulangi input
            }
        }

        System.out.println("\n=== Daftar Mobil Sport ===");
        double totalHarga = 0;

        //perulangan
        for (MobilSport mobil : daftarMobil) {
            mobil.tampilInfo();
            System.out.println("----------------------");
            totalHarga += mobil.getHarga();
        }

        System.out.println("Total Harga Semua Mobil: Rp " + totalHarga);
    }
}