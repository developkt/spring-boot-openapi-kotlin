package com.example.demo

import com.example.demo.generated.api.AuthorsApi
import com.example.demo.generated.model.Author
import com.example.demo.generated.model.AuthorList
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsApiImpl : AuthorsApi {
    override fun createAuthor(author: Author): ResponseEntity<Author> {
        return super.createAuthor(author)
    }

    override fun getAuthorById(id: String): ResponseEntity<Author> {
        return super.getAuthorById(id)
    }

    override fun getAuthors(): ResponseEntity<AuthorList> {
        return super.getAuthors()
    }
}
