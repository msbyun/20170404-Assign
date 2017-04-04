
public class Student {
private	String c;
private	int snum;
	public static void main(String[] args) {
		
		Student sub = new Student();
		sub.c = "인터넷정보과";
		sub.snum =20142795;
		
		System.out.println("학과:"+sub.c);
		System.out.println("학번:"+sub.snum);
		
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

