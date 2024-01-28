package com.searchservice.app.domain.repository

import com.searchservice.app.domain.entities.Quote

interface QuoteRepository {
    fun save(quote: Quote)

    fun delete(quoteId: String)

    fun findById(id: String): Quote?

    fun findInText(text: String): List<Quote>
}