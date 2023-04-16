package com.kuaishou.android.live.model.LiveFloatingWindowType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveFloatingWindowType extends Enum	// class@0007f4
{
    public final String mType;
    public static final LiveFloatingWindowType[] $VALUES;
    public static final LiveFloatingWindowType AD;
    public static final LiveFloatingWindowType DEFAULT;
    public static final LiveFloatingWindowType MERCHANT;
    public static final LiveFloatingWindowType OUT_LIVE;
    public static final LiveFloatingWindowType RECRUIT;

    static {
       LiveFloatingWindowType liveFloating = new LiveFloatingWindowType("DEFAULT", 0, "Default");
       LiveFloatingWindowType.DEFAULT = liveFloating;
       LiveFloatingWindowType liveFloating1 = new LiveFloatingWindowType("OUT_LIVE", 1, "OutLive");
       LiveFloatingWindowType.OUT_LIVE = liveFloating1;
       LiveFloatingWindowType liveFloating2 = new LiveFloatingWindowType("MERCHANT", 2, "Merchant");
       LiveFloatingWindowType.MERCHANT = liveFloating2;
       LiveFloatingWindowType liveFloating3 = new LiveFloatingWindowType("AD", 3, "Ad");
       LiveFloatingWindowType.AD = liveFloating3;
       LiveFloatingWindowType liveFloating4 = new LiveFloatingWindowType("RECRUIT", 4, "Recruit");
       LiveFloatingWindowType.RECRUIT = liveFloating4;
       LiveFloatingWindowType[] liveFloating5 = new LiveFloatingWindowType[]{liveFloating,liveFloating1,liveFloating2,liveFloating3,liveFloating4};
       LiveFloatingWindowType.$VALUES = liveFloating5;
    }
    public void LiveFloatingWindowType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static LiveFloatingWindowType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveFloatingWindowType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveFloatingWindowType.class, p0);
    }
    public static LiveFloatingWindowType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveFloatingWindowType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveFloatingWindowType.$VALUES.clone();
    }
}
