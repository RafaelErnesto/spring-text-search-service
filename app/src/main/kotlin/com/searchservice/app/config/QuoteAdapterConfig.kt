package com.searchservice.app.config

import com.searchservice.app.datasources.adapter.QuoteRepositoryAdapter
import com.searchservice.app.datasources.repository.QuoteElasticsearchRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class QuoteAdapterConfig {

    @Bean
    fun getQuoteRepositoryAdapter(quoteElasticsearchRepository: QuoteElasticsearchRepository): QuoteRepositoryAdapter {
        return QuoteRepositoryAdapter(quoteElasticsearchRepository)
    }
}