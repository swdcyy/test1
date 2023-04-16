package com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlayEvent$Status extends Enum	// class@001501
{
    public static final PlayEvent$Status[] $VALUES;
    public static final PlayEvent$Status PAUSE;
    public static final PlayEvent$Status PLAY;
    public static final PlayEvent$Status RESUME;
    public static final PlayEvent$Status STOP;

    static {
       PlayEvent$Status status = new PlayEvent$Status("PLAY", 0);
       PlayEvent$Status.PLAY = status;
       PlayEvent$Status status1 = new PlayEvent$Status("PAUSE", 1);
       PlayEvent$Status.PAUSE = status1;
       PlayEvent$Status status2 = new PlayEvent$Status("RESUME", 2);
       PlayEvent$Status.RESUME = status2;
       PlayEvent$Status status3 = new PlayEvent$Status("STOP", 3);
       PlayEvent$Status.STOP = status3;
       PlayEvent$Status[] statusArray = new PlayEvent$Status[]{status,status1,status2,status3};
       PlayEvent$Status.$VALUES = statusArray;
    }
    public void PlayEvent$Status(String p0,int p1){
       super(p0, p1);
    }
    public static PlayEvent$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayEvent$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlayEvent$Status.class, p0);
    }
    public static PlayEvent$Status[] values(){
       Object obj = PatchProxy.apply(null, null, PlayEvent$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayEvent$Status.$VALUES.clone();
    }
}
