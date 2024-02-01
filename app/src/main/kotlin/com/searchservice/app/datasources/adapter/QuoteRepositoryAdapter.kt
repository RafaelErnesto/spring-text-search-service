package com.searchservice.app.datasources.adapter

import com.searchservice.app.datasources.elasticsearch.toDomain
import com.searchservice.app.datasources.elasticsearch.toIndex
import com.searchservice.app.domain.entities.Quote
import com.searchservice.app.datasources.repository.QuoteElasticsearchAPIRepository
import com.searchservice.app.domain.repository.QuoteRepository
import java.util.*


class QuoteRepositoryAdapter(
    private val repository: QuoteElasticsearchAPIRepository
): QuoteRepository{
    override fun save(quote: Quote) {
        repository.save(quote.toIndex())
    }

    override fun delete(quoteId: String) {
        repository.delete(quoteId)
    }

    override fun findById(id: UUID): Quote? {
        return repository.findById(id)?.toDomain()
    }

    override fun findInText(text: String): List<Quote> {
        TODO("Not yet implemented")
    }

}