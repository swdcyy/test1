package com.kuaishou.live.core.show.pk.k;
import im8.g;
import k51.c;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.core.show.pk.j;
import com.kuaishou.live.core.show.pk.k$a;
import com.kuaishou.live.core.show.pk.n;
import com.kuaishou.live.core.show.pk.k$b;
import com.kuaishou.live.core.show.pk.k$c;
import com.kuaishou.live.core.show.pk.k$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import pp.d;
import com.kuaishou.live.common.core.component.pk.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.pk.i;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.video.waynelive.LivePlayerController;
import hf3.a;
import k2b.e0;
import com.kuaishou.live.core.show.pk.i$a;
import kq5.b;
import androidx.fragment.app.c$b;
import tkd.b;
import tkd.d;
import ym5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import java.util.Objects;
import java.util.List;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.pk.i$b;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import mq5.b;
import com.kuaishou.live.core.show.pk.m;
import java.util.Map;
import java.util.HashMap;
import tj3.e;
import pb1.a;
import lp3.e;
import rs1.b;
import lp3.c;

public class k extends c implements g	// class@000d92
{
    public e A;
    public b B;
    public b C;
    public k$e D;
    public n E;
    public a F;
    public boolean G;
    public i$a H;
    public c$b I;
    public boolean p;
    public boolean q;
    public boolean r;
    public String s;
    public QLivePlayConfig t;
    public i u;
    public a0 v;
    public e w;
    public c x;
    public c y;
    public a z;
    public static String sLivePresenterClassName = "LivePkAudiencePresenter";

    public void k(boolean p0){
       super();
       this.r = false;
       this.x = PublishSubject.g();
       this.y = PublishSubject.g();
       this.C = j.a;
       this.D = new k$a(this);
       this.E = new n();
       this.F = new k$b(this);
       this.H = new k$c(this);
       this.I = new k$d(this);
    }
    public void E8(){
       boolean b;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "5")) {
          if (this.r != null) {
             this.v.H2.h(LiveLogTag.PK, "already init");
          }else {
             b.j();
             this.v.H2.h(LiveLogTag.PK, "init");
             this.s = this.v.c.getUserId();
             this.t = this.v.e;
             ok = this.u;
             if (ok != null) {
                ok.b();
             }
             ok = this.t;
             b = (ok.mIsFromLiveMate != null && ok.isLandscape())? true: false;
             this.G = b;
             k tv = this.v;
             i oi = new i(this.s, this.t, b, tv.E, tv.C, tv.Z2.b(), this.v.Z2.a(), this.H);
             this.u = ok;
             this.r = true;
          }
       }
       this.v.Z2.k().c(this.I);
       if (d.a(0x4c5dd1b8).f2() && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().i3(this.C);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "3")) {
          return;
       }
       this.v.Z2.k().a(this.I);
       k tE = this.E;
       Objects.requireNonNull(tE);
       if (!PatchProxy.applyVoid(objArray, tE, n.class, "3")) {
          tE.a.clear();
       }
       k1.n(this);
       if (this.r != null) {
          this.W8();
       }
       if (d.a(0x4c5dd1b8).f2() && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().s3(this.C);
       }
       return;
    }
    public String P8(){
       UserInfo obj = PatchProxy.apply(null, this, k.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.R8();
       if (obj != null) {
          obj = obj.mId;
          if (obj != null) {
             return obj;
          }
       }
       return "";
    }
    public UserInfo R8(){
       Object obj = PatchProxy.apply(null, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u.a() != null) {
          return this.u.a().d;
       }
       return null;
    }
    public String S8(){
       Object obj = PatchProxy.apply(null, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u.a() != null) {
          return this.u.a().a;
       }
       return "";
    }
    public boolean V8(){
       return this.p;
    }
    public void W8(){
       boolean b;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "6")) {
          return;
       }
       this.v.H2.h(LiveLogTag.PK, "release");
       Object obj = PatchProxy.apply(objArray, this, ok, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(a.t().u("SOURCE_LIVE").d("usingPkStartFlagReplacePkBiz", true)){
          b = this.V8();
       }else {
          b = this.v.N().r2(AudienceBizRelation.PK);
       }
       if (b) {
          this.v.D2.U0();
       }
       this.u.b();
       k1.n(this);
       this.G = false;
       this.v.N().yj(AudienceBizRelation.PK);
       this.r = false;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new m());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.v = this.q8(a0.class);
       this.w = this.r8("LIVE_LOG_REPORTER");
       this.z = this.t8("AUDIENCE_LIVE_REDUCE");
       e uoe = this.r8("LIVE_SERVICE_MANAGER");
       this.A = uoe;
       this.B = uoe.a(b.class);
       return;
    }
}
