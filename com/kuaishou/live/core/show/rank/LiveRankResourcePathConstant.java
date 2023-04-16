package com.kuaishou.live.core.show.rank.LiveRankResourcePathConstant;
import l12.d;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRankResourcePathConstant extends Enum implements d	// class@000e49
{
    public final String resourceName;
    public final String resourcePath;
    public static final LiveRankResourcePathConstant[] $VALUES;
    public static final LiveRankResourcePathConstant LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT;
    public static final LiveRankResourcePathConstant LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2;
    public static final LiveRankResourcePathConstant LIVE_GZONE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2;
    public static final LiveRankResourcePathConstant LIVE_HOURLY_RANK_HEADLINE_LEFT_TOP_ICON;
    public static final LiveRankResourcePathConstant LIVE_NOBLE_TOP_LIST_BACKGROUND_PLACE_HOLDER;

    static {
       LiveRankResourcePathConstant liveRankReso1;
       LiveRankResourcePathConstant[] liveRankReso = new LiveRankResourcePathConstant[]{liveRankReso1,liveRankReso1,liveRankReso1,liveRankReso1,liveRankReso1};
       liveRankReso1 = new LiveRankResourcePathConstant("LIVE_NOBLE_TOP_LIST_BACKGROUND_PLACE_HOLDER", 0, "LIVE_NOBLE_TOP_LIST_BACKGROUND_PLACE_HOLDER", "udata/pkg/kwai-client-image/live_revenue_rank/live_noble_top_list_background_place_holder.png");
       LiveRankResourcePathConstant.LIVE_NOBLE_TOP_LIST_BACKGROUND_PLACE_HOLDER = liveRankReso1;
       liveRankReso1 = new LiveRankResourcePathConstant("LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT", 1, "LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT", "udata/pkg/kwai-client-image/live_revenue_rank/live_guest_activity_top_list_pendant.webp");
       LiveRankResourcePathConstant.LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT = liveRankReso1;
       liveRankReso1 = new LiveRankResourcePathConstant("LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2", 2, "LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2", "udata/pkg/kwai-client-image/live_revenue_rank/live_guest_rank_widget.png");
       LiveRankResourcePathConstant.LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2 = liveRankReso1;
       liveRankReso1 = new LiveRankResourcePathConstant("LIVE_GZONE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2", 3, "LIVE_GZONE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2", "udata/pkg/kwai-client-image/live_revenue_rank/live_guest_rank_widget_gray.png");
       LiveRankResourcePathConstant.LIVE_GZONE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2 = liveRankReso1;
       liveRankReso1 = new LiveRankResourcePathConstant("LIVE_HOURLY_RANK_HEADLINE_LEFT_TOP_ICON", 4, "LIVE_HOURLY_RANK_HEADLINE_LEFT_TOP_ICON", "udata/pkg/kwai-client-image/live_revenue_rank/live_hourly_rank_headline_left_top_icon.webp");
       LiveRankResourcePathConstant.LIVE_HOURLY_RANK_HEADLINE_LEFT_TOP_ICON = liveRankReso1;
       LiveRankResourcePathConstant.$VALUES = liveRankReso;
    }
    public void LiveRankResourcePathConstant(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.resourceName = p2;
       this.resourcePath = p3;
    }
    public static LiveRankResourcePathConstant valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRankResourcePathConstant.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRankResourcePathConstant.class, p0);
    }
    public static LiveRankResourcePathConstant[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRankResourcePathConstant.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRankResourcePathConstant.$VALUES.clone();
    }
    public String getResourceName(){
       return this.resourceName;
    }
    public String getResourcePath(){
       return this.resourcePath;
    }
}
