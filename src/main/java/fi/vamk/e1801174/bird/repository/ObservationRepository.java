package fi.vamk.e1801174.bird.repository;

import org.springframework.data.repository.CrudRepository;

import fi.vamk.e1801174.bird.entity.Observation;

public interface ObservationRepository extends CrudRepository<Observation, Integer>{
    
}
