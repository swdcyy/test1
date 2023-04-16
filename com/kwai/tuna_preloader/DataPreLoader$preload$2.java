package com.kwai.tuna_preloader.DataPreLoader$preload$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.tuna_preloader.DataPreLoader$c;

public final class DataPreLoader$preload$2 extends Lambda implements l	// class@00196d
{
    public final DataPreLoader this$0;

    public void DataPreLoader$preload$2(DataPreLoader p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$preload$2.class, "1")) {
          return;
       }
       DataPreLoader e = this.this$0.e;
       if (e != null) {
          e.i(p0);
       }
       this.this$0.j();
       this.this$0.i();
       return;
    }
}
