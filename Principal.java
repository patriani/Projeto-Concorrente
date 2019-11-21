import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal{
    public static void main(String[]args) throws IOException{
        
        String or; // recebe diretório de origem do backup
        String dest; // recebe diretório de destino do backup
        int aux = 1; // recebe 0 se não há mais arquivos a serem copiados
        long t1 = 0, t2 = 0;

        Scanner sc = new Scanner(System.in);

        Arquivo ar = new Arquivo();

        while(aux != 0){
        
        //Interação com o usuário -- inserir diretório de origem e de destino
        System.out.println("Insira o diretorio qualquer de origem (especificando o tipo do arquivo - .pdf,...)");
        or = sc.nextLine();
        System.out.println("Insira o diretorio qualquer de destino");
        dest = sc.nextLine();

        t1 = System.currentTimeMillis();
        ar.transf(or,dest); // chama método para copiar o original e colar no diretorio informado como destino
        t2 = System.currentTimeMillis();

        System.out.println("\n Tempo: " +(t2-t1));

        System.out.println("Deseja fazer backup de mais algum arquivo ?\n [1 - sim/ 0 - nao]: ");
        aux = sc.nextInt(); 
        sc.nextLine();

        }
    }
}
