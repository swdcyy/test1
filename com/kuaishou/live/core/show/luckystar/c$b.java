package com.kuaishou.live.core.show.luckystar.c$b;
import zb2.h0;
import com.kuaishou.live.core.show.luckystar.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import t02.a0;
import com.kwai.framework.model.user.User;
import p91.m;
import bc2.d;
import zb2.h;
import bc2.l;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import kg1.e;
import com.kuaishou.live.core.show.luckystar.k;
import java.lang.Runnable;
import ekd.k1;
import ft5.b;
import ks3.r;
import yb2.i;
import com.kuaishou.live.core.show.luckystar.LiveLuckyStarStyle;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import jga.c;
import wca.b;
import y41.i$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.core.basic.utils.e;
import y41.i;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import com.kuaishou.live.core.show.luckystar.d;
import com.kuaishou.live.core.show.luckystar.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.luckystar.e;
import com.kuaishou.live.core.show.luckystar.i;
import com.kuaishou.live.core.show.luckystar.f;
import com.kuaishou.live.core.show.luckystar.j;
import com.kuaishou.live.core.show.luckystar.g;
import pj2.c0;
import java.util.Map;
import com.kuaishou.live.core.show.share.f$b;

public class c$b implements h0	// class@000cbb
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       boolean b = (QCurrentUser.me().isLogined() && this.a.D.Z2.I().isFollowingOrFollowRequesting())? true: false;
       this.a.W8().a();
       b.c0(LiveLogTag.LUCKY_STAR, "onParticipateJoinFansGroup", "is followed", Boolean.valueOf(b));
       if (b) {
          this.a.D.r1.A1();
       }else {
          k1.s(new k(this), this.a, 100);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "6")) {
          return;
       }
       b.Z(LiveLogTag.LUCKY_STAR, "onParticipateCommentLive");
       this.a.W8().a();
       this.a.F.Zn(p0, "UNKNOWN");
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LUCKY_STAR, "onParticipateGoShopping");
       this.a.W8().a();
       this.a.D.z1.f();
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.LUCKY_STAR, "onParticipateLiveWatch");
       this.a.W8().a();
       this.a.l9(p0);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       c$b ta = this.a;
       if (ta.v.g == LiveLuckyStarStyle.LUCKY_STAR_V2) {
          ta.W8().a();
       }
       b.Z(LiveLogTag.LUCKY_STAR, "onParticipateFollowAnchor");
       c d = this.a.D;
       a0 z2 = d.Z2;
       i$a uoa = new i$a(this.a.getActivity(), z2.getLiveStreamId());
       uoa.o(z2.I());
       uoa.f(b.c(d.c.mEntity));
       uoa.m(e.j(this.a.D.c));
       uoa.n(105);
       uoa.r(true);
       uoa.a().c();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "5")) {
          return;
       }
       b.Z(LiveLogTag.LUCKY_STAR, "onParticipateShareLive");
       this.a.W8().a();
       a0 o1 = this.a.D.o1;
       if (o1 != null) {
          ImmutableMap$b uob = ImmutableMap.builder();
          String str = "";
          String str1 = k0.b(this.a.D, d.a, h.a).or(str);
          if (!TextUtils.x(str1)) {
             uob.c("username", str1);
          }
          str1 = k0.e(this.a.D, e.a, i.a, f.a, j.a, g.a).or(str);
          if (!TextUtils.x(str1)) {
             uob.c("photo", str1);
          }
          c0 uoc0 = new c0();
          uoc0.r("LIVE_LUCKY_SHARE");
          uoc0.m(3);
          uoc0.h(uob.a());
          o1.w1(uoc0);
       }
       return;
    }
}
