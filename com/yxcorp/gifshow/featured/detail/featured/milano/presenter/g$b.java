package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g$b;
import df5.b;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import pea.b;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.f;
import java.lang.Runnable;
import t45.c;
import java.util.List;
import java.lang.Math;
import java.lang.StringBuilder;
import mea.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import iea.p;
import df5.a;

public class g$b implements b	// class@000f39
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "2")) {
          return;
       }
       this.a.S8("attached");
       return;
    }
    public void b(QPhoto p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       g$b ta = this.a;
       if (ta.x == null) {
          ta.w = true;
       }
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, og, "19") && ta.P == null) {
          b.d("load prefetch data by poor net presenter");
          c.a(f.b);
          ta.P = true;
       }
       ta = this.a;
       ta.x = true;
       ta.F = p0;
       if (p0 != null && !ta.O.contains(p0)) {
          g$b ta1 = this.a;
          if (ta1.L != null) {
             ta = this.a;
             if (ta1.O.size() > (Math.max(ta.M, ta.K) + 2)) {
             label_0067 :
                this.a.c9();
                ta1 = this.a;
                Objects.requireNonNull(ta1);
                if (!PatchProxy.applyVoid(null, ta1, og, "23") && (ta1.L == null && ta1.O.size() > 5)) {
                   ta1.M = 6;
                   b.d("init page size default, mFirstPageSize = "+ta1.M);
                   ta1.L = true;
                   if (ta1.B.mTriggerPrefetchAfterVideoCount == -1) {
                      ta1.K = ta1.M;
                      b.d("init page size default, mVideoViewCntThreshold = "+ta1.K);
                   }
                }
                ta1 = this.a;
                Objects.requireNonNull(ta1);
                if (PatchProxy.applyVoid(null, ta1, og, "24") || (ta1.B.mTriggerPrefetchAfterVideoCount != null && ta1.N == null)) {
                   b.d("needUpdatePrefetchModels mVideoViewCntThreshold = "+ta1.K+" current view cnt = "+ta1.O.size());
                   if (ta1.K >= 2 && ta1.O.size() > ta1.K) {
                      b.d("notify update prefetch models");
                      ta1.N = true;
                      RxBus.f.b(new p());
                   }
                }
             label_0120 :
                return;
             }
          }
          ta1 = this.a;
          ta1.O.add(ta1.F);
          goto label_0067 ;
       }else {
          goto label_0067 ;
       }
    }
    public void c(QPhoto p0){
       a.c(this, p0);
    }
}
