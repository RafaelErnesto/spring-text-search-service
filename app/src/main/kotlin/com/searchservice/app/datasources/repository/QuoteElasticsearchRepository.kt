package com.searchservice.app.datasources.repository

import com.searchservice.app.domain.entities.Quote
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface QuoteElasticsearchRepository: ElasticsearchRepository<Quote, String> {
}