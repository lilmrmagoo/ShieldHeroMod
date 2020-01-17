package net.mcreator.test_procedurcese;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorRopeShieldItemRightClicked extends Elementstest_procedurcese.ModElement {
	public MCreatorRopeShieldItemRightClicked(Elementstest_procedurcese instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorRopeShieldItemRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorRopeShieldItemRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		double laddersplaced = 0;
		if ((entity.isSneaking())) {
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
					MCreatorRopeShieldItem.block, (int) (1)).getItem())) {
				if ((((((int) entity.rotationYaw) > 135) && (((int) entity.rotationYaw) < 225)) || ((entity.getHorizontalFacing()) == EnumFacing.NORTH))) {
					world.setBlockState(
							new BlockPos((int) (entity.world.rayTraceBlocks(
									entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
											entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
													entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()), (int) ((entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
													entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ()) + 1)), MCreatorRope.block
									.getDefaultState(), 3);
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) (entity.world.rayTraceBlocks(
								entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()), (int) (entity.world.rayTraceBlocks(
								entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()), (int) ((entity.world.rayTraceBlocks(
								entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ()) + 1)));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(
										new BlockPos((int) (entity.world.rayTraceBlocks(
												entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
														entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()), (int) (entity.world
												.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
																entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()),
												(int) ((entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
																entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ()) + 1)), _bs
												.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				if ((((world.getBlockState(new BlockPos((int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
						entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100, entity.getLook(1f).z * 100),
						false, false, true).getBlockPos().getX()), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
						entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100, entity.getLook(1f).z * 100),
						false, false, true).getBlockPos().getY()), (int) ((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
						entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100, entity.getLook(1f).z * 100),
						false, false, true).getBlockPos().getZ()) - 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock()) && ((entity
						.getHorizontalFacing()) == EnumFacing.SOUTH))) {
					world.setBlockState(
							new BlockPos((int) (entity.world.rayTraceBlocks(
									entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
											entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
													entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()), (int) ((entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
													entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ()) - 1)), MCreatorRope.block
									.getDefaultState(), 3);
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) (entity.world.rayTraceBlocks(
								entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()), (int) (entity.world.rayTraceBlocks(
								entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()), (int) ((entity.world.rayTraceBlocks(
								entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ()) - 1)));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(
										new BlockPos((int) (entity.world.rayTraceBlocks(
												entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
														entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()), (int) (entity.world
												.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
																entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()),
												(int) ((entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
																entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ()) - 1)), _bs
												.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				if (((entity.getHorizontalFacing()) == EnumFacing.WEST)) {
					world.setBlockState(
							new BlockPos((int) ((entity.world.rayTraceBlocks(
									entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
											entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()) + 1), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
													entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
													entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ())), MCreatorRope.block
									.getDefaultState(), 3);
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) ((entity.world.rayTraceBlocks(
								entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()) + 1), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ())));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(
										new BlockPos((int) ((entity.world.rayTraceBlocks(
												entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
														entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()) + 1),
												(int) (entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
																entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()),
												(int) (entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
																entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ())), _bs
												.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				if (((entity.getHorizontalFacing()) == EnumFacing.EAST)) {
					world.setBlockState(
							new BlockPos((int) ((entity.world.rayTraceBlocks(
									entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
											entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()) - 1), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
													entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
													entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ())), MCreatorRope.block
									.getDefaultState(), 3);
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) ((entity.world.rayTraceBlocks(
								entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()) - 1), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ())));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(
										new BlockPos((int) ((entity.world.rayTraceBlocks(
												entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
														entity.getLook(1f).z * 100), false, false, true).getBlockPos().getX()) - 1),
												(int) (entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
																entity.getLook(1f).z * 100), false, false, true).getBlockPos().getY()),
												(int) (entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
																entity.getLook(1f).z * 100), false, false, true).getBlockPos().getZ())), _bs
												.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
			}
		}
		if (((((entity.getEntityData().getDouble("currentability")) == 1) && ((entity.getEntityData().getDouble("AirShieldsNum")) < (entity
				.getEntityData().getDouble("unlockedAirShields")))) && ((entity.getEntityData().getDouble("AirStrikeShieldCool")) <= 0))) {
			if (((entity.getHorizontalFacing()) == EnumFacing.SOUTH)) {
				world.setBlockState(
						new BlockPos((int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) ((entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) - 1)),
						MCreatorAirStrikeShield.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getX()), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getY()), (int) ((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getZ()) - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(
									new BlockPos((int) (entity.world.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
											.rayTraceBlocks(
													entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
															entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()),
											(int) ((entity.world.rayTraceBlocks(
													entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
															entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) - 1)), _bs
											.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
				entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) + 1));
			} else if (((entity.getHorizontalFacing()) == EnumFacing.WEST)) {
				world.setBlockState(
						new BlockPos((int) ((entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) + 1), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())), MCreatorAirStrikeShield.block
								.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) ((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getX()) + 1), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getY()), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getZ())));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(
									new BlockPos((int) ((entity.world.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) + 1), (int) (entity.world
											.rayTraceBlocks(
													entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
															entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()),
											(int) (entity.world.rayTraceBlocks(
													entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
															entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())), _bs.withProperty(
											(PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
				entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) + 1));
			} else if ((((((int) entity.rotationYaw) > 135) && (((int) entity.rotationYaw) < 225)) || ((entity.getHorizontalFacing()) == EnumFacing.NORTH))) {
				world.setBlockState(
						new BlockPos((int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) ((entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) + 1)),
						MCreatorAirStrikeShield.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getX()), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getY()), (int) ((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getZ()) + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(
									new BlockPos((int) (entity.world.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
											.rayTraceBlocks(
													entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
															entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()),
											(int) ((entity.world.rayTraceBlocks(
													entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
															entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) + 1)), _bs
											.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
				entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) + 1));
			} else if (((entity.getHorizontalFacing()) == EnumFacing.EAST)) {
				world.setBlockState(
						new BlockPos((int) ((entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) - 1), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())), MCreatorAirStrikeShield.block
								.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) ((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getX()) - 1), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getY()), (int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
							entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16, entity.getLook(1f).z * 16),
							false, false, true).getBlockPos().getZ())));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(
									new BlockPos((int) ((entity.world.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) - 1), (int) (entity.world
											.rayTraceBlocks(
													entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
															entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()),
											(int) (entity.world.rayTraceBlocks(
													entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
															entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())), _bs.withProperty(
											(PropertyDirection) prop, EnumFacing.EAST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
				entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) + 1));
			}
			entity.getEntityData().setDouble("AirShieldEXP", ((entity.getEntityData().getDouble("AirShieldEXP")) + 1));
			entity.getEntityData().setDouble("AirStrikeShieldCool", 1200);
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer)) ? ((EntityPlayerMP) entity)
				.getAdvancements()
				.getProgress(
						((WorldServer) entity.world).getAdvancementManager().getAdvancement(new ResourceLocation("test_procedurcese:secondshield")))
				.isDone() : false)) {
			if (((((entity.getEntityData().getDouble("currentability")) == 1) && ((entity.getEntityData().getDouble("AirShieldsNum")) < (entity
					.getEntityData().getDouble("unlockedAirShields")))) && ((entity.getEntityData().getDouble("AirStrikeShield2Cool")) <= 0))) {
				if (((entity.getHorizontalFacing()) == EnumFacing.SOUTH)) {
					world.setBlockState(
							new BlockPos((int) (entity.world.rayTraceBlocks(
									entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
											entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) ((entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) - 1)),
							MCreatorAirStrikeShield.block.getDefaultState(), 3);
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) ((entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) - 1)));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(
										new BlockPos((int) (entity.world.rayTraceBlocks(
												entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
														entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
												.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
																entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()),
												(int) ((entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
																entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) - 1)), _bs
												.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
					entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) + 1));
				} else if (((entity.getHorizontalFacing()) == EnumFacing.WEST)) {
					world.setBlockState(
							new BlockPos((int) ((entity.world.rayTraceBlocks(
									entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
											entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) + 1), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())),
							MCreatorAirStrikeShield.block.getDefaultState(), 3);
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) ((entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) + 1), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(
										new BlockPos((int) ((entity.world.rayTraceBlocks(
												entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
														entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) + 1),
												(int) (entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
																entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()),
												(int) (entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
																entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())), _bs
												.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
					entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) + 1));
				} else if ((((((int) entity.rotationYaw) > 135) && (((int) entity.rotationYaw) < 225)) || ((entity.getHorizontalFacing()) == EnumFacing.NORTH))) {
					world.setBlockState(
							new BlockPos((int) (entity.world.rayTraceBlocks(
									entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
											entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) ((entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) + 1)),
							MCreatorAirStrikeShield.block.getDefaultState(), 3);
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) ((entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) + 1)));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(
										new BlockPos((int) (entity.world.rayTraceBlocks(
												entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
														entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()), (int) (entity.world
												.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
																entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()),
												(int) ((entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
																entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ()) + 1)), _bs
												.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
					entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) + 1));
				} else if (((entity.getHorizontalFacing()) == EnumFacing.EAST)) {
					world.setBlockState(
							new BlockPos((int) ((entity.world.rayTraceBlocks(
									entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
											entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) - 1), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) (entity.world
									.rayTraceBlocks(
											entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
													entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())),
							MCreatorAirStrikeShield.block.getDefaultState(), 3);
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) ((entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) - 1), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()), (int) (entity.world
								.rayTraceBlocks(
										entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
												entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(
										new BlockPos((int) ((entity.world.rayTraceBlocks(
												entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
														entity.getLook(1f).z * 16), false, false, true).getBlockPos().getX()) - 1),
												(int) (entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
																entity.getLook(1f).z * 16), false, false, true).getBlockPos().getY()),
												(int) (entity.world.rayTraceBlocks(
														entity.getPositionEyes(1f),
														entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 16, entity.getLook(1f).y * 16,
																entity.getLook(1f).z * 16), false, false, true).getBlockPos().getZ())), _bs
												.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
					entity.getEntityData().setDouble("AirShieldsNum", ((entity.getEntityData().getDouble("AirShieldsNum")) + 1));
				}
				entity.getEntityData().setDouble("AirStrikeShield2Cool", 1200);
			}
		}
	}
}
