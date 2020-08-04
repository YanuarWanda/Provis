package Model;

/**
 *
 * @author Yanuar Wanda Putra
 */
public class mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private int tinggi;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getTinggi() {
        return tinggi;
    }

    public mahasiswa(String nim, String nama, String jenisKelamin, int tinggi) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tinggi = tinggi;
    }
}
