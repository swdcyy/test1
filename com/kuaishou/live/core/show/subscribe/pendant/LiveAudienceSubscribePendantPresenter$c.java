package com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter$c;
import com.kuaishou.live.core.show.subscribe.pendant.f$b;
import com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribePendantInfo$LiveSubscribePendantDetail;
import yk2.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import yk2.y;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import u07.t$a;
import u07.f;
import yk2.h;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import ok2.i;
import com.kuaishou.live.core.show.subscribe.b;
import ps5.b;
import com.kuaishou.live.core.show.subscribe.d$b;
import android.view.View;
import com.kuaishou.live.core.show.subscribe.pendant.f;
import java.util.Set;
import d61.l0;

public class LiveAudienceSubscribePendantPresenter$c implements f$b	// class@001147
{
    public final LiveAudienceSubscribePendantPresenter a;

    public void LiveAudienceSubscribePendantPresenter$c(LiveAudienceSubscribePendantPresenter p0){
       this.a = p0;
       super();
    }
    public void a(LiveSubscribePendantInfo$LiveSubscribePendantDetail p0){
       u.c(this, p0);
    }
    public void b(boolean p0,LiveSubscribePendantInfo$LiveSubscribePendantDetail p1){
       LiveSubscribePendantInfo$LiveSubscribePendantDetail mReservation1;
       LiveAudienceSubscribePendantPresenter$c uoc = LiveAudienceSubscribePendantPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       Objects.requireNonNull(uoc);
       LiveAudienceSubscribePendantPresenter liveAudience = LiveAudienceSubscribePendantPresenter.class;
       if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, uoc, liveAudience, "6")) {
          LiveSubscribePendantInfo$LiveSubscribePendantDetail mReservation = p1.mReservationId;
          String str = (p0)? "CANCEL": "REVERSE";
          y.a(mReservation, str, uoc.K.Z2.a());
          if (p0) {
             mReservation1 = p1.mReservationId;
             if (!PatchProxy.applyVoidOneRefs(mReservation1, uoc, liveAudience, "9")) {
                Activity activity = uoc.getActivity();
                if (!g.h(activity)) {
                   t$a uoa = f.e(new t$a(activity));
                   uoa.W0(R.string.arg_RES_7f102a81);
                   uoa.S0(R.string.arg_RES_7f102a8e);
                   uoa.w0(true);
                   uoa.Q0(R.string.arg_RES_7f102a80);
                   uoa.t0(new h(uoc, mReservation1));
                   uoa.v(true);
                   uoa.Y(PopupInterface.a);
                }
             }
          }else {
             mReservation1 = p1.mReservationId;
             if (!PatchProxy.applyVoidOneRefs(mReservation1, uoc, liveAudience, "11")) {
                uoc.L.a(mReservation1, 15, uoc.getActivity(), null, null, null, uoc.K.Z2.d(), false);
             }
          }
       }
    label_00b3 :
       return;
    }
    public void c(LiveSubscribePendantInfo$LiveSubscribePendantDetail p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter$c.class, "3")) {
          return;
       }
       LiveAudienceSubscribePendantPresenter$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveAudienceSubscribePendantPresenter.class, "17") && (!ta.O.getVisibility() && (ta.P.d() && !ta.R.contains(p0.mReservationId)))) {
          ta.R.add(p0.mReservationId);
          y.b(p0.mReservationId, ta.K.Z2.a());
       }
    label_0049 :
       return;
    }
    public void d(LiveSubscribePendantInfo$LiveSubscribePendantDetail p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter$c.class, "2")) {
          return;
       }
       LiveAudienceSubscribePendantPresenter$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveAudienceSubscribePendantPresenter.class, "5")) {
          y.a(p0.mReservationId, "CLOSE", ta.K.Z2.a());
          ta.P.b();
          if (!PatchProxy.applyVoid(null, ta, LiveAudienceSubscribePendantPresenter.class, "16")) {
             l0.d(ta.a9()).i(Boolean.FALSE);
          }
       }
       return;
    }
}
