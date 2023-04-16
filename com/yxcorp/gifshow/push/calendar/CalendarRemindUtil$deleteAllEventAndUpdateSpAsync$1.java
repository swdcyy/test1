package com.yxcorp.gifshow.push.calendar.CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import android.content.Context;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import m6c.a;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.lang.Iterable;
import trd.y;
import java.lang.Long;
import java.lang.IllegalStateException;

public final class CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1 extends SuspendLambda implements p	// class@00163f
{
    public final Context $context;
    public int label;
    public k0 p$;

    public void CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1(Context p0,c p1){
       this.$context = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1(this.$context, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       obj = new ArrayList();
       p0 = a.a.c().entrySet().iterator();
       while (p0.hasNext()) {
          y.q0(obj, p0.next().getValue().values());
       }
       p0 = obj.iterator();
       while (p0.hasNext()) {
          Long longx = p0.next();
          a.o(longx, "it");
          a.a.b(this.$context, longx.longValue());
       }
       a.a.k(new HashMap());
       return l1.a;
    }
}
