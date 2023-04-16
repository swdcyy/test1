package com.kwai.slide.play.detail.group.Orientation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Orientation extends Enum	// class@0017be
{
    public static final Orientation[] $VALUES;
    public static final Orientation HORIZONTAL;
    public static final Orientation VERTICAL;

    static {
       Orientation orientation;
       Orientation[] orientationA = new Orientation[]{orientation,orientation};
       orientation = new Orientation("HORIZONTAL", 0);
       Orientation.HORIZONTAL = orientation;
       orientation = new Orientation("VERTICAL", 1);
       Orientation.VERTICAL = orientation;
       Orientation.$VALUES = orientationA;
    }
    public void Orientation(String p0,int p1){
       super(p0, p1);
    }
    public static Orientation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Orientation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Orientation.class, p0);
    }
    public static Orientation[] values(){
       Object obj = PatchProxy.apply(null, null, Orientation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Orientation.$VALUES.clone();
    }
}
