package be.vdab;
public class NieuweSpellingsControle {
    private final String taal;
    private final String tekst;
    public NieuweSpellingsControle(String taal, String tekst) {
        this.taal = taal;
        this.tekst = tekst;
    }
    public String[] controleer() {
        return new String[] {"onmidelijk", "paralelogram"}; // dummy voorbeeld
    }
}