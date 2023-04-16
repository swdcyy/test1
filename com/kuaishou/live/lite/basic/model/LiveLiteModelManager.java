package com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lp3.i;
import lp3.g;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager$a;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;
import o56.c;
import o56.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.robust.PatchProxyResult;
import z1.k;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager$b;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager$lazyGet$1;
import msd.a;

public final class LiveLiteModelManager	// class@001e8f
{
    public final i a;
    public final LiveLiteModelManager$a b;

    public void LiveLiteModelManager(LiveLiteModelConfig p0){
       a.p(p0, "config");
       super();
       this.a = new i(p0.b);
       this.b = new LiveLiteModelManager$a(this);
       LiveLiteModelManager$1 u1 = new LiveLiteModelManager$1(this);
       if (PatchProxy.applyVoidOneRefs(u1, p0, LiveLiteModelConfig.class, "2")) {
       }else {
          a.p(u1, "<set-?>");
          p0.c = u1;
       }
       Iterator iterator = p0.d.iterator();
       while (iterator.hasNext()) {
          this.c(iterator.next(), "");
       }
       return;
    }
    public final void a(Class p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelManager.class, "4")) {
          return;
       }
       if (this.a.b()) {
          String str = "get "+p0.getSimpleName()+" after LiveLiteModelManager destroyed";
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (!uoc.c()) {
             ExceptionHandler.handleCaughtException(new RuntimeException(str));
          }else {
             throw new RuntimeException(str);
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveLiteModelManager.class, "1")) {
          return;
       }
       this.a.clear();
       return;
    }
    public final Object c(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteModelManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       a.p(p1, "comment");
       p0 = this.e(p0).get();
       a.o(p0, "lazyGet\(clazz\).get\(\)");
       return p0;
    }
    public final Object d(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteModelManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       a.p(p1, "comment");
       k ok = this.f(p0);
       ok = (ok != null)? ok.get(): null;
       return ok;
    }
    public final k e(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       this.a(p0);
       return new LiveLiteModelManager$b(new LiveLiteModelManager$lazyGet$1(this, p0));
    }
    public final k f(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       this.a(p0);
       if (!this.a.d(p0)) {
          return null;
       }
       return this.e(p0);
    }
}
