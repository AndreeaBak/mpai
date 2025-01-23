package org.examen.mpai.marghioalaioan.model;

import org.examen.mpai.marghioalaioan.state.*;

public class SolicitareInterventieClient {

    private int idSolicitareClient;
    private String descriereProblema;
    private int timpEstimatSosire;
    private StareStadiuSolicitare stareStadiuSolicitare;
    private Client client;
    private Angajat angajat;

    public SolicitareInterventieClient(int idSolicitareClient, String descriereProblema, int timpEstimatSosire,
                                       StareStadiuSolicitare stareStadiuSolicitare,
                                       Client client,
                                       Angajat angajat) {
        this.idSolicitareClient = idSolicitareClient;
        this.descriereProblema = descriereProblema;
        this.timpEstimatSosire = timpEstimatSosire;
        this.stareStadiuSolicitare = stareStadiuSolicitare;
        this.client = client;
        this.angajat = angajat;
    }

    public void setStareStadiuSolicitare(StareInterventieClient stareInterventieClient) {
        switch (stareInterventieClient) {
            case SOLICITARE_IN_ANALIZA:
                this.stareStadiuSolicitare = new StareInAnaliza();
                break;
            case SOLICITARE_ACCEPTATA:
                this.stareStadiuSolicitare = new StareAcceptata();
                break;
            case SOLICITARE_ECHIPAJ_PLECAT_SPRE_CLIENT:
                this.stareStadiuSolicitare = new StareEchipajPlecat();
                //notificaClientii("Solicitarea este acum de tipul :" + StareInterventieClient.SOLICITARE_ECHIPAJ_PLECAT_SPRE_CLIENT);
                break;
            case SOLICITARE_RESPINSA:
                this.stareStadiuSolicitare = new StareRespinsa();
                break;
        }
    }

    public void notificaClientii(String mesaj) {
        this.angajat.notificareClientPentruInterventie("!!! --- Solicitarea a fost schimbata. " + mesaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SolicitareInterventieClient{");
        sb.append("idSolicitareClient=").append(idSolicitareClient);
        sb.append(", descriereProblema='").append(descriereProblema).append('\'');
        sb.append(", timpEstimatSosire=").append(timpEstimatSosire);
        sb.append(", stareStadiuSolicitare=").append(stareStadiuSolicitare.getStareInterventieClient().toString());
        sb.append(", client=").append(client);
        sb.append(", angajat=").append(angajat);
        sb.append('}');
        return sb.toString();
    }
}
