package hangman.model;
public class BonusScore implements GameScore{
	private int puntaje;
	public BonusScore(){
		this.puntaje=0;
		
	}
	
	/**
	@pre se inicia con 0 puntos
	@pos resultado al terminar el juego descontando de a 5 puntos por letra errada y se bonifica 10 letra correcta
	@param int correctCount 
	@param int incorrectCount
	@throws cuando el puntaje minimo es menor que 0 
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		return 1;
	}


}