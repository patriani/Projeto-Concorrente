import java.io.IOException;
import java.util.Scanner;

public class PrincipalConcorrente{
    public static void main(String[]args) throws IOException, IOException, InterruptedException{

        String or; // recebe diretório de origem do backup
        String dest; // recebe diretório de destino do backup
        int aux = 1; // recebe 0 se não há mais arquivos a serem copiados

        Scanner sc = new Scanner(System.in);

        
        while(aux != 0){

            System.out.println("Insira o diretorio de origem");
            or = sc.nextLine();
            System.out.println("Insira o diretorio de destino");
            dest = sc.nextLine();

            TransferenciaConcorrente Tr = new TransferenciaConcorrente(or,dest); // Passa diretorio de origem e de destino como parametros
            Thread Ttr = new Thread(Tr);

            HashConcorrente Hc = new HashConcorrente(or);
            Thread Thc = new Thread(Hc);

            HashConcorrente2 Hc2 = new HashConcorrente2(or,dest);
            Thread Thc2 = new Thread(Hc2);
            
            Ttr.sleep(5000);
            Thc2.sleep(6000);

            Thc.start(); // verifica tamanho do arquivo original
            Ttr.start(); // inicia thread para cópia e "paste" em outro diretorio
            Thc2.start(); // compara tamanho do arquivo original com o arquivo copiado e toma decisão de transferencia ou não
            
            
            System.out.println("Deseja fazer backup de mais algum arquivo ?\n [1 - sim/ 0 - nao]: ");
            aux = sc.nextInt(); sc.nextLine();
        }
        sc.close();
    }
    
}
