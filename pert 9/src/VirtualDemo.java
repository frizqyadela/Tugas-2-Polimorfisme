public class VirtualDemo {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Frizqya", "Padang", 1);
        Pegawai gajiPegawai = new Gaji("Dela", "Bukittinggi", 2, 5000.0);

        Pegawai pegawai2 = new Pegawai("Fikry", "Jakarta", 3);
        Pegawai gajiPegawai2 = new Gaji("Zaran", "Bandung", 4, 7000.0);

        pegawai1.mailCheck();
        gajiPegawai.mailCheck();

        pegawai2.mailCheck();
        gajiPegawai2.mailCheck();

        // Polimorfisme
        double weeklyPay1 = ((Gaji) gajiPegawai).computePay();
        double weeklyPay2 = ((Gaji) gajiPegawai2).computePay();

        System.out.println("======================================");
        System.out.println("Pembayaran mingguan untuk " + gajiPegawai.getName() + ": " + weeklyPay1);
        System.out.println("Pembayaran mingguan untuk " + gajiPegawai2.getName() + ": " + weeklyPay2);
    }
}
