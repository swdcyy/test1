package com.kwai.feature.api.live.base.service.floatelement.BottomAreaStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BottomAreaStatus extends Enum	// class@000f97
{
    public static final BottomAreaStatus[] $VALUES;
    public static final BottomAreaStatus HIDE;
    public static final BottomAreaStatus SHOWN;

    static {
       BottomAreaStatus uBottomAreaS = new BottomAreaStatus("SHOWN", 0);
       BottomAreaStatus.SHOWN = uBottomAreaS;
       BottomAreaStatus uBottomAreaS1 = new BottomAreaStatus("HIDE", 1);
       BottomAreaStatus.HIDE = uBottomAreaS1;
       BottomAreaStatus[] uBottomAreaS2 = new BottomAreaStatus[]{uBottomAreaS,uBottomAreaS1};
       BottomAreaStatus.$VALUES = uBottomAreaS2;
    }
    public void BottomAreaStatus(String p0,int p1){
       super(p0, p1);
    }
    public static BottomAreaStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BottomAreaStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BottomAreaStatus.class, p0);
    }
    public static BottomAreaStatus[] values(){
       Object obj = PatchProxy.apply(null, null, BottomAreaStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BottomAreaStatus.$VALUES.clone();
    }
}
