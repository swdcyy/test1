package com.kuaishou.krn.apm.memory.KdsLeakDetector;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$watcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import msd.l;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$watch$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import brd.z;
import lrd.b;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$d;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import crd.b;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$watchKrnContainer$1;
import ze.v;
import java.util.Map;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$watchReactRootView$1;

public final class KdsLeakDetector	// class@0007ec
{
    public static KdsLeakDetector$b a;
    public static boolean b;
    public static boolean c;
    public static long d;
    public static long e;
    public static final p f;
    public static final KdsLeakDetector g;

    static {
       KdsLeakDetector.g = new KdsLeakDetector();
       KdsLeakDetector.f = s.c(KdsLeakDetector$watcher$2.INSTANCE);
    }
    public void KdsLeakDetector(){
       super();
    }
    public static void d(KdsLeakDetector p0,Object p1,l p2,long p3,l p4,int p5,Object p6){
       KdsLeakDetector$watch$1 iNSTANCE = (p5 & 0x08)? KdsLeakDetector$watch$1.INSTANCE: 0;
       p0.c(p1, p2, p3, iNSTANCE);
       return;
    }
    public final Object a(){
       int[] ointArray = new int[0x40001];
       return ointArray;
    }
    public final boolean b(){
       return KdsLeakDetector.b;
    }
    public final void c(Object p0,l p1,long p2,l p3){
       if (PatchProxy.isSupport(KdsLeakDetector.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, this, KdsLeakDetector.class, "3")) {
          return;
       }
       a.p(p1, "description");
       a.p(p3, "continueRetain");
       if (!KdsLeakDetector.c) {
          return;
       }
       KdsLeakDetector$d uod = new KdsLeakDetector$d(new WeakReference(p0), p3, p1, p2);
       b.e().e(v0, p2, TimeUnit.MILLISECONDS);
       return;
    }
    public final void e(Object p0,String p1,String p2,String p3,long p4){
       KdsLeakDetector kdsLeakDetec = KdsLeakDetector.class;
       if (PatchProxy.isSupport(kdsLeakDetec)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, kdsLeakDetec, "5")) {
             return;
          }
       }
       a.p(p0, "container");
       a.p(p1, "name");
       if (!KdsLeakDetector.c) {
          return;
       }else {
          KdsLeakDetector.d(this, p0, new KdsLeakDetector$watchKrnContainer$1(p1, p2, p3), p4, null, 8, null);
          return;
       }
    }
    public final void f(v p0,Map p1,long p2){
       if (PatchProxy.isSupport(KdsLeakDetector.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, KdsLeakDetector.class, "4")) {
          return;
       }
       a.p(p0, "reactRootView");
       a.p(p1, "commonDescription");
       if (!KdsLeakDetector.c) {
          return;
       }
       KdsLeakDetector.d(this, p0, new KdsLeakDetector$watchReactRootView$1(p1), p2, null, 8, null);
       return;
    }
}
