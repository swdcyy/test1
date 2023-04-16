package com.kuaishou.tuna_core.button.TunaButtonMonitor$b;
import java.lang.Runnable;
import java.lang.Integer;
import ma6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.button.TunaButtonMonitor;

public final class TunaButtonMonitor$b implements Runnable	// class@001096
{
    public final Integer b;
    public final a c;

    public void TunaButtonMonitor$b(Integer p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TunaButtonMonitor$b.class, "1")) {
          return;
       }
       TunaButtonMonitor$b tb = this.b;
       TunaButtonMonitor$b tc = this.c;
       if (tc != null) {
          a = tc.a;
          if (a != null) {
             objArray = Integer.valueOf(a.get());
          }
       }
       if (a.g(tb, objArray)) {
          TunaButtonMonitor.b.a(this.c);
       }
       return;
    }
}
