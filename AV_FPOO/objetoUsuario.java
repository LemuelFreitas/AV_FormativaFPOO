package AV_FPOO;

public class objetoUsuario extends Usuario {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario(10, "Fulano", 123, "ADM", "Usuario1");
		System.out.println("ID: " + usuario1.getId());
		System.out.println("Nome: " + usuario1.getNome());
		System.out.println("Senha: " + usuario1.getPassword());
		System.out.println("Permissão: " + usuario1.getPermissao());
		System.out.println("Usuario: " + usuario1.getUsuario());
	}
}
