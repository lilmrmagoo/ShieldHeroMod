package net.mcreator.test_procedurcese;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.WorldServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorGuibuttoncheckachivement extends Elementstest_procedurcese.ModElement {
	public MCreatorGuibuttoncheckachivement(Elementstest_procedurcese instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGuibuttoncheckachivement!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer)) ? ((EntityPlayerMP) entity)
				.getAdvancements()
				.getProgress(
						((WorldServer) entity.world).getAdvancementManager().getAdvancement(
								new ResourceLocation("test_procedurcese:ropeshieldunlock"))).isDone() : false) && ((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(MCreatorBasicShieldITem.block, (int) (1)))
				: false))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(MCreatorBasicShieldITem.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(MCreatorRopeShieldItem.block, (int) (1)));
		}
	}
}
