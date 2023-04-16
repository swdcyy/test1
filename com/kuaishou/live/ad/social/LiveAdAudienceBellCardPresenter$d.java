package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$d;
import am0.f;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import am0.b;
import ekd.k1;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;

public final class LiveAdAudienceBellCardPresenter$d implements f	// class@0009f0
{
    public final LiveAdAudienceBellCardPresenter a;

    public void LiveAdAudienceBellCardPresenter$d(LiveAdAudienceBellCardPresenter p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       LiveAdAudienceBellCardPresenter$d ta;
       LiveAdAudienceBellCardPresenter$d uod = LiveAdAudienceBellCardPresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       String str = "TAG_SHOW_BELL";
       if (!p0) {
          ta = this.a;
          ta.r = null;
          if (ta.R8().b()) {
             k1.n("TAG_HIDE_BELL");
             this.a.V8(true);
          }else {
             k1.n(str);
          }
       }else if(this.a.r != null){
          k1.n(str);
          ta = this.a;
          LiveAdAudienceBellCardPresenter r = ta.r;
          a.m(r);
          ta.S8(r, true);
       }
       return;
    }
}
