package uts.oop.c.pkg2301010274;

/**
 *
 * @author ASUS
 */
public class TugasSekolah {
    String mataPelajaran;
    String deskripsi;
    String deadline;
    String status;

    public TugasSekolah(String mataPelajaran, String deskripsi, String deadline, String status) {
        this.mataPelajaran = mataPelajaran;
        this.deskripsi = deskripsi;
        this.deadline = deadline;
        this.status = status;
    }

    public void tampilkan() {
        System.out.println("Mata Pelajaran : " + mataPelajaran);
        System.out.println("Deskripsi      : " + deskripsi);
        System.out.println("Deadline       : " + deadline);
        System.out.println("Status         : " + status);
    }
}
