package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1;
import java.lang.Runnable;
import sj0.b;
import java.lang.Integer;
import java.lang.String;
import msd.l;
import java.lang.ref.WeakReference;
import com.kuaishou.krn.apm.MemoryEventTiming;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.MemoryMonitor;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.CatalystInstance;
import com.kuaishou.krn.instance.JsFramework;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.facebook.react.a;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1;
import msd.a;

public final class MemoryMonitor$postMemoryEvent$1 implements Runnable	// class@0007d2
{
    public final b b;
    public final Integer c;
    public final String d;
    public final boolean e;
    public final long f;
    public final l g;
    public final WeakReference h;
    public final MemoryEventTiming i;

    public void MemoryMonitor$postMemoryEvent$1(b p0,Integer p1,String p2,boolean p3,long p4,l p5,WeakReference p6,MemoryEventTiming p7){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
    }
    public final void run(){
       Object[] objArray3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MemoryMonitor$postMemoryEvent$1.class, "1")) {
          return;
       }
       MemoryMonitor m = MemoryMonitor.m;
       MemoryMonitor$postMemoryEvent$1 tb = this.b;
       MemoryMonitor$postMemoryEvent$1 tc = this.c;
       Objects.requireNonNull(m);
       Object[] objArray1 = PatchProxy.applyTwoRefs(tb, tc, m, MemoryMonitor.class, "18");
       if (objArray1 != PatchProxyResult.class) {
       }else if(tb != null){
          objArray = tb.b();
       }else if(tc != null){
          JsFramework[] jsFrameworkA = JsFramework.values();
          int len = jsFrameworkA.length;
          Object[] objArray2 = objArray;
          int i = 0;
          while (i < len) {
             Iterator iterator = KrnInternalManager.c.b().d(jsFrameworkA[i]).iterator();
             while (true) {
                int i1 = 1;
                if (iterator.hasNext()) {
                   objArray3 = iterator.next();
                   Object obj = objArray3;
                   obj = (obj != null && obj.i().r() == tc.intValue())? 1: null;
                   if (!obj) {
                      continue ;
                   }
                }else {
                   objArray3 = objArray;
                }
                objArray2 = objArray3;
                if (objArray2 == null) {
                   i1 = 0;
                }
                if (i1) {
                }else {
                   i = i + 1;
                }
             }
          }
          if (objArray2 != null) {
             objArray = objArray2.b();
          }
       }
       objArray1 = objArray;
       MemoryMonitor.m.l(new MemoryMonitor$postMemoryEvent$1$1(this, objArray1));
       return;
    }
}
