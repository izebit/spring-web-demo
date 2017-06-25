package ru.izebit.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.izebit.model.Article;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 *         Creation date: 6/25/17.
 * @since 1.0
 */
@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
