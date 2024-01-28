package com.searchservice.app.domain.service

import com.searchservice.app.datasources.adapter.QuoteRepositoryAdapter
import com.searchservice.app.domain.entities.Quote


class QuoteService(
    private val quoteRepositoryAdapter: QuoteRepositoryAdapter
) {
    fun findInText(searchText: String): List<Quote> {
        return quoteRepositoryAdapter.findInText(searchText)
    }
}