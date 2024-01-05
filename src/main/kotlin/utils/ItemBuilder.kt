package utils

data class AbilityStyle(
    var name: String,
    var description: String
)

data class PetAbility(
    var style: AbilityStyle,
    var action: () -> Unit
)

data class PetBuilder(
    var name: String,
    var description: String,
    var type: String,
    var rarity: String,
    var level: Int,
    var abilities: MutableList<PetAbility>
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

fun String.defense(): String {
    return "§a❈ Defense"
}

fun String.health(): String {
    return "§c❤ Health"
}

fun String.speed(): String {
    return "§b✦ Speed"
}

fun String.critChance(): String {
    return "§c☣ Crit Chance"
}

fun String.critDamage(): String {
    return "§c☠ Crit Damage"
}

fun String.intelligence(): String {
    return "§b✎ Intelligence"
}

fun String.seaCreatureChance(): String {
    return "§b❁ Sea Creature Chance"
}

fun String.magicFind(): String {
    return "§d✯ Magic Find"
}

fun String.petLuck(): String {
    return "§d☘ Pet Luck"
}

fun String.fishingSpeed(): String {
    return "§b✹ Fishing Speed"
}

fun String.miningSpeed(): String {
    return "§c⸕ Mining Speed"
}

fun String.foragingSpeed(): String {
    return "§a✤ Foraging Speed"
}

fun String.abilityDamage(): String {
    return "§d✹ Ability Damage"
}

fun String.attackSpeed(): String {
    return "§c⚔ Attack Speed"
}

fun String.miningFortune(): String {
    return "§c⸕ Mining Fortune"
}  

fun String.foragingFortune(): String {
    return "§a✤ Foraging Fortune"
}

fun String.farmingFortune(): String {
    return "§e✿ Farming Fortune"
}

fun String.farmingSpeed(): String {
    return "§e✿ Farming Speed"
}

fun String.fishingFortune(): String {
    return "§b✹ Fishing Fortune"
}



