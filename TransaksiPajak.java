
public class TransaksiPajak {
    int kode, bulanBayar;
    long nominalBayar, denda;
    String kendaraan;

    public TransaksiPajak(int kode, int bulanBayar, long nominalBayar, long denda , String kendaraan ){
        this.kode = kode;
        this.bulanBayar = bulanBayar;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.kendaraan = kendaraan;
    }
}
