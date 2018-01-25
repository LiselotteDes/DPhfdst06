package be.vdab;
public class SpellingscontroleAdapter {
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
        NieuweSpellingsControle controle = new NieuweSpellingsControle(taal, tekst);
        fouten = controle.controleer(); 
    }
    public int getAantalFouten() {
        return fouten.length;
    }
    public String getFout(int index) {
        return fouten[index];
    }
}
