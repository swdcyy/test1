package com.kuaishou.live.livestage.ScaleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ScaleType extends Enum	// class@000bda
{
    public static final ScaleType[] $VALUES;
    public static final ScaleType CENTER_INSIDE;
    public static final ScaleType FIT_XY;

    static {
       ScaleType scaleType;
       ScaleType[] scaleTypeArr = new ScaleType[]{scaleType,scaleType};
       scaleType = new ScaleType("CENTER_INSIDE", 0);
       ScaleType.CENTER_INSIDE = scaleType;
       scaleType = new ScaleType("FIT_XY", 1);
       ScaleType.FIT_XY = scaleType;
       ScaleType.$VALUES = scaleTypeArr;
    }
    public void ScaleType(String p0,int p1){
       super(p0, p1);
    }
    public static ScaleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ScaleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ScaleType.class, p0);
    }
    public static ScaleType[] values(){
       Object obj = PatchProxy.apply(null, null, ScaleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScaleType.$VALUES.clone();
    }
}
