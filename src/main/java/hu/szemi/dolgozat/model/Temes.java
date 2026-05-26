/*
* File: Temes.java
* Author: Nagy Szemere
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-05-26
* Github: https://github.com/szetyix
* Licenc: MIT
*/
package hu.szemi.dolgozat.model;

public class Temes {

    private final int id;
    private final String nev;
    private final String dulo;
    private final int termesQ;
    private final String betakaritasVege;

    public Temes(int id, String nev, String dulo, int termesQ, String betakaritasVege) {
        this.id = id;
        this.nev = nev;
        this.dulo = dulo;
        this.termesQ = termesQ;
        this.betakaritasVege = betakaritasVege;
    }

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public String getDulo() {
        return dulo;
    }

    public int getTermesQ() {
        return termesQ;
    }

    public String getBetakaritasVege() {
        return betakaritasVege;
    }
}
