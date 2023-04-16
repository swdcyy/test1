package com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter$a;
import androidx.fragment.app.c$b;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import aq5.d;
import lp3.c;
import lp3.i;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import t02.a0;
import dq5.b;

public final class LiveAudienceMultiPkPresenter$a extends c$b	// class@000bb4
{
    public final LiveAudienceMultiPkPresenter a;

    public void LiveAudienceMultiPkPresenter$a(LiveAudienceMultiPkPresenter p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiPkPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       LiveAudienceMultiPkPresenter$a ta = this.a;
       Objects.requireNonNull(ta);
       p1 = PatchProxy.apply(null, ta, LiveAudienceMultiPkPresenter.class, "13");
       if (p1 != PatchProxyResult.class) {
          b = p1.booleanValue();
       }else {
          LiveAudienceMultiPkPresenter w = ta.w;
          if (w == null) {
             a.S("liveServiceManager");
          }
          w = w.a(d.class);
          a.o(w, "liveServiceManager.getSe¡­veBizManager::class.java\)");
          if (w.r2(AudienceBizRelation.LIVE_MULTI_PK) || w.r2(AudienceBizRelation.PK)) {
             b = true;
          }else {
             b = false;
          }
       }
       if (b) {
          LiveAudienceMultiPkPresenter.Y8(this.a).W.a();
       }
       return;
    }
}
