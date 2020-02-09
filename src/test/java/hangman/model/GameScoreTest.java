package hangman.model;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest 
{
    /**
     * OriginalScore: Clases de equivalencia 0 <= puntaje <= 100
					  Condicion frontera puntaje >= 0 
	   BonusScore: Clases de Equivalencia 0<= puntaje < n 
				   Condicion frontera puntaje >= 0 
	   PowerScore: Clases de Equivalencia 0 <= puntaje <= 500 
				   Condicion frontera puntaje >= 0 y puntaje <= 500 
					
     */
    @Test
    public void shouldRestScoreOriginalScoreLetterIncorrect()
    {
		OriginalScore score = new OriginalScore();
		int puntaje = score.calculateScore(0,10);
        Assert.assertEquals(1,puntaje);
    }
	@Test
    public void shouldSumScoreBonusScoreLetterCorrect()
    {
		BonusScore score = new BonusScore();
		int puntaje = score.calculateScore(10,0);
        Assert.assertEquals(1,puntaje);
    }
	@Test
    public void shouldSumScorePowerScoreLetterCorrect()
    {
		PowerScore score = new PowerScore();
		int puntaje = score.calculateScore(5,0);
        Assert.assertEquals(1,puntaje);
    }
	@Test
    public void shouldRestBonusScoreLetterIncorrect()
    {
		BonusScore score = new BonusScore();
		int puntaje = score.calculateScore(0,5);
        Assert.assertEquals(1,puntaje);
    }
	@Test
    public void shouldRestPowerScoreLetterIncorrect()
    {
		PowerScore score = new PowerScore();
		int puntaje = score.calculateScore(0,8);
        Assert.assertEquals(1,puntaje);
    }
}
