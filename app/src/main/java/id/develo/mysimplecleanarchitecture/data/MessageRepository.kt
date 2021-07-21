package id.develo.mysimplecleanarchitecture.data

import id.develo.mysimplecleanarchitecture.domain.IMessageRepository
import id.develo.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity =
        messageDataSource.getMessageFromSource(name)
}