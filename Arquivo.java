import java.io.*;
import java.nio.channels.FileChannel;

public class Arquivo{
 
    public void transf(String origem, String destino) throws IOException, NullPointerException{
        
        FileChannel canalOrigem = null;
        FileChannel canalDestino = null;
        try {

            canalOrigem = new FileInputStream(origem).getChannel();
            canalDestino = new FileOutputStream(destino).getChannel();
            canalOrigem.transferTo(0, canalOrigem.size(),canalDestino);

        } catch(Exception ae){

            System.out.println("Erro :  Diretorio inexistente:" + ae.getMessage());

        }finally {
            canalOrigem.close();
            canalDestino.close();
    }

    }

    public void delete(String dir){ // recebe diretorio do arquivo a ser excluido
        
        File file = new File( dir );
        file.delete(); 
    }
}
