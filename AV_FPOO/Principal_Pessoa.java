package AV_FPOO;

public class Principal_Pessoa {
	public static void main(String[] args) {
		Fisica pessoa1 = new Fisica("4968659648","895156987","Ricardo");
		System.out.println("CPF: " + pessoa1.getCPF());
		System.out.println("RG: " +pessoa1.getRG());
		System.out.println("NOME: " +pessoa1.getNome());
}}
