package primeiro_projeto_java;

public class Livros {
private String cor;
private int qtd_paginas; 
private String editora;
private String genero;

public Livros (String cor, int qtd_paginas, String editora, String genero) {
	this.cor = cor;
	this.qtd_paginas = qtd_paginas;
	this.editora = editora;
	this.genero = genero;
}

public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public int getQtd_paginas() {
	return qtd_paginas;
}
public void setQtd_paginas(int qtd_paginas) {
	this.qtd_paginas = qtd_paginas;
}
public String getEditora() {
	return editora;
}
public void setEditora(String editora) {
	this.editora = editora;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}

}
