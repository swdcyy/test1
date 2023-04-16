package com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import asd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader$load$1;
import csd.b;
import ftd.u;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import kotlin.Result;
import ftd.r0;
import java.lang.Boolean;
import dsd.a;
import java.lang.Throwable;
import qrd.l1;
import ftd.z1;
import ftd.v;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader$b;
import com.kwai.plugin.dva.work.c$c;
import android.util.Log;
import lnc.i3;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import o56.a;
import android.content.Context;
import com.kwai.android.common.ext.ContextExtKt;
import java.lang.Integer;
import k2b.u1;

public final class DvaPluginLoader	// class@00166d
{
    public final String a;
    public final String b;
    public u c;

    public void DvaPluginLoader(String p0,String p1){
       a.p(p0, "plugin");
       a.p(p1, "errorReportKey");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return this.b;
    }
    public final String b(){
       return this.a;
    }
    public final Object c(c p0){
       boolean b;
       Boolean uBoolean;
       Boolean uBoolean1;
       DvaPluginLoader$load$1 obj = PatchProxy.applyOneRefs(p0, this, DvaPluginLoader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof DvaPluginLoader$load$1) {
          obj = p0;
          DvaPluginLoader$load$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             DvaPluginLoader$load$1 result = obj.result;
             Throwable obj1 = b.h();
             DvaPluginLoader$load$1 label1 = obj.label;
             String str = 2;
             b = false;
             int i1 = 1;
             if (label1 != null) {
                if (label1 != i1) {
                   if (label1 == str) {
                      obj = obj.L$0;
                      j0.n(result);
                   label_0128 :
                      result = Result.constructor-impl(a.a(result.booleanValue()));
                      obj1 = Result.exceptionOrNull-impl(result);
                      if (obj1 != null) {
                         _monitor_enter(obj);
                         obj.c = null;
                         _monitor_exit(obj);
                         String stackTraceSt = Log.getStackTraceString(obj1);
                         a.o(stackTraceSt, "Log.getStackTraceString\(it\)");
                         obj.d(obj.b, stackTraceSt, "LOAD");
                      }
                      uBoolean = a.a(b);
                      if (Result.isFailure-impl(result)) {
                         uBoolean1 = uBoolean;
                      }
                      return uBoolean1;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   obj = obj.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                PushLogcat iNSTANCE = PushLogcat.INSTANCE;
                PushLogcat.i$default(iNSTANCE, null, "[DvaPluginLoader] load "+this.a, i1, null);
                DvaPluginLoader tc = this.c;
                if (tc != null) {
                   obj.L$0 = this;
                   obj.L$1 = tc;
                   obj.label = i1;
                   result = tc.C(obj);
                   if (result == obj1) {
                      return obj1;
                   }else {
                      int i2 = this;
                   }
                }else {
                   _monitor_enter(this);
                   u ou = v.c(null, i1, null);
                   this.c = ou;
                   _monitor_exit(this);
                   a.m(ou);
                   PushLogcat.i$default(iNSTANCE, null, "[DvaPluginLoader] start load plugin ["+this.a+']', i1, null);
                   Dva uDva = Dva.instance();
                   a.o(uDva, "Dva.instance\(\)");
                   uDva.getPluginInstallManager().j(this.a).a(new DvaPluginLoader$b(this, ou));
                   obj.L$0 = this;
                   obj.L$1 = ou;
                   obj.L$2 = ou;
                   obj.label = str;
                   result = ou.C(obj);
                   if (result == obj1) {
                      return obj1;
                   }else {
                      u ou1 = this;
                      goto label_0128 ;
                   }
                }
             }
             result = Result.constructor-impl(a.a(result.booleanValue()));
             if (Result.exceptionOrNull-impl(result) != null) {
                _monitor_enter(obj);
                obj.c = null;
                _monitor_exit(obj);
             }
             uBoolean = a.a(b);
             if (Result.isFailure-impl(result)) {
                uBoolean1 = uBoolean;
             }
             if (uBoolean1 != null) {
                b = uBoolean1.booleanValue();
             }
             return a.a(b);
          }
       }
       obj = new DvaPluginLoader$load$1(this, p0);
       goto label_0025 ;
    }
    public final void d(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DvaPluginLoader.class, "4")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "msg");
       a.p(p2, "source");
       i3 oi3 = i3.f();
       a.o(oi3, "JsonStringBuilder.newInstance\(\)");
       oi3.c("time", Long.valueOf(System.currentTimeMillis()));
       oi3.d("source", p2);
       oi3.d("plugin", this.a);
       oi3.d("msg", p1);
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       oi3.d("process", ContextExtKt.getProcessName(b));
       oi3.c("id", Integer.valueOf(this.hashCode()));
       PushLogcat.i$default(PushLogcat.INSTANCE, null, "[DvaPluginLoader] sendReportTrace success: "+oi3, 1, null);
       u1.R(p0, oi3.toString(), 9);
       p0 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          PushLogcat.i$default(PushLogcat.INSTANCE, null, "[DvaPluginLoader] sendReportTrace failure: "+oi3, 1, null);
          oi3.d("msg", Log.getStackTraceString(throwable));
          u1.R(this.b, oi3.toString(), 9);
       }
       return;
    }
}
