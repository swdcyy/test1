package bxc.b;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor$HeadingDirection;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$AbsorbStatus;
import bxc.a;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Math;

public final class b extends TimeLineGestureProcessor	// class@0004b2
{
    public final List q;

    public void b(){
       super();
       this.q = CollectionsKt___CollectionsKt.J5(CollectionsKt__CollectionsKt.E());
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "timelineAssetInfoList");
       return;
    }
    public int h(int p0,ITimeLineGestureProcessor$HeadingDirection p1){
       ArrayList uArrayList;
       Iterator iterator;
       Object obj1;
       Object obj2;
       int i1;
       Object obj3;
       int i2;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p1, "direction");
       if (this.h != TimeLineGestureProcessor$AbsorbStatus.IDLE) {
          return -1;
       }else {
          int i = a.a[p1.ordinal()];
          Integer integer = null;
          if (i != 1) {
             if (i == 2) {
                uArrayList = new ArrayList();
                iterator = this.q.iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   obj2 = (obj1.intValue() >= p0)? 1: null;
                   if (obj2) {
                      uArrayList.add(obj1);
                   }
                }
                iterator = uArrayList.iterator();
                if (iterator.hasNext()) {
                   integer = iterator.next();
                   if (iterator.hasNext()) {
                      i1 = Math.abs((integer.intValue() - p0));
                      do {
                         obj3 = iterator.next();
                         i2 = obj3.intValue() - p0;
                         i2 = Math.abs(i2);
                         if (i1 > i2) {
                            integer = obj3;
                            i1 = i2;
                         }
                      } while (!iterator.hasNext());
                   }
                }
                i = (integer != null)? integer.intValue(): -1;
                if ((i - p0) <= this.f()) {
                   return i;
                }
             }
          }else {
             uArrayList = new ArrayList();
             iterator = this.q.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                obj2 = (obj1.intValue() <= p0)? 1: null;
                if (obj2) {
                   uArrayList.add(obj1);
                }
             }
             iterator = uArrayList.iterator();
             if (iterator.hasNext()) {
                integer = iterator.next();
                if (iterator.hasNext()) {
                   i1 = Math.abs((integer.intValue() - p0));
                   do {
                      obj3 = iterator.next();
                      i2 = obj3.intValue() - p0;
                      i2 = Math.abs(i2);
                      if (i1 > i2) {
                         integer = obj3;
                         i1 = i2;
                      }
                   } while (!iterator.hasNext());
                }
             }
             i = (integer != null)? integer.intValue(): -1;
             if ((p0 - i) <= this.f()) {
                return i;
             }
          }
       label_0127 :
          return -1;
       }
    }
}
