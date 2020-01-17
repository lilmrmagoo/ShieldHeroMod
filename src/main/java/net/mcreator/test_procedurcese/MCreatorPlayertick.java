package net.mcreator.test_procedurcese;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorPlayertick extends Elementstest_procedurcese.ModElement {
	public MCreatorPlayertick(Elementstest_procedurcese instance) {
		super(instance, 23);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlayertick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getDouble("AirStrikeShieldCool")) > 0)) {
			entity.getEntityData().setDouble("AirStrikeShieldCool", ((entity.getEntityData().getDouble("AirStrikeShieldCool")) - 1));
		}
		if (((entity.getEntityData().getDouble("AirStrikeShield2Cool")) > 0)) {
			entity.getEntityData().setDouble("AirStrikeShield2Cool", ((entity.getEntityData().getDouble("AirStrikeShield2Cool")) - 1));
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
