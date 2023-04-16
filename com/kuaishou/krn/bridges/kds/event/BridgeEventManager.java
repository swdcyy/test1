package com.kuaishou.krn.bridges.kds.event.BridgeEventManager;
import zi0.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zi0.b;
import com.kuaishou.krn.lifecycle.JSLifecycleManager;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.krn.bridges.kds.event.BridgeEventManager$cleanIdleListener$1;
import java.util.Set;
import msd.l;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.krn.bridges.kds.event.BridgeEventManager$a;
import com.facebook.react.bridge.CatalystInstance;
import com.kuaishou.krn.bridges.kds.KdsBridge;
import com.kuaishou.krn.bridges.kds.KdsBridge$a;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import java.util.Collection;

public final class BridgeEventManager	// class@000824
{
    public static final Set a;
    public static final BridgeEventManager b;

    static {
       BridgeEventManager.b = new BridgeEventManager();
       c a = c.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoid(null, a, c.class, "1")) {
       }else {
          b uob = new b();
          if (!PatchProxy.applyVoidOneRefs(uob, null, JSLifecycleManager.class, "2")) {
             a.p(uob, "lifecycleObserver");
             JSLifecycleManager.b.a().add(uob);
          }
       }
       BridgeEventManager.a = new CopyOnWriteArraySet();
    }
    public void BridgeEventManager(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, BridgeEventManager.class, "8")) {
          return;
       }
       this.e(BridgeEventManager.a, BridgeEventManager$cleanIdleListener$1.INSTANCE);
       return;
    }
    public final void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BridgeEventManager.class, "4")) {
          return;
       }
       a.p(p0, "type");
       this.a();
       Iterator iterator = BridgeEventManager.a.iterator();
       while (iterator.hasNext()) {
          BridgeEventManager$a uoa = iterator.next();
          if (a.g(uoa.c(), p0)) {
             CatalystInstance uCatalystIns = uoa.a();
             boolean b = (uCatalystIns != null)? uCatalystIns.isDestroyed(): true;
             if (!b) {
                KdsBridge.Companion.a(uoa.a(), uoa.b(), p1);
             }
          }
       }
       return;
    }
    public final void c(Context p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, null, this, BridgeEventManager.class, "5")) {
          return;
       }
       a.p(p1, "type");
       if (p0 == null) {
          return;
       }
       this.a();
       Iterator iterator = BridgeEventManager.a.iterator();
       while (iterator.hasNext()) {
          BridgeEventManager$a uoa = iterator.next();
          if (a.g(uoa.c(), p1)) {
             Context uContext = PatchProxy.apply(null, uoa, BridgeEventManager$a.class, "2");
             if (uContext == PatchProxyResult.class) {
                uContext = uoa.a.get();
             }
             if (a.g(uContext, p0)) {
                CatalystInstance uCatalystIns = uoa.a();
                boolean b = (uCatalystIns != null)? uCatalystIns.isDestroyed(): true;
                if (!b) {
                   KdsBridge.Companion.a(uoa.a(), uoa.b(), null);
                }
             }
          }
       }
       return;
    }
    public final void d(CatalystInstance p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, null, this, BridgeEventManager.class, "6")) {
          return;
       }
       a.p(p1, "type");
       if (p0 == null) {
          return;
       }
       this.a();
       Iterator iterator = BridgeEventManager.a.iterator();
       while (iterator.hasNext()) {
          BridgeEventManager$a uoa = iterator.next();
          if (a.g(uoa.c(), p1) && a.g(uoa.a(), p0)) {
             CatalystInstance uCatalystIns = uoa.a();
             boolean b = (uCatalystIns != null)? uCatalystIns.isDestroyed(): true;
             if (!b) {
                KdsBridge.Companion.a(uoa.a(), uoa.b(), null);
             }
          }
       }
       return;
    }
    public final void e(Set p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BridgeEventManager.class, "3")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (p1.invoke(obj).booleanValue()) {
             uArrayList.add(obj);
          }
       }
       p0.removeAll(uArrayList);
       return;
    }
}
