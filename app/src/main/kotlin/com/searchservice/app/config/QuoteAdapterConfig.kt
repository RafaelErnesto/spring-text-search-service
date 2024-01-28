package com.searchservice.app.config


import com.searchservice.app.datasources.adapter.QuoteRepositoryAdapter
import com.searchservice.app.datasources.repository.QuoteElasticsearchAPIRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class QuoteAdapterConfig {

    @Bean
    fun getQuoteRepositoryAdapter(quoteElasticsearchAPIRepository: QuoteElasticsearchAPIRepository): QuoteRepositoryAdapter {
        return QuoteRepositoryAdapter(quoteElasticsearchAPIRepository)
    }
}