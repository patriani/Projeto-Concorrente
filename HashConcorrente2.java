import java.io.*;

public class HashConcorrente2 extends ArquivoConcorrente implements Runnable{

    private long tamanho;
    private long t1;
    String destino;

    public HashConcorrente2(){}

    public HashConcorrente2(String or,String dest,long t1){
        super(or,dest);
        setT1(t1);
    }

    public void setTamanho(long tamanho){
        this.tamanho = tamanho;
    }

    public long getTamanho(){
        return this.tamanho;
    }

    public void setT1(long t1){
        this.t1 = t1;
    }

    public long getT1(){
        return this.t1;
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
            
            t2 = System.currentTimeMillis()/1000L;
            tempo(t2);
            System.out.println("Erro: o arquivo foi corrompido e a operação foi encerrada - arquivo copia deletado");
        }
        
    }

    public void tempo(long t2){ // calcula tempo do processo

        long t1 = getT1();
        t2 -= 11000;
        System.out.println("tempo1: " +t1);
        System.out.println("tempo2: " +t2);
        long tempo = (t2 - t1);
        //tempo = tempo - 11000; // => tirando tempo do sleep e (t1 - t2) para calcular o tempo gasto -> inicial - final
        //tempo = tempo/1000; // transformando para segundos 
        System.out.println("tempo : " +tempo);

    }

}
