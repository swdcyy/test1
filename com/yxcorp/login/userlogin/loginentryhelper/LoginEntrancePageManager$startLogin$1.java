package com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager$startLogin$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import z1d.d;
import n3d.a;
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
import com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import e17.i;
import java.util.Objects;
import lnc.i3;
import java.lang.StringBuilder;
import java.lang.Throwable;
import qrd.i;
import k2b.u1;
import android.content.Intent;

public final class LoginEntrancePageManager$startLogin$1 extends SuspendLambda implements p	// class@001b59
{
    public final a $callback;
    public final d $loginPageChain;
    public Object L$0;
    public int label;
    public k0 p$;

    public void LoginEntrancePageManager$startLogin$1(d p0,a p1,c p2){
       this.$loginPageChain = p0;
       this.$callback = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LoginEntrancePageManager$startLogin$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LoginEntrancePageManager$startLogin$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LoginEntrancePageManager$startLogin$1(this.$loginPageChain, this.$callback, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LoginEntrancePageManager$startLogin$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LoginEntrancePageManager$startLogin$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LoginEntrancePageManager$startLogin$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          if (LoginEntrancePageManager.e.a(this.$loginPageChain, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
