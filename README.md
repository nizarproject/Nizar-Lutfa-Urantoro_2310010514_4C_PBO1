---

# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi showroom mobil sport menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menyimpan dan menampilkan data beberapa mobil sport, termasuk mobil sport listrik. Output aplikasi berupa informasi detail mobil seperti nama, merk, harga, kecepatan, dan kapasitas baterai (untuk mobil listrik).

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `MobilSport`, `MobilSportListrik`, dan `ShowroomMobilSport` adalah contoh dari class.

```bash
public class MobilSport {
    ...
}

public class MobilSportListrik extends MobilSport {
    ...
}

public class ShowroomMobilSport {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarMobil[0] = new MobilSport(...);` adalah contoh pembuatan object.

```bash
daftarMobil = new MobilSport
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `merk`, `harga`, `kecepatan`, dan `kapasitasBaterai` adalah contoh atribut.

```bash
private String nama;
private String merk;
private double harga;
private int kecepatan;
private int kapasitasBaterai;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `MobilSport` dan `MobilSportListrik`.

```bash
public MobilSport(String nama, String merk, double harga, int kecepatan) {
    this.nama = nama;
    this.merk = merk;
    this.harga = harga;
    this.kecepatan = kecepatan;
}

public MobilSportListrik(String nama, String merk, double harga, int kecepatan, int kapasitasBaterai) {
    super(nama, merk, harga, kecepatan);
    this.kapasitasBaterai = kapasitasBaterai;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setHarga`, dan lain-lain adalah contoh method mutator.

```bash
public void setharga(double harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getMerk`, `getHarga` dan `getKecepatan`, adalah contoh method accessor.

```bash
public String getNama() {return nama;}
public String getMerk() {return merk;}
public String GetHarga() {return harga;}
public String getKecepatan() {return kecepatan;}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `merk`, `harga` dan `kecepatan`, dienkapsulasi.

```bash
private String nama;
private String merk;
private double harga;
private int kecepatan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MobilSportListrik` mewarisi `MobilSport` dengan sintaks `extends`.

```bash
public class MobilSportListrik extends MobilSport {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Polymorphism pada kode ini berupa Overriding method `tampilInfo()` di `MobilSportListrik`.

```bash
@Override
public void tampilInfo() {
    super.tampilInfo();
    System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " kWh");
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else`.

```bash
 if (jawab.equalsIgnoreCase("y")) {
 System.out.print("Kapasitas Baterai (kWh): ");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan perulangan `for-each` untuk menampilkan semua data mobil.

```bash
for (MobilSport mobil : daftarMobil) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan method `System.out.println` untuk menampilkan informasi mobil.

```bash
System.out.println("== Data Mobil Sport ==");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MobilSport[] daftarMobil = new MobilSport[3];` adalah contoh penggunaan array.

```bash
MobilSport[] daftarMobil = new MobilSport[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error saat proses menampilkan data mobil.

```bash
try {
    for (MobilSport mobil : daftarMobil) {
        if (mobil != null) {
            mobil.tampilInfo();
        }
    }
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

|  No | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    10   |
|  10 | Seleksi        |    5    |
|  11 | Perulangan     |    5    |
|  12 | IO Sederhana   |    10   |
|  13 | Array          |    15   |
|  14 | Error Handling |    15   |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nizar Lutfa Urantoro
NPM: 2310010514

---
