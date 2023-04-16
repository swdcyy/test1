package com.yxcorp.gifshow.widget.SwipeLayout$Direction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SwipeLayout$Direction extends Enum	// class@0018cd
{
    public static final SwipeLayout$Direction[] $VALUES;
    public static final SwipeLayout$Direction BOTH;
    public static final SwipeLayout$Direction LEFT;
    public static final SwipeLayout$Direction RIGHT;

    static {
       SwipeLayout$Direction uDirection = new SwipeLayout$Direction("LEFT", 0);
       SwipeLayout$Direction.LEFT = uDirection;
       SwipeLayout$Direction uDirection1 = new SwipeLayout$Direction("RIGHT", 1);
       SwipeLayout$Direction.RIGHT = uDirection1;
       SwipeLayout$Direction uDirection2 = new SwipeLayout$Direction("BOTH", 2);
       SwipeLayout$Direction.BOTH = uDirection2;
       SwipeLayout$Direction[] uDirectionAr = new SwipeLayout$Direction[]{uDirection,uDirection1,uDirection2};
       SwipeLayout$Direction.$VALUES = uDirectionAr;
    }
    public void SwipeLayout$Direction(String p0,int p1){
       super(p0, p1);
    }
    public static SwipeLayout$Direction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SwipeLayout$Direction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SwipeLayout$Direction.class, p0);
    }
    public static SwipeLayout$Direction[] values(){
       Object obj = PatchProxy.apply(null, null, SwipeLayout$Direction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SwipeLayout$Direction.$VALUES.clone();
    }
}
