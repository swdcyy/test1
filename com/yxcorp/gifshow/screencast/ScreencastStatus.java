package com.yxcorp.gifshow.screencast.ScreencastStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ScreencastStatus extends Enum	// class@001b24
{
    public static final ScreencastStatus[] $VALUES;
    public static final ScreencastStatus BREAK;
    public static final ScreencastStatus END;
    public static final ScreencastStatus PAUSE;
    public static final ScreencastStatus START;
    public static final ScreencastStatus UNSTART;

    static {
       ScreencastStatus screencastSt1;
       ScreencastStatus[] screencastSt = new ScreencastStatus[]{screencastSt1,screencastSt1,screencastSt1,screencastSt1,screencastSt1};
       screencastSt1 = new ScreencastStatus("UNSTART", 0);
       ScreencastStatus.UNSTART = screencastSt1;
       screencastSt1 = new ScreencastStatus("START", 1);
       ScreencastStatus.START = screencastSt1;
       screencastSt1 = new ScreencastStatus("PAUSE", 2);
       ScreencastStatus.PAUSE = screencastSt1;
       screencastSt1 = new ScreencastStatus("BREAK", 3);
       ScreencastStatus.BREAK = screencastSt1;
       screencastSt1 = new ScreencastStatus("END", 4);
       ScreencastStatus.END = screencastSt1;
       ScreencastStatus.$VALUES = screencastSt;
    }
    public void ScreencastStatus(String p0,int p1){
       super(p0, p1);
    }
    public static ScreencastStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ScreencastStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ScreencastStatus.class, p0);
    }
    public static ScreencastStatus[] values(){
       Object obj = PatchProxy.apply(null, null, ScreencastStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScreencastStatus.$VALUES.clone();
    }
}
