package ru.izebit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.izebit.dao.ArticleRepository;
import ru.izebit.model.Article;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 *         Creation date: 6/25/17.
 * @since 1.0
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;

    public void save(Article article) {
        repository.save(article);

        System.out.println(article);
    }
}
