package rafa;

public class ClaseDummy2 {
	
	private boolean valor;
	private String cosas;

	public ClaseDummy2(boolean campo1, String campo2) {
		this.valor = campo1;
		this.cosas = campo2;
	}

	public boolean isValor() {
		return valor;
	}

	public void setValor(boolean valor) {
		this.valor = valor;
	}

	public String getCosas() {
		return cosas;
	}

	public void setCosas(String cosas) {
		this.cosas = cosas;
	}

	@Override
	public String toString() {
		return "ClaseDummy2 [valor=" + valor + ", cosas=" + cosas + "]";
	}

}
