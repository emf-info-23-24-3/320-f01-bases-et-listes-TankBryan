package app;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Personne personne1 = new Personne("Tank", "Bryan", "Rte de Montreux 123", "Châtel-St-Denis", 1618);
        Personne personne2 = new Personne("Hamid", "Moha", "Rue du poulet 21", "Attalens", 1213);
        Personne personne3 = new Personne("Nguyen", "Larke", "Route de la Fontaine 1", "Martany", 1179);

        ArrayList<Personne> listePersonnes = new ArrayList<Personne>();

        listePersonnes.add(personne1);
        listePersonnes.add(personne2);
        listePersonnes.add(personne3);

        for (Personne personne : listePersonnes) {
            System.out.println("Nom de la personne : " + personne.getNom());
        }
    }

}
