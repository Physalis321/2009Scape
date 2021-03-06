package plugin.interaction.npc;

import core.cache.def.impl.NPCDefinition;
import core.game.interaction.OptionHandler;
import core.game.node.Node;
import core.game.node.entity.player.Player;
import core.plugin.InitializablePlugin;
import core.plugin.Plugin;

/**
 * Represents the plugin used to handle the spirit graahk familiar
 * @author Splinter
 */
@InitializablePlugin
public final class SpiritGraahkOptionPlugin extends OptionHandler {

	@Override
	public Plugin<Object> newInstance(Object arg) throws Throwable {
		NPCDefinition.forId(7363).getConfigurations().put("option:interact", this);
		return this;
	}

	@Override
	public boolean handle(final Player player, Node node, String option) {
		player.getDialogueInterpreter().open(7353, node.asNpc());
		return true;
	}

}
