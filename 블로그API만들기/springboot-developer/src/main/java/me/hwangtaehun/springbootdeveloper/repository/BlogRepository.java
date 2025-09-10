package me.hwangtaehun.springbootdeveloper.repository;

import me.hwangtaehun.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
