package com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$c;
import xq5.c;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter;
import java.lang.Object;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tj3.i;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import ck2.i;
import com.kuaishou.live.core.show.statistics.logreporter.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import tj3.e;
import tj3.k;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class LiveLogReporterBasePresenter$c implements c	// class@00109f
{
    public final LiveLogReporterBasePresenter b;

    public void LiveLogReporterBasePresenter$c(LiveLogReporterBasePresenter p0){
       this.b = p0;
       super();
    }
    public void LiveLogReporterBasePresenter$c(LiveLogReporterBasePresenter p0,LiveLogReporterBasePresenter$1 p1){
       super(p0);
    }
    public void P(){
       LiveLogReporterBasePresenter x;
       if (PatchProxy.applyVoid(null, this, LiveLogReporterBasePresenter$c.class, "2")) {
          return;
       }
       this.b.x.k(false);
       LiveLogReporterBasePresenter$c tb = this.b;
       if (tb.A == null && tb.D == null) {
          LiveLogReporterBasePresenter y = tb.y;
          int i = 1;
          if (y != null && y.mHasClickReplacePageList != null) {
             y.mHasClickReplacePageList = false;
             x = tb.x;
             x.k(false);
             x.p(i);
             x.G(k0.a(this.b.P8(), d.a).or(Integer.valueOf(7)).intValue());
          }else {
             x = tb.x;
             x.p(i);
             int i1 = (this.b.S8())? 6: 15;
             x.G(i1);
          }
          this.b.p.v(false);
          this.b.x.p(3);
       }
       this.b.w.o0(0);
       this.b.X8();
       this.b.Y8();
       this.b.D = false;
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, LiveLogReporterBasePresenter$c.class, "1")) {
          return;
       }
       this.b.V8();
       this.b.W8();
       if (!this.b.S8()) {
          this.b.p.i();
       }
       LiveLogReporterBasePresenter$c tb = this.b;
       if (tb.I == null) {
          tb.I = true;
       }else {
          tb.p.y();
          if (this.b.S8()) {
             LiveLogReporterBasePresenter x = this.b.x;
             x.p(true);
             x.r(2);
             x.G(6);
             this.b.p.v(false);
             this.b.D = true;
          }
       }
       this.b.x.p(true);
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
