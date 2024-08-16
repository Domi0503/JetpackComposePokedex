package com.plcoding.jetpackcomposepokedex.data.remote.responses

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.plcoding.jetpackcomposepokedex.data.remote.responses.MoveLearnMethod,
    val version_group: com.plcoding.jetpackcomposepokedex.data.remote.responses.VersionGroup
)