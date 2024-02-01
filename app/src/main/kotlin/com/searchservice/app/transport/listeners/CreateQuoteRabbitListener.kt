package com.searchservice.app.transport.listeners

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.searchservice.app.domain.entities.Quote
import com.searchservice.app.domain.repository.QuoteRepository
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class CreateQuoteRabbitListener(
    private val quoteRepository: QuoteRepository
) {

    @RabbitListener(queues = ["create.quote"])
    fun listen(message: String) {
        val parsedMessage = jacksonObjectMapper().readValue<Quote>(message)
       quoteRepository.save(parsedMessage)
    }
}