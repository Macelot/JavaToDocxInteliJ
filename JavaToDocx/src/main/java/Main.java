
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        /**
         * @param args the command line arguments
         * https://www.youtube.com/watch?v=z9A75Fq9JLE
         * https://www.youtube.com/watch?v=L-pOP5JUadE
         *
         */
        FileOutputStream out = null;
        XWPFDocument document = new XWPFDocument();

        try {
            out = new FileOutputStream(new File("Documento.docx"));

            XWPFParagraph paragrafo = document.createParagraph();

            XWPFRun runPaRun1 = paragrafo.createRun();

            runPaRun1.setText("TESTE TÍTULO 1");
            runPaRun1.setBold(true);
            runPaRun1.addBreak();
            runPaRun1.addBreak();

            XWPFParagraph paragrafo2 = document.createParagraph();
            XWPFRun runPaRun2 = paragrafo2.createRun();
            runPaRun2.addTab();
            runPaRun2.setText("Olá, este é um parágrafo criado com a tecnologia. É mágica.");

            XWPFParagraph paragrafo3 = document.createParagraph();
            XWPFRun runPaRun3 = paragrafo3.createRun();
            runPaRun3.addTab();
            runPaRun3.setText("Continuação do parágrafo anterior");


            document.write(out);


        }catch(FileNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
