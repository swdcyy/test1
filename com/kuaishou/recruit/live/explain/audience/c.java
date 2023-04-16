package com.kuaishou.recruit.live.explain.audience.c;
import im8.g;
import h41.a;
import com.kuaishou.recruit.live.explain.audience.d;
import kt4.g;
import kt4.h;
import kt4.e;
import kt4.i;
import kt4.f;
import kt4.j;
import z1.k;
import kt4.r;
import lt4.a;
import lt4.g;
import lt4.d;
import com.kuaishou.recruit.live.explain.audience.b;
import mt4.b;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import com.kuaishou.recruit.live.explain.audience.c$a;
import aq5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.c;
import lp3.e;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import crd.a;
import ga1.f;
import ga1.c;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import oy.a;
import hf3.a;
import lf3.g;
import crd.b;
import lnc.b9;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import mt4.e;
import kt4.m;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sr5.a;
import dq5.b;
import vq5.d;
import tj3.e;
import gs4.b;
import fu4.b;
import i81.g;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tj3.k;
import java.lang.System;
import java.lang.Integer;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelDisplay;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitAudiencePanelClose;
import brd.t;
import kt4.p;
import erd.g;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import lq5.a;
import com.kuaishou.commercial.reporter.data.CommercialRecruitLiveShowClickReportMessageData;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import lt4.e;
import lt4.f;
import crd.c;

public class c extends a implements g	// class@000ec4
{
    public final d A;
    public final r B;
    public final a C;
    public final g D;
    public final d E;
    public final b F;
    public final List G;
    public q H;
    public a s;
    public e t;
    public b u;
    public d v;
    public c w;
    public b x;
    public b y;
    public e z;

    public void c(){
       super();
       d uod = new d(new g(this), new h(this), new e(this), new i(this), new f(this), new j(this));
       this.A = v7;
       r or = new r();
       this.B = or;
       a uoa = new a();
       this.C = uoa;
       g og = new g();
       this.D = og;
       d uod1 = new d(or);
       this.E = uod1;
       b uob = new b(or);
       this.F = uob;
       b[] uobArray = new b[]{uoa,og,uod1,uob};
       this.G = Arrays.asList(uobArray);
       this.H = new c$a(this);
    }
    public final d P8(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.a(d.class);
    }
    public void Q(boolean p0){
       d uod = d.class;
       c uoc = c.class;
       String str = "4";
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, str)) {
          return;
       }
       super.Q(p0);
       Iterator iterator = this.G.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          c tA = this.A;
          Objects.requireNonNull(tA);
          if (PatchProxy.applyVoidOneRefs(uob, tA, uod, "7")) {
             continue ;
          }
          tA.j.remove(uob);
       }
       c tD = this.D;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoid(null, tD, g.class, str)) {
          tD.c.d();
          tD.e = false;
       }
       tD = this.E;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoid(null, tD, d.class, str)) {
          tD.b.v3(tD.f);
          a[] uoaArray = new a[true];
          uoaArray[0] = AudienceBizRelation.CHAT;
          tD.c.G5(tD.g, uoaArray);
       }
       tD = this.A;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoid(null, tD, uod, "3")) {
          if (!PatchProxy.applyVoid(null, tD, uod, "5")) {
             uod = tD.m;
             uod.Y(tD.q);
             uod.t();
          }
          tD.b.get().o(988, tD.r);
          tD.b.get().o(989, tD.r);
          tD.l.clear();
          b9.a(tD.k);
          tD.n = 0;
          tD.o = false;
          tD.p = false;
       }
       tD = this.F;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoid(null, tD, b.class, "2")) {
          tD.l = true;
          k1.m(tD.n);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tD = this.D;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoidOneRefs(p0, tD, g.class, "2")) {
          tD.d.b();
       }
       Objects.requireNonNull(this.E);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new m());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.j8();
       this.s = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.t = this.r8("LIVE_SERVICE_MANAGER");
       this.u = this.q8(b.class);
       this.v = this.r8("LIVE_ROUTER_SERVICE");
       this.z = this.r8("LIVE_LOG_REPORTER");
       this.y = this.t.a(b.class);
       this.w = this.t.a(c.class);
       this.x = this.t.a(b.class);
       c tD = this.D;
       d uod = this.P8();
       c ty = this.y;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoidTwoRefs(uod, ty, tD, g.class, "1")) {
          tD.a = uod;
          tD.b = ty;
          tD.d.c();
       }
       this.B.b = this.y;
       return;
    }
    public void x(boolean p0){
       c a;
       Object obj = this;
       g og = g.class;
       c uoc = c.class;
       String str = "3";
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), obj, uoc, str)) {
          return;
       }
       LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig liveRecruitR = a.E(LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig.class);
       if (liveRecruitR == null) {
          liveRecruitR = new LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig();
       }
       a = obj.A;
       c x = obj.x;
       liveRecruitR = liveRecruitR.mShouldShowCheckMoreJobs;
       Objects.requireNonNull(a);
       c uoc1 = 2;
       Object[] objArray = null;
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidTwoRefs(x, Boolean.valueOf(liveRecruitR), a, d.class, "1")) {
          a.m = a.k();
          if (!PatchProxy.applyVoid(objArray, a, d.class, "4")) {
             LiveStreamFeed liveStreamFe = a.d.get();
             if (liveStreamFe == null) {
                b.P(LiveLogTag.LIVE_RECRUIT.appendTag("LiveAudienceRecruitExplainPanelStateManager"), "LiveStreamFeed is null");
             }else {
                long l = a.e.get().x().M();
                a.n = l;
                if (l - null <= 0) {
                   a.n = System.currentTimeMillis();
                }
                d m = a.m;
                m.S(liveStreamFe.mTypeViewList);
                m.D(a.f.get().intValue());
                m.R(liveStreamFe.getId());
                m.C(a.n);
                m.T("explainPanel");
                m.Z().d0(uoc1);
             }
          }
          a.h = liveRecruitR;
          a.b.get().u0(988, LivePlusRecruitMessages$LiveRecruitPanelDisplay.class, a.r);
          a.b.get().u0(989, LivePlusRecruitMessages$LiveRecruitAudiencePanelClose.class, a.s);
          if (x != null) {
             a.k = x.W().subscribe(new p(a));
          }
       }
       c f = obj.F;
       a = obj.s;
       Activity activity = this.getActivity();
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(objArray, obj, uoc, "6");
       if (liveStreamPa != PatchProxyResult.class) {
       }else {
          liveStreamPa = obj.s.b().a();
       }
       c v = obj.v;
       a uoa = obj.t.a(a.class);
       Objects.requireNonNull(f);
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray1 = new Object[]{a,activity,liveStreamPa,v,uoa};
          if (!PatchProxy.applyVoid(objArray1, f, b.class, "1")) {
          label_0142 :
             f.c = a;
             f.b = activity;
             f.f = liveStreamPa;
             f.d = v;
             f.e = uoa;
             if (!PatchProxy.applyVoid(null, f, b.class, "5")) {
                f.o = a.o();
                f.p = new CommercialRecruitLiveShowClickReportMessageData();
                LiveStreamFeedWrapper mEntity = f.c.j0().mEntity;
                if (mEntity != null) {
                   f.p.mLiveStreamId = f.c.j0().mEntity.getId();
                   b p = f.p;
                   p.mTypeViewList = mEntity.mTypeViewList;
                   p.mMessageType = "explainPanel";
                }
             }
          }
       }else {
          goto label_0142 ;
       }
       uoc = obj.C;
       uoc.a = obj.y.getPlayerView();
       uoc.b = obj.u;
       uoc.c = obj.t.a(og).nc();
       uoc.d = obj.t.a(og).i7();
       c e = obj.E;
       d uod = this.P8();
       f = obj.w;
       a = obj.y;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidThreeRefs(uod, f, a, e, d.class, "1")) {
          e.c = uod;
          e.b = f;
          e.d = a;
          f.i2(e.f);
          a[] uoaArray1 = new a[]{AudienceBizRelation.CHAT};
          e.c.u5(e.g, uoaArray1);
       }
       e = obj.D;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(null, e, g.class, str)) {
          g a1 = e.a;
          e uoe = new e(e);
          a[] uoaArray = new a[]{AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW};
          a1.u5(uoe, uoaArray);
          e.c.c(c.d(new f(a1, uoe)));
       }
       Iterator iterator = obj.G.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          f = obj.A;
          Objects.requireNonNull(f);
          if (PatchProxy.applyVoidOneRefs(uob, f, d.class, "6")) {
             continue ;
          }
          f.j.add(uob);
       }
       return;
    }
}
