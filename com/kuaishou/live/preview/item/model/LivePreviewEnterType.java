package com.kuaishou.live.preview.item.model.LivePreviewEnterType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePreviewEnterType extends Enum	// class@000df1
{
    public String mReportValue;
    public static final LivePreviewEnterType[] $VALUES;
    public static final LivePreviewEnterType BACK_FOREGROUND;
    public static final LivePreviewEnterType DEFAULT;
    public static final LivePreviewEnterType DOWN_SLIDE;
    public static final LivePreviewEnterType OTHER_PAGE_ADR;
    public static final LivePreviewEnterType REFRESH;
    public static final LivePreviewEnterType SWITCH_TAB;
    public static final LivePreviewEnterType UP_SLIDE;

    static {
       LivePreviewEnterType livePreviewE = new LivePreviewEnterType("DEFAULT", 0, "DEFAULT");
       LivePreviewEnterType.DEFAULT = livePreviewE;
       LivePreviewEnterType livePreviewE1 = new LivePreviewEnterType("SWITCH_TAB", 1, "SWITCH_TAB");
       LivePreviewEnterType.SWITCH_TAB = livePreviewE1;
       LivePreviewEnterType livePreviewE2 = new LivePreviewEnterType("OTHER_PAGE_ADR", 2, "OTHER_PAGE_ADR");
       LivePreviewEnterType.OTHER_PAGE_ADR = livePreviewE2;
       LivePreviewEnterType livePreviewE3 = new LivePreviewEnterType("BACK_FOREGROUND", 3, "BACK_FOREGROUND");
       LivePreviewEnterType.BACK_FOREGROUND = livePreviewE3;
       LivePreviewEnterType livePreviewE4 = new LivePreviewEnterType("UP_SLIDE", 4, "UP_SLIDE");
       LivePreviewEnterType.UP_SLIDE = livePreviewE4;
       LivePreviewEnterType livePreviewE5 = new LivePreviewEnterType("DOWN_SLIDE", 5, "DOWN_SLIDE");
       LivePreviewEnterType.DOWN_SLIDE = livePreviewE5;
       LivePreviewEnterType livePreviewE6 = new LivePreviewEnterType("REFRESH", 6, "REFRESH");
       LivePreviewEnterType.REFRESH = livePreviewE6;
       LivePreviewEnterType[] livePreviewE7 = new LivePreviewEnterType[]{livePreviewE,livePreviewE1,livePreviewE2,livePreviewE3,livePreviewE4,livePreviewE5,livePreviewE6};
       LivePreviewEnterType.$VALUES = livePreviewE7;
    }
    public void LivePreviewEnterType(String p0,int p1,String p2){
       super(p0, p1);
       this.mReportValue = p2;
    }
    public static LivePreviewEnterType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePreviewEnterType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePreviewEnterType.class, p0);
    }
    public static LivePreviewEnterType[] values(){
       Object obj = PatchProxy.apply(null, null, LivePreviewEnterType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePreviewEnterType.$VALUES.clone();
    }
}
