package com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveSceneType extends Enum	// class@000fa9
{
    public static final LiveSceneType[] $VALUES;
    public static final LiveSceneType Anchor;
    public static final LiveSceneType Audience;
    public static final LiveSceneType Escrow;
    public static final LiveSceneType FansGroupV2;
    public static final LiveSceneType FloatingWindow;
    public static final LiveSceneType SimplePlay;

    static {
       LiveSceneType liveSceneTyp = new LiveSceneType("Audience", 0);
       LiveSceneType.Audience = liveSceneTyp;
       LiveSceneType liveSceneTyp1 = new LiveSceneType("Anchor", 1);
       LiveSceneType.Anchor = liveSceneTyp1;
       LiveSceneType liveSceneTyp2 = new LiveSceneType("Escrow", 2);
       LiveSceneType.Escrow = liveSceneTyp2;
       LiveSceneType liveSceneTyp3 = new LiveSceneType("SimplePlay", 3);
       LiveSceneType.SimplePlay = liveSceneTyp3;
       LiveSceneType liveSceneTyp4 = new LiveSceneType("FloatingWindow", 4);
       LiveSceneType.FloatingWindow = liveSceneTyp4;
       LiveSceneType liveSceneTyp5 = new LiveSceneType("FansGroupV2", 5);
       LiveSceneType.FansGroupV2 = liveSceneTyp5;
       LiveSceneType[] liveSceneTyp6 = new LiveSceneType[]{liveSceneTyp,liveSceneTyp1,liveSceneTyp2,liveSceneTyp3,liveSceneTyp4,liveSceneTyp5};
       LiveSceneType.$VALUES = liveSceneTyp6;
    }
    public void LiveSceneType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveSceneType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSceneType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveSceneType.class, p0);
    }
    public static LiveSceneType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveSceneType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveSceneType.$VALUES.clone();
    }
}
