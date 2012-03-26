package br.com.caelum.blog.jenkins;

public class Imposto {

	public Imposto() {
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}