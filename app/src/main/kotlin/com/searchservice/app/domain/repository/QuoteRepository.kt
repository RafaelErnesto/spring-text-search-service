package com.searchservice.app.domain.repository

import com.searchservice.app.domain.entities.Quote
import java.util.UUID

interface QuoteRepository {
    fun save(quote: Quote)

    fun delete(quoteId: String)

    fun findById(id: UUID): Quote?

    fun findInText(text: String): List<Quote>
}