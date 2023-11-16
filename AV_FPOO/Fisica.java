package AV_FPOO;

public class Fisica extends Pessoa{
	private String CPF;
	private String RG;
	public Fisica(String nome, String cPF, String rG) {
		super(nome);
		CPF = cPF;
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}

	}
	

