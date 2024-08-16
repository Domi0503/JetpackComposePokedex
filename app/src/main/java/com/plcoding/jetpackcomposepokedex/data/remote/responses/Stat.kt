package com.plcoding.jetpackcomposepokedex.data.remote.responses

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: com.plcoding.jetpackcomposepokedex.data.remote.responses.StatX
)