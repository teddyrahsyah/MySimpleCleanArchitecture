package id.develo.mysimplecleanarchitecture.data

import id.develo.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}