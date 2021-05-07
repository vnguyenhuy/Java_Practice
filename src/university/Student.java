package university;

public class Student {
    private int maSV;
    private String tenSV;
    private float diemTL, diemTH;
    
    public Student(int maSV, String tenSV, float diemTL, float diemTH) {
    	this.maSV = maSV;
    	this.tenSV = tenSV;
    	this.diemTL = diemTL;
    	this.diemTH = diemTH;
    }
    
    public Student() {
    	
    }
    
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public float getDiemTL() {
		return diemTL;
	}
	public void setDiemTL(float diemTL) {
		this.diemTL = diemTL;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}        
	
	public float tinhDiemTB() {
		return (diemTH + diemTL)/2;
	}
	
	public String toString() {
        return maSV + " - " + tenSV + " diem Tb : " + tinhDiemTB();
    }
 
    public void inSV() {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", maSV, tenSV, diemTH, diemTL, tinhDiemTB());
    }
}
