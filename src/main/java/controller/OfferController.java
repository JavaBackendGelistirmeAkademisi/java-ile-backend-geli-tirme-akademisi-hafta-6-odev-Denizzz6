package controller;
import jakarta.transaction.Transactional;
import model.Offer;
import model.request.OfferRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.OfferService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/offer")
public class OfferController {
    private final OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService){
        this.offerService=offerService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Offer addOffer(@Valid @RequestBody OfferRequestDTO offerRequestDTO){
        Offer offer=new Offer();
        offer.setName(offerRequestDTO.getName());
        offer.setPrice(offerRequestDTO.getPrice());
        offer.setTerms(offerRequestDTO.getTerms());
        return offerService.addOffer(offer);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    public void deleteOffer(@PathVariable Long id){
        offerService.deleteOffer(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    public Offer updateOffer(@PathVariable Long id, @Valid @RequestBody OfferRequestDTO offerRequestDTO) throws ChangeSetPersister.NotFoundException {
        Offer offer = offerService.findById(id);
        if (offer == null) {
            throw new ChangeSetPersister.NotFoundException();
        }
        offer.setId(offerRequestDTO.getId());
        offer.setName(offerRequestDTO.getName());
        offer.setPrice(offerRequestDTO.getPrice());
        offer.setTerms(offerRequestDTO.getTerms());
        return offerService.updateOffer(offer);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public List<Offer> getAllOffer(){
        return offerService.getAllOffer();
    }
}
