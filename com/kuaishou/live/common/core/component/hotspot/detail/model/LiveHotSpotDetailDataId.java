package com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataId;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveHotSpotDetailDataId extends Enum	// class@0013be
{
    public final String id;
    public static final LiveHotSpotDetailDataId[] $VALUES;
    public static final LiveHotSpotDetailDataId BASE_INFO;
    public static final LiveHotSpotDetailDataId CORE_MEDIA_AREA;
    public static final LiveHotSpotDetailDataId HOT_SPOT_EXPLAIN;
    public static final LiveHotSpotDetailDataId NORMAL_MEDIA_AREA;
    public static final LiveHotSpotDetailDataId RELATED_AUTHOR;

    static {
       LiveHotSpotDetailDataId liveHotSpotD1;
       LiveHotSpotDetailDataId[] liveHotSpotD = new LiveHotSpotDetailDataId[]{liveHotSpotD1,liveHotSpotD1,liveHotSpotD1,liveHotSpotD1,liveHotSpotD1};
       liveHotSpotD1 = new LiveHotSpotDetailDataId("BASE_INFO", 0, "hotspotBaseInfo");
       LiveHotSpotDetailDataId.BASE_INFO = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailDataId("RELATED_AUTHOR", 1, "relatedAuthors");
       LiveHotSpotDetailDataId.RELATED_AUTHOR = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailDataId("CORE_MEDIA_AREA", 2, "coreMediaArea");
       LiveHotSpotDetailDataId.CORE_MEDIA_AREA = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailDataId("HOT_SPOT_EXPLAIN", 3, "hotspotExplain");
       LiveHotSpotDetailDataId.HOT_SPOT_EXPLAIN = liveHotSpotD1;
       liveHotSpotD1 = new LiveHotSpotDetailDataId("NORMAL_MEDIA_AREA", 4, "normalMediaArea");
       LiveHotSpotDetailDataId.NORMAL_MEDIA_AREA = liveHotSpotD1;
       LiveHotSpotDetailDataId.$VALUES = liveHotSpotD;
    }
    public void LiveHotSpotDetailDataId(String p0,int p1,String p2){
       super(p0, p1);
       this.id = p2;
    }
    public static LiveHotSpotDetailDataId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveHotSpotDetailDataId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveHotSpotDetailDataId.class, p0);
    }
    public static LiveHotSpotDetailDataId[] values(){
       Object obj = PatchProxy.apply(null, null, LiveHotSpotDetailDataId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveHotSpotDetailDataId.$VALUES.clone();
    }
    public final String getId(){
       return this.id;
    }
}
