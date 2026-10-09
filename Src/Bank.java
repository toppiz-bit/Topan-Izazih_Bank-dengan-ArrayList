import java.util.ArrayList;

public class Bank {
    private ArrayList<Nasabah> daftarNasabah = new ArrayList<>();

    public void tambahNasabah(String namaDepan, String namaBelakang) {
        daftarNasabah.add(new Nasabah(namaDepan, namaBelakang));
    }

    public int getJumlahNasabah() {
        return daftarNasabah.size();
    }

    public Nasabah getNasabah(int index) {
        return daftarNasabah.get(index);
    }

    // Cari nasabah lewat nama depan, null kalau tidak ketemu
    public Nasabah cariNasabah(String namaDepan) {
        for (Nasabah n : daftarNasabah) {
            if (n.getNamaDepan().equalsIgnoreCase(namaDepan)) {
                return n;
            }
        }
        return null;
    }

    public void printSemua() {
        System.out.println("Jumlah nasabah: " + getJumlahNasabah());
        for (int i = 0; i < daftarNasabah.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarNasabah.get(i).printInfo();
        }
    }
}
