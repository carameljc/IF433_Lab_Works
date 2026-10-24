package oop_105783_HannaPaulineHaryono.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("[SAFE ZONE] Kamu berada di area aman. HP perlahan pulih.")
        }
        is BattleState.MonsterEncounter -> {
            // Smart cast: event otomatis dikenali sebagai MonsterEncounter
            println("[BATTLE] Monster '${event.monsterName}' muncul! Bersiap bertarung!")
        }
        is BattleState.LootDropped -> {
            // Destructuring pada data class GameItem
            val (name, damage, rarity) = event.item
            println("[LOOT] Kamu mendapat '$name' (Damage: $damage, Rarity: $rarity)")
        }
        is BattleState.GameOver -> {
            println("[GAME OVER] ${event.reason}")
        }
    }
}