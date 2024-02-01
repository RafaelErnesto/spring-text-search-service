package com.searchservice.app.config

import org.springframework.amqp.core.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class AmqpConfig {

    @Bean
    fun createQuoteQueue(): Queue? {
        return QueueBuilder.durable("create.quote")
            .withArgument("x-dead-letter-exchange", "create.quote.dlx")
            .withArgument("x-dead-letter-routing-key", "dlq")
            .build()
    }

    @Bean
    fun createQuoteDeadLetterQueue(): Queue? {
        return QueueBuilder.durable("create.quote.dlq").build()
    }

    @Bean
    fun createQuoteExchange(): DirectExchange? {
        return DirectExchange("create.quote")
    }

    @Bean
    fun binding(createQuoteQueue: Queue?, createQuoteExchange: DirectExchange?): Binding? {
        return BindingBuilder.bind(createQuoteQueue).to(createQuoteExchange).with("")
    }

    @Bean
    fun createQuoteDeadLetterExchange(): DirectExchange? {
        return DirectExchange("create.quote.dlx")
    }

    @Bean
    fun bindingDLQ(createQuoteDeadLetterQueue: Queue?, createQuoteDeadLetterExchange: DirectExchange?): Binding? {
        return BindingBuilder.bind(createQuoteDeadLetterQueue).to(createQuoteDeadLetterExchange).with("dlq")
    }
}