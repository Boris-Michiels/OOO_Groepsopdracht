package model;

import java.util.ArrayList;

public class Bestelling {
    private ArrayList<BestelLijn> bestellijnen = new ArrayList<>();
    private BestelLijn bestelLijn;

    public void voegBestelLijnToe(String broodjenaam) {
        bestelLijn = new BestelLijn(broodjenaam);
        bestellijnen.add(bestelLijn);
    }

    public void addBeleg(String beleg) {
        bestelLijn.addBeleg(beleg);
    }

    public BestelLijn getBestelLijn() {
        return bestelLijn;
    }

    public void setBestelLijn(BestelLijn bestelLijn) {
        this.bestelLijn = bestelLijn;
    }

    public ArrayList<BestelLijn> getLijstBestellijnen() {
        return bestellijnen;
    }

    @Override
    public String toString() {
        return bestellijnen.toString();
    }
}