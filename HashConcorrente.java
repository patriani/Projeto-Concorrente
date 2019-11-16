import java.io.*;

public class HashConcorrente extends ArquivoConcorrente implements Runnable{
    private long t1 = 0;

    public void setT1(long t1){
        this.t1 = t1;
    }

    public long getT1(){
        return t1;
    }

    public HashConcorrente(){} // construtor default

    public HashConcorrente(String or){
        super(or);
    }

	@Override
    public void run() {

        HashConcorrente2 hash2 = new HashConcorrente2();

        File f = new File (getOr());
        long tamanho = f.length(); // grava tamanho do arquivo original
        hash2.setTamanho(tamanho);        
    }
    
}
