package main.world.blocks;

import mindustry.gen.Building;
import mindustry.world.Block;

public class TeleporterBlock extends Block {
    public TeleporterBlock(String name) {
        super(name);
        update = true;
    }

    public class TeleporterBuild extends Building implements Teleporter {
        public TeleporterGraph teleGraph = new TeleporterGraph();
    }
}
