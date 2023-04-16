package com.yxcorp.experiment.ABManager$1;
import androidx.lifecycle.GenericLifecycleObserver;
import com.yxcorp.experiment.c;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import com.yxcorp.experiment.c$a;
import java.lang.Enum;
import android.os.SystemClock;
import com.yxcorp.experiment.logger.a;
import c97.d;
import q97.c;
import java.lang.String;
import wu8.q;
import zu8.b;
import com.yxcorp.experiment.d;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import java.lang.Math;
import java.util.concurrent.ExecutorService;
import f97.a;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import brd.t;
import zu8.e;
import zu8.d;
import erd.g;
import crd.b;

public class ABManager$1 implements GenericLifecycleObserver	// class@0011dd
{
    public final c b;

    public void ABManager$1(c p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       c n;
       c d;
       int i = c$a.a[p1.ordinal()];
       String str = "ABTest-LogEventHelper";
       if (i != 1) {
          if (i == 2) {
             i.d = SystemClock.elapsedRealtime();
             n = this.b.n;
             if (n.b()) {
                d.a().f().d(str, "onBackground");
                n.h();
                n.e(3);
             }
          }
       }else {
          long l = SystemClock.elapsedRealtime();
          ABManager$1 tb = this.b;
          d = tb.d;
          if (d > 0 && (l - d) - tb.k.l() > 0) {
             tb = this.b;
             tb.b.b((l - tb.d));
             tb = this.b;
             tb.d = l;
             new d(tb.e).b(ApiRequestTiming.ON_FOREGROUND);
          }
          n = this.b.n;
          if (n.b()) {
             d.a().f().d(str, "onForeground");
             n.h();
             long l1 = Math.max(c.h().g().e(), 1000);
             if (n.h == null) {
                n.h = b.b(a.c());
             }
             d.a().f().d(str, "startNormalLog interval: "+l1);
             n.g = t.interval(l1, l1, TimeUnit.MILLISECONDS).subscribeOn(b.a()).observeOn(n.h).subscribe(new e(n), new d(l1));
          }
       }
    label_00ec :
       return;
    }
}
