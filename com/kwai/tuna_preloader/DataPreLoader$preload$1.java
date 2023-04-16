package com.kwai.tuna_preloader.DataPreLoader$preload$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.tuna_preloader.DataPreLoader$c;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.tuna_preloader.DataPreLoader$preload$1$1;
import msd.p;
import com.kwai.tuna_preloader.DataPreLoader$b;
import java.lang.Throwable;

public final class DataPreLoader$preload$1 extends Lambda implements l	// class@00196c
{
    public final DataPreLoader this$0;

    public void DataPreLoader$preload$1(DataPreLoader p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ResultWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$preload$1.class, "1")) {
          return;
       }
       a.p(p0, "resultWrapper");
       DataPreLoader e = this.this$0.e;
       if (e != null) {
          e.j(p0);
       }
       if (this.this$0.a.compareAndSet(2, 3)) {
          e = this.this$0.e;
          if (e != null) {
             e.k();
          }
          e = this.this$0.d;
          if (e != null) {
             e.a(p0, new DataPreLoader$preload$1$1(this));
          }
       }else {
          this.this$0.j();
          this.this$0.i();
          DataPreLoader e1 = this.this$0.e;
          if (e1 != null) {
             e1.b(null);
          }
       }
       return;
    }
}
