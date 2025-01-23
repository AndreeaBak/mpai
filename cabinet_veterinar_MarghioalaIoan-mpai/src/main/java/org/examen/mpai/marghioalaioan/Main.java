package org.examen.mpai.marghioalaioan;

import org.examen.mpai.marghioalaioan.model.*;
import org.examen.mpai.marghioalaioan.state.StareRespinsa;
import org.examen.mpai.marghioalaioan.view.AfisareView;
import org.examen.mpai.marghioalaioan.view.IAfisareView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IAfisareView afisareView = new AfisareView();

        List<Animal> animals;
        animals = citireAnimalTxt();

        Client client1 = new Client(1,"Ghica Valentin", "Picior rupt", "Str.Popei, 1", animals.get(0));
        Client client2 = new Client(2,"Pop Mircea", "Obezitate", "Str.Nucului,2", animals.get(1));

        Angajat angajat = new Angajat(1,"Alexandru");

        angajat.adaugareClientPentruInterventie(client1);
        angajat.adaugareClientPentruInterventie(client2);
        angajat.notificareClientPentruInterventie("Cazul dumneavoastra a fost preluat");

        SolicitareInterventieClient solicitareInterventieClient1 = new SolicitareInterventieClient(1,client1.getDescriereProblema(), 10, new StareRespinsa(),client1,angajat);
        SolicitareInterventieClient solicitareInterventieClient2 = new SolicitareInterventieClient(2, client2.getDescriereProblema(),120, new StareRespinsa(),client2, angajat);

        afisareView.afisareSolicitari(solicitareInterventieClient1, solicitareInterventieClient2);

        angajat.notificareClientPentruInterventie("-- Solicitarea dumneavostra a primit o noua stare!");

        solicitareInterventieClient1.setStareStadiuSolicitare(StareInterventieClient.SOLICITARE_ECHIPAJ_PLECAT_SPRE_CLIENT);
        solicitareInterventieClient2.setStareStadiuSolicitare(StareInterventieClient.SOLICITARE_IN_ANALIZA);

        afisareView.afisareSolicitari(solicitareInterventieClient1, solicitareInterventieClient2);

        System.out.println("***************");

        System.out.println(cautareInTXTdupaRasa("beagle"));
    }

    private static List<Animal> citireAnimalTxt() {
        List<Animal> animale = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("animale.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linie = bufferedReader.readLine();
            while (linie != null) {
                String[] valori = linie.split(",");
                if(valori.length == 4) {
                    Animal animal = new Animal(valori[0], valori[1], Integer.parseInt(valori[2]), Integer.parseInt(valori[3]));
                    animale.add(animal);
                    linie = bufferedReader.readLine();
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return animale;
    }

    private static Animal cautareInTXTdupaRasa(String rasaAnimal) {
        try {
            FileReader fileReader = new FileReader("animale.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linie = bufferedReader.readLine();
            while (linie != null) {
                String[] valori = linie.split(",");
                if(valori.length == 4) {
                    if(rasaAnimal.equals(valori[0])) {
                        Animal animal = new Animal(valori[0], valori[1], Integer.parseInt(valori[2]), Integer.parseInt(valori[3]));
                        bufferedReader.close();
                        return animal;
                    }
                    linie = bufferedReader.readLine();
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
