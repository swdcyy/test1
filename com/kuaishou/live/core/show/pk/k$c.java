package com.kuaishou.live.core.show.pk.k$c;
import com.kuaishou.live.core.show.pk.i$a;
import com.kuaishou.live.core.show.pk.k;
import java.lang.Object;
import hd2.k;
import com.kuaishou.live.core.show.pk.i$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.core.show.pk.n;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.pk.n$a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStatistic;
import t02.a0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import pp.d;
import java.lang.Math;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.pk.audience.LiveAudiencePKState;
import com.kuaishou.live.common.core.component.follow.cache.c;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.live.core.basic.activity.x;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.pk.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.pk.h;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import i81.g;
import lp3.c;
import lp3.e;
import i81.f;
import lnc.a1;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import hd2.l;
import i81.c;
import id2.h;
import brd.y;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import oq5.b;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import eg3.j$b;
import com.kuaishou.live.core.basic.bulletin.BulletinUtils;
import com.kuaishou.livestream.message.nano.LivePkMessages$LivePkGiftCritMoment;
import com.kuaishou.live.core.show.pk.k$e;

public class k$c implements i$a	// class@000d8f
{
    public int a;
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super();
    }
    public void a(){
       k.a(this);
    }
    public void b(i$b p0,long p1){
       k$c uoc = k$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoc, "10")) {
          return;
       }
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), e, n.class, "13")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       return;
    }
    public void c(i$b p0,LiveStreamMessages$SCPkStatistic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "3")) {
          return;
       }
       this.b.v.H2.h(LiveLogTag.PK, "onPkUpdate");
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, e, n.class, "6")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       return;
    }
    public void d(i$b p0,long p1){
       k$c uoc = k$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoc, "7")) {
          return;
       }
       int i = Math.round(((float)p1 / 1000.00f));
       this.b.v.H2.j(LiveLogTag.PK, "onPunish", "leftSeconds", Integer.valueOf(i), "mLastLeftSeconds ", Integer.valueOf(this.a));
       if (this.a != i) {
          this.a = i;
       }
       if (!i) {
          return;
       }else {
          k e = this.b.E;
          Objects.requireNonNull(e);
          if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), e, n.class, "10")) {
             Iterator iterator = e.a.iterator();
             while (iterator.hasNext()) {
                Objects.requireNonNull(iterator.next());
             }
          }
          return;
       }
    }
    public void e(i$b p0,LiveStreamMessages$SCPkStatistic p1){
       k ok = k.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "2")) {
          return;
       }
       this.n(LiveAudiencePKState.PLAYING);
       k$c tb = this.b;
       boolean b = true;
       tb.q = b;
       tb.v.H2.h(LiveLogTag.PK, "onPkStart");
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, e, n.class, "5")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().e(p0, p1);
          }
       }
       boolean b1 = c.b().c(this.b.P8());
       LivePlayFragment livePlayFrag = this.b.v.S.t0();
       String str = this.b.P8();
       k$c tb1 = this.b;
       Objects.requireNonNull(tb1);
       i$b uob = PatchProxy.apply(null, tb1, ok, "8");
       if (uob != PatchProxyResult.class) {
       }else if(tb1.u.a() != null){
          uob = tb1.u.a().c;
       }else {
          uob = null;
       }
       String str1 = "LIVE_PK";
       p0 = p0.a;
       ClientContent$LiveStreamPackage liveStreamPa = this.b.v.Z2.a();
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{livePlayFrag,Boolean.valueOf(b1),str,uob,str1,p0,liveStreamPa};
          if (PatchProxy.applyVoid(objArray, null, oh, "1")) {
          label_010b :
             k$c tb2 = this.b;
             Objects.requireNonNull(tb2);
             g og = g.class;
             if (!PatchProxy.applyVoid(null, tb2, ok, "13")) {
                f uof = tb2.A.a(og).nc();
                if (tb2.V8() && uof != null) {
                   int i = a1.d(R.dimen.arg_RES_7f0708ef);
                   if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb2, ok, "14")) {
                      LiveBulletinLayoutManager liveBulletin = tb2.A.a(og).i7();
                      if (tb2.V8() && liveBulletin != null) {
                         liveBulletin.i(LiveBulletinStageType.PK, new l(i));
                      }
                   }
                }
             }
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_ADVERSARY_SCREEN_CARD";
       i3 oi3 = i3.f();
       oi3.d("anchor_user_id", liveStreamPa.anchorUserId);
       oi3.d("live_stream_id", liveStreamPa.liveStreamId);
       oi3.d("type", str1);
       oi3.d("identity", p0);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$LiveStreamPackage liveStreamPa1 = new ClientContent$LiveStreamPackage();
       liveStreamPa1.anchorUserId = str;
       liveStreamPa1.liveStreamId = uob;
       liveStreamPa1.myFollow = b1;
       uContentPack.liveStreamPackage = liveStreamPa1;
       u1.C0("", livePlayFrag, 9, uElementPack, uContentPack);
       goto label_010b ;
    }
    public void f(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "11")) {
          return;
       }
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(p0, e, n.class, "14")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       h oh = new h();
       oh.a = false;
       this.b.x.onNext(oh);
       return;
    }
    public void g(i$b p0,LiveStreamMessages$SCPkStatistic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "5")) {
          return;
       }
       this.n(LiveAudiencePKState.PRE_PUNISH);
       this.b.v.H2.h(LiveLogTag.PK, "onPrePunish");
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, e, n.class, "8")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       return;
    }
    public void h(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "12")) {
          return;
       }
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(p0, e, n.class, "15")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       return;
    }
    public void i(i$b p0,LiveStreamMessages$SCPkStatistic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "6")) {
          return;
       }
       this.n(LiveAudiencePKState.PUNISH);
       this.b.v.H2.h(LiveLogTag.PK, "onPunish");
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, e, n.class, "9")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       return;
    }
    public void j(i$b p0,long p1){
       k$c uoc = k$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoc, "4")) {
          return;
       }
       int i = Math.round(((float)p1 / 1000.00f));
       if (this.a != i) {
          this.a = i;
          this.b.v.H2.j(LiveLogTag.PK, "onPkCountDown", "leftSeconds", Integer.valueOf(i), "pkId", this.b.S8());
       }
       if (!i) {
          return;
       }else {
          k e = this.b.E;
          Objects.requireNonNull(e);
          n on = n.class;
          if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), e, on, "7")) {
             Iterator iterator = e.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().j(p0, p1);
             }
          }
          return;
       }
    }
    public void k(i$b p0,boolean p1){
       a0 p1;
       k$c uoc = k$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       this.n(LiveAudiencePKState.ESTABLISHED);
       this.b.v.H2.h(LiveLogTag.PK, "onEstablished");
       uoc = this.b;
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(null, uoc, k.class, "4") && y.d(uoc.getActivity())) {
          p1 = uoc.v.p1;
          if (p1 != null) {
             p1.d();
          }
       }
       uoc = this.b;
       uoc.p = true;
       uoc.v.N().Pj(AudienceBizRelation.PK);
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), e, n.class, "4")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       return;
    }
    public void l(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "8")) {
          return;
       }
       this.n(LiveAudiencePKState.IDLE);
       k$c tb = this.b;
       tb.p = false;
       tb.q = false;
       tb.v.N().yj(AudienceBizRelation.PK);
       this.b.v.J1.b();
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(p0, e, n.class, "11")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().l(p0);
          }
       }
       BulletinUtils.c(this.b.A);
       return;
    }
    public void m(i$b p0,LivePkMessages$LivePkGiftCritMoment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "9")) {
          return;
       }
       h oh = new h();
       oh.a = true;
       oh.b = p1.startTime;
       oh.c = p1.endTime;
       this.b.x.onNext(oh);
       k e = this.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, e, n.class, "12")) {
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       return;
    }
    public final void n(LiveAudiencePKState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "13")) {
          return;
       }
       if (this.b.D.b() == null) {
          return;
       }
       this.b.D.b().r = p0;
       return;
    }
}
