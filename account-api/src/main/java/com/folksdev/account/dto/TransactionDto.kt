package com.folksdev.account.dto

import com.folksdev.account.model.TransactionType
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransactionDto (
    val id: String?,
    val transactionalType: TransactionType? = TransactionType.INITIAL,
    val amount: BigDecimal?,
    val transactionalDate: LocalDateTime?
) {
}