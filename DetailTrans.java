import java.util.ArrayList;

public class DetailTrans {
    private int id_detailTrans;
    private ArrayList<Produk> listProduk = new ArrayList<>();

    public DetailTrans(int id_detailTrans){
        this.id_detailTrans = id_detailTrans;
    }
    public int getId_DetailTrans() {
        return id_detailTrans;
    }

    public void setId_DetailTrans(int id_detailTrans) {
        this.id_detailTrans = id_detailTrans;
    }

    public void tambahProduk(Produk listProduk){
        this.listProduk.add(listProduk);
    }

    
    public void showDetailTrans(){
        System.out.println(getId_DetailTrans());
        for (Produk produk : listProduk) {
            produk.showProduk();
        }
    }
}