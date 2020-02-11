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
		for(int i=0; i<correctCount ; i++){
			puntaje += 10;
		}
		for(int i=0;i <incorrectCount; i++){
			if(puntaje > 0 && puntaje-5 >=0){
				puntaje -= 5; 
			}else if(puntaje-5 < 0){
				puntaje =0;
			}
		}
		return puntaje;
	}


}