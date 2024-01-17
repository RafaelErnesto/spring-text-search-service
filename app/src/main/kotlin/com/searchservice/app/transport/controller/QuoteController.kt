package com.searchservice.app.transport.controller

import com.searchservice.app.domain.entities.Quote
import com.searchservice.app.domain.service.QuoteService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/v1/quotes")
class QuoteController(
    private val quoteService: QuoteService
) {
    @GetMapping("/all")
    fun fetchAll():List<Quote> {
        return quoteService.findAll()
    }
    
}