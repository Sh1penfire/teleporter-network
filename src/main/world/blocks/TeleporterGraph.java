package main.world.blocks;

import arc.struct.ObjectSet;
import arc.struct.Seq;
import arc.util.Log;
import arc.util.Time;
import mindustry.gen.Groups;

import java.util.Iterator;

public class TeleporterGraph {

    private static ObjectSet<Network> blockNet = new ObjectSet<Network>();

    public class Network{
        public ObjectSet<TeleporterBlock> teleporters = new ObjectSet<TeleporterBlock>();
    }

    //sets up the graph for the current session
    public static void setup(){

        Seq seq = Seq.with("string", 8, null);

        Iterator iterable = seq.iterator();

        long time = Time.millis();

        while(iterable.hasNext()){
            Log.info(iterable.next());
        }

        Log.info("Iterator: " + Time.timeSinceMillis(time) + "ms");


        long time2 = Time.millis();

        seq.each(c -> Log.info(c));

        Log.info("Each: " + Time.timeSinceMillis(time2) + "ms");

    }
}
