package doanhocki;

import java.util.Scanner;

public class QuanLyNCC {
	DSNhaCungCap ncc;
	public QuanLyNCC() {
		ncc=new  DSNhaCungCap();
	}
	public void qlncc() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap vao Thong Tin NCC \n 2: Xuat Thong Tin NCC \n 3: Them NCC \n 4: Tim kiem NCC \n 5: Sua thong tin NCC \n 6: Xoa NCC 7: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					ncc.nhap();
					break;
				case "2":
					ncc.xuat();
				
				case "3":
					ncc.them();
					break;
				case "4":
					ncc.timKiem();
					break;
				case "5":
					ncc.xoa();
					break;
				case "6":
					break outer;
		
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;				
				}
			
			
			}
		
	}
	
}