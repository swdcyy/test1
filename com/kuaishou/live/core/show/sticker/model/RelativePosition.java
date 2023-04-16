package com.kuaishou.live.core.show.sticker.model.RelativePosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RelativePosition extends Enum	// class@0010b9
{
    public static final RelativePosition[] $VALUES;
    public static final RelativePosition LEFT_BOTTOM;
    public static final RelativePosition LEFT_TOP;
    public static final RelativePosition RIGHT_BOTTOM;
    public static final RelativePosition RIGHT_TOP;

    static {
       RelativePosition relativePosi1;
       RelativePosition[] relativePosi = new RelativePosition[]{relativePosi1,relativePosi1,relativePosi1,relativePosi1};
       relativePosi1 = new RelativePosition("LEFT_TOP", 0);
       RelativePosition.LEFT_TOP = relativePosi1;
       relativePosi1 = new RelativePosition("RIGHT_TOP", 1);
       RelativePosition.RIGHT_TOP = relativePosi1;
       relativePosi1 = new RelativePosition("LEFT_BOTTOM", 2);
       RelativePosition.LEFT_BOTTOM = relativePosi1;
       relativePosi1 = new RelativePosition("RIGHT_BOTTOM", 3);
       RelativePosition.RIGHT_BOTTOM = relativePosi1;
       RelativePosition.$VALUES = relativePosi;
    }
    public void RelativePosition(String p0,int p1){
       super(p0, p1);
    }
    public static RelativePosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RelativePosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RelativePosition.class, p0);
    }
    public static RelativePosition[] values(){
       Object obj = PatchProxy.apply(null, null, RelativePosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RelativePosition.$VALUES.clone();
    }
}
