package com.plcoding.jetpackcomposepokedex.data.remote.responses

data class Pokemon(
    val abilities: List<com.plcoding.jetpackcomposepokedex.data.remote.responses.Ability>,
    val base_experience: Int,
    val cries: com.plcoding.jetpackcomposepokedex.data.remote.responses.Cries,
    val forms: List<com.plcoding.jetpackcomposepokedex.data.remote.responses.Form>,
    val game_indices: List<com.plcoding.jetpackcomposepokedex.data.remote.responses.GameIndice>,
    val height: Int,
    val held_items: List<Any>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.plcoding.jetpackcomposepokedex.data.remote.responses.Move>,
    val name: String,
    val order: Int,
    val past_abilities: List<Any>,
    val past_types: List<Any>,
    val species: com.plcoding.jetpackcomposepokedex.data.remote.responses.Species,
    val sprites: com.plcoding.jetpackcomposepokedex.data.remote.responses.Sprites,
    val stats: List<com.plcoding.jetpackcomposepokedex.data.remote.responses.Stat>,
    val types: List<com.plcoding.jetpackcomposepokedex.data.remote.responses.Type>,
    val weight: Int
)