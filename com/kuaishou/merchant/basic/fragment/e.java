package com.kuaishou.merchant.basic.fragment.e;
import erd.g;
import com.kuaishou.merchant.basic.fragment.f;
import java.lang.Object;
import brd.t;
import ht3.b;
import ht3.o;
import io.reactivex.internal.functions.Functions;
import crd.b;
import n04.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import android.os.SystemClock;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public final class e implements g	// class@0015c0
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b;
       boolean b = true;
       if (p0.z != b) {
       }else if(p0.k.getDispatchDrawObservable() != null){
          p0.s = b;
          p0.o = p0.k.getDispatchDrawObservable().subscribe(new o(p0), Functions.e);
       }else {
          Object[] objArray1 = new Object[0];
          a.C().w("MerchantPagePerfLogger", "hookRequest, subject is null, page=["+p0.k.C1()+"]", objArray1);
       }
       if (p0.f <= 0) {
          p0.f = SystemClock.elapsedRealtime();
          PageMonitor.INSTANCE.trackPageRequestEnd(p0.k, b);
       }
       p0.z = 2;
       Object[] objArray = new Object[0];
       a.C().w("MerchantPagePerfLogger", "hookRequest, page=["+p0.k.C1()+"] mRequestSuccessTime=["+p0.f+"]", objArray);
       return;
    }
}
