
public class main {
	
	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak1------");
		// membuat object dari class kotak
		kotak1 main = new kotak1();
			
		// method setter kotak
		main.setpanjang(12.23);
		main.setlebar(3.56);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("------Object Kelas mahasiswa------");
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "udin";
		mahasiswa.nim = "D0217017";
		mahasiswa.alamat = "manyamba";
		mahasiswa.golonganDarah = "AB";
		mahasiswa.status = "pelajar";
		mahasiswa.tinggiBadan = "160";
		mahasiswa.beratBadan = "49";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
		


		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
		node node = new node();
		
		//method setter node
		node.label = "AQUA";
		node.Value = 1;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Object Kelas stack------");
		//membuat object dari kelas stack
		stack stack = new stack();
		
		stack.value[0] = "udin";
		stack.value[1] = "aswad";
		stack.value[2]= "ahmad";
		stack.value[3]= "sadly";
		stack.setvalueAt(4 ,"aswad");

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};


		}

	
}
