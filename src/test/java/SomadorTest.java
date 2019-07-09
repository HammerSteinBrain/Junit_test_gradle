import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SomadorTest{
    private Somador somador;
	
    public SomadorTest(){
        somador = new Somador();
    }

	//@ParameterizedTest
	//@ValueSource(ints={1,2,3,4,5})
	//public void quadradoTest(int par01){
		//int resultado;
		//resultado = somador.quadrado(par01);
        //assertEquals(par01*par01,resultado);
    //}
	
	//@ParameterizedTest
	//@CsvSource(value={"1:2:3","4:5:9","11:12:23"},delimiter=':')
	//public void somarTest(int x,int y, int resultado){
      //  assertEquals(resultado,somador.somar(x,y));
    //}
	
	@ParameterizedTest(name="Teste {index} => x={0} y={1},"
					+" resultado={2}")

	@CsvFileSource(resources="/valores_teste.csv", delimiter=',')
	public void somarTestCsv(int x,int y, int resultado){
        assertEquals(resultado,somador.somar(x,y));
	}
    //@Test
    //public void somarTest(){
        //assertEquals(3,somador.somar(1,1));
    //}

    @Test @Disabled
    public void somarTest2(){
        assertEquals(2,somador.somar(1,somador.somar(1,0)));
    }

}
