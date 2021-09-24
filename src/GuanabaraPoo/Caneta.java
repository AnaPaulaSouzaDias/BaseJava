package GuanabaraPoo;

public class Caneta {

	String modelo;
	String cor;
	float  ponta;
	int carga;
	boolean tampada;
	
	void status(){
		System.out.println("Esta caneta � da cor " + this.cor);
		System.out.println("A carga esta em "+this.carga +"%");
		System.out.println("Esta tampada? " + this.tampada);		
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("N�o d� pra rabiscar, esta tampada");
		}else {
			System.out.println("Estou rabiscando...");
		}
	}
	
    void tampar() {
		this.tampada  = true;
	}
    
    void destampar() {
    	this.tampada  = false;	
	}
	
}
