package net.mcreator.test_procedurcese;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorAirStrikeShieldEntityWalksOn extends Elementstest_procedurcese.ModElement {
	public MCreatorAirStrikeShieldEntityWalksOn(Elementstest_procedurcese instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorAirStrikeShieldEntityWalksOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorAirStrikeShieldEntityWalksOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorAirStrikeShieldEntityWalksOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorAirStrikeShieldEntityWalksOn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		try {
			IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing")) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.DOWN), 3);
					break;
				}
			}
		} catch (Exception e) {
		}
	}
}
