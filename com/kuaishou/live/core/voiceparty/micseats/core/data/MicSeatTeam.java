package com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MicSeatTeam extends Enum	// class@00157c
{
    public static final MicSeatTeam[] $VALUES;
    public static final MicSeatTeam BLUE;
    public static final MicSeatTeam NONE;
    public static final MicSeatTeam YELLOW;

    static {
       MicSeatTeam micSeatTeam;
       MicSeatTeam[] micSeatTeamA = new MicSeatTeam[]{micSeatTeam,micSeatTeam,micSeatTeam};
       micSeatTeam = new MicSeatTeam("YELLOW", 0);
       MicSeatTeam.YELLOW = micSeatTeam;
       micSeatTeam = new MicSeatTeam("BLUE", 1);
       MicSeatTeam.BLUE = micSeatTeam;
       micSeatTeam = new MicSeatTeam("NONE", 2);
       MicSeatTeam.NONE = micSeatTeam;
       MicSeatTeam.$VALUES = micSeatTeamA;
    }
    public void MicSeatTeam(String p0,int p1){
       super(p0, p1);
    }
    public static MicSeatTeam valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MicSeatTeam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MicSeatTeam.class, p0);
    }
    public static MicSeatTeam[] values(){
       Object obj = PatchProxy.apply(null, null, MicSeatTeam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MicSeatTeam.$VALUES.clone();
    }
}
