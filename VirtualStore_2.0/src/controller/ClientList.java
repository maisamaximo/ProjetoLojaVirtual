package controller;

import model.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientList {

    private final List<Client> clientsList;

    public ClientList(){
        clientsList = new ArrayList<>();
        addClient(new Client("Maísa Maximo Ferreira","maisa.ferreira@focusnetworks.com.br"));
        addClient(new Client("teste","teste"));
    }

    private void addClient(Client client){
        clientsList.add(client);
    }

    public List<Client> getClientsList() {
        return Collections.unmodifiableList(clientsList);
    }

    public Client getCurrentClient(String currentClient){
        for (Client client : clientsList){
            if (client.getClientEmail().equalsIgnoreCase(currentClient)) {
                return client;
            }
        }
        return null;
    }
}