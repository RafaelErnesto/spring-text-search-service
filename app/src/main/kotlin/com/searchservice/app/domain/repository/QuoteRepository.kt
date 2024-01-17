package com.searchservice.app.domain.repository

import com.searchservice.app.domain.entities.Quote

interface QuoteRepository {
    fun findAll(): List<Quote>
}