package com.kuaishou.live.audience.component.follow.card.d;
import k51.c;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.protobuf.livestream.nano.LiveFollowProto$SCFollowPopup;
import qy0.d;
import lf3.g;
import hf3.a;
import com.kuaishou.live.audience.component.follow.card.d$a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment;
import qy0.g;
import java.lang.Runnable;
import e93.f;
import com.kuaishou.live.audience.component.follow.LiveAudienceFollowCardUser;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public abstract class d extends c	// class@000acd
{
    public a0 p;
    public List q;
    public c r;
    public long s;
    public long t;
    public LiveLogTag u;
    public b v;
    public static String sLivePresenterClassName = "LiveAudienceBaseActivityFollowCardPresenter";

    public void d(){
       super();
       this.q = new ArrayList();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.p.C.u0(622, LiveFollowProto$SCFollowPopup.class, new d(this));
       d tp = this.p;
       if (tp.h != null) {
          tp.y2.P4(new d$a(this));
       }
       if (this.S8() == 1) {
          this.u = LiveLogTag.ACTIVITY_FOLLOW_CARD;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.q.clear();
       this.R8();
       this.u = null;
       this.s = 0;
       this.t = 0;
       return;
    }
    public abstract LiveAudienceBaseActivityFollowCardFragment P8();
    public void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       f.h("dismissFollowCardPopup", new g(this));
       return;
    }
    public abstract int S8();
    public abstract void V8();
    public abstract void W8(LiveAudienceFollowCardUser p0);
    public abstract void X8(LiveFollowProto$SCFollowPopup p0);
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       return;
    }
}
