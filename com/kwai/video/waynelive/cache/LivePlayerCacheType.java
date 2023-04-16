package com.kwai.video.waynelive.cache.LivePlayerCacheType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayerCacheType extends Enum	// class@000dde
{
    public static final LivePlayerCacheType[] $VALUES;
    public static final LivePlayerCacheType AAC;
    public static final LivePlayerCacheType INTER_ACTIVE_TSPT;
    public static final LivePlayerCacheType SEI_INFO;
    public static final LivePlayerCacheType SRV_TSPT;

    static {
       LivePlayerCacheType livePlayerCa = new LivePlayerCacheType("SRV_TSPT", 0);
       LivePlayerCacheType.SRV_TSPT = livePlayerCa;
       LivePlayerCacheType livePlayerCa1 = new LivePlayerCacheType("INTER_ACTIVE_TSPT", 1);
       LivePlayerCacheType.INTER_ACTIVE_TSPT = livePlayerCa1;
       LivePlayerCacheType livePlayerCa2 = new LivePlayerCacheType("AAC", 2);
       LivePlayerCacheType.AAC = livePlayerCa2;
       LivePlayerCacheType livePlayerCa3 = new LivePlayerCacheType("SEI_INFO", 3);
       LivePlayerCacheType.SEI_INFO = livePlayerCa3;
       LivePlayerCacheType[] livePlayerCa4 = new LivePlayerCacheType[]{livePlayerCa,livePlayerCa1,livePlayerCa2,livePlayerCa3};
       LivePlayerCacheType.$VALUES = livePlayerCa4;
    }
    public void LivePlayerCacheType(String p0,int p1){
       super(p0, p1);
    }
    public static LivePlayerCacheType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerCacheType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayerCacheType.class, p0);
    }
    public static LivePlayerCacheType[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayerCacheType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayerCacheType.$VALUES.clone();
    }
}
