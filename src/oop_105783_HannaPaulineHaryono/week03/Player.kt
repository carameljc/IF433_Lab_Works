package oop_105783_HannaPaulineHaryono.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val currentLevel = level
            xp += amount
            if (level > currentLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}