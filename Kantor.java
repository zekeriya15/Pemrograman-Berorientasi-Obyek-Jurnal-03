import java.util.ArrayList;

public class Kantor {
    ArrayList<Pegawai> listPegawai;

    // constructor
    public Kantor() {
        listPegawai = new ArrayList<>();
    }

    // function
    public void addPegawai(Pegawai p) {
        listPegawai.add(p);
    }

    public void getPegawai() {
        for (Pegawai p : listPegawai) {
            System.out.println(p);
        }
    }

    public void getPegawai(String departemen) {
        for (Pegawai p : listPegawai) {
            if (p.getDepartemen().equalsIgnoreCase(departemen)) {       // p.getDepartemen() returns string | .equalsIgnoreCase() is string method
                System.out.println(p);
            }
        }
    }

    public void getGajiPegawai(double gaji) {
        for (Pegawai p : listPegawai) {
            if (p.getGaji() > gaji) {
                System.out.println(p);
            }
        }

    }

    public void setDataPegawai(String id, String nama, String alamat, String departemen, double gaji) {
        for (Pegawai p : listPegawai) {
            if (p.getId().equals(id)) {
                p.setNama(nama);
                p.setAlamat(alamat);
                p.setDepartemen(departemen);
                p.setGaji(gaji);
            }
        }

    }


}
