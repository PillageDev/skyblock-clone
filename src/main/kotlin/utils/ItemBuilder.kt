package utils

data class AbilityStyle(
    var name: String,
    var description: String
)

data class PetBuilder(
    var name: String,
    var description: String,
    var type: String,
    var rarity: String,
    var level: Int,

)

data class PetAbility(
    var name: String,
    var description: String
)

enum class Rarity(val color: String) {
    COMMON("§f"),
    UNCOMMON("§a"),
    RARE("§9"),
    EPIC("§5"),
    LEGENDARY("§6"),
    MYTHIC("§d"),
    DIVINE("§c"),
    SPECIAL("§b"),
    VERY_SPECIAL("§c"),
}

fun String.damage(): String {
    return "§c❁ Damage"
}

fun bruh(): String {
    return "Add 3".damage() + "to "
}