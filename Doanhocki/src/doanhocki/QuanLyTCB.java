package doanhocki;

import java.util.Scanner;

public class QuanLyTCB {
	ThuocChuaBenh tcb;
	public QuanLyTCB() {
		tcb=new ThuocChuaBenh();
	}
	public void qltcb() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap infor Thuoc Chua Benh \n 2: Xuat infor Thuoc Chua Benh \n 3: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					tcb.nhap();
					break;
				case "2":
					tcb.xuat();
				case "3":
					break outer;
		
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;				
				}
			
			
			}
		
	}
	
}
