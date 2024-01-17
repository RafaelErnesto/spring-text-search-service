package com.searchservice.app.domain.entities

import org.springframework.data.elasticsearch.annotations.Document
import java.util.UUID

@Document(indexName = "quote")
data class Quote(
    val id: UUID,
    val text: String
)
