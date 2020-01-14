public class Transaksi {
    private int id_Transaksi;
    private int tnggl;
    private String status;
    private Pembeli pembeli;
    private DetailTrans dt;

    public Transaksi(Pembeli pembeli, DetailTrans dt){
        this.pembeli = pembeli;
        this.dt = dt;
    }
    public int getid_Transaksi() {
        return id_Transaksi;
    }

    public void setid_Transaksi(int id_Transaksi) {
        this.id_Transaksi = id_Transaksi;
    }

    public int getTnggl() {
        return tnggl;
    }

    public void setTnggl(int tnggl ) {
        this.tnggl = tnggl;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status ) {
        this.status = status;

    }public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli ) {
        this.pembeli = pembeli;
    }
    public DetailTrans getDt() {
        return dt;
    }

    public void setDt(DetailTrans dt ) {
        this.dt = dt;
    } 
    public void showTransaksi(){
        System.out.println("Id Transaksi : " + getid_Transaksi());
        System.out.println("Tanggal : " + getTnggl());
        System.out.println("Pembeli : " + pembeli.getNm_lengkap());
        System.out.println("Status : " + getStatus());
        System.out.println("Detail Transaksi : " + dt.getId_DetailTrans());
        System.out.println("");
    }
}