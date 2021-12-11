package doanhocki;

import java.util.Scanner;

public class QuanLySanPham {
	DSSanPham sp;
	public QuanLySanPham() {
		sp=new  DSSanPham();
	}
	public void qlsp() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap vao Infor San Pham \n 2: Xuat infor San Pham \n 3: Them sp \n 4: Tim kiem sp theo ma \n 5: Tim kiem sp theo ten \n 6: Tim kiem sp theo loai \n 7: Sua infor SP \n 8: Xoa San Pham \n 9: Thong ke San Pham theo loai \n 10: Thong ke San Pham theo gia \n 11: Thong ke San Pham so luong con lai \n 12: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					sp.nhap();
					break;
				case "2":
					sp.xuat();
					break;
				case "3":
					sp.them();
					break;
				case "4":
					sp.timKiem();
					break;
				case "5":
					sp.timTheoTen();
					break;
				case "6":
					sp.timTheoLoai();
					break;
				case "7":
					sp.sua();
					break;
				case "8":
					sp.xoa();
				case "9":
					sp.thongKeTheoLoai();
					break;
				case "10":
					sp.thongKeTuGiaDenGia();
					break;
				case "11":
					sp.thongKeSluongCo();
					break;
				case "12":
					break outer;
		
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;				
				}
			
			
			}
		
	}
	
}