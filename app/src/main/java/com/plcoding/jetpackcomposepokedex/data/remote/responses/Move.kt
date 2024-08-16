package com.plcoding.jetpackcomposepokedex.data.remote.responses

data class Move(
    val move: com.plcoding.jetpackcomposepokedex.data.remote.responses.MoveX,
    val version_group_details: List<com.plcoding.jetpackcomposepokedex.data.remote.responses.VersionGroupDetail>
)