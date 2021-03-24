package com.coroutines_example.paging

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cheese (@PrimaryKey(autoGenerate = true) var  id: Int ,var name :String)