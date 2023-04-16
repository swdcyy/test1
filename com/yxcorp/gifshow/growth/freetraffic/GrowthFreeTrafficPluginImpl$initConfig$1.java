package com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPluginImpl$initConfig$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPluginImpl;
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
import kotlin.Result;
import vma.a;
import android.content.SharedPreferences;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;
import java.lang.IllegalStateException;

public final class GrowthFreeTrafficPluginImpl$initConfig$1 extends SuspendLambda implements p	// class@00137c
{
    public int label;
    public k0 p$;
    public final GrowthFreeTrafficPluginImpl this$0;

    public void GrowthFreeTrafficPluginImpl$initConfig$1(GrowthFreeTrafficPluginImpl p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       GrowthFreeTrafficPluginImpl$initConfig$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, GrowthFreeTrafficPluginImpl$initConfig$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new GrowthFreeTrafficPluginImpl$initConfig$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GrowthFreeTrafficPluginImpl$initConfig$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthFreeTrafficPluginImpl$initConfig$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       long l = 0;
       long longx = a.a.getLong("lastOneDayTimeStamp", l);
       p0 = longx - l;
       if (!p0) {
          a.t(System.currentTimeMillis());
       }else if(p0 > 0 && !DateUtils.H(longx)){
          a.o(0);
          a.t(System.currentTimeMillis());
       }
       this.this$0.n();
       p0 = Result.constructor-impl(l1.a);
       p0 = Result.exceptionOrNull-impl(p0);
       if (p0 != null) {
          u1.R("biz_ft_gd_init_error", Log.getStackTraceString(p0), 9);
       }
       return l1.a;
    }
}
