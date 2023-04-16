package com.yxcorp.gifshow.v3.customizer.preview.FlexLayoutTopLimitType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FlexLayoutTopLimitType extends Enum	// class@000d57
{
    public static final FlexLayoutTopLimitType[] $VALUES;
    public static final FlexLayoutTopLimitType FROM_DEFAULT_POSITION;
    public static final FlexLayoutTopLimitType FROM_HOLE_BOTTOM;
    public static final FlexLayoutTopLimitType FROM_HOLE_TOP;
    public static final FlexLayoutTopLimitType FROM_STATUS_BAR_BOTTOM;
    public static final FlexLayoutTopLimitType FROM_STATUS_BAR_TOP;

    static {
       FlexLayoutTopLimitType uFlexLayoutT1;
       FlexLayoutTopLimitType[] uFlexLayoutT = new FlexLayoutTopLimitType[]{uFlexLayoutT1,uFlexLayoutT1,uFlexLayoutT1,uFlexLayoutT1,uFlexLayoutT1};
       uFlexLayoutT1 = new FlexLayoutTopLimitType("FROM_HOLE_TOP", 0);
       FlexLayoutTopLimitType.FROM_HOLE_TOP = uFlexLayoutT1;
       uFlexLayoutT1 = new FlexLayoutTopLimitType("FROM_HOLE_BOTTOM", 1);
       FlexLayoutTopLimitType.FROM_HOLE_BOTTOM = uFlexLayoutT1;
       uFlexLayoutT1 = new FlexLayoutTopLimitType("FROM_STATUS_BAR_TOP", 2);
       FlexLayoutTopLimitType.FROM_STATUS_BAR_TOP = uFlexLayoutT1;
       uFlexLayoutT1 = new FlexLayoutTopLimitType("FROM_STATUS_BAR_BOTTOM", 3);
       FlexLayoutTopLimitType.FROM_STATUS_BAR_BOTTOM = uFlexLayoutT1;
       uFlexLayoutT1 = new FlexLayoutTopLimitType("FROM_DEFAULT_POSITION", 4);
       FlexLayoutTopLimitType.FROM_DEFAULT_POSITION = uFlexLayoutT1;
       FlexLayoutTopLimitType.$VALUES = uFlexLayoutT;
    }
    public void FlexLayoutTopLimitType(String p0,int p1){
       super(p0, p1);
    }
    public static FlexLayoutTopLimitType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FlexLayoutTopLimitType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FlexLayoutTopLimitType.class, p0);
    }
    public static FlexLayoutTopLimitType[] values(){
       Object obj = PatchProxy.apply(null, null, FlexLayoutTopLimitType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FlexLayoutTopLimitType.$VALUES.clone();
    }
}
