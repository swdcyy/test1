package com.kwai.tuna_preloader.DataPreLoader$preload$1$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader$preload$1;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.tuna_preloader.DataPreLoader;
import com.kwai.tuna_preloader.DataPreLoader$c;
import java.util.concurrent.atomic.AtomicInteger;

public final class DataPreLoader$preload$1$1 extends Lambda implements p	// class@00196b
{
    public final DataPreLoader$preload$1 this$0;

    public void DataPreLoader$preload$1$1(DataPreLoader$preload$1 p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.booleanValue(), p1);
       return l1.a;
    }
    public final void invoke(boolean p0,Throwable p1){
       DataPreLoader e;
       if (PatchProxy.isSupport(DataPreLoader$preload$1$1.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, DataPreLoader$preload$1$1.class, "1")) {
          return;
       }
       if (p0) {
          e = this.this$0.this$0.e;
          if (e != null) {
             e.c();
          }
          this.this$0.this$0.a.compareAndSet(3, 4);
       }else {
          e = this.this$0.this$0.e;
          if (e != null) {
             e.b(p1);
          }
          this.this$0.this$0.j();
       }
       this.this$0.this$0.i();
       return;
    }
}
