public class buku {
	String MerkBuku,UkuranBuku;
	int LembarBuku,BeratBuku,HargaBuku;
	
	void cetakInfo() {
		System.out.println("Merk Buku    : "+ MerkBuku);
		System.out.println("Ukuran       : "+ UkuranBuku);
		System.out.println("Lembar       : "+ LembarBuku+" lembar");
		System.out.println("Berat        : "+ BeratBuku +" gram");
		System.out.println("Harga        : Rp. "+ HargaBuku);
		System.out.println("======================================");
	}
}
