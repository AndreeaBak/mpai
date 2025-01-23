package org.examen.mpai.marghioalaioan.view;

import org.examen.mpai.marghioalaioan.model.SolicitareInterventieClient;

public class AfisareView implements IAfisareView{

    public void afisareSolicitari(SolicitareInterventieClient solicitareInterventieClient1, SolicitareInterventieClient solicitareInterventieClient2) {
        System.out.println(solicitareInterventieClient1);
        System.out.println(solicitareInterventieClient2);
    }

}
