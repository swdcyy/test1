package com.kwai.live.gzone.accompanyplay.audience.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceShow;
import k37.b;
import lf3.g;
import hf3.a;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyStateRefresh;
import k37.c;
import java.lang.Long;
import com.kwai.framework.model.user.User;
import fq5.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mq5.b;
import crd.b;
import lnc.b9;
import brd.t;
import k37.a;
import brd.x;
import com.kwai.live.gzone.accompanyplay.audience.m$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;

public class m extends PresenterV2	// class@000b99
{
    public b p;
    public a q;
    public b r;
    public k0$g s;
    public k0$e t;
    public b u;

    public void m(){
       super();
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "3")) {
          b.c0(LiveLogTag.GZONE, "LiveGzoneAccompanyLongConnectRefreshPresenter", "registerLongConnect", "registerLongConnect");
          this.q.u0(740, SCGzoneAccompanyEntranceShow.class, new b(this));
          this.q.u0(742, SCGzoneAccompanyStateRefresh.class, new c(this));
       }
       return;
    }
    public void P8(long p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, om, "4")) {
          return;
       }
       if (TextUtils.n(this.p.I().getId(), QCurrentUser.ME.getId())) {
          return;
       }
       if (this.r.U0()) {
          return;
       }
       b9.a(this.u);
       this.u = t.just(Long.valueOf(p0)).compose(new a(p0)).subscribe(new m$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.q = this.r8("LIVE_LONG_CONNECTION");
       this.r = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       return;
    }
}
