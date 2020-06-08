package exercicio_5_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Teste {

	public static void main(String[] args) throws IOException {
		
		String localArquivo= "C:\\Users\\Gabri\\Documentos\\Estrutural\\bin\\exercicio_5_1";
		
		InputStream is = new FileInputStream(localArquivo);
		
		IOFacade ioFacade = new IOFacade(is);
		
		ioFacade.ReadFile();
		

	}

}
