package org.examen.mpai.marghioalaioan.observer;

public interface IAngajat {

    void adaugareClientPentruInterventie(IClient client); //metoda de abonare
    void notificareClientPentruInterventie(String mesaj);
    void stergereClientDinInterventie(IClient client);

}
