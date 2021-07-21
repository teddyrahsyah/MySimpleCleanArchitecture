package id.develo.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String) : MessageEntity
}