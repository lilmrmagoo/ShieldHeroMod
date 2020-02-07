package net.mcreator.test_procedurcese;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import java.util.HashMap;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorDebugCommandExecuted extends Elementstest_procedurcese.ModElement {
	public MCreatorDebugCommandExecuted(Elementstest_procedurcese instance) {
		super(instance, 21);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorDebugCommandExecuted!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure MCreatorDebugCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorDebugCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setDouble("AirShieldsNum", 0);
		entity.getEntityData().setBoolean("Ropeextended", (false));
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("true"))) {
			test_procedurceseVariables.MapVariables.get(world).debug = (boolean) (true);
			test_procedurceseVariables.MapVariables.get(world).syncData(world);
		} else if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("false"))) {
			test_procedurceseVariables.MapVariables.get(world).debug = (boolean) (false);
			test_procedurceseVariables.MapVariables.get(world).syncData(world);
		}
	}
}
