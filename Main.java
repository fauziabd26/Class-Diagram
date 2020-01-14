public class Main{
    public static void main(String[] args) {
        Keranjang k = new Keranjang();
        k.setid_keranjang(354);
        k.setJumlah(26);
        k.showKeranjang();
        Pembeli p1 = new Pembeli();
        p1.setId_pembeli(001);
        p1.setEmail("fauzi aaf");
        p1.setPass("12345");
        p1.setNm_Lengkap("oji abdillah");
        p1.setNo_telp(17);
        p1.showPembeli();
        Produk pr = new Produk(780,"cofee paste",12000);
        //pr.setId_Produk(789);
        //pr.setNm_Produk("coffe paste");
        //pr.setHarga(12000);
        pr.showProduk();
        DetailTrans dt = new DetailTrans(12345678);
        dt.tambahProduk(pr);
        dt.showDetailTrans();
        
        Transaksi t = new Transaksi(p1,dt);
        t.setid_Transaksi(100);
        t.setTnggl(26072020);
        //t.setPembeli(p1);
        t.setStatus("Berhasil");
        //t.setDt(dt);
        t.showTransaksi();
        

    }
}