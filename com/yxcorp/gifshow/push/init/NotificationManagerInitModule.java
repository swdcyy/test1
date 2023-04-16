package com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.initmodule.AzerothInitModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import b76.a;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import com.kwai.android.common.ext.ContextExtKt;
import android.os.Build$VERSION;
import kotlin.Result;
import s7.b;
import u7.a;
import o6c.b;
import com.android.kwai.platform.notification.core.MethodCallName;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule$b;
import t7.c;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;

public final class NotificationManagerInitModule extends a	// class@0012e5
{
    public static final NotificationManagerInitModule$a q;

    static {
       NotificationManagerInitModule.q = new NotificationManagerInitModule$a(null);
    }
    public void NotificationManagerInitModule(){
       super();
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, NotificationManagerInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{AzerothInitModule.class};
       return CollectionsKt__CollectionsKt.P(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NotificationManagerInitModule.class, "4")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       Application uApplication = uoc.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       if (ContextExtKt.isMainProcess(uApplication) && Build$VERSION.SDK_INT < 33) {
          this.l0();
       }
       return;
    }
    public final void l0(){
       if (PatchProxy.applyVoid(null, this, NotificationManagerInitModule.class, "3")) {
          return;
       }
       b b = b.b;
       a uoa = b.a(b);
       b.h(MethodCallName.CREATE_CHANNEL, NotificationManagerInitModule$b.a);
       Application b1 = a.B;
       a.o(b1, "AppEnv.APP");
       b.f(b1, uoa);
       Result.constructor-impl(l1.a);
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, NotificationManagerInitModule.class, "1")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       Application uApplication = uoc.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       if (!ContextExtKt.isMainProcess(uApplication) || Build$VERSION.SDK_INT >= 33) {
          this.l0();
       }
       return;
    }
}
