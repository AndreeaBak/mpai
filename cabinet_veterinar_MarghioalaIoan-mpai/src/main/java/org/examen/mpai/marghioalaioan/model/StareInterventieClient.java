package org.examen.mpai.marghioalaioan.model;

public enum StareInterventieClient {

    SOLICITARE_IN_ANALIZA("solicitare_in_analiza"),
    SOLICITARE_ACCEPTATA("solicitare_acceptata"),
    SOLICITARE_RESPINSA("solicitare_respinsa"),
    SOLICITARE_ECHIPAJ_PLECAT_SPRE_CLIENT("echipaj_plecat_spre_client");

    public final String stareInterventie;

    StareInterventieClient(String stareInterventie) {
        this.stareInterventie = stareInterventie;
    }
}
