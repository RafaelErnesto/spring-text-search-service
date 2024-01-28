package com.searchservice.app.config

import com.searchservice.app.datasources.adapter.QuoteRepositoryAdapter
import com.searchservice.app.domain.service.QuoteService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class QuoteServiceConfig {

    @Bean
    fun getQuoteService(quoteRepositoryAdapter: QuoteRepositoryAdapter): QuoteService {
        return QuoteService(quoteRepositoryAdapter)
    }
}