package org.example.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Banque implements Serializable {
    public ArrayList<CompteBancaire> comptes = new ArrayList<CompteBancaire>();
    public ArrayList<Client> clients = new ArrayList<Client>();
    private String nomBanque;

    public void setComptes(ArrayList<CompteBancaire> comptes) {
        this.comptes = comptes;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public Banque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
    public Banque(){}

    public CompteBancaire findCompteByIdClient(int idClient){
        for (CompteBancaire compte: comptes) {
            if(compte.getClient().getIdClient() == idClient){
                return compte;
            }
        }
        return null;
    }

    public CompteBancaire findCompteByNum(int num){
        for (CompteBancaire compte: comptes) {
            if(compte.getNumCompteBancaire() == num){
                return compte;
            }
        }
        return null;
    }

    public CompteBancaire getCompteBancaireByCompte(int numCompteBancaire){
        for (CompteBancaire compte: comptes){
            if(compte.getNumCompteBancaire() == numCompteBancaire){
                return compte;
            }
        }
        return null;
    }

    public String getNbCompte(int idClient){
        int nbCompte = 0;
        for (CompteBancaire compte: comptes){
            if(compte.getClient().getIdClient() == idClient){
                nbCompte += 1;
            }
        }
        return "Vous avez :" + nbCompte + " Compte(s) chez nous";
    }

    public void ajoutCompte(CompteBancaire compte){
        comptes.add(compte);
    }
    public void ajoutClient(Client client){
        clients.add(client);
    }

    public ArrayList<CompteBancaire> getComptes() {
        return comptes;
    }

    public void CreateClient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un identifiant :");
        int clientId = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Saisissez votre nom :");
        String clientNom = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Saisissez votre prenom :");
        String clientPrenom = sc2.nextLine();

        Client client = new Client(clientId, clientNom, clientPrenom);
        clients.add(client);
    }

    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un numero de compte :");
        int num = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Saisissez un fond :");
        int fond = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Saisissez un id client :");
        int idClient = sc2.nextInt();

        Client client = findClientById(idClient);
        if(client != null){
            System.out.println("Client choisi : " + client.getNom());
            CompteBancaire cb = new CompteBancaire(client, num, fond);
            ajoutCompte(cb);
        }
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public Client findClientById(int idClient){
        for(Client client : clients){
            if(client.getIdClient() == idClient){
                return client;
            }
        }
        return null;
    }
}