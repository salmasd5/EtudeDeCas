package com.daigham.EtudeDeCas.service;

import java.util.List;
import java.util.Optional;

import com.daigham.EtudeDeCas.entity.Chambre;

public interface ChambreService {
	List<Chambre> getAllChambres();
    Optional<Chambre> getChambreById(Long id);
    Chambre saveChambre(Chambre chambre);
    Chambre updateChambre(Long id, Chambre chambreDetails);
    void deleteChambre(Long id);
}
