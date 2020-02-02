package net.mcreator.test_procedurcese;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementstest_procedurcese.ModElement.Tag
public class MCreatorRopetag extends Elementstest_procedurcese.ModElement {
	public MCreatorRopetag(Elementstest_procedurcese instance) {
		super(instance, 26);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("rope", new ItemStack(MCreatorRopeItem.block, (int) (1)));
	}
}
