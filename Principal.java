import java.io.IOException;
import java.util.Scanner;

public class Principal{
    public static void main(String[]args) throws IOException{
        
        String or; // recebe diretório de origem do backup
        String dest; // recebe diretório de destino do backup
        int aux = 1; // recebe 0 se não há mais arquivos a serem copiados

        Scanner sc = new Scanner(System.in);

        Arquivo ar = new Arquivo();

        while(aux != 0){
            
        System.out.println("Insira o diretorio de origem");
        or = sc.nextLine();
        System.out.println("Insira o diretorio de destino");
        dest = sc.nextLine();

        ar.transf(or,dest); // chama método para copiar o original e colar no diretorio informado como destino
        ar.delete(or); // deleta o original

        System.out.println("Deseja fazer backup de mais algum arquivo ?\n [1 - sim/ 0 - nao]: ");
        aux = sc.nextInt(); 
        sc.nextLine();
        }
    }
}

