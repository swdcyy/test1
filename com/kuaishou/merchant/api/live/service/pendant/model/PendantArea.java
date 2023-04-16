package com.kuaishou.merchant.api.live.service.pendant.model.PendantArea;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PendantArea extends Enum	// class@001577
{
    public static final PendantArea[] $VALUES;
    public static final PendantArea AREA_RIGHT;
    public static final PendantArea AREA_RIGHT_BOTTOM;

    static {
       PendantArea pendantArea;
       PendantArea[] pendantAreaA = new PendantArea[]{pendantArea,pendantArea};
       pendantArea = new PendantArea("AREA_RIGHT", 0);
       PendantArea.AREA_RIGHT = pendantArea;
       pendantArea = new PendantArea("AREA_RIGHT_BOTTOM", 1);
       PendantArea.AREA_RIGHT_BOTTOM = pendantArea;
       PendantArea.$VALUES = pendantAreaA;
    }
    public void PendantArea(String p0,int p1){
       super(p0, p1);
    }
    public static PendantArea valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PendantArea.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PendantArea.class, p0);
    }
    public static PendantArea[] values(){
       Object obj = PatchProxy.apply(null, null, PendantArea.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PendantArea.$VALUES.clone();
    }
}
