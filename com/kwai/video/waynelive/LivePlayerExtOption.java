package com.kwai.video.waynelive.LivePlayerExtOption;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayerExtOption extends Enum	// class@000dd0
{
    public final int mKey;
    public static final LivePlayerExtOption[] $VALUES;
    public static final LivePlayerExtOption LIVE_LAS_SPTS;

    static {
       LivePlayerExtOption livePlayerEx = new LivePlayerExtOption("LIVE_LAS_SPTS", 0, 1);
       LivePlayerExtOption.LIVE_LAS_SPTS = livePlayerEx;
       LivePlayerExtOption[] livePlayerEx1 = new LivePlayerExtOption[]{livePlayerEx};
       LivePlayerExtOption.$VALUES = livePlayerEx1;
    }
    public void LivePlayerExtOption(String p0,int p1,int p2){
       super(p0, p1);
       this.mKey = p2;
    }
    public static LivePlayerExtOption valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerExtOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayerExtOption.class, p0);
    }
    public static LivePlayerExtOption[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayerExtOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayerExtOption.$VALUES.clone();
    }
}
