package com.dio.inversaodecontrole;

public class EnviarEmails {

	public EnviarEmails(String tipo, String endereco, String senha) {

	}
	
	public static EnviarEmails obterDadosEmail() {
		return new EnviarEmails("stmp", "contato@com", "fulano");
	}

	public void Retornar(String mensagem) {
		System.out.println("Email enviado");
	}
}
