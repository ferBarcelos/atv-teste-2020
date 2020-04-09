package Exercicio02.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Exercicio02.Principal;

public class TesteHora {

	
SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
	
	@Test
	public void testePrincipal() {
		assertNotEquals(d.format(new Date()), new Principal().getHorario(), 0.1);
	}
}
