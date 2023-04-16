package com.kuaishou.live.lite.slide.LiveLiteSlideType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteSlideType extends Enum	// class@000b57
{
    public static final LiveLiteSlideType[] $VALUES;
    public static final LiveLiteSlideType DOWN_SLIDE;
    public static final LiveLiteSlideType NONE;
    public static final LiveLiteSlideType UP_SLIDE;

    static {
       LiveLiteSlideType liveLiteSlid = new LiveLiteSlideType("NONE", 0);
       LiveLiteSlideType.NONE = liveLiteSlid;
       LiveLiteSlideType liveLiteSlid1 = new LiveLiteSlideType("UP_SLIDE", 1);
       LiveLiteSlideType.UP_SLIDE = liveLiteSlid1;
       LiveLiteSlideType liveLiteSlid2 = new LiveLiteSlideType("DOWN_SLIDE", 2);
       LiveLiteSlideType.DOWN_SLIDE = liveLiteSlid2;
       LiveLiteSlideType[] liveLiteSlid3 = new LiveLiteSlideType[]{liveLiteSlid,liveLiteSlid1,liveLiteSlid2};
       LiveLiteSlideType.$VALUES = liveLiteSlid3;
    }
    public void LiveLiteSlideType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteSlideType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteSlideType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteSlideType.class, p0);
    }
    public static LiveLiteSlideType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteSlideType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteSlideType.$VALUES.clone();
    }
}
