import java.io.*;
import java.nio.channels.FileChannel;

public class Transferencia extends ArquivoConcorrente implements Runnable {

    public Transferencia() {
    }

    public Transferencia(String or, String dest) {
        super(or, dest);
    }

    public void run() {

        FileChannel canalOrigem = null;
        FileChannel canalDestino = null;

        try {

            canalOrigem = new FileInputStream(super.getOr()).getChannel();
            canalDestino = new FileOutputStream(super.getDest()).getChannel();
            canalOrigem.transferTo(0, canalOrigem.size(), canalDestino);

            File file = new File( super.getOr() );
            file.delete();

        } catch (Exception ae) {

            System.out.println("Erro :  Diretorio inexistente:" + ae.getMessage());

        } finally {

            try {
                canalOrigem.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                canalDestino.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
    }
            
    }

}
