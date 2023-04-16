package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FetchPhoneNumInterceptor$intercept$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import z1d.d;
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
import java.lang.IllegalStateException;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import android.content.Context;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FetchPhoneNumInterceptor$intercept$2$a;
import ftd.k;
import ov5.c;
import z2d.f;
import dsd.e;

public final class FetchPhoneNumInterceptor$intercept$2 extends SuspendLambda implements p	// class@001b67
{
    public final d $launcher;
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;

    public void FetchPhoneNumInterceptor$intercept$2(d p0,c p1){
       this.$launcher = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       FetchPhoneNumInterceptor$intercept$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, FetchPhoneNumInterceptor$intercept$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new FetchPhoneNumInterceptor$intercept$2(this.$launcher, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FetchPhoneNumInterceptor$intercept$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FetchPhoneNumInterceptor$intercept$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       FetchPhoneNumInterceptor$intercept$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.L$1 = this;
          this.label = 1;
          p0 = new l(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
          p0.u();
          f.s(this.$launcher.d(), new FetchPhoneNumInterceptor$intercept$2$a(p0, this), 1);
          p0 = p0.r();
          if (p0 == b.h()) {
             e.c(this);
          }
          if (p0 == obj) {
             return obj;
          }
       }
       return p0;
    }
}
