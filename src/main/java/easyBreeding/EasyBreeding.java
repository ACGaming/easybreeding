package easyBreeding;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="easyBreeding", name="Easy Breeding", version="1.1")
public class easyBreeding 
{
	@Mod.EventHandler
	public void load(FMLInitializationEvent evt)
	{
		MinecraftForge.EVENT_BUS.register(new droppedFoodEventHandler());
	}
}