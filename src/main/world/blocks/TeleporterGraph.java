package main.world.blocks;

import arc.struct.ObjectSet;

public class TeleporterGraph {

    private static ObjectSet<Network> blockNet = new ObjectSet<Network>();

    public class Network{
        public ObjectSet<TeleporterBlock> teleporters = new ObjectSet<TeleporterBlock>();
    }

}
