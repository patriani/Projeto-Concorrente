import java.io.*;

public class HashConcorrente2 extends ArquivoConcorrente implements Runnable{

    private long tamanho;
    String destino;

    public HashConcorrente2(){}

    public HashConcorrente2(String or,String dest){
        super(or,dest);
    }

    public void setTamanho(long tamanho){
        this.tamanho = tamanho;
    }

    public long getTamanho(){
        return this.tamanho;
    }

    @Override
    public void run() {

        File fdestino = new File (super.getDest());
        File forigem = new File( super.getOr() );
        
        long tamanho2 = fdestino.length(); // tamanho2 recebe o tamanho da cópia (arquivo)
        

        if(this.tamanho == tamanho2){ // não foi corrompido - deleta o arquivo original

            forigem.delete();
            
            long t2 = 0;
            t2 = System.currentTimeMillis();
            tempo(t2);

        }else{ //foi corrompido - deleta a cópia

            fdestino.delete();
            long t2 = 0;
            
            t2 = System.currentTimeMillis();
            tempo(t2);
            System.out.println("Erro: o arquivo foi corrompido e a operação foi encerrada - arquivo copia deletado");
        }
        
    }

    public static void tempo(long t2){ // calcula tempo do processo

        HashConcorrente h = new HashConcorrente();
        long t1 = 0;
        t1 = h.getT1();// recupera tempo inicial 
        
        long tempo = (t2 - t1) - (11000); // - (100) => tirando tempo do sleep e (t1 - t2) para calcular o tempo gasto -> inicial - final
        tempo = tempo/1000; // transformando para segundos 
        System.out.println("tempo : " +tempo);

    }

}
