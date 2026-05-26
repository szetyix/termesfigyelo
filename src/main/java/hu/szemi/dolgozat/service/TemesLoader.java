/*
* File: TemesLoader.java
* Author: Nagy Szemere
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-05-26
* Github: https://github.com/szetyix
* Licenc: MIT
*/
package hu.szemi.dolgozat.service;

import hu.szemi.dolgozat.model.Temes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TemesLoader {

    public List<Temes> loadFromResource(String resourcePath) {
        List<Temes> eredmeny = new ArrayList<>();

        InputStream inputStream = getClass().getResourceAsStream(resourcePath);
        if (inputStream == null) {
            throw new IllegalArgumentException("Nem talalhato eroforras: " + resourcePath);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String sor;
            while ((sor = reader.readLine()) != null) {
                if (sor.isBlank() || sor.startsWith("#")) {
                    continue;
                }

                String[] mezok = sor.split(":");
                if (mezok.length < 5) {
                    continue;
                }

                int id = Integer.parseInt(mezok[0].trim());
                String nev = mezok[1].trim();
                String dulo = mezok[2].trim();
                int termes = Integer.parseInt(mezok[3].trim());
                String betakaritas = mezok[4].trim();

                eredmeny.add(new Temes(id, nev, dulo, termes, betakaritas));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Hiba az allomany olvasasa kozben.", e);
        }

        return eredmeny;
    }
}
