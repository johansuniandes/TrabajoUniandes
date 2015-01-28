package edu.uniandes.ecos.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Operaciones oper = new Operaciones();
        assertEquals("Para la opcion 1 debe retornar el valor de 550.6", (float) 550.6,oper.obtenerMedia());        
        assertEquals("Para la opcion 2 debe retornar el valor de 572.02686", (float) 572.02686,oper.obtenerDesviacion());
    }
}
