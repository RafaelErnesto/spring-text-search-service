package com.searchservice.app.transport.dto

import com.searchservice.app.domain.entities.Quote

data class QuoteDTO(
    val text: String
)

fun Quote.toDTO() = QuoteDTO(
    text
)
