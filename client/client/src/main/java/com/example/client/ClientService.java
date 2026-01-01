package com.example.client;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final List<Client> clients = new ArrayList<>();

    public ClientService() {
        // Données en dur juste pour le test
        clients.add(new Client(1L, "Alice", "alice@test.com"));
        clients.add(new Client(2L, "Bob", "bob@test.com"));
    }

    public List<Client> getAllClients() {
        return clients;
    }

    public Optional<Client> getClientById(Long id) {
        return clients.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }
}
