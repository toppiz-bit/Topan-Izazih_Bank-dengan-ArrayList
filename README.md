# Latihan Bank dengan ArrayList

Program Java sederhana untuk mengelola nasabah dan akun bank.

## Struktur Kelas

```
Bank  --(ArrayList<Nasabah>)-->  Nasabah  --(ArrayList<Akun>)-->  Akun
```

| Kelas | Isi |
|---|---|
| `Akun` | nomor akun, saldo (awal 0), `setor`, `tarik` |
| `Nasabah` | nama depan, nama belakang, `ArrayList<Akun>` |
| `Bank` | `ArrayList<Nasabah>`, tambah dan cari nasabah |
| `MainBankAkun` | program utama untuk mencoba semuanya |

## Penggunaan ArrayList
- `Bank` menyimpan banyak nasabah di `ArrayList<Nasabah>`.
- `Nasabah` menyimpan banyak akun di `ArrayList<Akun>`.
- Method yang dipakai: `add()`, `get(index)`, `size()`, dan perulangan for-each.

## Cara Menjalankan
```
cd src
javac *.java
java MainBankAkun
```

## Screenshot Hasil
![Hasil program](hasil.png)
