package com.yxcorp.gifshow.v3.customizer.preview.FlexLayoutBottomLimitType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FlexLayoutBottomLimitType extends Enum	// class@000d56
{
    public static final FlexLayoutBottomLimitType[] $VALUES;
    public static final FlexLayoutBottomLimitType FROM_BOTTOM_BAR_BOTTOM;
    public static final FlexLayoutBottomLimitType FROM_BOTTOM_BAR_TOP;
    public static final FlexLayoutBottomLimitType FROM_BUTTON_LAYOUT_BOTTOM;
    public static final FlexLayoutBottomLimitType FROM_BUTTON_LAYOUT_TOP;
    public static final FlexLayoutBottomLimitType FROM_DEFAULT_POSITION;
    public static final FlexLayoutBottomLimitType FROM_SAFE_AREA_BOTTOM;
    public static final FlexLayoutBottomLimitType FROM_SAFE_AREA_TOP;

    static {
       FlexLayoutBottomLimitType uFlexLayoutB1;
       FlexLayoutBottomLimitType[] uFlexLayoutB = new FlexLayoutBottomLimitType[]{uFlexLayoutB1,uFlexLayoutB1,uFlexLayoutB1,uFlexLayoutB1,uFlexLayoutB1,uFlexLayoutB1,uFlexLayoutB1};
       uFlexLayoutB1 = new FlexLayoutBottomLimitType("FROM_BOTTOM_BAR_TOP", 0);
       FlexLayoutBottomLimitType.FROM_BOTTOM_BAR_TOP = uFlexLayoutB1;
       uFlexLayoutB1 = new FlexLayoutBottomLimitType("FROM_BOTTOM_BAR_BOTTOM", 1);
       FlexLayoutBottomLimitType.FROM_BOTTOM_BAR_BOTTOM = uFlexLayoutB1;
       uFlexLayoutB1 = new FlexLayoutBottomLimitType("FROM_BUTTON_LAYOUT_TOP", 2);
       FlexLayoutBottomLimitType.FROM_BUTTON_LAYOUT_TOP = uFlexLayoutB1;
       uFlexLayoutB1 = new FlexLayoutBottomLimitType("FROM_BUTTON_LAYOUT_BOTTOM", 3);
       FlexLayoutBottomLimitType.FROM_BUTTON_LAYOUT_BOTTOM = uFlexLayoutB1;
       uFlexLayoutB1 = new FlexLayoutBottomLimitType("FROM_SAFE_AREA_TOP", 4);
       FlexLayoutBottomLimitType.FROM_SAFE_AREA_TOP = uFlexLayoutB1;
       uFlexLayoutB1 = new FlexLayoutBottomLimitType("FROM_SAFE_AREA_BOTTOM", 5);
       FlexLayoutBottomLimitType.FROM_SAFE_AREA_BOTTOM = uFlexLayoutB1;
       uFlexLayoutB1 = new FlexLayoutBottomLimitType("FROM_DEFAULT_POSITION", 6);
       FlexLayoutBottomLimitType.FROM_DEFAULT_POSITION = uFlexLayoutB1;
       FlexLayoutBottomLimitType.$VALUES = uFlexLayoutB;
    }
    public void FlexLayoutBottomLimitType(String p0,int p1){
       super(p0, p1);
    }
    public static FlexLayoutBottomLimitType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FlexLayoutBottomLimitType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FlexLayoutBottomLimitType.class, p0);
    }
    public static FlexLayoutBottomLimitType[] values(){
       Object obj = PatchProxy.apply(null, null, FlexLayoutBottomLimitType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FlexLayoutBottomLimitType.$VALUES.clone();
    }
}
