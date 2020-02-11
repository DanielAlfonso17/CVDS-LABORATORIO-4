package hangman.model;
public class PowerScore implements GameScore{
	private int puntaje;
	public PowerScore(){
		this.puntaje=0;
	}
	
	/**
	@pre se inicia con 0 puntos
	@pos resultado al terminar el juego descontando de a 8 puntos por letra errada y bonificando con 
	5^Iesima letra
	@param int correctCount 
	@param int incorrectCount
	@throws cuando el puntaje minimo es menor que 0 
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		for(int i=1; i<=correctCount; i++){
			if(puntaje+correctCount>=500){
				puntaje = 500;
			}else{
				puntaje += Math.pow(5,i);
			}
		}
		for(int i=0;i <incorrectCount; i++){
			if(puntaje > 0 && puntaje-8 >=0){
				puntaje -= 8; 
			}else if(puntaje-8 < 0){
				puntaje =0;
			}
		}
		return puntaje;
	}


}