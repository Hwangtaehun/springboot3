package me.hwangtaehun.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.hwangtaehun.springbootdeveloper.domain.Article;
import me.hwangtaehun.springbootdeveloper.dto.AddArticleRequest;
import me.hwangtaehun.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
