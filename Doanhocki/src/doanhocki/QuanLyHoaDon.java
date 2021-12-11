package doanhocki;

import java.util.Scanner;

public class QuanLyHoaDon {
	DSHoaDonXuat hd;
	public QuanLyHoaDon() {
		hd = new  DSHoaDonXuat();
	}
	
	public void qlhd() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap vao infor Hoa Don  \n 2: Xuat infor Hoa Don \n 3: Them Hoa Don \n 4: Search hoa don \n 5: Tim Hoa don theo ma nhan vien \n 6: Sua Hoa Don \n 7: Xoa Hoa Don \n 8: Thong ke theo gia \n 9: thong ke theo nhan vien \n 10: Thong ke theo kahch hang \n 11: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					hd.nhap();
					break;
					
				case "2":
					hd.xuat();
					break;
				case "3":
					hd.them();
					break;
				case "4":
					hd.timKiem();
					break;
				case "5":
					hd.timTheoNv(a);
					break;
				case "6":
					hd.sua();
					break;
				case "7":
					hd.xoa();
					break;	
				case "8":
					hd.thongKeTuGia();
					break ;
				case "9":
					hd.thongKeTheoNvien();
					break;
				case "10":
					hd.thongKeTheoKhachHang();
					break;
				case "11":
					break outer;
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;
			}
		
		}
}
}