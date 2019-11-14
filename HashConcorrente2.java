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
            System.out.println("Deleta origem");

        }else{ //foi corrompido - deleta a cópia

            fdestino.delete();

            System.out.println("Erro: o arquivo foi corrompido e a operação foi encerrada");

        }
        
    }

}