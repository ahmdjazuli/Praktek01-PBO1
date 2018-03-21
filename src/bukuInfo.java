class bukuInfo {
	public static void main(String[] args) {
		// bikin objek dulu
		buku BukuGambar = new buku();
		buku BukuTulis = new buku();
		buku BukuMajalah = new buku();
		
		// ngisi nilai atribut
		BukuGambar.MerkBuku = "SIDU";
		BukuGambar.UkuranBuku = "A4";
		BukuGambar.LembarBuku = 12;
		BukuGambar.BeratBuku = 250;
		BukuGambar.HargaBuku = 4000;
		
		BukuTulis.MerkBuku = "Maxy Tiara";
		BukuTulis.UkuranBuku = "A5";
		BukuTulis.LembarBuku = 38;
		BukuTulis.BeratBuku = 99;
		BukuTulis.HargaBuku = 3500;
		
		BukuMajalah.MerkBuku = "BOBO";
		BukuMajalah.UkuranBuku = "A4";
		BukuMajalah.LembarBuku = 20;
		BukuMajalah.BeratBuku = 400;
		BukuMajalah.HargaBuku = 10000;
		
		//panggil fungsi
		BukuGambar.cetakInfo();
		BukuTulis.cetakInfo();
		BukuMajalah.cetakInfo();
	
	}
}
