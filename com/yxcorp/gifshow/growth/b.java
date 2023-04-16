package com.yxcorp.gifshow.growth.b;
import erd.g;
import java.lang.Object;
import eda.n;
import com.yxcorp.gifshow.growth.GrowthInitModule;
import android.app.Application;
import o56.a;
import m6c.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.android.api.PushApiScope;
import com.yxcorp.gifshow.push.calendar.CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1;
import android.content.Context;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;

public final class b implements g	// class@0012f2
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       p0 = a.b();
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "11")) {
       }else {
          a.p(p0, "context");
          a.f(PushApiScope.INSTANCE, null, null, new CalendarRemindUtil$deleteAllEventAndUpdateSpAsync$1(p0, null), 3, null);
       }
       return;
    }
}
