package com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager$launchPage$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z1d.d;

public final class LoginEntrancePageManager$launchPage$1 extends ContinuationImpl	// class@001b58
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public Object result;
    public final LoginEntrancePageManager this$0;

    public void LoginEntrancePageManager$launchPage$1(LoginEntrancePageManager p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LoginEntrancePageManager$launchPage$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.a(null, this);
    }
}
