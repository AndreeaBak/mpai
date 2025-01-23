package org.examen.mpai.marghioalaioan.state;

import org.examen.mpai.marghioalaioan.model.StareInterventieClient;

public class StareEchipajPlecat implements StareStadiuSolicitare{

    @Override
    public StareInterventieClient getStareInterventieClient() {
        return StareInterventieClient.SOLICITARE_ECHIPAJ_PLECAT_SPRE_CLIENT;
    }
}
