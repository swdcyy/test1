package com.kwai.sdk.eve.internal.common.scheduler.Schedulers$awaitTermination$$inlined$forEach$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import cn7.e;
import java.util.concurrent.TimeUnit;
import en7.n;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.lang.Integer;

public final class Schedulers$awaitTermination$$inlined$forEach$lambda$1 extends Lambda implements a	// class@001487
{
    public final e $it;
    public final CountDownLatch $latch$inlined;
    public final long $p0$inlined;
    public final TimeUnit $p1$inlined;
    public final n $ref$inlined;

    public void Schedulers$awaitTermination$$inlined$forEach$lambda$1(e p0,long p1,TimeUnit p2,n p3,CountDownLatch p4){
       this.$it = p0;
       this.$p0$inlined = p1;
       this.$p1$inlined = p2;
       this.$ref$inlined = p3;
       this.$latch$inlined = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, Schedulers$awaitTermination$$inlined$forEach$lambda$1.class, "1")) {
          return;
       }
       this.$it.awaitTermination(this.$p0$inlined, this.$p1$inlined);
       Schedulers$awaitTermination$$inlined$forEach$lambda$1 t$ref$inline = this.$ref$inlined;
       t$ref$inline.a = Integer.valueOf((t$ref$inline.a().intValue() - 1));
       this.$latch$inlined.countDown();
       PatchProxy.onMethodExit(Schedulers$awaitTermination$$inlined$forEach$lambda$1.class, "1");
       return;
    }
}
