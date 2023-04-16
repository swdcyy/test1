package com.kuaishou.live.lite.slide.LiveLiteSlideStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteSlideStatus extends Enum	// class@000b56
{
    public static final LiveLiteSlideStatus[] $VALUES;
    public static final LiveLiteSlideStatus DID_APPEAR;
    public static final LiveLiteSlideStatus DID_DISAPPEAR;
    public static final LiveLiteSlideStatus NONE;
    public static final LiveLiteSlideStatus WILL_APPEAR;
    public static final LiveLiteSlideStatus WILL_DISAPPEAR;

    static {
       LiveLiteSlideStatus liveLiteSlid1;
       LiveLiteSlideStatus[] liveLiteSlid = new LiveLiteSlideStatus[]{liveLiteSlid1,liveLiteSlid1,liveLiteSlid1,liveLiteSlid1,liveLiteSlid1};
       liveLiteSlid1 = new LiveLiteSlideStatus("NONE", 0);
       LiveLiteSlideStatus.NONE = liveLiteSlid1;
       liveLiteSlid1 = new LiveLiteSlideStatus("WILL_APPEAR", 1);
       LiveLiteSlideStatus.WILL_APPEAR = liveLiteSlid1;
       liveLiteSlid1 = new LiveLiteSlideStatus("DID_APPEAR", 2);
       LiveLiteSlideStatus.DID_APPEAR = liveLiteSlid1;
       liveLiteSlid1 = new LiveLiteSlideStatus("WILL_DISAPPEAR", 3);
       LiveLiteSlideStatus.WILL_DISAPPEAR = liveLiteSlid1;
       liveLiteSlid1 = new LiveLiteSlideStatus("DID_DISAPPEAR", 4);
       LiveLiteSlideStatus.DID_DISAPPEAR = liveLiteSlid1;
       LiveLiteSlideStatus.$VALUES = liveLiteSlid;
    }
    public void LiveLiteSlideStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteSlideStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteSlideStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteSlideStatus.class, p0);
    }
    public static LiveLiteSlideStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteSlideStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteSlideStatus.$VALUES.clone();
    }
}
