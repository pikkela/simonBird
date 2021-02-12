package fi.vamk.e1801174.bird.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fi.vamk.e1801174.bird.entity.Observation;
import fi.vamk.e1801174.bird.repository.ObservationRepository;

@RestController
public class ObservationContoroller {
    @Autowired
    ObservationRepository repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/observation")
    //selain lähettään bodyn ja @requestbody hakee contentin
    public Observation create(@RequestBody Observation observation){
        return repository.save(observation);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/observations")
    public Iterable<Observation> getAll(){
        return repository.findAll();   
    }
}
