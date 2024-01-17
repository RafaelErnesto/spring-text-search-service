package com.searchservice.app.datasources.config

import co.elastic.clients.elasticsearch.ElasticsearchClient
import co.elastic.clients.json.jackson.JacksonJsonpMapper
import co.elastic.clients.transport.ElasticsearchTransport
import co.elastic.clients.transport.rest_client.RestClientTransport
import org.apache.http.HttpHost
import org.elasticsearch.client.RestClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class ElasticsearchConfiguration {

    @Bean
    fun getElasticsearchClient(): ElasticsearchClient {
        val restClient = RestClient
            .builder(HttpHost.create("localhost:9200"))
            .build()


        val transport: ElasticsearchTransport = RestClientTransport(
            restClient, JacksonJsonpMapper()
        )

        return ElasticsearchClient(transport)
    }
}