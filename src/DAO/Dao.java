package DAO;

import entities.Entitet;

import java.util.List;

public interface Dao {
    //Create
    <T extends Entitet> void leggTil(T nyEntitet);

    //Read
    <T extends Entitet> List<T> finnAlle();

    <T extends Entitet> T finn(int id);

    //Update
    <T extends Entitet> void oppdater(T oppdatertEntitet);

    //Delete
    <T extends Entitet> void slett(T entitet);
}
