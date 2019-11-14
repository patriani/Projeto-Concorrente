import java.io.*;

public class HashConcorrente extends ArquivoConcorrente implements Runnable{

    public HashConcorrente(String or){
        super(or);
    }

	@Override
    public void run() {

        HashConcorrente2 tam = new HashConcorrente2();

        File f = new File (getOr());
        long tamanho = f.length();
        tam.setTamanho(tamanho);        
    }
    
}