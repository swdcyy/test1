package com.kuaishou.live.core.basic.activity.LivePlayStage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayStage extends Enum	// class@001819
{
    public final String key;
    public static final LivePlayStage[] $VALUES;
    public static final LivePlayStage BASIC_COMPONENT_LOADED;
    public static final LivePlayStage BASIC_VIEW_CREATED;
    public static final LivePlayStage BIZ_COMPONENT_INITED;
    public static final LivePlayStage BIZ_COMPONENT_LOADED;
    public static final LivePlayStage BIZ_VIEW_CREATED;
    public static final LivePlayStage CONTAINER_CREATED;
    public static final LivePlayStage ON_CLICK;
    public static final LivePlayStage PLAYER_CREATED;
    public static final LivePlayStage PLAYER_VIEW_AVAILABLE;
    public static final LivePlayStage SLIDE_CONTAINER_ON_PAGE_SELECTED;

    static {
       LivePlayStage[] livePlayStag = new LivePlayStage[10];
       LivePlayStage livePlayStag1 = new LivePlayStage("ON_CLICK", 0, null);
       LivePlayStage.ON_CLICK = livePlayStag1;
       livePlayStag[0] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("CONTAINER_CREATED", 1, "stage_container_created");
       LivePlayStage.CONTAINER_CREATED = livePlayStag1;
       livePlayStag[1] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("BASIC_VIEW_CREATED", 2, "stage_basic_view_created");
       LivePlayStage.BASIC_VIEW_CREATED = livePlayStag1;
       livePlayStag[2] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("PLAYER_CREATED", 3, "stage_player_created");
       LivePlayStage.PLAYER_CREATED = livePlayStag1;
       livePlayStag[3] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("BASIC_COMPONENT_LOADED", 4, "stage_basic_component_loaded");
       LivePlayStage.BASIC_COMPONENT_LOADED = livePlayStag1;
       livePlayStag[4] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("PLAYER_VIEW_AVAILABLE", 5, "stage_player_view_available");
       LivePlayStage.PLAYER_VIEW_AVAILABLE = livePlayStag1;
       livePlayStag[5] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("SLIDE_CONTAINER_ON_PAGE_SELECTED", 6, null);
       LivePlayStage.SLIDE_CONTAINER_ON_PAGE_SELECTED = livePlayStag1;
       livePlayStag[6] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("BIZ_VIEW_CREATED", 7, "stage_biz_view_created");
       LivePlayStage.BIZ_VIEW_CREATED = livePlayStag1;
       livePlayStag[7] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("BIZ_COMPONENT_INITED", 8, "stage_biz_component_inited");
       LivePlayStage.BIZ_COMPONENT_INITED = livePlayStag1;
       livePlayStag[8] = livePlayStag1;
       livePlayStag1 = new LivePlayStage("BIZ_COMPONENT_LOADED", 9, "stage_biz_component_loaded");
       LivePlayStage.BIZ_COMPONENT_LOADED = livePlayStag1;
       livePlayStag[9] = livePlayStag1;
       LivePlayStage.$VALUES = livePlayStag;
    }
    public void LivePlayStage(String p0,int p1,String p2){
       super(p0, p1);
       this.key = p2;
    }
    public static LivePlayStage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayStage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayStage.class, p0);
    }
    public static LivePlayStage[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayStage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayStage.$VALUES.clone();
    }
    public final String getKey(){
       return this.key;
    }
}
