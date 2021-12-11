package doanhocki;

import java.util.Scanner;

public class QuanLyKM {
	KhuyenMai km;
	public QuanLyKM() {
		km=new KhuyenMai();
	}
	public void qlkm() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap infor Thuoc Chua Benh \n 2: Xuat infor Thuoc Chua Benh \n 3: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					km.nhap();
					break;
				case "2":
					km.xuat();
				case "3":
					break outer;
		
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;				
				}
			
			
			}
		
	}
	
}
