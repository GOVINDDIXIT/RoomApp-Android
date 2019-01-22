package com.dixit.govind.room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "word_table")
class WordEntity(@PrimaryKey @ColumnInfo(name = "word") val word: String)