package com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$b;
import java.util.Comparator;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class TimeLineGestureProcessor$b implements Comparator	// class@00166d
{
    public static final TimeLineGestureProcessor$b b;

    static {
       TimeLineGestureProcessor$b.b = new TimeLineGestureProcessor$b();
    }
    public void TimeLineGestureProcessor$b(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TimeLineGestureProcessor$b.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(p0, "point1");
          a.p(p1, "point2");
          i = p0.getFirst().intValue() - p1.getFirst().intValue();
       }
       return i;
    }
}
