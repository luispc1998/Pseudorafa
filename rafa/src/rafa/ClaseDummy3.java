package rafa;

public class ClaseDummy3 {

	private boolean boo1;
	private boolean boo2;
	private Protocolo protocolos;
	
	
	
	
	public ClaseDummy3(boolean boo1, boolean boo2, Protocolo protocolos) {
		this.boo1 = boo1;
		this.boo2 = boo2;
		this.protocolos = protocolos;
	}
	
	
	
	@Override
	public String toString() {
		return "ClaseDummy3 [boo1=" + boo1 + ", boo2=" + boo2 + ", protocolos=" + protocolos + "]";
	}



	public boolean isBoo1() {
		return boo1;
	}
	public void setBoo1(boolean boo1) {
		this.boo1 = boo1;
	}
	public boolean isBoo2() {
		return boo2;
	}
	public void setBoo2(boolean boo2) {
		this.boo2 = boo2;
	}
	public Protocolo getProtocolos() {
		return protocolos;
	}
	public void setProtocolos(Protocolo protocolos) {
		this.protocolos = protocolos;
	}
}
