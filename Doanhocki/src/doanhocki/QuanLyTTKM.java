package doanhocki;

import java.util.Scanner;

public class QuanLyTTKM {
	ThongTinKhuyenMai ttkm;
	public QuanLyTTKM() {
		ttkm=new ThongTinKhuyenMai();
	}
	public void qlttkm() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap infor Thuoc Chua Benh \n 2: Xuat infor Thuoc Chua Benh \n 3: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					ttkm.nhap();
					break;
				case "2":
					ttkm.xuat();
				case "3":
					break outer;
		
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;				
				}
			
			
			}
		
	}
	
}
