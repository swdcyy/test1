package com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt$b;
import java.lang.Runnable;
import en7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import en7.o;
import java.util.LinkedList;
import qrd.l1;

public final class CachedResourcesKt$b implements Runnable	// class@001473
{
    public final a b;
    public final Runnable c;

    public void CachedResourcesKt$b(a p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CachedResourcesKt$b.class, "1")) {
          return;
       }
       CachedResourcesKt$b tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Boolean.TRUE, tb, uoa, "1") && true != tb.b)) {
          if (!PatchProxy.applyVoid(objArray, tb, uoa, "4")) {
             a = tb.a;
             _monitor_enter(a);
             Iterator iterator = tb.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().b();
             }
             tb.a.clear();
             _monitor_exit(a);
          }
          tb.b = true;
       }
       tb = this.c;
       if (tb != null) {
          tb.run();
       }
       return;
    }
}
