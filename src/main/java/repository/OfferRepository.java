package repository;

import model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface OfferRepository extends JpaRepository<Offer,Long>{
        Optional<Offer> findById(Long id);

    }

