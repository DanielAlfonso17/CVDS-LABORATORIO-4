package hangman.model;
public class OriginalScore implements GameScore{
	private int puntaje;
	public OriginalScore(){
		this.puntaje=100;
	}
	
	/**
	@pre se inicia con 100 puntos 
	@pos resultado al terminar el juego descontando de a 10 puntos por letra errada
	@param int correctCount 
	@param int incorrectCount
	@throws cuando el puntaje minimo es menor que 0 
	**/
	public int calculateScore(int correctCount, int incorrectCount)throws modelException {
        if(correctCount <0 || incorrectCount <0 ){
            throw new modelException("Parametros Invalidos.");
        }
        int resp = 0;
        int puntaje = 100;
        resp = puntaje - (incorrectCount*10);
        if (resp < 0){
            resp = 0;
        }
        return resp;
    }

}