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
        int respuesta = 0;
        respuesta = puntaje - (incorrectCount*10);
        if (respuesta < 0){
            respuesta = 0;
        }
        return respuesta;
    }

}