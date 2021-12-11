/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanhocki;

/**
 *
 * @author 84345
 */
public class Cuahangthuocyte {
    private String tencuahang;
    private String diachicuahang;
    private String sodienthoai;
    private String emailch;
    
    public Cuahangthuocyte(){
    }

     public Cuahangthuocyte(String tencuahang, String diachicuahang, String sodienthoai, String emailch) {
         this.tencuahang = tencuahang;
         this.diachicuahang = diachicuahang;
         this.sodienthoai = sodienthoai;
         this.emailch = emailch;
     }

    public String getTencuahang() {
        return tencuahang;
    }

    public void setTencuahang(String tencuahang) {
        this.tencuahang = tencuahang;
    }

    public String getDiachicuahang() {
        return diachicuahang;
    }

    public void setDiachicuahang(String diachicuahang) {
        this.diachicuahang = diachicuahang;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmailch() {
        return emailch;
    }

    public void setEmailch(String emailch) {
        this.emailch = emailch;
    }

    String gettencuahang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
