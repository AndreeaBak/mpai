package org.examen.mpai.marghioalaioan.state;

import org.examen.mpai.marghioalaioan.model.StareInterventieClient;

public class StareRespinsa implements StareStadiuSolicitare{

    @Override
    public StareInterventieClient getStareInterventieClient() {
        return StareInterventieClient.SOLICITARE_RESPINSA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stare RESPINSA");
        return sb.toString();
    }
}
