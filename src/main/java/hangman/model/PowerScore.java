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
		return 1;
	}


}