package main;

import arc.*;
import arc.util.*;
import main.content.TeleBlocks;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class TeleporterNetwork extends Mod{

    public TeleporterNetwork(){

    }

    @Override
    public void loadContent(){
        Log.info("Loading teleporter content");
        long time = Time.millis();

        TeleBlocks.loadCont();

        Log.info("Loaded teleporters in {0} seconds", Time.timeSinceMillis(time));
    }

}
