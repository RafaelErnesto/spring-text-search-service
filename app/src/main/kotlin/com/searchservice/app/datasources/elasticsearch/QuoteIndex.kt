package com.searchservice.app.datasources.elasticsearch

import com.searchservice.app.domain.entities.Quote
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType
import java.util.*

@Document(indexName = "quote")
data class QuoteIndex(
    @Id
    val id: UUID,
    @Field(type = FieldType.Text)
    val text: String
)

fun QuoteIndex.toDomain() = Quote(
    id, text
)