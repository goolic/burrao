import java.util.Random;

import baralho.TipoDeCarta;

class baralho {
	
	private static enum TipoDeCarta { AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI, CORINGA };
	class carta {
		
		TipoDeCarta carta;
		
		/**
		 * @return the carta
		 */
		public TipoDeCarta getCarta() {
			return carta;
		}
		/**
		 * @param carta the carta to set
		 */
		public void setCarta(TipoDeCarta carta) {
			this.carta = carta;
		}	
	}
	private carta[] arrayDeCartas;
	/**
	 * 
	 * @param numJogadores
	 */
	public baralho ( int numJogadores ) {
		this.arrayDeCartas = new carta[numJogadores*4+1];
		for (int i=0;i<numJogadores;) {
			//gero randomico 1 tipo de carta
			
			Random randomicos = new Random();
			
			int tipoDeCarta = randomicos.nextInt(13)+1;
			
			TipoDeCarta tipoDeNovasCartas;
			
			
			switch (tipoDeCarta){
				case 1:
					tipoDeNovasCartas = TipoDeCarta.AS;
					break;
				case 2:
					tipoDeNovasCartas = TipoDeCarta.DOIS;
					break;
				case 3:
					tipoDeNovasCartas = TipoDeCarta.TRES;
					break;
				case 4:
					tipoDeNovasCartas = TipoDeCarta.QUATRO;
					break;
				case 5:
					tipoDeNovasCartas = TipoDeCarta.CINCO;
					break;
				case 6:
					tipoDeNovasCartas = TipoDeCarta.SEIS;
					break;
				case 7:
					tipoDeNovasCartas = TipoDeCarta.SETE;
					break;
				case 8:
					tipoDeNovasCartas = TipoDeCarta.OITO;
					break;
				case 9:
					tipoDeNovasCartas = TipoDeCarta.NOVE;
					break;
				case 10:
					tipoDeNovasCartas = TipoDeCarta.DEZ;
					break;
				case 11:
					tipoDeNovasCartas = TipoDeCarta.VALETE;
					break;
				case 12:
					tipoDeNovasCartas = TipoDeCarta.DAMA;
					break;
				case 13:
					tipoDeNovasCartas = TipoDeCarta.REI;
					break;
				default:
					tipoDeNovasCartas = TipoDeCarta.CORINGA;
			}
			if (!this.jaExisteTipo(tipoDeNovasCartas))//Se ainda n‹o existe colocar
				if (tipoDeNovasCartas == TipoDeCarta.CORINGA) {
					i++;
					this.arrayDeCartas[this.arrayDeCartas.length].carta = tipoDeNovasCartas;
				}
				else
					for (int j=0;j<4;j++){
						i++;
						this.arrayDeCartas[this.arrayDeCartas.length].carta = tipoDeNovasCartas;
					}
			}
	}
	/**
	 * 
	 * @param tipoDeNovasCartas
	 * @return
	 */
	private boolean jaExisteTipo(TipoDeCarta tipoDeNovasCartas) {
		for (int i = 0; i< this.arrayDeCartas.length;i++)
			if (this.arrayDeCartas[i].getCarta()==tipoDeNovasCartas)
				return true;
		return false;
	}
	/**
	 * @return the baralho
	 */
	public carta[] getBaralho() {
		return baralho;
	}
	/**
	 * @param baralho the baralho to set
	 */
	public void setBaralho(carta[] baralho) {
		this.baralho = baralho;
	}
	

}


class jogador {
	
	String nome;	
	
}
class main {

}
