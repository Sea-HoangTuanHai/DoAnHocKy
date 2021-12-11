package doanhocki;

import java.util.Scanner;

public class QuanLyKhachHang {
	DSKhachHang kh;
	public QuanLyKhachHang() {
		kh=new  DSKhachHang();
	}
	public void qlkh() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap vao infor Khach Hang  \n 2: Xuat infor Khach Hang \n 3: Them khach hang \n 4: Search khach hang theo ten \n 5: Tim Khach Hang Theo ho \n 6: Sua infor Khach Hang \n 7: Xoa Khach Hang \n 8: Thong Ke \n 9: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					kh.nhap();
					break;
					
				case "2":
					kh.xuat();
					break;
				case "3":
					kh.them();
					break;
				case "4":
					kh.timTheoTen();
					break;
				case "5":
					kh.timTheoHo();
					break;
				case "6":
					kh.sua();
					break;
				case "7":
					kh.xoa();
					break;
				case "8":
					kh.thongKe();
					break;
				case "9":
					break outer;
		
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;
			}
		
		}
	}
	
	
}
 

