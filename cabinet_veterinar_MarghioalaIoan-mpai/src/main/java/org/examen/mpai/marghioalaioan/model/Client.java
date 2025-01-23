package org.examen.mpai.marghioalaioan.model;

import org.examen.mpai.marghioalaioan.observer.IClient;

public class Client implements IClient {

    private int idClient;
    private String numeClient;
    private String descriereProblema;
    private String adresaLocatie;
    private Animal animal;

    public Client(int idClient, String numeClient, String descriereProblema, String adresaLocatie,
                  Animal animal) {
        this.idClient = idClient;
        this.numeClient = numeClient;
        this.descriereProblema = descriereProblema;
        this.adresaLocatie = adresaLocatie;
        this.animal = animal;
    }

    public String getDescriereProblema() {
        return descriereProblema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("idClient=").append(idClient);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", descriereProblema='").append(descriereProblema).append('\'');
        sb.append(", adresaLocatie='").append(adresaLocatie).append('\'');
        sb.append(", animal=").append(animal);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void primesteNotificareDespreInterventie(String mesaj) {
        System.out.println("Clientul " + this.numeClient + " a primit notificarea: " + mesaj);
    }
}
