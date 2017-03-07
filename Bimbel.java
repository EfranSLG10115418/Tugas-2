class Bimbel {
	public static void main (String[]args){
		Siswa DataSiswa = new Siswa();
		Pengajar DataPengajar = new Pengajar();
	


	//Data siswa
	DataSiswa.Nama          = "Rudy Mancuso";
	DataSiswa.Sekolah       = "SMA Negeri 1";
	DataSiswa.AlamatSekolah = "Bandung";


	//Data Pengajar
	DataPengajar.Nama  = "Elizabeth";
	DataPengajar.NIP   = "2140041997";


	System.out.println("\n\n");
	//Output Data Siswa
	DataSiswa.data_siswa();
	System.out.println("Nama Murid	    = "+DataSiswa.Nama);
	System.out.println("Sekolah 		= "+DataSiswa.Sekolah);
	System.out.println("Alamat Sekolah	= "+DataSiswa.AlamatSekolah);

	System.out.println("\n\n");

	//Output Data Pengajar
	DataPengajar.pesan_atas();
	System.out.println("Nama 	= "+DataPengajar.Nama);
	System.out.println("NIP		= "+DataPengajar.NIP);

	}


}