package com.kuaishou.live.core.show.race.HorseRaceInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.live.model.Race;

public class HorseRaceInfoResponse implements Serializable	// class@000e45
{
    public String mAttach;
    public Race mRace;
    public static final long serialVersionUID = 0x47293464c6ee2c4f;

    public void HorseRaceInfoResponse(){
       super();
       this.mRace = new Race();
       this.mAttach = "";
    }
}
