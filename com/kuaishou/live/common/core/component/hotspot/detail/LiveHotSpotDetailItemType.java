package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailItemType;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailItemType$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveHotSpotDetailItemType extends Enum	// class@001365
{
    public final int type;
    public static final LiveHotSpotDetailItemType[] $VALUES;
    public static final LiveHotSpotDetailItemType BASE_INFO;
    public static final LiveHotSpotDetailItemType CORE_MEDIA_AREA;
    public static final LiveHotSpotDetailItemType$a Companion;
    public static final LiveHotSpotDetailItemType HOT_SPOT_EXPLAIN;
    public static final LiveHotSpotDetailItemType NORMAL_MEDIA_AREA;
    public static final LiveHotSpotDetailItemType RELATED_AUTHOR;
    public static final LiveHotSpotDetailItemType UNKNOWN;

    static {
       LiveHotSpotDetailItemType liveHotSpotD1;
       LiveHotSpotDetailItemType[] liveHotSpotD = new LiveHotSpotDetailItemType[]{liveHotSpotD1,liveHotSpotD1,liveHotSpotD1,liveHotSpotD1,liveHotSpotD1,liveHotSpotD1};
       liveHotSpotD1 = new LiveHotSpotDetailItemType("UNKNOWN", 0, 0);
       LiveHotSpotDetailItemType.UNKNOWN = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailItemType("BASE_INFO", 1, 1);
       LiveHotSpotDetailItemType.BASE_INFO = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailItemType("RELATED_AUTHOR", 2, 2);
       LiveHotSpotDetailItemType.RELATED_AUTHOR = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailItemType("CORE_MEDIA_AREA", 3, 3);
       LiveHotSpotDetailItemType.CORE_MEDIA_AREA = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailItemType("HOT_SPOT_EXPLAIN", 4, 4);
       LiveHotSpotDetailItemType.HOT_SPOT_EXPLAIN = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailItemType("NORMAL_MEDIA_AREA", 5, 5);
       LiveHotSpotDetailItemType.NORMAL_MEDIA_AREA = liveHotSpotD1;
       LiveHotSpotDetailItemType.$VALUES = liveHotSpotD;
       LiveHotSpotDetailItemType.Companion = new LiveHotSpotDetailItemType$a(null);
    }
    public void LiveHotSpotDetailItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static LiveHotSpotDetailItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveHotSpotDetailItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveHotSpotDetailItemType.class, p0);
    }
    public static LiveHotSpotDetailItemType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveHotSpotDetailItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveHotSpotDetailItemType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
