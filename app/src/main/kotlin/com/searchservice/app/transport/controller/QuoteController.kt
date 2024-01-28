package com.searchservice.app.transport.controller

import com.searchservice.app.domain.service.QuoteService
import com.searchservice.app.transport.dto.QuoteDTO
import com.searchservice.app.transport.dto.toDTO
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/v1/quotes")
class QuoteController(
    private val quoteService: QuoteService
) {
    @GetMapping
    fun findInText(@RequestParam(required = true) search: String): ResponseEntity<List<QuoteDTO>> {
        val result = quoteService.findInText(search)
        return ResponseEntity.ok().body(result.map { it.toDTO() })
    }
    
}