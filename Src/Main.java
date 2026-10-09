public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // 1. Tambah nasabah ke bank
        bank.tambahNasabah("Toppiz", "Lv999");
        bank.tambahNasabah("Topan", "Izazih");
        bank.tambahNasabah("Azi", "Pizz");

        // 2. Buat akun lalu masukkan ke nasabah
        Nasabah Toppiz = bank.getNasabah(0);
        Toppiz.tambahAkun(new Akun(2001));
        Toppiz.tambahAkun(new Akun(2002));

        Nasabah Topan = bank.getNasabah(1);
        Topan.tambahAkun(new Akun(2003));

        // AziPizz belum punya akun

        // 3. Setor dan tarik
        Toppiz.getAkun(0).setor(1500000);
        Toppiz.getAkun(1).setor(300000);
        Topan.getAkun(0).setor(2000000);

        System.out.println("=== Setelah setor ===");
        bank.printSemua();

        boolean berhasil = Toppiz.getAkun(0).tarik(500000);
        System.out.println("\nToppiz tarik Rp500000 -> " + (berhasil ? "berhasil" : "gagal"));

        berhasil = Topan.getAkun(0).tarik(5000000);
        System.out.println("Topan tarik Rp5000000 -> " + (berhasil ? "berhasil" : "gagal (saldo kurang)"));

        // 4. Cari nasabah
        System.out.println("\n=== Cari nasabah 'Topan' ===");
        Nasabah hasil = bank.cariNasabah("Topan");
        if (hasil != null) {
            hasil.printInfo();
        }

        System.out.println("\n=== Kondisi akhir ===");
        bank.printSemua();
    }
}
