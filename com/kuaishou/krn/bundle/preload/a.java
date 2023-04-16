package com.kuaishou.krn.bundle.preload.a;
import com.kuaishou.krn.lifecycle.AppLifecycleManager$c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import gj0.d;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;
import iu6.a;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.lang.Boolean;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import gj0.b;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.krn.c;
import kj0.l;
import gj0.c;
import java.lang.Throwable;
import ek0.d;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager$SceneType;

public class a implements AppLifecycleManager$c	// class@000841
{

    public void a(){
       super();
    }
    public static List a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod.preloadType == PreloadType.GENERATE_CODE_CACHE.ordinal()) {
             obj.add(uod);
          }
       }
       return obj;
    }
    public static void b(String p0,a p1){
       boolean b;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, a.class, "2")) {
          return;
       }
       List obj1 = PatchProxy.apply(obj, obj, ExpConfigKt.class, "69");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          d uod = KrnInternalManager.c.a().c();
          boolean b1 = true;
          b = (uod != null)? uod.getBoolean("krn_preload_business_async", b1): true;
       }
       if (!b) {
          c.a(new b(p1, p0));
       }else {
          try{
             obj1 = a.a(c.b().g().L());
             if (p1 == null && obj1.size() > 0) {
                c.b().o(p0, obj1);
                return;
             }else {
                c.a(new c(obj1, p1, p0));
             }
          }catch(java.lang.Exception e3){
             d.k("tryPreloadBusinessBundles£º", e3);
          }
       }
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a.b(KrnReactRootPreloadManager$SceneType.ENTER_BACKGROUND.name(), null);
       return;
    }
    public void onForeground(){
    }
}
