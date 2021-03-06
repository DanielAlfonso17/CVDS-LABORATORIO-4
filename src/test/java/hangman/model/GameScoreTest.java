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
    public void shouldScoreOriginalOne()
    {
		OriginalScore score = new OriginalScore();
		int puntaje = score.calculateScore(0,2);
        Assert.assertEquals(80,puntaje);
    }
	@Test
    public void shouldScoreOriginalTwo()
    {
		OriginalScore score = new OriginalScore();
		int puntaje = score.calculateScore(0,8);
        Assert.assertEquals(20,puntaje);
    }
	@Test
    public void shouldScoreBonusOne()
    {
		BonusScore score = new BonusScore();
		int puntaje = score.calculateScore(5,2);
        Assert.assertEquals(40,puntaje);
    }
	@Test
    public void shouldScoreBonusTwo()
    {
		BonusScore score = new BonusScore();
		int puntaje = score.calculateScore(6,5);
        Assert.assertEquals(35,puntaje);
    }
	@Test
    public void shouldScorePowerOne()
    {
		PowerScore score = new PowerScore();
		int puntaje = score.calculateScore(3,2);
        Assert.assertEquals(139,puntaje);
    }
	
	@Test
    public void shouldScorePowerTwo()
    {
		PowerScore score = new PowerScore();
		int puntaje = score.calculateScore(2,2);		
        Assert.assertEquals(14,puntaje);
    }
}
