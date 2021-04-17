package com.example.demo

import com.example.demo.generated.api.PostsApi
import com.example.demo.generated.model.CreatePost
import com.example.demo.generated.model.Post
import com.example.demo.generated.model.PostListe
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class PostsApiImpl : PostsApi {
    override fun createPost(xAuthorId: String, createPost: CreatePost): ResponseEntity<Post> {
        return if (xAuthorId == "1234") {
            ResponseEntity.status(201).body(
                Post(
                    UUID.randomUUID().toString(), createPost.text, createPost.tags
                )
            )
        } else {
            ResponseEntity.notFound().build()
        }
    }

    override fun getPosts(tags: List<String>?, users: List<String>?): ResponseEntity<PostListe> {
        return ResponseEntity.ok(
            PostListe(
                listOf(
                    Post(UUID.randomUUID().toString(), "hello world", listOf("#first", "#hello")),
                    Post(UUID.randomUUID().toString(), "second post")
                )
            )
        )
    }
}
