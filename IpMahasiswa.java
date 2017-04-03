import java.util.Scanner;

public class IpMahasiswa {

    	public static void main(String[] args){
		IpMahasiswa ipmhs = new IpMahasiswa();
		Scanner input = new Scanner(System.in);
		float IP;
		int jmlMhs=0, mahasiswaLulus=0, mahasiswaTidakLulus=0;
		
		System.out.print("Masukkan IP : ");
		IP=input.nextFloat();
		while(IP!=-999){
			if(ipmhs.isWithinRange(IP, 0, 4) == 1){
				jmlMhs++;
				if(IP >= 2.7 && IP <= 4.0){
						mahasiswaLulus++;
				} else{
						mahasiswaTidakLulus++;
				}
			}
			System.out.print("Masukkan IP : ");
			IP=input.nextFloat();
		}
		System.out.println("Jumlah Mahasiswa : "+jmlMhs);
		System.out.println("Jumlah Mahasiswa Yang Lulus : "+mahasiswaLulus);
		System.out.println("Jumlah Mahasiswa Yang Tidak Lulus : "+mahasiswaTidakLulus);
	}
	
	int isWithinRange(float x, int min, int max){
			if(x>=min && x<=max){
				return 1;
			} else {
				return 0;
			}
	}
}