package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$g;
import xq5.c;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import am0.b;
import am0.f;
import com.kuaishou.live.ad.social.u;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class LiveAdAudienceBellCardPresenter$g implements c	// class@0009f3
{
    public final LiveAdAudienceBellCardPresenter b;

    public void LiveAdAudienceBellCardPresenter$g(LiveAdAudienceBellCardPresenter p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveAdAudienceBellCardPresenter$g.class, "2")) {
          return;
       }
       boolean b = false;
       if (this.b.R8().b()) {
          this.b.V8(b);
       }
       this.b.X8(b);
       LiveAdAudienceBellCardPresenter$g tb = this.b;
       LiveAdAudienceBellCardPresenter t = tb.t;
       if (t != null) {
          t.o(tb.B);
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, LiveAdAudienceBellCardPresenter$g.class, "1")) {
          return;
       }
       LiveAdAudienceBellCardPresenter$g tb = this.b;
       LiveAdAudienceBellCardPresenter t = tb.t;
       if (t != null) {
          t.l(tb.B);
       }
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
