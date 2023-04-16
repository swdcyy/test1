package a96.p;
import erd.g;
import com.kwai.framework.krn.init.preload.e;
import com.kwai.framework.krn.init.network.RequestConfig;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import gk0.b;
import java.lang.System;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.framework.krn.init.preload.KrnPreRequestReportInfo;
import okhttp3.Response;
import okhttp3.Request;
import y86.c;
import y86.s;
import com.kwai.framework.krn.init.preload.e$i;
import com.kwai.framework.krn.init.preload.a;
import java.lang.StringBuilder;
import com.kwai.framework.krn.init.network.b;
import com.facebook.react.bridge.ReactContext;
import y86.d;
import a96.l;

public final class p implements g	// class@000052
{
    public final e b;
    public final RequestConfig c;
    public final LaunchModel d;
    public final long e;

    public void p(e p0,RequestConfig p1,LaunchModel p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       a uoa;
       e$i a;
       p op = this;
       p b = op.b;
       p c = op.c;
       p d = op.d;
       p e = op.e;
       int i = p0;
       Objects.requireNonNull(b);
       if (!PatchProxy.isSupport(e.class) || (!PatchProxy.applyVoidFourRefs(c, i, d, Long.valueOf(e), b, e.class, "13") && c != null)) {
          if (b.f(d)) {
             uoa = i;
             b.a().f(d.a(), d.b(), c.getUrl(), e, System.currentTimeMillis());
          }else {
             uoa = i;
          }
          KrnPreRequestReportInfo krnPreReques = b.j.get(c);
          if (krnPreReques != null) {
             krnPreReques.onRespond();
             c uoc = s.e(uoa.n().request());
             if (uoc != null) {
                c uoc1 = null;
                boolean b1 = false;
                boolean b2 = (uoc.isSocketReused - uoc1 > 0)? true: false;
                krnPreReques.isSocketReused = b2;
                if (uoc.isUseKlinkProxy - uoc1 > 0) {
                   b1 = true;
                }
                krnPreReques.isUseKlinkProxy = b1;
                krnPreReques.setKlinkTimeCost(uoc.klinkTimeCost);
                if (uoc.klinkTimeCost - uoc1 <= 0) {
                   uoc1 = uoc.totalCost;
                }
                krnPreReques.setTotalCost(uoc1);
                krnPreReques.mAegonCost = uoc.mAegonCost;
                krnPreReques.mRequestBodyLength = uoc.mRequestBodyLength;
                krnPreReques.mResponseBodyLength = uoc.mResponseBodyLength;
             }
             if (krnPreReques.hasBizRequest != null) {
                b.l(krnPreReques, c);
             }
             b.h(c);
          }
          e$i oi = b.f.get(c);
          if (oi != null) {
             oi.a = uoa;
             a.M().F("预请求已回包，请求成功，URL是: \n "+c.getUrl());
             if (oi.c != null) {
                c.setHitKrnPageLoadMonitorSample(oi.e);
                b uob = b.b();
                a = oi.a;
                e$i c1 = oi.c;
                Objects.requireNonNull(uob);
                if (!PatchProxy.applyVoidFourRefs(d, c, a, c1, uob, b.class, "12")) {
                   uob.g(d, null, c, a, c1);
                }
                b.f.remove(c);
             }else {
                e$i d1 = oi.d;
                if (d1 != null) {
                   d1.b(oi.a);
                   b.f.remove(c);
                }
             }
          }
       }
    label_0117 :
       return;
    }
}
