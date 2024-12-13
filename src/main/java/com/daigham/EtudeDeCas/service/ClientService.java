package com.daigham.EtudeDeCas.service;

import java.util.List;
import java.util.Optional;

import com.daigham.EtudeDeCas.entity.Client;

public interface ClientService {
	List<Client> getAllClients();
    Optional<Client> getClientById(Long id);
    Client saveClient(Client client);
    Client updateClient(Long id, Client clientDetails);
    void deleteClient(Long id);

}
