package com.kuaishou.live.core.show.race.LiveRaceConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveRaceConfig implements Serializable	// class@000e47
{
    public boolean mDisableRaceLog;
    public static final long serialVersionUID = 0xd19692ed97a5450e;

    public void LiveRaceConfig(){
       super();
       this.mDisableRaceLog = true;
    }
}
