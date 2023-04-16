package com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$ScaleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TKPlayerController$ScaleType extends Enum	// class@001671
{
    public static final TKPlayerController$ScaleType[] $VALUES;
    public static final TKPlayerController$ScaleType CENTER_CROP;
    public static final TKPlayerController$ScaleType CENTER_INSIDE;
    public static final TKPlayerController$ScaleType FIX_XY;

    static {
       TKPlayerController$ScaleType scaleType = new TKPlayerController$ScaleType("FIX_XY", 0);
       TKPlayerController$ScaleType.FIX_XY = scaleType;
       TKPlayerController$ScaleType scaleType1 = new TKPlayerController$ScaleType("CENTER_INSIDE", 1);
       TKPlayerController$ScaleType.CENTER_INSIDE = scaleType1;
       TKPlayerController$ScaleType scaleType2 = new TKPlayerController$ScaleType("CENTER_CROP", 2);
       TKPlayerController$ScaleType.CENTER_CROP = scaleType2;
       TKPlayerController$ScaleType[] scaleTypeArr = new TKPlayerController$ScaleType[]{scaleType,scaleType1,scaleType2};
       TKPlayerController$ScaleType.$VALUES = scaleTypeArr;
    }
    public void TKPlayerController$ScaleType(String p0,int p1){
       super(p0, p1);
    }
    public static TKPlayerController$ScaleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKPlayerController$ScaleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TKPlayerController$ScaleType.class, p0);
    }
    public static TKPlayerController$ScaleType[] values(){
       Object obj = PatchProxy.apply(null, null, TKPlayerController$ScaleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKPlayerController$ScaleType.$VALUES.clone();
    }
}
