package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    //Long is id type
}
