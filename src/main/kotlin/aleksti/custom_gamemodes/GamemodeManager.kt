package aleksti.custom_gamemodes

object GamemodeManager {
    val GHOST = CustomGamemodeTemplate(fly = true, immortality = true, effects = listOf("minecraft:invisibility"))
    val ANOTHER = CustomGamemodeTemplate(fly = false, immortality = false, effects = listOf("minecraft:speed"))
}