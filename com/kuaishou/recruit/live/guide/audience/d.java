package com.kuaishou.recruit.live.guide.audience.d;
import h41.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import lf3.g;
import hf3.a;
import fu4.b;
import lp3.c;
import lp3.i;
import android.view.View;
import rt4.e;
import msd.a;
import k51.b;
import com.kuaishou.recruit.live.guide.audience.LiveAudienceRecruitInfoGuidePendantView;
import java.util.Objects;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import tkd.b;
import tkd.d;
import os5.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sr5.a;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import vq5.d;
import com.kuaishou.recruit.live.guide.audience.e$a;
import brd.t;
import rt4.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage;
import com.kwai.robust.PatchProxyResult;
import rt4.c;

public class d extends a	// class@000eca
{
    public e$a A;
    public b B;
    public g C;
    public a s;
    public LiveTopPendantTempPlayService t;
    public boolean u;
    public d v;
    public m w;
    public View x;
    public a y;
    public i z;

    public void d(){
       super();
    }
    public void Q(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "5")) {
          return;
       }
       super.Q(p0);
       this.u = false;
       this.y.o(1035, this.C);
       this.z.a(b.class);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       p0 = b.b("LiveAudienceRecruitInfoGuidePendantPresenter::doBindView", new e(p0));
       this.x = p0;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, LiveAudienceRecruitInfoGuidePendantView.class, "1")) {
          p0.b = p0.findViewById(0x7f0a248a);
          p0.c = p0.findViewById(0x7f0a2489);
          p0.findViewById(R.id.live_recruit_info_guide_pendant_view).setBackgroundResource(d.a(-2004767397).Rg(3));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.j8();
       this.s = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.t = this.q8(LiveTopPendantTempPlayService.class);
       this.v = this.r8("LIVE_ROUTER_SERVICE");
       this.y = this.r8("LIVE_LONG_CONNECTION");
       this.A = this.q8(e$a.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.z = oi;
       this.B = oi.a(b.class);
       return;
    }
    public void x(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "4")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
          this.X7(this.B.W().subscribe(new d(this), Functions.d()));
       }
       d ty = this.y;
       c uoc = PatchProxy.apply(objArray, this, uod, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(this);
          this.C = uoc;
       }
       ty.u0(1035, LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage.class, uoc);
       return;
    }
}
