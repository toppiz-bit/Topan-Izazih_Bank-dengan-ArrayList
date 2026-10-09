public class Akun {
    private int nomorAkun;
    private double saldo;

    // Saldo awal selalu 0
    public Akun(int nomorAkun) {
        this.nomorAkun = nomorAkun;
        this.saldo = 0;
    }

    public int getNomorAkun() {
        return nomorAkun;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    // Mengembalikan true kalau penarikan berhasil
    public boolean tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public void printInfo() {
        System.out.println("   Akun " + nomorAkun + " | Saldo: Rp" + saldo);
    }
}
