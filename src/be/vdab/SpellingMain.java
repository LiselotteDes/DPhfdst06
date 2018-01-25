package be.vdab;

import java.util.Arrays;

public class SpellingMain {
    public static void main(String[] args) {
        // Je gebruikt de OudeSpelling Library als volgt:
//        OudeSpellingsControle controle = new OudeSpellingsControle();
//        controle.setTaal("NL");
//        controle.setTekst("Ik kom onmidelijk met een paralelogram");
//        controle.controleerSpelling();
//        int aantalFouten = controle.getAantalFouten();
//        for(int index = 0; index != aantalFouten; index++) {
//            System.out.println(controle.getFout(index));
//        }
        /*
        Aanpassing om NieuweSpellings Library te gebruiken ipv OudeSpellings Library *zonder* het adapter design.
        Overal in je code waar je de oude library oproepte meerdere regels aanpassen om de nieuwe library op te roepen.
        */
//        NieuweSpellingsControle controle = new NieuweSpellingsControle("NL", "Ik kom onmidelijk met een paralelogram");
//        Arrays.stream(controle.controleer()).forEach(fout -> System.out.println(fout));
        
        // Aanpassing *met* adapter class: Nu moet je op meerdere plaatsen maar één regel aanpassen
        SpellingscontroleAdapter controle = new SpellingscontroleAdapter(); // !!! enige aanpassing 
        controle.setTaal("NL");
        controle.setTekst("Ik kom onmidelijk met een paralelogram");
        controle.controleerSpelling();
        int aantalFouten = controle.getAantalFouten();
        for(int index = 0; index != aantalFouten; index++) {
            System.out.println(controle.getFout(index));
        }
    }
    
}
