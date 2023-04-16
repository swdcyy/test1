package com.kuaishou.live.livestage.RenderType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RenderType extends Enum	// class@000bd9
{
    public static final RenderType[] $VALUES;
    public static final RenderType CAMERA_VIEW;
    public static final RenderType DIRECTOR;
    public static final RenderType PLAYER_VIEW;
    public static final RenderType RTC_VIEW;

    static {
       RenderType renderType;
       RenderType[] renderTypeAr = new RenderType[]{renderType,renderType,renderType,renderType};
       renderType = new RenderType("CAMERA_VIEW", 0);
       RenderType.CAMERA_VIEW = renderType;
       renderType = new RenderType("PLAYER_VIEW", 1);
       RenderType.PLAYER_VIEW = renderType;
       renderType = new RenderType("RTC_VIEW", 2);
       RenderType.RTC_VIEW = renderType;
       renderType = new RenderType("DIRECTOR", 3);
       RenderType.DIRECTOR = renderType;
       RenderType.$VALUES = renderTypeAr;
    }
    public void RenderType(String p0,int p1){
       super(p0, p1);
    }
    public static RenderType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RenderType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RenderType.class, p0);
    }
    public static RenderType[] values(){
       Object obj = PatchProxy.apply(null, null, RenderType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RenderType.$VALUES.clone();
    }
}
