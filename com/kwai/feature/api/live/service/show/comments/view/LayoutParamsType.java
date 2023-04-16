package com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LayoutParamsType extends Enum	// class@001017
{
    public static final LayoutParamsType[] $VALUES;
    public static final LayoutParamsType BOTTOM_MARGIN;
    public static final LayoutParamsType FADING_EDGE_TOP;
    public static final LayoutParamsType HEIGHT;
    public static final LayoutParamsType RIGHT_MARGIN;
    public static final LayoutParamsType VISIBILITY;

    static {
       LayoutParamsType layoutParams = new LayoutParamsType("VISIBILITY", 0);
       LayoutParamsType.VISIBILITY = layoutParams;
       LayoutParamsType layoutParams1 = new LayoutParamsType("RIGHT_MARGIN", 1);
       LayoutParamsType.RIGHT_MARGIN = layoutParams1;
       LayoutParamsType layoutParams2 = new LayoutParamsType("BOTTOM_MARGIN", 2);
       LayoutParamsType.BOTTOM_MARGIN = layoutParams2;
       LayoutParamsType layoutParams3 = new LayoutParamsType("FADING_EDGE_TOP", 3);
       LayoutParamsType.FADING_EDGE_TOP = layoutParams3;
       LayoutParamsType layoutParams4 = new LayoutParamsType("HEIGHT", 4);
       LayoutParamsType.HEIGHT = layoutParams4;
       LayoutParamsType[] layoutParams5 = new LayoutParamsType[]{layoutParams,layoutParams1,layoutParams2,layoutParams3,layoutParams4};
       LayoutParamsType.$VALUES = layoutParams5;
    }
    public void LayoutParamsType(String p0,int p1){
       super(p0, p1);
    }
    public static LayoutParamsType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LayoutParamsType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LayoutParamsType.class, p0);
    }
    public static LayoutParamsType[] values(){
       Object obj = PatchProxy.apply(null, null, LayoutParamsType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LayoutParamsType.$VALUES.clone();
    }
}
