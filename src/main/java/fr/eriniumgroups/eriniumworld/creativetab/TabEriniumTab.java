
package fr.eriniumgroups.eriniumworld.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import fr.eriniumgroups.eriniumworld.item.ItemEriniumLogo;
import fr.eriniumgroups.eriniumworld.ElementsEriniumworldMod;

@ElementsEriniumworldMod.ModElement.Tag
public class TabEriniumTab extends ElementsEriniumworldMod.ModElement {
	public TabEriniumTab(ElementsEriniumworldMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("taberinium_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemEriniumLogo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
