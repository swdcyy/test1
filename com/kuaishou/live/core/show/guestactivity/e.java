package com.kuaishou.live.core.show.guestactivity.e;
import ekd.f$j;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kuaishou.live.core.show.guestactivity.h$f;
import hb2.g$b;

public class e extends f$j	// class@000bd4
{
    public final LiveAudienceGuestActivityTopListPresenterV2 a;

    public void e(LiveAudienceGuestActivityTopListPresenterV2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.a.N.setVisibility(8);
       if (!this.a.W0.N().r2(AudienceBizRelation.GUEST_ACTIVITY)) {
          return;
       }
       this.a.U0.a();
       a0 l1 = this.a.W0.l1;
       if (l1 != null) {
          l1.f(true);
       }
       return;
    }
}
