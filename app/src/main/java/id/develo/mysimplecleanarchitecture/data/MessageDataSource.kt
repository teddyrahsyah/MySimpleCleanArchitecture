package id.develo.mysimplecleanarchitecture.data

import id.develo.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}