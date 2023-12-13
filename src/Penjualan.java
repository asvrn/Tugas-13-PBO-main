public class Penjualan extends Transaksi implements Pembayaran {
    public Penjualan(String namaPelanggan, String noHp, String alamat, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(namaPelanggan, noHp, alamat, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * getJumlahBeli();
    }

    @Override
    public void setJumlahBeli(int jumlahBeli) {
        super.setJumlahBeli(jumlahBeli);
    }

    public int getJumlahBeli() {
        return super.jumlahBeli;
    }

    // Override metode tampilkanDetailTransaksi dari kelas dasar
    @Override
    public void tampilkanDetailTransaksi() {
        super.tampilkanDetailTransaksi();
        System.out.println("Total Bayar\t: " + hitungTotalBayar());
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("Kasir\t\t: " + kasir);
    }
}
