package com.yxcorp.gifshow.growth.model.GestureGuidanceConfig$GuidanceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GestureGuidanceConfig$GuidanceType extends Enum	// class@001433
{
    public final String type;
    public static final GestureGuidanceConfig$GuidanceType[] $VALUES;
    public static final GestureGuidanceConfig$GuidanceType DoubleClickLike;
    public static final GestureGuidanceConfig$GuidanceType LeftSlide;
    public static final GestureGuidanceConfig$GuidanceType UpDownSlide;

    static {
       GestureGuidanceConfig$GuidanceType guidanceType1;
       GestureGuidanceConfig$GuidanceType[] guidanceType = new GestureGuidanceConfig$GuidanceType[]{guidanceType1,guidanceType1,guidanceType1};
       guidanceType1 = new GestureGuidanceConfig$GuidanceType("UpDownSlide", 0, "UP_DOWN_SLIDE");
       GestureGuidanceConfig$GuidanceType.UpDownSlide = guidanceType1;
       guidanceType1 = new GestureGuidanceConfig$GuidanceType("LeftSlide", 1, "LEFT_SLIDE_SHOW_AUTHOR_PHOTOS");
       GestureGuidanceConfig$GuidanceType.LeftSlide = guidanceType1;
       guidanceType1 = new GestureGuidanceConfig$GuidanceType("DoubleClickLike", 2, "DOUBLE_CLICK_LIKE");
       GestureGuidanceConfig$GuidanceType.DoubleClickLike = guidanceType1;
       GestureGuidanceConfig$GuidanceType.$VALUES = guidanceType;
    }
    public void GestureGuidanceConfig$GuidanceType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static GestureGuidanceConfig$GuidanceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GestureGuidanceConfig$GuidanceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GestureGuidanceConfig$GuidanceType.class, p0);
    }
    public static GestureGuidanceConfig$GuidanceType[] values(){
       Object obj = PatchProxy.apply(null, null, GestureGuidanceConfig$GuidanceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GestureGuidanceConfig$GuidanceType.$VALUES.clone();
    }
    public final String getType(){
       return this.type;
    }
}
