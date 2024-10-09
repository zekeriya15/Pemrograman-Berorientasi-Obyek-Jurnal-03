public class Pegawai {
    private final String idPegawai;
    private String nama;
    private String alamat;
    private String departemen;
    private double gaji;

    public Pegawai(String id, String nama, String alamat, String departemen, double gaji) {
        this.idPegawai = id;
        this.nama = nama;
        this. alamat = alamat;
        this.departemen = departemen;
        this.gaji = gaji;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // getter
    public String getId() {
        return idPegawai;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getGaji() {
        return gaji;
    }

    @Override
    public String toString() {
        return "ID Pegawai: " + idPegawai + 
                "\nNama: " + nama +
                "\nAlamat: " + alamat +
                "\nDepartemen: " + departemen +
                "\nGaji: " + gaji + "\n";
    }

    
}
