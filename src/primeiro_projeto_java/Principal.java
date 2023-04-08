package primeiro_projeto_java;

public class Principal {

	public static void main(String[] args) {
		Livros c1 = new Livros ("amarelo", 390, "Saraiva", "terror" );
		
		
		System.out.print("seu livro é " + c1.getCor() + " tem " + c1.getQtd_paginas()+ " páginas, é da editora " + c1.getEditora()+"e do gênero " + c1.getGenero());

	}

}
