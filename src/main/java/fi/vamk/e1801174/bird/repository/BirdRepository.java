package fi.vamk.e1801174.bird.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import fi.vamk.e1801174.bird.entity.Bird;

import org.springframework.data.jpa.repository.Query;

public interface BirdRepository extends CrudRepository<Bird, Integer>{
    @Query(value = "SELECT u FROM Bird u")
    List<Bird> findAllBirds(Sort sort);
}
