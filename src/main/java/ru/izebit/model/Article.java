package ru.izebit.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 *         Creation date: 6/25/17.
 * @since 1.0
 */
@Entity
public class Article implements Serializable, Comparable<Article> {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String title;
    @Column(length = 1000000)
    @Lob
    private String content;
    @Column
    private long creationTimestamp;

    public Article() {
    }

    public Article(String title, String content) {
        this.content = content;
        this.title = title;
        this.creationTimestamp = System.currentTimeMillis();
    }

    @Override
    public int compareTo(Article that) {
        return Long.compare(this.creationTimestamp, that.creationTimestamp);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
