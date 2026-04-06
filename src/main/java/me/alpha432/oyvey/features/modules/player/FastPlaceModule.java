package me.alpha432.oyvey.features.modules.player;

import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class FastPlaceModule extends Module {

    public FastPlaceModule() {
        super("FastPlace", "Makes you place blocks and throw exp faster", Category.PLAYER);
    }

    @Override
    public void onTick() {
        if (nullCheck()) return;

        Item heldItem = mc.player.getMainHandItem().getItem();

        // Check if the player is holding a block (for placing) or experience bottle (for throwing)
        if (heldItem instanceof BlockItem || heldItem == Items.EXPERIENCE_BOTTLE) {
            mc.rightClickDelay = 0;
        }
    }
}
