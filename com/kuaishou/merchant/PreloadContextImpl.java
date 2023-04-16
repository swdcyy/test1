package com.kuaishou.merchant.PreloadContextImpl;
import qa4.b;
import com.kuaishou.merchant.PreloadContextImpl$mLogger$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qa4.e;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.app.Activity;
import com.kwai.framework.activitycontext.ActivityContext;
import qa4.a;
import java.lang.Boolean;
import com.kuaishou.merchant.preload.PreloadConfig;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class PreloadContextImpl implements b	// class@0014c7
{
    public static final p a;
    public static final PreloadContextImpl b;

    static {
       PreloadContextImpl.b = new PreloadContextImpl();
       PreloadContextImpl.a = s.c(PreloadContextImpl$mLogger$2.INSTANCE);
    }
    public void PreloadContextImpl(){
       super();
    }
    public static final void b(){
       if (PatchProxy.applyVoid(null, null, PreloadContextImpl.class, "1")) {
          return;
       }
       e d = e.d;
       PreloadContextImpl b = PreloadContextImpl.b;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(b, d, e.class, "5")) {
          a.p(b, "preloadContext");
          e.c = b;
       }
       return;
    }
    public Context a(){
       Object obj = PatchProxy.apply(null, this, PreloadContextImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b();
    }
    public Activity c(){
       Object obj = PatchProxy.apply(null, this, PreloadContextImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActivityContext.g().e();
    }
    public a d1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PreloadContextImpl preloadConte = PreloadContextImpl.class;
       Object obj = PatchProxy.apply(null, this, preloadConte, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, preloadConte, "6");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PreloadContextImpl.a.getValue();
       }
       return obj1;
    }
    public boolean e1(){
       Object obj = PatchProxy.apply(null, this, PreloadContextImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public PreloadConfig f1(){
       Object obj = PatchProxy.apply(null, this, PreloadContextImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("merchantPreloadConfig", PreloadConfig.class, new PreloadConfig());
    }
}
