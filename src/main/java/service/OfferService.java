package service;
import exception.OfferNotFoundException;
import model.Offer;
import org.springframework.stereotype.Service;
import repository.OfferRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OfferService {
private final OfferRepository offerRepository;

public OfferService(OfferRepository offerRepository){
    this.offerRepository=offerRepository;
}

public Offer addOffer(Offer offer){
    offerRepository.save(offer);
    return offer;
}

public void deleteOffer(Long id){
    offerRepository.deleteById(id);
}

public Offer updateOffer(Offer offer){
    return offerRepository.save(offer);
}

    public List<Offer> getAllOffer(){
        return offerRepository.findAll();
    }


    public Offer findById(Long id) {
        Optional<Offer> offer = offerRepository.findById(id);
        if (offer.isPresent()) {
            return offer.get();
        } else {
            throw new OfferNotFoundException("Offer bulunamadı!");
        }

    }
}
