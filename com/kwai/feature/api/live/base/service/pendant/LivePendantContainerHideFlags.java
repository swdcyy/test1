package com.kwai.feature.api.live.base.service.pendant.LivePendantContainerHideFlags;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePendantContainerHideFlags extends Enum	// class@000f9b
{
    public static final LivePendantContainerHideFlags[] $VALUES;
    public static final LivePendantContainerHideFlags ANCHOR_BOTTOM_BAR_VISIBILITY;
    public static final LivePendantContainerHideFlags AUDIENCE_BOTTOM_BAR_VISIBILITY;
    public static final LivePendantContainerHideFlags DELAY_FOR_UI_OPT;
    public static final LivePendantContainerHideFlags GZONE_ACTIVITY_BANNER;
    public static final LivePendantContainerHideFlags GZONE_COMMENT_TAB;
    public static final LivePendantContainerHideFlags MERCHANT_LIVE_616_PENDANT;
    public static final LivePendantContainerHideFlags VOICE_PARTY_THEATER;
    public static final LivePendantContainerHideFlags VOICE_PARTY_VIDEO_STYLE_V2;

    static {
       LivePendantContainerHideFlags livePendantC = new LivePendantContainerHideFlags("AUDIENCE_BOTTOM_BAR_VISIBILITY", 0);
       LivePendantContainerHideFlags.AUDIENCE_BOTTOM_BAR_VISIBILITY = livePendantC;
       LivePendantContainerHideFlags livePendantC1 = new LivePendantContainerHideFlags("ANCHOR_BOTTOM_BAR_VISIBILITY", 1);
       LivePendantContainerHideFlags.ANCHOR_BOTTOM_BAR_VISIBILITY = livePendantC1;
       LivePendantContainerHideFlags livePendantC2 = new LivePendantContainerHideFlags("VOICE_PARTY_THEATER", 2);
       LivePendantContainerHideFlags.VOICE_PARTY_THEATER = livePendantC2;
       LivePendantContainerHideFlags livePendantC3 = new LivePendantContainerHideFlags("VOICE_PARTY_VIDEO_STYLE_V2", 3);
       LivePendantContainerHideFlags.VOICE_PARTY_VIDEO_STYLE_V2 = livePendantC3;
       LivePendantContainerHideFlags livePendantC4 = new LivePendantContainerHideFlags("GZONE_ACTIVITY_BANNER", 4);
       LivePendantContainerHideFlags.GZONE_ACTIVITY_BANNER = livePendantC4;
       LivePendantContainerHideFlags livePendantC5 = new LivePendantContainerHideFlags("GZONE_COMMENT_TAB", 5);
       LivePendantContainerHideFlags.GZONE_COMMENT_TAB = livePendantC5;
       LivePendantContainerHideFlags livePendantC6 = new LivePendantContainerHideFlags("MERCHANT_LIVE_616_PENDANT", 6);
       LivePendantContainerHideFlags.MERCHANT_LIVE_616_PENDANT = livePendantC6;
       LivePendantContainerHideFlags livePendantC7 = new LivePendantContainerHideFlags("DELAY_FOR_UI_OPT", 7);
       LivePendantContainerHideFlags.DELAY_FOR_UI_OPT = livePendantC7;
       LivePendantContainerHideFlags[] livePendantC8 = new LivePendantContainerHideFlags[]{livePendantC,livePendantC1,livePendantC2,livePendantC3,livePendantC4,livePendantC5,livePendantC6,livePendantC7};
       LivePendantContainerHideFlags.$VALUES = livePendantC8;
    }
    public void LivePendantContainerHideFlags(String p0,int p1){
       super(p0, p1);
    }
    public static LivePendantContainerHideFlags valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePendantContainerHideFlags.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePendantContainerHideFlags.class, p0);
    }
    public static LivePendantContainerHideFlags[] values(){
       Object obj = PatchProxy.apply(null, null, LivePendantContainerHideFlags.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePendantContainerHideFlags.$VALUES.clone();
    }
}
