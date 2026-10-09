import java.util.ArrayList;

public class Nasabah {
    private String namaDepan;
    private String namaBelakang;
    private ArrayList<Akun> daftarAkun = new ArrayList<>();

    public Nasabah(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public String getNamaLengkap() {
        return namaDepan + " " + namaBelakang;
    }

    public void tambahAkun(Akun akun) {
        daftarAkun.add(akun);
    }

    public Akun getAkun(int index) {
        return daftarAkun.get(index);
    }

    public int getJumlahAkun() {
        return daftarAkun.size();
    }

    public double getTotalSaldo() {
        double total = 0;
        for (Akun a : daftarAkun) {
            total += a.getSaldo();
        }
        return total;
    }

    public void printInfo() {
        System.out.println(getNamaLengkap() + " (" + getJumlahAkun() + " akun)");
        for (Akun a : daftarAkun) {
            a.printInfo();
        }
        System.out.println("   Total saldo: Rp" + getTotalSaldo());
    }
}
