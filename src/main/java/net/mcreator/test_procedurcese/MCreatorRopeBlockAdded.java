package net.mcreator.test_procedurcese;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorRopeBlockAdded extends Elementstest_procedurcese.ModElement {
	public MCreatorRopeBlockAdded(Elementstest_procedurcese instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorRopeBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorRopeBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorRopeBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorRopeBlockAdded!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double blocksplaced = 0;
		double defaultone = 0;
		defaultone = (double) ((defaultone) + 1);
		for (int index0 = 0; index0 < (int) (32); index0++) {
			if (((world.getBlockState(new BlockPos((int) x, (int) (y - (defaultone)), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
					.getBlock())) {
				blocksplaced = (double) ((blocksplaced) + 1);
				world.setBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z), MCreatorRopeFake.block.getDefaultState(), 3);
				defaultone = (double) ((defaultone) + 1);
				if (((new Object() {
					public EnumFacing getEnumFacing(BlockPos pos) {
						try {
							IBlockState _bs = world.getBlockState(pos);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH)) {
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
					world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z),
							world.getBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z)).getBlock(), true);
				} else if (((new Object() {
					public EnumFacing getEnumFacing(BlockPos pos) {
						try {
							IBlockState _bs = world.getBlockState(pos);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH)) {
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
					world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z),
							world.getBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z)).getBlock(), true);
				} else if (((new Object() {
					public EnumFacing getEnumFacing(BlockPos pos) {
						try {
							IBlockState _bs = world.getBlockState(pos);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST)) {
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
					world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z),
							world.getBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z)).getBlock(), true);
				} else if (((new Object() {
					public EnumFacing getEnumFacing(BlockPos pos) {
						try {
							IBlockState _bs = world.getBlockState(pos);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST)) {
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
					world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z),
							world.getBlockState(new BlockPos((int) x, (int) (y - (blocksplaced)), (int) z)).getBlock(), true);
				}
			}
		}
	}
}
