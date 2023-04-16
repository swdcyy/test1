package com.kwai.performance.fluency.page.monitor.utils.ChoreographerExt$runOnNextPostFrame$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Runnable;
import hf7.a$a;
import java.lang.Object;
import qrd.l1;
import hf7.a;
import java.lang.reflect.Method;

public final class ChoreographerExt$runOnNextPostFrame$1 extends Lambda implements a	// class@0010cd
{
    public final Runnable $action;
    public final a$a $cb;

    public void ChoreographerExt$runOnNextPostFrame$1(Runnable p0,a$a p1){
       this.$action = p0;
       this.$cb = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       a d = a.d;
       d.a();
       boolean b = d.b(a.b, this.$action);
       ChoreographerExt$runOnNextPostFrame$1 t$cb = this.$cb;
       if (t$cb != null) {
          if (b) {
             t$cb.b();
          }else {
             t$cb.a();
          }
       }
       return;
    }
}
