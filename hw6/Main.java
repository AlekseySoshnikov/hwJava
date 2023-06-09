// Задание к семинару от 06.06.2023

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("ASER", "RED", "CHINA");
        Notebook notebook1 = new Notebook("HP", "SILVER", "USA");
        Notebook notebook2 = new Notebook("HP", "BLACK", "USA");
        Notebook notebook3 = new Notebook("ASUS", "BLACK", "JAPAN");
        Notebook notebook4 = new Notebook("LENOVO", "BLUE", "CHINA");
        Notebook notebook5 = new Notebook("ASER", "RED", "CHINA");
        Notebook notebook6 = new Notebook("ASER", "SILVER", "CHINA");     

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook);
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);               
        
        NotebookFilter nf = new NotebookFilter();
        nf.inputItemAndPrint(nf.inputFilter(), notebooks);        
    }          
}