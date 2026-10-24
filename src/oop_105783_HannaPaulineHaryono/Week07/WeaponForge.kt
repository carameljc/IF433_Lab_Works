package oop_105783_HannaPaulineHaryono.Week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            return Weapon(
                item = GameItem(name = "Pedang Kayu Bapuk", damage = 5, rarity = ItemRarity.COMMON),
                durability = 50
            )
        }

        fun forgeEpicSword(): Weapon {
            return Weapon(
                item = GameItem(name = "Pedang Naga Api", damage = 80, rarity = ItemRarity.EPIC),
                durability = 200
            )
        }
    }
}