package com.searchservice.app.datasources.adapter

import com.searchservice.app.datasources.repository.QuoteElasticsearchRepository
import com.searchservice.app.domain.entities.Quote
import com.searchservice.app.domain.repository.QuoteRepository



class QuoteRepositoryAdapter(
    private val quoteElasticsearchRepository: QuoteElasticsearchRepository
): QuoteRepository {
    override fun findAll(): List<Quote> {
        return quoteElasticsearchRepository.findAll().toList()
    }
}