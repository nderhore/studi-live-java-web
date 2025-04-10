package fr.studi.live.service;

import fr.studi.live.pojo.Pilote;
import fr.studi.live.repository.PiloteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PiloteService {

    @Autowired
    private PiloteRepository piloteRepository;

    public List<Pilote> getAllPilote() {
        return piloteRepository.findAll();
    }

    public Pilote getPiloteById(Long id) {
        return piloteRepository.findById(id).orElse(null);
    }

    public void createPilote(Pilote monPilote) {
        piloteRepository.save(monPilote);
    }

    public boolean deletePiloteById(Long id) {
        boolean toDelete = piloteRepository.existsById(id);
        if(toDelete) {
            piloteRepository.deleteById(id);
        }
        return toDelete;
    }

    public void updatePilote(Long id, Pilote newPilote) {

        /**
         * 1. recuperer l'objet de la database
         * 2. le modifier
         * 3. le réinjecter
         */

        Pilote oldPilote = this.getPiloteById(id);
        if(oldPilote != null) {
            oldPilote.setNom(newPilote.getNom());
            oldPilote.setPrenom(newPilote.getPrenom());
            oldPilote.setPays(newPilote.getPays());
            oldPilote.setNumero(newPilote.getNumero());
            piloteRepository.save(oldPilote);
        }
    }
}
