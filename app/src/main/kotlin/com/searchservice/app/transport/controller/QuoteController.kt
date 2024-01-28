package com.searchservice.app.transport.controller

import com.searchservice.app.domain.service.QuoteService
import com.searchservice.app.transport.dto.QuoteDTO
import com.searchservice.app.transport.dto.toDTO
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/v1/quotes")
class QuoteController(
    private val quoteService: QuoteService
) {
    @GetMapping("/all")
    fun fetchAll(): ResponseEntity<List<QuoteDTO>> {
        val result = quoteService.findAll()
        return ResponseEntity.ok().body(result.map { it.toDTO() })
    }
    
}