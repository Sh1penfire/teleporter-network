package main.world.blocks;

import arc.struct.ObjectSet;
import mindustry.gen.Groups;

public class TeleporterGraph {

    private static ObjectSet<Network> blockNet = new ObjectSet<Network>();

    public class Network{
        public ObjectSet<TeleporterBlock> teleporters = new ObjectSet<TeleporterBlock>();
    }

    //sets up the graph for the current session
    public static void setup(){
        Groups.build.iterator();
    }
}
