package com.searchservice.app.config

import com.searchservice.app.domain.service.QuoteService
import com.searchservice.app.transport.controller.QuoteController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class QuoteControllerConfig {

    @Bean
    fun getQuoteController(quoteService: QuoteService): QuoteController {
        return QuoteController(quoteService)
    }
}