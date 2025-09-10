package me.hwangtaehun.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.hwangtaehun.springbootdeveloper.domain.Article;
import me.hwangtaehun.springbootdeveloper.dto.AddArticleRequest;
import me.hwangtaehun.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BlogApiController {
    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request){
        Article saveArticle = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveArticle);
    }
}
