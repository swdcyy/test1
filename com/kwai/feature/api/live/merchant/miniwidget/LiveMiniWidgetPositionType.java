package com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetPositionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMiniWidgetPositionType extends Enum	// class@000fdd
{
    public static final LiveMiniWidgetPositionType[] $VALUES;
    public static final LiveMiniWidgetPositionType LEFT_TOP;
    public static final LiveMiniWidgetPositionType RIGHT_BOTTOM_LARGE_STYLE;
    public static final LiveMiniWidgetPositionType RIGHT_BOTTOM_LIVE_PLUS;
    public static final LiveMiniWidgetPositionType RIGHT_BOTTOM_NORMAL;
    public static final LiveMiniWidgetPositionType UNKNOWN;

    static {
       LiveMiniWidgetPositionType liveMiniWidg1;
       LiveMiniWidgetPositionType[] liveMiniWidg = new LiveMiniWidgetPositionType[]{liveMiniWidg1,liveMiniWidg1,liveMiniWidg1,liveMiniWidg1,liveMiniWidg1};
       liveMiniWidg1 = new LiveMiniWidgetPositionType("UNKNOWN", 0);
       LiveMiniWidgetPositionType.UNKNOWN = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetPositionType("LEFT_TOP", 1);
       LiveMiniWidgetPositionType.LEFT_TOP = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetPositionType("RIGHT_BOTTOM_NORMAL", 2);
       LiveMiniWidgetPositionType.RIGHT_BOTTOM_NORMAL = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetPositionType("RIGHT_BOTTOM_LARGE_STYLE", 3);
       LiveMiniWidgetPositionType.RIGHT_BOTTOM_LARGE_STYLE = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetPositionType("RIGHT_BOTTOM_LIVE_PLUS", 4);
       LiveMiniWidgetPositionType.RIGHT_BOTTOM_LIVE_PLUS = liveMiniWidg1;
       LiveMiniWidgetPositionType.$VALUES = liveMiniWidg;
    }
    public void LiveMiniWidgetPositionType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMiniWidgetPositionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMiniWidgetPositionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMiniWidgetPositionType.class, p0);
    }
    public static LiveMiniWidgetPositionType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMiniWidgetPositionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMiniWidgetPositionType.$VALUES.clone();
    }
}
