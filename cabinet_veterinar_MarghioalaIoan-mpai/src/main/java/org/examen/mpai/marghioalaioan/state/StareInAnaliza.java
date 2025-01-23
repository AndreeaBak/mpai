package org.examen.mpai.marghioalaioan.state;

import org.examen.mpai.marghioalaioan.model.StareInterventieClient;

public class StareInAnaliza implements StareStadiuSolicitare{

    @Override
    public StareInterventieClient getStareInterventieClient() {
        return StareInterventieClient.SOLICITARE_IN_ANALIZA;
    }
}