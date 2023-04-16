package com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$a;
import ug1.a1;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2;
import java.lang.Object;
import f92.b;
import ug1.z0;
import f92.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.framework.model.user.UserInfo;
import d61.v;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo;

public class LiveAudienceGuestActivityTopListPresenterV2$a implements a1	// class@000bc8
{
    public final LiveAudienceGuestActivityTopListPresenterV2 a;

    public void LiveAudienceGuestActivityTopListPresenterV2$a(LiveAudienceGuestActivityTopListPresenterV2 p0){
       this.a = p0;
       super();
    }
    public void G4(b p0){
       z0.b(this, p0);
    }
    public void S1(a p0){
       z0.a(this, p0);
    }
    public void o4(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGuestActivityTopListPresenterV2$a.class, "1")) {
          return;
       }
       if (p0.e != null && p0.g != null) {
          LiveAudienceGuestActivityTopListPresenterV2 t = this.a.T;
          if (t != null && (t.equals(p0.h) && this.a.W0.N().r2(AudienceBizRelation.GUEST_ACTIVITY))) {
             LiveAudienceGuestActivityTopListPresenterV2$a ta = this.a;
             ta.R = v.f(p0.g.mId, ta.R);
             LiveAudienceGuestActivityTopListPresenterV2$a ta1 = this.a;
             if (ta1.N != null && ta1.S != null) {
                ta1.c9(ta1.U, true);
             }
          }
       }
    label_004f :
       return;
    }
    public void t2(b p0){
       z0.d(this, p0);
    }
}
