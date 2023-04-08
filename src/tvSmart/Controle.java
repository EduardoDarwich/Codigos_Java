package tvSmart;

public class Controle {
private boolean ligada;
private int canal ;
private int volume;

public Controle () {
	this.ligada = false;
	this.volume = 0;
	this.canal = 0;
}

public void setLigada( boolean ligada) {
	this.ligada = ligada ;
}

public boolean getLigada () {
	return ligada;
}

public void setCanal (int canal) {
	this.canal = canal;
}

public int getCanal () {
	return canal;
}

public void setVolume(int volume) {
	this.volume = volume;
}


public int getVolume() {
	return volume;
}

public void ligar () {
	setLigada(true);
}

public void desligar() {
	setLigada(false);
}

public void aumentarVolume() {
	setVolume(getVolume() +1) ;
}

public void diminuirVolume() {
	setVolume(getVolume() -1) ;
}

public void mudarCanalCima(int qtdCanaisparacima) {
	setCanal(getCanal()+ qtdCanaisparacima);
}

public void mudarCanalBaixo(int qtdCanaisparabaixo) {
	setCanal(getCanal()- qtdCanaisparabaixo);
}








}
