package doanhocki;

import java.util.Scanner;

public class QuanLyCTHD {
	CTHoaDon cthd;
	public QuanLyCTHD() {
		cthd=new  CTHoaDon();
	}
	public void qlcthd() {
		outer:
			
			while (true){
				Scanner sc= new Scanner(System.in);
				
				System.out.println(" 1: Nhap vao Thong Tin chi tiet Hoa Don \n 2: Xuat infor Hoa Don \n 3: Thoat");
				System.out.println("-----------Nhap lua chon---------");
				String a= sc.nextLine();
				switch (a)
				{
				case "1":
					cthd.nhap();
					break;
				case "2":
					cthd.xuat();
				case "3":
					break outer;
		
				default: System.out.println("Nhap sai.. Nhap lai: ");
					break;				
				}
			
			
			}
		
	}
	
}