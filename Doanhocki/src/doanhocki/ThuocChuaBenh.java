package doanhocki;


import java.util.*;
import java.lang.*;
import java.io.*;
public class ThuocChuaBenh extends SanPham{
	Scanner in = new Scanner(System.in);
	private String ThanhPhan;
	private String xuatxu;
	//Constructor
	public ThuocChuaBenh() {}
	public ThuocChuaBenh(String masp, String tensp, String loai, int gia, int soluongco, String ThanhPhan, String xuatxu) {
		super(masp,tensp,loai,gia,soluongco);
		this.ThanhPhan = ThanhPhan;
		this.xuatxu = xuatxu;
	}
	public ThuocChuaBenh(ThuocChuaBenh ff) { //ff means fast food
		super((SanPham) ff);
		ThanhPhan = ff.ThanhPhan;
		xuatxu = ff.xuatxu;
	}
	//Getter & Setter
	public String getThanhPhan() {
		return ThanhPhan;
	}
	public void setThanhPhan(String ThanhPhan) {
		this.ThanhPhan = ThanhPhan;
	}
	public String getXuatxu() {
		return xuatxu;
	}
	public void setXuatxu(String xuatxu) {
		this.xuatxu = xuatxu;
	}
	//Input & Output
	@Override public void nhap() {
		super.nhap();
		//Enter Thanh Phan
		while(true) {
			System.out.print("Nhap vao Thanh Phan cua thuoc: ");
			ThanhPhan = in.nextLine();
			if(ThanhPhan.equals(" ") == false && ThanhPhan.equals("") == false && ThanhPhan.equals(null) == false) {
				break;
			}
		}
		
		//Enter xuatxu
		while(true) {
			System.out.print("Nhap vao xuat xu cua san pham: ");
			xuatxu = in.nextLine();
			if(xuatxu.equals(" ") == false && xuatxu.equals("") == false && xuatxu.equals(null) == false) {
				break;
			}
		}
	}
	@Override public void xuat() {
		//Handle ThanhPhan
		String ThanhPhanThuoc = ThanhPhan;
		for(int i = 0; i < 30-ThanhPhan.length();i++) {
			ThanhPhanThuoc += " ";
		}
		
		//Handle xuatxu
		String xuatxuTam = xuatxu;
		for(int i = 0; i < 10-xuatxu.length();i++) {
			xuatxuTam += " ";
		}
		super.xuat();
		System.out.println(ThanhPhanThuoc + " | " + xuatxuTam + " | ");
	}
	@Override public void writeFile(String fileName)throws IOException{
		DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName, Boolean.TRUE));
		try {
			super.writeFile(fileName);
			out.writeUTF(ThanhPhan);
			out.writeUTF(xuatxu);
		}catch(IOException e) {
			
		}
		finally {
			out.close();
		}
	}
}
