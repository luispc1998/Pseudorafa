package rafa;

public class ClaseDummy1 {

	private String att1;
	private String att2;
	
	
	public ClaseDummy1(String campo1, String campo2) {
		this.att1=campo1;
		this.att2=campo2;
	}
	@Override
	public String toString() {
		return "ClaseDummy1 [att1=" + att1 + ", att2=" + att2 + "]";
	}
	public String getAtt1() {
		return att1;
	}
	public void setAtt1(String att1) {
		this.att1 = att1;
	}
	public String getAtt2() {
		return att2;
	}
	public void setAtt2(String att2) {
		this.att2 = att2;
	}
}
