
public class Student {
private	String c;
private	int snum;
	public static void main(String[] args) {
		
		Student sub = new Student();
		sub.c = "���ͳ�������";
		sub.snum =20142795;
		
		System.out.println("�а�:"+sub.c);
		System.out.println("�й�:"+sub.snum);
		
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}

	
}

