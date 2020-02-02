package net.mcreator.test_procedurcese;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorRopeUpdateTick extends Elementstest_procedurcese.ModElement {
	public MCreatorRopeUpdateTick(Elementstest_procedurcese instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorRopeUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorRopeUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorRopeUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorRopeUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((!(((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MCreatorRope.block.getDefaultState().getBlock()) || ((world
				.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MCreatorRopeFake.block.getDefaultState().getBlock())))) {
			if ((((new Object() {
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
			}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH) && ((world.getBlockState(new BlockPos((int) x, (int) y,
					(int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - 1), (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock(), true);
			} else if ((((new Object() {
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
			}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH) && ((world.getBlockState(new BlockPos((int) x, (int) y,
					(int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - 1), (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock(), true);
			} else if ((((new Object() {
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
			}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST) && ((world.getBlockState(new BlockPos((int) (x + 1),
					(int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - 1), (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock(), true);
			} else if ((((new Object() {
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
			}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST) && ((world.getBlockState(new BlockPos((int) (x - 1),
					(int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - 1), (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock(), true);
			}
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MCreatorRope.block.getDefaultState().getBlock()) || ((world
				.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MCreatorRopeFake.block.getDefaultState().getBlock()))) {
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
			}.getEnumFacing(new BlockPos((int) x, (int) (y + 1), (int) z))) == EnumFacing.NORTH)) {
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
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
			}.getEnumFacing(new BlockPos((int) x, (int) (y + 1), (int) z))) == EnumFacing.SOUTH)) {
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
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
			}.getEnumFacing(new BlockPos((int) x, (int) (y + 1), (int) z))) == EnumFacing.WEST)) {
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.WEST),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
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
			}.getEnumFacing(new BlockPos((int) x, (int) (y + 1), (int) z))) == EnumFacing.EAST)) {
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
		}
	}
}
