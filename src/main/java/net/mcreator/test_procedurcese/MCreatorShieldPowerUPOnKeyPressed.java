package net.mcreator.test_procedurcese;

import net.minecraft.world.WorldServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorShieldPowerUPOnKeyPressed extends Elementstest_procedurcese.ModElement {
	public MCreatorShieldPowerUPOnKeyPressed(Elementstest_procedurcese instance) {
		super(instance, 15);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorShieldPowerUPOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getEntityData().getDouble("currentability")) == 0) && (((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity)
						.getAdvancements()
						.getProgress(
								((WorldServer) entity.world).getAdvancementManager().getAdvancement(
										new ResourceLocation("test_procedurcese:ropeshieldunlock"))).isDone()
				: false))) {
			entity.getEntityData().setDouble("currentability", 1);
		} else if (((entity.getEntityData().getDouble("currentability")) == 1)) {
			entity.getEntityData().setDouble("currentability", 0);
		}
	}
}
