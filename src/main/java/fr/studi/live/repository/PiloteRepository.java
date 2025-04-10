package fr.studi.live.repository;

import fr.studi.live.pojo.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}
