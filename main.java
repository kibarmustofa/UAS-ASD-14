public class main {
    public static void main(String[] args) {
        LinkedList kendaraanList = new LinkedList();

    
        Kendaraan kendaraan1 = new Kendaraan("s 4567 yv", " Basko", "Mobil", 2000, 2012, 4);
        Kendaraan kendaraan2 = new Kendaraan("N 4511 VS", " Arta", "Mobil", 2500, 2015, 3);
        Kendaraan kendaraan3 = new Kendaraan("AB 4321 A", " Wisnu", "Motor", 125, 2010, 2);
        Kendaraan kendaraan4 = new Kendaraan("B 1234 AG", " Sisa", "Motor", 150, 2020, 1);

        kendaraanList.append(kendaraan1);
        kendaraanList.append(kendaraan2);
        kendaraanList.append(kendaraan3);

        
        System.out.println("Data Kendaraan:");
        kendaraanList.printList();
    }
}
