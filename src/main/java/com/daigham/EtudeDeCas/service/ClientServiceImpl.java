package com.daigham.EtudeDeCas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daigham.EtudeDeCas.dao.ClientRepository;
import com.daigham.EtudeDeCas.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {
	 @Autowired
	 private ClientRepository clientRepository;
	 @Override
	 public List<Client> getAllClients() {
	        return clientRepository.findAll();
	 }
	 @Override
	    public Optional<Client> getClientById(Long id) {
	        return clientRepository.findById(id);
	    }
	 @Override
	    public Client saveClient(Client client) {
	        return clientRepository.save(client);
	    }
	 @Override
	    public Client updateClient(Long id, Client clientDetails) {
	        return clientRepository.findById(id).map(client -> {
				client.setNom(clientDetails.getNom());
	            client.setPrenom(clientDetails.getPrenom());
	            client.setEmail(clientDetails.getEmail());
	            client.setTelephone(clientDetails.getTelephone());
	            return clientRepository.save(client);
	        }).orElseThrow(() -> new RuntimeException("Client not found with id " + id));
	    }
	 @Override
	    public void deleteClient(Long id) {
	        clientRepository.deleteById(id);
	    }
	 
}
