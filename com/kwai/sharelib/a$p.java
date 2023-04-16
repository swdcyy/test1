package com.kwai.sharelib.a$p;
import erd.g;
import com.kwai.sharelib.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.g;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.sharelib.KsShareApi;
import java.lang.StringBuilder;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import au6.e;

public final class a$p implements g	// class@0016b3
{
    public final a b;
    public final Ref$ObjectRef c;

    public void a$p(a p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, a$p.class, "1")) {
       }else {
          k1.o(new g(this, obj));
          if (KsShareApi.s.f()) {
             Thread thread = Thread.currentThread();
             a.o(thread, "Thread.currentThread\(\)");
             Log.e("ShareDebugLog", "FAIL in PANEL "+thread.getName(), obj);
          }
          e.b(e.a, null, "showSharePanel show panel error : "+obj.getMessage(), obj, 1, null);
       }
       return;
    }
}
