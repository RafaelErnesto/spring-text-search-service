package com.searchservice.app.datasources.repository

import com.searchservice.app.datasources.elasticsearch.QuoteIndex
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates
import org.springframework.stereotype.Component
import java.util.UUID

private const val  INDEX_NAME= "quote"
@Component
class QuoteElasticsearchAPIRepository(
    val elasticsearchTemplate: ElasticsearchTemplate
) {

    fun save(quoteIndex: QuoteIndex) {
        elasticsearchTemplate.save(
            quoteIndex,
            IndexCoordinates.of(INDEX_NAME)
        )
    }

    fun delete(id: String) {
        elasticsearchTemplate.delete(
            id,
            IndexCoordinates.of(INDEX_NAME)
        )
    }

    fun findById(id: UUID): QuoteIndex? {
        return elasticsearchTemplate.get(id.toString(), QuoteIndex::class.java, IndexCoordinates.of(INDEX_NAME))
    }

    fun findInText(searchText: String): List<QuoteIndex> {
        TODO()
    }
}