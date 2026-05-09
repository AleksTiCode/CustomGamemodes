package aleksti.custom_gamemodes

import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent
import net.neoforged.neoforge.common.NeoForge

const val ID = "custom_gamemodes"
@Mod(ID)
class ArmsRaceMod(modEventBus: IEventBus) {

    init {
        modEventBus.addListener(this::onCommonSetup)
        NeoForge.EVENT_BUS.register(this)
    }

    fun onCommonSetup(event: FMLCommonSetupEvent) {
        println("Common setup")
    }

//    @SubscribeEvent
//    fun onRegisterCommands(event: RegisterCommandsEvent) {
//        ArmsRaceCommand().register(event.dispatcher)
//    }
}