package traffic;

public class Vehicle {
	private int maXe,dungTich;
    private double triGia;
    private String chuXe,moTa;
    
    public double tinhThue() {
    	if(dungTich < 100) return triGia*0.01;
    	else if (dungTich >= 100 && dungTich < 200) return triGia*0.03;
    	else return triGia*0.05;
    }
    
	public int getMaXe() {
		return maXe;
	}
	public void setMaXe(int maXe) {
		this.maXe = maXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
    
	 @Override
	    public String toString() {
	        return maXe + "-"+chuXe + "-"+dungTich + "-"+triGia + "-"+moTa;
	}
	 
    void inThue(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",maXe,chuXe,dungTich,triGia,moTa,tinhThue());
    }
}
