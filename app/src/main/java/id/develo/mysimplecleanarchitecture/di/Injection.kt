package id.develo.mysimplecleanarchitecture.di

import id.develo.mysimplecleanarchitecture.data.IMessageDataSource
import id.develo.mysimplecleanarchitecture.data.MessageDataSource
import id.develo.mysimplecleanarchitecture.data.MessageRepository
import id.develo.mysimplecleanarchitecture.domain.IMessageRepository
import id.develo.mysimplecleanarchitecture.domain.MessageInteractor
import id.develo.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}