package com.yxcorp.gifshow.social.bridge.Klink.KlinkState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KlinkState extends Enum	// class@001d4c
{
    public static final KlinkState[] $VALUES;
    public static final KlinkState down;
    public static final KlinkState offline;
    public static final KlinkState online;

    static {
       KlinkState klinkState = new KlinkState("down", 0);
       KlinkState.down = klinkState;
       KlinkState klinkState1 = new KlinkState("offline", 1);
       KlinkState.offline = klinkState1;
       KlinkState klinkState2 = new KlinkState("online", 2);
       KlinkState.online = klinkState2;
       KlinkState[] klinkStateAr = new KlinkState[]{klinkState,klinkState1,klinkState2};
       KlinkState.$VALUES = klinkStateAr;
    }
    public void KlinkState(String p0,int p1){
       super(p0, p1);
    }
    public static KlinkState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KlinkState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KlinkState.class, p0);
    }
    public static KlinkState[] values(){
       Object obj = PatchProxy.apply(null, null, KlinkState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KlinkState.$VALUES.clone();
    }
}
