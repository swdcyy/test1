package com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.c;
import lh2.e;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import lh2.b;
import lh2.c;
import com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import aq5.b;
import aq5.a;
import m91.b;
import mq5.h;
import mq5.b;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import lh2.d;
import com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.LiveRedPackRainForbiddenBiz;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.activity.x;
import iw1.a;
import pu1.m;
import p91.m;
import qo1.a;
import ls1.g;
import aq5.d;
import fq5.b;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends e	// class@000ef4
{
    public a0 u;
    public BaseFragment v;
    public AudienceBizRelation[] w;
    public b x;
    public h y;
    public c z;
    public static String sLivePresenterClassName = "LiveAudienceRedPackRainForbiddenPresenter";

    public void c(){
       super();
       AudienceBizRelation[] uAudienceBiz = new AudienceBizRelation[10];
       uAudienceBiz[0] = AudienceBizRelation.PK;
       uAudienceBiz[1] = AudienceBizRelation.LIVE_LINE;
       uAudienceBiz[2] = AudienceBizRelation.LIVE_MULTI_LINE;
       uAudienceBiz[3] = AudienceBizRelation.LIVE_MULTI_PK;
       uAudienceBiz[4] = AudienceBizRelation.VOICE_PARTY;
       uAudienceBiz[5] = AudienceBizRelation.VOICE_PARTY_KTV;
       uAudienceBiz[6] = AudienceBizRelation.VOICE_PARTY_TEAM_PK;
       uAudienceBiz[7] = AudienceBizRelation.VOICE_PARTY_THEATER;
       uAudienceBiz[8] = AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN;
       uAudienceBiz[9] = AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN;
       this.w = uAudienceBiz;
       this.x = new b(this);
       this.y = new c(this);
       this.z = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.u.Y0.u5(this.x, this.w);
       this.u.D2.Km(this.y);
       c tu = this.u;
       if (tu.h != null) {
          tu.y2.P4(this.z);
       }
       this.X7(this.v.m().subscribe(new d(this), b.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.u.Y0.G5(this.x, this.w);
       this.u.D2.le(this.y);
       c tu = this.u;
       if (tu.h != null) {
          tu.y2.d5(this.z);
       }
       return;
    }
    public LiveRedPackRainForbiddenBiz P8(){
       a0 obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u.D2.U0()) {
          return LiveRedPackRainForbiddenBiz.LIVE_END;
       }
       if (!this.u.S.a()) {
          return LiveRedPackRainForbiddenBiz.PAGE_HIDE;
       }
       obj = this.u.O;
       if (obj == null || (obj.wn() || m.a.q(this.u.Z2))) {
          return LiveRedPackRainForbiddenBiz.PK;
       }
       if (a.e(this.u.Z2) || g.g(this.u.Z2)) {
          return LiveRedPackRainForbiddenBiz.LIVE_LINE;
       }
       if (this.u.Z2.A0().r2(AudienceBizRelation.VOICE_PARTY)) {
          return LiveRedPackRainForbiddenBiz.VOICE_PARTY;
       }
       return super.P8();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(c.class, null);
       return objectsByTag;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.q8(a0.class);
       this.v = this.r8("LIVE_FRAGMENT");
       return;
    }
}
