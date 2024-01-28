package com.searchservice.app.datasources.adapter

import com.searchservice.app.domain.entities.Quote
import com.searchservice.app.datasources.repository.QuoteElasticsearchAPIRepository
import com.searchservice.app.domain.repository.QuoteRepository


class QuoteRepositoryAdapter(
    val repository: QuoteElasticsearchAPIRepository
): QuoteRepository{
    override fun save(quote: Quote) {
        TODO("Not yet implemented")
    }

    override fun delete(quoteId: String) {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): Quote? {
        TODO("Not yet implemented")
    }

    override fun findInText(text: String): List<Quote> {
        TODO("Not yet implemented")
    }

}