package be.vdab;
public class OudeSpellingsControle {
    private String taal;
    private String tekst;
    private String[] fouten;
    
    public void setTaal(String taal) {
        this.taal = taal;
    }
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
    public void controleerSpelling() {
        fouten = new String[] {"onmidelijk", "paralelogram"};
    }
    public int getAantalFouten() {
        return fouten.length;
    }
    public String getFout(int index) {
        return fouten[index];
    }
}
