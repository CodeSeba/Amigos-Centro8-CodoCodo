package test;
import ar.org.centro8.curso.java.utils.files.FileText;
import ar.org.centro8.curso.java.utils.files.I_File;
import java.util.ArrayList;
import java.util.List;
public class TestFile {
    public static void main(String[] args) {
        String file="texto.txt";
        I_File fileText=new FileText(file);
        
        fileText.setText("Curso de Java.\n");
        fileText.appendText("Primavera.\n");
        fileText.appendText("Verano.\n");
        fileText.appendText("Otoño.\n");
        fileText.appendText("Invierno.\n");
        fileText.addLine("Lunes");
        fileText.addLine("Lunes");
        fileText.addLine("Martes");
        fileText.addLine("Martes");
        fileText.addLine("Miércoles");
        fileText.addLine("Jueves");
        fileText.addLine("Jueves");
        fileText.addLine("Viernes");
        
        //fileText.clear();
        
        //fileText.print();
        //System.out.println(fileText.getText());
        
        //fileText.getLines().forEach(System.out::println);
        
        //fileText.getLines("mar").forEach(System.out::println);
        
        //fileText.getReversedLines().forEach(System.out::println);
        
        //fileText.getOrderLines().forEach(System.out::println);
        
        //fileText.getReversedOrderLines().forEach(System.out::println);
        
        //fileText.getLinkedHasSetLines().forEach(System.out::println);
        
        //fileText.getTreeSetLines().forEach(System.out::println);
        
        List<String> lista=new ArrayList();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        fileText.addLines(lista);
        
        fileText.removeLine("Viernes");
        fileText.getLines().forEach(System.out::println);
        
        
        
        
        
        
    }
}