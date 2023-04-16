package com.kwai.sdk.eve.internal.common.utils.TimeRangeKt$union$closure$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Comparable;
import java.util.List;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import en7.m;

public final class TimeRangeKt$union$closure$1 extends Lambda implements q	// class@0014af
{
    public static final TimeRangeKt$union$closure$1 INSTANCE;

    static {
       TimeRangeKt$union$closure$1.INSTANCE = new TimeRangeKt$union$closure$1();
    }
    public void TimeRangeKt$union$closure$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Boolean.valueOf(this.invoke(p0, p1, p2));
    }
    public final boolean invoke(Comparable p0,Comparable p1,List p2){
       m obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TimeRangeKt$union$closure$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "l");
       a.p(p1, "u");
       a.p(p2, "list");
       boolean b = true;
       if (!p2 instanceof Collection || !p2.isEmpty()) {
          Iterator iterator = p2.iterator();
          do {
             if (iterator.hasNext()) {
                obj = iterator.next();
                boolean b1 = (p0.compareTo(obj.b()) >= 0 && p1.compareTo(obj.a()) <= 0)? true: false;
             }
          } while (b1);
          return b;
       }
       b = false;
       goto label_005d ;
    }
}
