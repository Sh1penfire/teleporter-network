package main.content;

import main.world.blocks.TeleporterBlock;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;

public class TeleBlocks {
    public static Block smallTele, largeTele, teleBlocker, sandboxTele, itemsTele;

    public static void loadCont(){
        //following the convention of adjectiveNoun = new Class("noun-adjective"){{
        smallTele = new TeleporterBlock("teleporter-small"){{
            requirements(Category.distribution, ItemStack.with(Items.lead, 80, Items.silicon, 45));
        }};
    }
}
