package com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.StartMatchType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class StartMatchType extends Enum	// class@0015a7
{
    public static final StartMatchType[] $VALUES;
    public static final StartMatchType NORMAL;
    public static final StartMatchType REMATCH;

    static {
       StartMatchType startMatchTy1;
       StartMatchType[] startMatchTy = new StartMatchType[]{startMatchTy1,startMatchTy1};
       startMatchTy1 = new StartMatchType("NORMAL", 0);
       StartMatchType.NORMAL = startMatchTy1;
       startMatchTy1 = new StartMatchType("REMATCH", 1);
       StartMatchType.REMATCH = startMatchTy1;
       StartMatchType.$VALUES = startMatchTy;
    }
    public void StartMatchType(String p0,int p1){
       super(p0, p1);
    }
    public static StartMatchType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StartMatchType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(StartMatchType.class, p0);
    }
    public static StartMatchType[] values(){
       Object obj = PatchProxy.apply(null, null, StartMatchType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StartMatchType.$VALUES.clone();
    }
}
