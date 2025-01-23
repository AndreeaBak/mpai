package org.examen.mpai.marghioalaioan.state;

import org.examen.mpai.marghioalaioan.model.StareInterventieClient;

public class StareAcceptata implements StareStadiuSolicitare{

    @Override
    public StareInterventieClient getStareInterventieClient() {
        return StareInterventieClient.SOLICITARE_ACCEPTATA;
    }
}
