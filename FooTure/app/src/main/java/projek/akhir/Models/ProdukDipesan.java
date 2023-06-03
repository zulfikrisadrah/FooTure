package projek.akhir.Models;

public class ProdukDipesan extends Pesanan{
    private Produk produk;
    private int kuantitas;

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    @Override
    public void tambahPesanan() {
        kuantitas = kuantitas + 1;
    }

    @Override
    public void kurangPesanan() {
        kuantitas = kuantitas - 1;
    }

    
}
