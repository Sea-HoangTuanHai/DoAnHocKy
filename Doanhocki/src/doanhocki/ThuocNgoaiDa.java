package doanhocki;


import java.util.*;
import java.lang.*;
import java.io.*;
public class ThuocNgoaiDa extends SanPham{
	Scanner in = new Scanner(System.in);
	private String tacdung;
	
	//Constructor
	public ThuocNgoaiDa() {}
	public ThuocNgoaiDa(String masp, String tensp, String loai, int gia, int soluongco, String tacdung) {
		super(masp, tensp, loai, gia, soluongco);
		this.tacdung = tacdung;
		
	}
	public ThuocNgoaiDa(ThuocNgoaiDa nd) {
		super((SanPham) nd);
		tacdung =  nd.tacdung;
		
	}
	//Getter and Setter
	public String gettacdung() {
		return tacdung;
	}
	public void settacdung(String tacdung) {
		this.tacdung = tacdung;
	}
	
	//Input and Output
	@Override public void nhap() {
		//Call nhap() function from supclass
		super.nhap();
		
		//Enter tacdung
		System.out.print("Nhap vao tac dung cua thuoc: ");
		tacdung = in.nextLine();
		
		}
		
	
	@Override public void xuat() {
		RemoveRedundantSpace rp = new RemoveRedundantSpace();
		//Handle tacdung
		String tacdungTam = tacdung;
		for(int i = 0; i < 30-tacdung.length(); i++) {
			tacdungTam += " ";
		}
		
		
		super.xuat();
		System.out.println(tacdungTam + " | " + " | ");
	}
	@Override public void writeFile(String fileName)throws IOException{
		DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName, Boolean.TRUE));
		try {
			super.writeFile(fileName);
			out.writeUTF(tacdung);
			
		}catch(IOException e) {
			
		}
		finally {
			out.close();
		}
	}
}
