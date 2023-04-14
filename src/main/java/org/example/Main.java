package org.example;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.batik.svggen.font.table.Program;
import org.example.entity.Banque;
import org.example.entity.Client;
import org.example.entity.CompteBancaire;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
/*
        Banque banque = new Banque("Caisse populaire");

        Client client1 = new Client(1, "Bernard", "Arnaud");
        Client client2 = new Client(2, "helme", "Nerve");
        Client client3 = new Client(3, "Helmout", "Hard");
        Client client4 = new Client(4, "Jean", "Paul");
        Client client5 = new Client(5, "Cris", "Fort");
        Client client6 = new Client(13, "POIUYTR", "azerty");

        CompteBancaire compte1 = new CompteBancaire(client1, 123, 200);
        CompteBancaire compte2 = new CompteBancaire(client2, 125, 25);
        CompteBancaire compte3 = new CompteBancaire(client3, 859, 1000);
        CompteBancaire compte4 = new CompteBancaire(client4, 747, 231);
        CompteBancaire compte5 = new CompteBancaire(client4, 173, 2000);

        banque.ajoutClient(client1);
        banque.ajoutClient(client2);
        banque.ajoutClient(client3);
        banque.ajoutClient(client4);
        banque.ajoutClient(client5);
        banque.ajoutClient(client6);

        banque.ajoutCompte(compte1);
        banque.ajoutCompte(compte2);
        banque.ajoutCompte(compte3);
        banque.ajoutCompte(compte4);
        banque.ajoutCompte(compte5);
*/
/*
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\SerializableObjetJson.json"), banque);
*/

        Boolean bobo = false;
        while (bobo == false) {
            try {
                ObjectMapper mapper = new ObjectMapper();

                Banque banqueDeserializable = mapper.readValue(new File("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\SerializableObjetJson.json"), Banque.class);

                System.out.println(banqueDeserializable.getNomBanque());

                afficherBanque(banqueDeserializable);

                //mapper.writeValue(new File("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\SerializableObjetJson.json"), banque);


                Scanner sc = new Scanner(System.in);
                System.out.println("Voulez vous créer un User : 1 \n" +
                        "Créer compte : 2\n" +
                        "Acceder à un compte : 3\n" +
                        "Afficher : 4\n" +
                        "Arreter : 10");
                int choix = sc.nextInt();
                switch (choix) {
                    case 1:
                        banqueDeserializable.CreateClient();
                        mapper.writeValue(new File("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\SerializableObjetJson.json"), banqueDeserializable);
                        break;
                    case 2:
                        banqueDeserializable.createAccount();
                        mapper.writeValue(new File("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\SerializableObjetJson.json"), banqueDeserializable);
                        break;
                    case 3:
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("Saisissez votre numero de compte :");
                        int numCompte = sc2.nextInt();
                        CompteBancaire compte = banqueDeserializable.findCompteByNum(numCompte);
                        afficherCompte(compte);

                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("Retirer de l'argent : 1");
                        int choixCompte = sc3.nextInt();

                        switch (choixCompte){
                            case 1:
                                Scanner sc4 = new Scanner(System.in);
                                System.out.println("Combien voulez-vous retirer");
                                int valeur = sc4.nextInt();
                                compte.retirerArgent(valeur);
                        }
                        break;
                    case 4:
                        afficherBanque(banqueDeserializable);
                        break;
                    case 10:
                        bobo = true;
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        /*ObjectMapper objectMapper = new ObjectMapper();
        File json = getJson("banque.json");
        objectMapper.writeValue(new File("banque.json"), banque);

        Banque myBank = objectMapper.readValue(json, Banque.class);
        CompteBancaire myCount = myBank.getComptes().get(0);
        System.out.println(myCount.getFondDisponible());*/

    }

    public static File getJson(String name){
        String json = Program.class.getClassLoader().getResource(name).getFile();
        return new File(json);
    }

    public static void afficherBanque(Banque banque){
        if(banque != null){
            System.out.println("Banque Caisse Populaire : ");
            System.out.println("nomBanque : " + banque.getNomBanque());
            System.out.println("comptes : " + banque.getComptes());

            for(CompteBancaire comptesBancaires : banque.getComptes()){
                System.out.println("Nom : " + comptesBancaires.getClient().getNom());
                System.out.println("Prenom : " + comptesBancaires.getClient().getPrenom());
                System.out.println("Argent à disposition : " + comptesBancaires.getFondDisponible());
                System.out.println("______________________________________________________________________________________________________________");
            }
        }
    }
    public static void afficherCompte(CompteBancaire compte){
        if(compte != null){
            System.out.println("Nom : " + compte.getClient().getNom());
            System.out.println("Prenom : " + compte.getClient().getPrenom());
            System.out.println("Argent à disposition : " + compte.getFondDisponible());
            System.out.println("______________________________________________________________________________________________________________");
        }
    }
}