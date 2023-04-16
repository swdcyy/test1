package com.kwai.sdk.eve.internal.common.utils.TimeRangeSetSummary$a;
import java.lang.Object;
import nsd.u;
import java.util.List;
import com.kwai.sdk.eve.internal.common.utils.TimeRangeSetSummary;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import java.util.Iterator;
import java.lang.Iterable;
import msd.l;
import java.lang.Number;

public final class TimeRangeSetSummary$a	// class@0014b1
{

    public void TimeRangeSetSummary$a(){
       super();
    }
    public void TimeRangeSetSummary$a(u p0){
       super();
    }
    public final TimeRangeSetSummary a(List p0){
       TimeRangeSetSummary timeRangeSet;
       l obj = PatchProxy.applyOneRefs(p0, this, TimeRangeSetSummary$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "list");
       if (p0.isEmpty()) {
          timeRangeSet = new TimeRangeSetSummary(0, 0, 0, 0);
          return p0;
       }else {
          long l = CollectionsKt___CollectionsKt.m2(p0).e();
          long l1 = CollectionsKt___CollectionsKt.Y2(p0).d();
          long l2 = l1 - l;
          obj = TimeRangeSetSummary.e;
          long l3 = 0;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             l3 = l3 + obj.invoke(iterator.next()).longValue();
          }
          timeRangeSet = new TimeRangeSetSummary(l, l1, l2, l3);
          return iterator;
       }
    }
}
