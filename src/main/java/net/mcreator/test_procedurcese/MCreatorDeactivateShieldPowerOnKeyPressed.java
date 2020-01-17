package net.mcreator.test_procedurcese;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorDeactivateShieldPowerOnKeyPressed extends Elementstest_procedurcese.ModElement {
	public MCreatorDeactivateShieldPowerOnKeyPressed(Elementstest_procedurcese instance) {
		super(instance, 24);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorDeactivateShieldPowerOnKeyPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorDeactivateShieldPowerOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity.getEntityData().getDouble("currentability")) == 1)) {
			if (((world.getBlockState(new BlockPos((int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
					entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 17, entity.getLook(1f).y * 17, entity.getLook(1f).z * 17), false,
					false, true).getBlockPos().getX()), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
					entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 17, entity.getLook(1f).y * 17, entity.getLook(1f).z * 17), false,
					false, true).getBlockPos().getY()), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
					entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 17, entity.getLook(1f).y * 17, entity.getLook(1f).z * 17), false,
					false, true).getBlockPos().getZ())))).getBlock() == MCreatorAirStrikeShield.block.getDefaultState().getBlock())) {
				world.setBlockState(
						new BlockPos((int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 17, entity.getLook(1f).y * 17,
												entity.getLook(1f).z * 17), false, false, true).getBlockPos().getX()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 17, entity.getLook(1f).y * 17,
												entity.getLook(1f).z * 17), false, false, true).getBlockPos().getY()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 17, entity.getLook(1f).y * 17,
												entity.getLook(1f).z * 17), false, false, true).getBlockPos().getZ())), Blocks.AIR.getDefaultState(),
						3);
				entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) - 1));
			}
		}
	}
}
