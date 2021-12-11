package doanhocki;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
    	outer:
		
    	while (true)
    	{
    		System.out.println(" 1: Quan ly Hoa Don \n 2: Quan Ly CTHD \n 3: Quan ly Khach Hang \n 4: Quan ly NCC \n 5: Quan ly Nhan Vien \n 6: Quan Ly san pham \n 7: Quan ly thuoc chua benh \n 8: Quan ly thuoc ngoai da \n 9:Quan Ly khuyen mai \n 10: Thong tin khuyen mai \n 11: Thoat");
    		System.out.println("-----------Nhap lua chon---------");
    		String a= sc.nextLine();
    		switch (a) {
			case "1":
				QuanLyHoaDon qlhdx=new QuanLyHoaDon();
				qlhdx.qlhd();
				break;
			case "2":
				QuanLyCTHD lisshd=new QuanLyCTHD();
				lisshd.qlcthd();
				break;
			case "3":
				QuanLyKhachHang qldskh=new QuanLyKhachHang();		
				qldskh.qlkh();
				break;
			case "4":
				QuanLyNCC qldsncc=new QuanLyNCC();
				qldsncc.qlncc();
				break;
			case "5":
				QuanLyNV qldsnv = new QuanLyNV();
				qldsnv.qlnv();
			case "6":
				QuanLySanPham qldssp=new QuanLySanPham();
				qldssp.qlsp();
				break;
			case "7":
				QuanLyTCB qldstcb=new QuanLyTCB();
				qldstcb.qltcb();
				break;
			case "8":
				QuanLyTND qldstnd=new QuanLyTND();
				break;
			case "9":
				QuanLyKM qldskm=new QuanLyKM();
				qldskm.qlkm();
				break;
			case "10":
				QuanLyTTKM dsttkm=new QuanLyTTKM();
				dsttkm.qlttkm();
			break;
			case "11":
				break outer;
			default:  System.out.println("Nhap sai.. Nhap lai: ");
			break;
			}
    		
    		
    
    	}
    }
    
}