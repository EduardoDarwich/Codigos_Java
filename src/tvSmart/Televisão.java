package tvSmart;

public class Televisão {
	public static void main(String[] args) {
		
		Controle c1 = new Controle();
		/*c1.getLigada();
		c1.ligar();
		c1.desligar();
		c1.ligar();
		c1.aumentarVolume();
		c1.diminuirVolume();
		c1.mudarCanalCima(5);
		c1.mudarCanalBaixo();*/
		
		System.out.println("Volume:"+ c1.getVolume());
		
		System.out.println("Canal:"+ c1.getCanal());
		
		if(c1.getLigada() == false) {
			System.out.println("Sua televião está desligada" );
		}
		else {
			System.out.println("sua televião está ligada");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
