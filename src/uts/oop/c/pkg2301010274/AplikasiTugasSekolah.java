package uts.oop.c.pkg2301010274;

import java.util.Scanner;

/**
 *
 * @author ArlyaDewi
 * Tgl 09 Mei 2025
 * 
 */
public class AplikasiTugasSekolah {
    TugasSekolah[] data = new TugasSekolah[100];
    int index = 0;
    Scanner input = new Scanner(System.in);

    public void jalankan() {
        char pilihan;

        do {
            System.out.println("\nAplikasi List Tugas Sekolah");
            System.out.println("============================");
            System.out.println("A. Lihat Tugas");
            System.out.println("B. Tambah Tugas");
            System.out.println("C. Ubah Tugas");
            System.out.println("D. Hapus Tugas");
            System.out.println("S. Selesai");
            System.out.print("Pilihan Anda (A/B/C/D/S): ");
            pilihan = input.next().toUpperCase().charAt(0);
            input.nextLine(); // clear buffer

            switch (pilihan) {
                case 'A': lihatTugas(); break;
                case 'B': tambahTugas(); break;
                case 'C': ubahTugas(); break;
                case 'D': hapusTugas(); break;
                case 'S': System.out.println(); break;
                default : System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 'S');
    }

    public void lihatTugas() {
        System.out.println("\nDaftar Tugas Sekolah");
        System.out.println("=====================");
        if (index == 0) {
            System.out.println("Belum ada data tugas.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.println("\nTugas ke-" + (i + 1));
                data[i].tampilkan();
            }
        }
    }

    public void tambahTugas() {
        System.out.println("\nTambah Tugas Baru");
        System.out.println("==================");
        System.out.print("Mata Pelajaran       : ");
        String mapel = input.nextLine();
        System.out.print("Deskripsi Tugas      : ");
        String deskripsi = input.nextLine();
        System.out.print("Deadline (dd-mm-yyyy): ");
        String deadline = input.nextLine();
        System.out.print("Status (Selesai/Belum): ");
        String status = input.nextLine();

        data[index] = new TugasSekolah(mapel, deskripsi, deadline, status);
        index++;
        System.out.println("Tugas berhasil ditambahkan.");
    }

    public void ubahTugas() {
        lihatTugas();
        if (index == 0) return;

        System.out.print("\nNomor tugas yang akan diubah: ");
        int no = input.nextInt();
        input.nextLine(); // clear buffer

        if (no > 0 && no <= index) {
            System.out.println("Data Lama:");
            data[no - 1].tampilkan();

            System.out.println("\nMasukkan Data Baru:");
            System.out.print("Mata Pelajaran       : ");
            String mapel = input.nextLine();
            System.out.print("Deskripsi Tugas      : ");
            String deskripsi = input.nextLine();
            System.out.print("Deadline (dd-mm-yyyy): ");
            String deadline = input.nextLine();
            System.out.print("Status (Selesai/Belum): ");
            String status = input.nextLine();

            data[no - 1] = new TugasSekolah(mapel, deskripsi, deadline, status);
            System.out.println("Tugas ke-" + no + " berhasil diubah.");
        } else {
            System.out.println("Nomor tugas tidak valid.");
        }
    }

    public void hapusTugas() {
        lihatTugas();
        if (index == 0) return;

        System.out.print("\nNomor tugas yang akan dihapus: ");
        int no = input.nextInt();
        input.nextLine(); // clear buffer

        if (no > 0 && no <= index) {
            for (int i = no - 1; i < index - 1; i++) {
                data[i] = data[i + 1];
            }
            data[index - 1] = null;
            index--;
            System.out.println("Tugas berhasil dihapus.");
        } else {
            System.out.println("Nomor tugas tidak valid.");
        }
    }
}
