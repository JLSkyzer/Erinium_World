package fr.eriniumgroups.eriniumworld.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.eriniumgroups.eriniumworld.gui.GuiTestGui;
import fr.eriniumgroups.eriniumworld.EriniumworldMod;
import fr.eriniumgroups.eriniumworld.ElementsEriniumworldMod;

@ElementsEriniumworldMod.ModElement.Tag
public class ProcedureTestCommandCommandExecuted extends ElementsEriniumworldMod.ModElement {
	public ProcedureTestCommandCommandExecuted(ElementsEriniumworldMod instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TestCommandCommandExecuted!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TestCommandCommandExecuted!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TestCommandCommandExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TestCommandCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TestCommandCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(EriniumworldMod.instance, GuiTestGui.GUIID, world, x, y, z);
	}
}
