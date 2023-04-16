package com.yxcorp.plugin.setting.fontscale.FontScaleFollowSystemStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FontScaleFollowSystemStatus extends Enum	// class@0008a2
{
    public static final FontScaleFollowSystemStatus[] $VALUES;
    public static final FontScaleFollowSystemStatus CLOSE_AUTO;
    public static final FontScaleFollowSystemStatus CLOSE_MANUAL;
    public static final FontScaleFollowSystemStatus OPEN;

    static {
       FontScaleFollowSystemStatus uFontScaleFo1;
       FontScaleFollowSystemStatus[] uFontScaleFo = new FontScaleFollowSystemStatus[]{uFontScaleFo1,uFontScaleFo1,uFontScaleFo1};
       uFontScaleFo1 = new FontScaleFollowSystemStatus("OPEN", 0);
       FontScaleFollowSystemStatus.OPEN = uFontScaleFo1;
       uFontScaleFo1 = new FontScaleFollowSystemStatus("CLOSE_MANUAL", 1);
       FontScaleFollowSystemStatus.CLOSE_MANUAL = uFontScaleFo1;
       uFontScaleFo1 = new FontScaleFollowSystemStatus("CLOSE_AUTO", 2);
       FontScaleFollowSystemStatus.CLOSE_AUTO = uFontScaleFo1;
       FontScaleFollowSystemStatus.$VALUES = uFontScaleFo;
    }
    public void FontScaleFollowSystemStatus(String p0,int p1){
       super(p0, p1);
    }
    public static FontScaleFollowSystemStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FontScaleFollowSystemStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FontScaleFollowSystemStatus.class, p0);
    }
    public static FontScaleFollowSystemStatus[] values(){
       Object obj = PatchProxy.apply(null, null, FontScaleFollowSystemStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FontScaleFollowSystemStatus.$VALUES.clone();
    }
}
