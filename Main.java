package Bangundatar;

public class Main {
    public static void main(String[] args){

        bangundatar BangunDatar = new bangundatar();
        Segitiga segitiga = new Segitiga(8, 6);
        Lingkaran lingkaran = new Lingkaran(30);

        BangunDatar.luas();
        BangunDatar.keliling();

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Lingkaran: " + lingkaran.keliling());
    }
}
