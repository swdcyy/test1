package com.yxcorp.gifshow.events.SyncDetailAnimParamEvent$Mode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SyncDetailAnimParamEvent$Mode extends Enum	// class@000e84
{
    public static final SyncDetailAnimParamEvent$Mode[] $VALUES;
    public static final SyncDetailAnimParamEvent$Mode MAX;
    public static final SyncDetailAnimParamEvent$Mode NORMAL;
    public static final SyncDetailAnimParamEvent$Mode REMOVE;

    static {
       SyncDetailAnimParamEvent$Mode mode;
       SyncDetailAnimParamEvent$Mode[] modeArray = new SyncDetailAnimParamEvent$Mode[]{mode,mode,mode};
       mode = new SyncDetailAnimParamEvent$Mode("NORMAL", 0);
       SyncDetailAnimParamEvent$Mode.NORMAL = mode;
       mode = new SyncDetailAnimParamEvent$Mode("MAX", 1);
       SyncDetailAnimParamEvent$Mode.MAX = mode;
       mode = new SyncDetailAnimParamEvent$Mode("REMOVE", 2);
       SyncDetailAnimParamEvent$Mode.REMOVE = mode;
       SyncDetailAnimParamEvent$Mode.$VALUES = modeArray;
    }
    public void SyncDetailAnimParamEvent$Mode(String p0,int p1){
       super(p0, p1);
    }
    public static SyncDetailAnimParamEvent$Mode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SyncDetailAnimParamEvent$Mode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SyncDetailAnimParamEvent$Mode.class, p0);
    }
    public static SyncDetailAnimParamEvent$Mode[] values(){
       Object obj = PatchProxy.apply(null, null, SyncDetailAnimParamEvent$Mode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SyncDetailAnimParamEvent$Mode.$VALUES.clone();
    }
}
