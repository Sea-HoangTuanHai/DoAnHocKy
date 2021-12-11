package doanhocki;

import java.util.Scanner;

public class QuanLyNV {
	DSNhanVien nv;
	public QuanLyNV() {
		nv=new  DSNhanVien();
	}
	public void qlnv() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap vao Infor Nhan Vien \n 2: Xuat infor Nhan Vien \n 3: Them NV \n 4: Tim kiem NV theo ma \n 5: Tim kiem NV theo ten \n 6: Tim kiem NV theo ho \n 7: Sua infor NV \n 8: Xoa Nhan Vien \n 9: Thong ke NV theo gioi tinh \n 10: Thong ke NV theo nam sinh \n 11: Thong ke NV theo ca lam \n 12: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					nv.nhap();
					break;
				case "2":
					nv.xuat();
					break;
				case "3":
					nv.them();
					break;
				case "4":
					nv.timKiem();
					break;
				case "5":
					nv.timTheoTen();
					break;
				case "6":
					nv.timTheoHo();
					break;
				case "7":
					nv.sua();
					break;
				case "8":
					nv.xoa();
				case "9":
					nv.thongKeGioiTinh();
					break;
				case "10":
					nv.thongKeNamSinh();
					break;
				case "11":
					nv.thongKeCaLam();
					break;
				case "12":
					break outer;
		
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;				
				}
			
			
			}
		
	}
	
}