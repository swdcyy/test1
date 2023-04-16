package com.kuaishou.krn.bundle.preload.k;
import java.lang.Runnable;
import java.lang.String;
import java.util.List;
import com.kuaishou.krn.model.LoadingStateTrack;
import java.lang.Object;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jk0.b;
import jk0.c;
import ek0.d;
import com.kuaishou.krn.c;
import kj0.l;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.util.Iterator;
import gj0.d;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import com.kuaishou.krn.instance.JsFramework;
import sj0.b;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.kuaishou.krn.instance.JsExecutorConfig;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import wj0.a;
import wj0.a$a;
import android.os.SystemClock;
import brd.m;
import hj0.c;
import gu6.b;
import brd.a0;
import gj0.h;
import erd.r;
import com.kuaishou.krn.bundle.preload.f;
import erd.o;
import com.kuaishou.krn.bundle.preload.c;
import com.kuaishou.krn.bundle.preload.e;
import gj0.i;
import erd.a;
import gj0.l;
import gj0.m;
import erd.g;
import crd.b;

public final class k implements Runnable	// class@00084b
{
    public final String b;
    public final List c;
    public final LoadingStateTrack d;

    public void k(String p0,List p1,LoadingStateTrack p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       boolean b1;
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       if (PatchProxy.applyVoidThreeRefs(tb, tc, td, null, KrnReactRootPreloadManager.class, "6")) {
       }else if(c.a().b()){
          d.i("business preload is disabled, in develop mode");
       }else if(!c.b().g().N()){
          d.i("business preload is disabled, krn config is not enabled");
       }else if(!ExpConfigKt.o()){
          d.i("business preload is disabled, kswitch is off");
       }else if(tc == null || tc.size() <= 0){
          d.i("business preload list is empty");
       }else {
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             if (KrnReactRootPreloadManager.a.contains(uod.b())) {
                d.e(uod+" is preloading, stop!");
             }else {
                m obj = null;
                Iterator obj1 = PatchProxy.applyOneRefs(uod, obj, KrnReactRootPreloadManager.class, "7");
                boolean b = false;
                String str = 1;
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else {
                   obj1 = KrnInternalManager.c.b().d(uod.d()).iterator();
                   while (obj1.hasNext()) {
                      b uob = obj1.next();
                      if (!(uob.e()).equals(uod.a()) || (!uob.k() || uod.preloadType == PreloadType.GENERATE_CODE_CACHE.ordinal())) {
                         JsExecutorConfig obj2 = PatchProxy.applyTwoRefs(uod, uob, obj, KrnReactRootPreloadManager.class, "8");
                         if (obj2 != PatchProxyResult.class) {
                            b1 = obj2.booleanValue();
                         }else if((uob.e()).equals(uod.a()) && (uod.preloadType == PreloadType.GENERATE_CODE_CACHE.ordinal() && (uob.b() != null && uob.b().getJsExecutor() != null))){
                            obj2 = uod.c().mType;
                            JavaScriptExecutor$Type type = uob.b().getJsExecutor().getType();
                            Object obj3 = PatchProxy.applyTwoRefs(obj2, type, obj, a.class, "1");
                            if (obj3 != PatchProxyResult.class) {
                               b1 = obj3.booleanValue();
                            }else {
                               int i = a$a.a[obj2.ordinal()];
                               if (i != str) {
                                  if (i != 2 || type != JavaScriptExecutor$Type.V8_LITE) {
                                  label_014c :
                                     b1 = false;
                                  }
                               }else if(type == JavaScriptExecutor$Type.V8){
                               }
                               b1 = true;
                            }
                         }else {
                            goto label_014c ;
                         }
                         if (!b1) {
                         }
                      }
                      b = true;
                   }
                }
                if (b) {
                   d.e("preload engine has already existed, "+uod);
                }else {
                   d.e("add to preloading: "+uod);
                   KrnReactRootPreloadManager.a.add(uod.b());
                   long l = SystemClock.elapsedRealtime();
                   obj = PatchProxy.applyOneRefs(uod, obj, KrnReactRootPreloadManager.class, "9");
                   if (obj != PatchProxyResult.class) {
                   }else {
                      obj = c.a.a(uod.d()).o(uod.a()).t(new h(uod)).t(f.b);
                   }
                   obj.n(new c(uod, td)).n(new e(tb, uod, l)).h(new i(uod)).y(new l(uod), new m(uod));
                }
             }
          }
       }
       return;
    }
}
