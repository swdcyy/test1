package com.kwai.video.wayne.player.WaynePlayerInitor$APP;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WaynePlayerInitor$APP extends Enum	// class@000cb5
{
    public static final WaynePlayerInitor$APP[] $VALUES;
    public static final WaynePlayerInitor$APP DEMO;
    public static final WaynePlayerInitor$APP INTERNATIONAL;
    public static final WaynePlayerInitor$APP KWAISHOU;
    public static final WaynePlayerInitor$APP PLATFORM_TOB;

    static {
       WaynePlayerInitor$APP uAPP = new WaynePlayerInitor$APP("KWAISHOU", 0);
       WaynePlayerInitor$APP.KWAISHOU = uAPP;
       WaynePlayerInitor$APP uAPP1 = new WaynePlayerInitor$APP("PLATFORM_TOB", 1);
       WaynePlayerInitor$APP.PLATFORM_TOB = uAPP1;
       WaynePlayerInitor$APP uAPP2 = new WaynePlayerInitor$APP("INTERNATIONAL", 2);
       WaynePlayerInitor$APP.INTERNATIONAL = uAPP2;
       WaynePlayerInitor$APP uAPP3 = new WaynePlayerInitor$APP("DEMO", 3);
       WaynePlayerInitor$APP.DEMO = uAPP3;
       WaynePlayerInitor$APP[] uAPPArray = new WaynePlayerInitor$APP[]{uAPP,uAPP1,uAPP2,uAPP3};
       WaynePlayerInitor$APP.$VALUES = uAPPArray;
    }
    public void WaynePlayerInitor$APP(String p0,int p1){
       super(p0, p1);
    }
    public static WaynePlayerInitor$APP valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WaynePlayerInitor$APP.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WaynePlayerInitor$APP.class, p0);
    }
    public static WaynePlayerInitor$APP[] values(){
       Object obj = PatchProxy.apply(null, null, WaynePlayerInitor$APP.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WaynePlayerInitor$APP.$VALUES.clone();
    }
}
