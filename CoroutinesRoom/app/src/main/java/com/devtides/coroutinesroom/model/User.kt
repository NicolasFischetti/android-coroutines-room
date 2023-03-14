package com.devtides.coroutinesroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    val username: String,

    @ColumnInfo(name = "password_hash")
    val passwordHas: Int,
    val info: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}