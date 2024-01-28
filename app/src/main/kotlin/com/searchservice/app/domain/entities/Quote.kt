package com.searchservice.app.domain.entities

import java.util.UUID

data class Quote(
    val id: UUID,
    val text: String
)
