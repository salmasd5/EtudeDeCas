package com.daigham.EtudeDeCas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daigham.EtudeDeCas.dao.ChambreRepository;
import com.daigham.EtudeDeCas.dao.ClientRepository;
import com.daigham.EtudeDeCas.entity.Chambre;
import com.daigham.EtudeDeCas.entity.Client;

@SpringBootApplication
public class EtudeDeCasApplication implements CommandLineRunner {
	
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ChambreRepository chambreRepository;

	public static void main(String[] args) {
		SpringApplication.run(EtudeDeCasApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        clientRepository.save(new Client(null, "Daigham", "Salma", "sd@gmail.com", "123456789"));
        clientRepository.save(new Client(null, "Tahri", "Imane", "imane@gmail.com", "987654321"));

        chambreRepository.save(new Chambre(null, "Simple", 1000.0, true));
        chambreRepository.save(new Chambre(null, "Double", 170.0, false));

        System.out.println("Initial data added to the database.");
    }

}
