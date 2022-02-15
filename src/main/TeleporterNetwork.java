package main;

import arc.*;
import arc.util.*;
import main.content.TeleBlocks;
import main.world.blocks.TeleporterGraph;
import mindustry.*;
import mindustry.content.*;
import mindustry.core.GameState.State;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class TeleporterNetwork extends Mod{
    public TeleporterNetwork(){
        Events.on(ContentInitEvent.class, e -> {
            UI.init();
        });

        Events.on(StateChangeEvent.class, e -> {
            if(e.from == State.menu && e.to == State.playing){
                TeleporterGraph.setup();
            }
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading teleporter content");
        long time = Time.millis();

        TeleBlocks.loadCont();

        Log.info(Strings.format("Loaded teleporters in {0} seconds", Time.timeSinceMillis(time)));
    }

}
