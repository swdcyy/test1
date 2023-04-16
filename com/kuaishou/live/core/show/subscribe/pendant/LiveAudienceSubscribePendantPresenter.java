package com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter;
import im8.g;
import c12.f;
import java.util.HashSet;
import com.kuaishou.live.core.show.subscribe.pendant.f;
import yk2.e;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import yk2.f;
import yk2.g;
import com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter$a;
import com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a51.c;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter$3;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Boolean;
import m91.b;
import t02.a0;
import aq5.b;
import aq5.a;
import ft5.d;
import ft5.b;
import oq5.c;
import jv1.b;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ea1.a;
import tv2.a;
import pu1.m;
import p91.m;
import qo1.a;
import ls1.g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import java.lang.Integer;
import ekd.m1;
import yk2.l;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.subscribe.d$b;
import brd.t;
import ry1.b;
import com.kuaishou.live.core.show.subscribe.pendant.d;
import erd.o;
import hf3.a;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter$c;
import com.kuaishou.live.core.show.subscribe.pendant.f$b;

public class LiveAudienceSubscribePendantPresenter extends f implements g	// class@001148
{
    public a0 K;
    public d$b L;
    public b M;
    public final Set N;
    public View O;
    public final f P;
    public final x Q;
    public final Set R;
    public a S;
    public final AudienceBizRelation[] T;
    public final b U;
    public final c V;
    public h W;
    public final d X;
    public static String sLivePresenterClassName = "LiveAudienceSubscribePendantPresenter";

    public void LiveAudienceSubscribePendantPresenter(){
       super();
       this.N = new HashSet();
       this.P = new f();
       this.Q = new e(this);
       this.R = new HashSet();
       AudienceBizRelation[] uAudienceBiz = new AudienceBizRelation[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.LIVE_LINE,AudienceBizRelation.LIVE_MULTI_LINE,AudienceBizRelation.LIVE_MULTI_PK,AudienceBizRelation.PK,AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN,AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN,AudienceBizRelation.RECRUIT_EXPLAIN_PANEL};
       this.T = uAudienceBiz;
       this.U = new f(this);
       this.V = new g(this);
       this.W = new LiveAudienceSubscribePendantPresenter$a(this);
       this.X = new LiveAudienceSubscribePendantPresenter$b(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSubscribePendantPresenter.class, "1")) {
          return;
       }
       super.F8();
       this.getLifecycle().addObserver(new LiveAudienceSubscribePendantPresenter$3(this));
       return;
    }
    public void Q(boolean p0){
       LiveAudienceSubscribePendantPresenter liveAudience = LiveAudienceSubscribePendantPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, liveAudience, "8")) {
          this.P.e();
          this.K.N().G5(this.U, this.T);
          this.M.Yj(this.X);
       }
       this.K.x.Q0(this.V);
       this.N.clear();
       return;
    }
    public final String a9(){
       String obj = PatchProxy.apply(null, this, LiveAudienceSubscribePendantPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "liveSubscribePendant"+QCurrentUser.me().getId()+"_";
       a0 e = this.K.e;
       if (e != null && e.mLiveStreamId != null) {
          obj = obj+this.K.e.mLiveStreamId;
       }
       return obj;
    }
    public boolean b9(){
       LiveAudienceSubscribePendantPresenter obj = PatchProxy.apply(null, this, LiveAudienceSubscribePendantPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.S;
       if (obj != null && !obj.a()) {
          return false;
       }
       boolean b = this.K.x.H2();
       LiveAudienceSubscribePendantPresenter tK = this.K;
       a0 y0 = tK.Y0;
       if (!a.c(tK)) {
          if (y0.r2(AudienceBizRelation.VOICE_PARTY)) {
             return false;
          }else if(y0.r2(AudienceBizRelation.VOICE_PARTY_KTV)){
             return false;
          }
       }
       String str = 1;
       tK = (y0.r2(AudienceBizRelation.PK) || m.a.q(this.K.Z2))? 1: 0;
       int i = (a.e(this.K.Z2) || g.g(this.K.Z2))? 1: 0;
       int i1 = (y0.r2(AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN) || y0.r2(AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN))? 1: 0;
       boolean b1 = y0.r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL);
       tK = (!tK && (!i && (!i1 && !b1)))? 1: null;
       if (b || !tK) {
          return false;
       }else if(!this.N.isEmpty()){
          b.c0(LiveLogTag.LIVE_SUBSCRIBE, "disabled by other biz", "bizs", this.N.toString());
          return false;
       }else {
          return str;
       }
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSubscribePendantPresenter.class, "12")) {
          return;
       }
       LiveAudienceSubscribePendantPresenter tO = this.O;
       int i = (this.b9())? 0: 4;
       tO.setVisibility(i);
       b.d0(LiveLogTag.LIVE_SUBSCRIBE_PENDANT, "PendantContainerVisible", "visible", Integer.valueOf(this.O.getVisibility()), "shouldShowPendant", Boolean.valueOf(this.b9()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter.class, "3")) {
          return;
       }
       this.O = m1.f(p0, 0x7f0a262a);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceSubscribePendantPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceSubscribePendantPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceSubscribePendantPresenter.class, new l());
       }else {
          obj.put(LiveAudienceSubscribePendantPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSubscribePendantPresenter.class, "2")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.r8("LIVE_SUBSCRIBE_AUDIENCE_SERVICE");
       this.M = this.r8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       return;
    }
    public void x(boolean p0){
       LiveAudienceSubscribePendantPresenter liveAudience = LiveAudienceSubscribePendantPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "4")) {
          return;
       }
       LiveAudienceSubscribePendantPresenter tK = this.K;
       this.P.c(this.m8(), tK.C, tK.b3.W().map(d.b), this);
       LiveAudienceSubscribePendantPresenter tP = this.P;
       tP.l = this.Q;
       tP.f(new LiveAudienceSubscribePendantPresenter$c(this));
       this.K.N().u5(this.U, this.T);
       this.K.x.W0(this.V, true);
       this.M.Le(this.X);
       this.c9();
       return;
    }
}
