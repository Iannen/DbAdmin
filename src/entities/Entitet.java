package entities;

import java.util.ArrayList;

public interface Entitet {
    String getNavn();

    String getEntId();

    Integer getId();

    String entiteterMenyInfo();
    ArrayList<String> administrasjonsMenyInfo();
}
