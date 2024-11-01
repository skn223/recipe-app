package skn.springframework.recipeproject.repositories;

import skn.springframework.recipeproject.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByCategoryName(String categoryName);
}
