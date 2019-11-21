import java.io.IOException;
import java.util.Scanner;

public class Principal{
    public static void main(String[]args) throws IOException, IOException{

        String or; // recebe diretório de origem do backup
        String dest; // recebe diretório de destino do backup
        int aux = 1; // recebe 0 se não há mais arquivos a serem copiados

        Scanner sc = new Scanner(System.in);

        while(aux != 0){

            System.out.println("Insira o diretorio de origem");
            or = sc.nextLine();
            System.out.println("Insira o diretorio de destino");
            dest = sc.nextLine();

            Transferencia Tr = new Transferencia(or,dest); // Passa diretorio de origem e de destino como parametros
            Thread Ttr = new Thread(Tr);
    
            //Delete Dl = new Delete(); // Passa o diretorio de destino como parametro 
            //hread Tdl = new Thread(Dl);
            
            Ttr.start(); // inicia thread para cópia e "paste" em outro diretorio
            
            //Tdl.start(); // inicia thread para exclusão do arquivo copiado
            
            System.out.println("Deseja fazer backup de mais algum arquivo ?\n [1 - sim/ 0 - nao]: ");
            aux = sc.nextInt();
        }
        sc.close();
    }
    
}
