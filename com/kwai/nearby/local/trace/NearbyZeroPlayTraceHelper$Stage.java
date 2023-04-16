package com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$Stage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NearbyZeroPlayTraceHelper$Stage extends Enum	// class@000ffe
{
    public static final NearbyZeroPlayTraceHelper$Stage[] $VALUES;
    public static final NearbyZeroPlayTraceHelper$Stage CLICK;
    public static final NearbyZeroPlayTraceHelper$Stage DATA_INIT;
    public static final NearbyZeroPlayTraceHelper$Stage ENTER;
    public static final NearbyZeroPlayTraceHelper$Stage HIDE;
    public static final NearbyZeroPlayTraceHelper$Stage PLAY;
    public static final NearbyZeroPlayTraceHelper$Stage USER_INTERACT;

    static {
       NearbyZeroPlayTraceHelper$Stage stage = new NearbyZeroPlayTraceHelper$Stage("HIDE", 0);
       NearbyZeroPlayTraceHelper$Stage.HIDE = stage;
       NearbyZeroPlayTraceHelper$Stage stage1 = new NearbyZeroPlayTraceHelper$Stage("ENTER", 1);
       NearbyZeroPlayTraceHelper$Stage.ENTER = stage1;
       NearbyZeroPlayTraceHelper$Stage stage2 = new NearbyZeroPlayTraceHelper$Stage("DATA_INIT", 2);
       NearbyZeroPlayTraceHelper$Stage.DATA_INIT = stage2;
       NearbyZeroPlayTraceHelper$Stage stage3 = new NearbyZeroPlayTraceHelper$Stage("USER_INTERACT", 3);
       NearbyZeroPlayTraceHelper$Stage.USER_INTERACT = stage3;
       NearbyZeroPlayTraceHelper$Stage stage4 = new NearbyZeroPlayTraceHelper$Stage("CLICK", 4);
       NearbyZeroPlayTraceHelper$Stage.CLICK = stage4;
       NearbyZeroPlayTraceHelper$Stage stage5 = new NearbyZeroPlayTraceHelper$Stage("PLAY", 5);
       NearbyZeroPlayTraceHelper$Stage.PLAY = stage5;
       NearbyZeroPlayTraceHelper$Stage[] stageArray = new NearbyZeroPlayTraceHelper$Stage[]{stage,stage1,stage2,stage3,stage4,stage5};
       NearbyZeroPlayTraceHelper$Stage.$VALUES = stageArray;
    }
    public void NearbyZeroPlayTraceHelper$Stage(String p0,int p1){
       super(p0, p1);
    }
    public static NearbyZeroPlayTraceHelper$Stage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NearbyZeroPlayTraceHelper$Stage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NearbyZeroPlayTraceHelper$Stage.class, p0);
    }
    public static NearbyZeroPlayTraceHelper$Stage[] values(){
       Object obj = PatchProxy.apply(null, null, NearbyZeroPlayTraceHelper$Stage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NearbyZeroPlayTraceHelper$Stage.$VALUES.clone();
    }
}
