package org.examen.mpai.marghioalaioan.model;

import org.examen.mpai.marghioalaioan.observer.IAngajat;
import org.examen.mpai.marghioalaioan.observer.IClient;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements IAngajat {

    private int idAngajat;
    private String numeAngajat;
    private List<IClient> listaClienti; //observeri

    public Angajat(int idAngajat, String numeAngajat) {
        this.idAngajat = idAngajat;
        this.numeAngajat = numeAngajat;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append("idAngajat=").append(idAngajat);
        sb.append(", numeAngajat='").append(numeAngajat).append('\'');
        sb.append(", listaClienti=").append(listaClienti);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void adaugareClientPentruInterventie(IClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void notificareClientPentruInterventie(String mesaj) {
        for(IClient client : listaClienti) {
            client.primesteNotificareDespreInterventie(mesaj);
        }
    }

    @Override
    public void stergereClientDinInterventie(IClient client) {
        this.listaClienti.remove(client);
    }
}
