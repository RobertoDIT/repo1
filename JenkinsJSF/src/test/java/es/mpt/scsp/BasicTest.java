package test.java.es.mpt.scsp;

import main.java.es.mpt.scsp.Historico;

import org.junit.Test;

public class BasicTest {

    @Test
    public void testBien() {
        Historico hist = new Historico(1,1,"prueba", 1, 1,1,"test",2);
		assert (hist.isEstadoString()=="CORRECTO");
    }
    @Test
    public void testMal() {
        Historico hist = new Historico(1,1,"prueba", 1, 1,1,"test",2);
		assert (hist.isEstadoString()=="asadasdasd");
		
		/*
		 * https://github.com/RobertoDIT/PracticasSGAD.git
		 * C:\Program Files\Java\jdk1.8.0_131
		 * C:\Archivos\Programas\apache-maven-3.6.3\bin
		 * C:\Archivos\Programas\apache-maven-3.6.3\conf
		 * 
		 * 
		 */
    }
}
