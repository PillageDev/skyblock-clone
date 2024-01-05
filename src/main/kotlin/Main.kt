import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {
    companion object {
        lateinit var instance: Main
            private set
    }
    override fun onEnable() {
        logger.info("Skyblock is enabled!")
    }

    override fun onDisable() {
        logger.info("Skyblock is disabled!")
    }
}