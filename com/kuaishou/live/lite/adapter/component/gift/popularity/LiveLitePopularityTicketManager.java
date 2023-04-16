package com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import td3.o;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import z1.k;
import xa3.a;
import nj1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import ih1.l;
import om1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import d83.a;
import c83.h;
import a83.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lj1.c;
import l73.o;
import com.kwai.framework.model.user.UserInfo;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager$b;
import a83.a$b;
import b83.a;
import t73.b;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager$2;
import crd.b;
import lnc.b9;
import brd.t;
import c83.a;
import erd.g;
import w73.c;
import erd.r;
import c83.f;
import erd.o;
import c83.g;
import c83.e;
import c83.b;
import c83.c;
import java.lang.Boolean;
import w73.s;
import java.util.Objects;
import w73.s$b;
import w73.a;
import java.lang.Integer;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.b;
import com.kuaishou.live.lite.sidebar.e$a;
import w73.v;
import ekd.k1;

public final class LiveLitePopularityTicketManager extends LifecycleManager	// class@001df0
{
    public final a c;
    public final h d;
    public final a e;
    public final a f;
    public final k g;
    public final LiveGiftSendModel h;
    public final e i;
    public final k j;
    public static final LiveLitePopularityTicketManager$a k;

    static {
       LiveLitePopularityTicketManager.k = new LiveLitePopularityTicketManager$a(null);
    }
    public void LiveLitePopularityTicketManager(LifecycleOwner p0,o p1,e p2,LiveLiteBottomBarService p3,k p4,k p5,k p6,k p7,k p8,a p9,a p10,LiveGiftSendModel p11,l p12,e p13,k p14){
       k ok = this;
       Object obj = p0;
       a obj1 = p1;
       ArrayList obj2 = p4;
       h obj3 = p11;
       Object obj4 = p12;
       Object obj5 = p13;
       c obj6 = p14;
       a.p(obj, "lifecycleOwner");
       a.p(obj1, "userStatusManager");
       a.p(p2, "liteSideBarService");
       a.p(p3, "liteBottomBarService");
       a.p(obj2, "anchorInfo");
       a.p(p5, "liveStreamFeed");
       a.p(p6, "isFollowingAnchor");
       a.p(p7, "liveStreamPackage");
       a.p(p8, "feedLogCtxSupplier");
       a.p(p9, "liteFansGroupService");
       a.p(p10, "loginDependency");
       a.p(obj3, "giftSendModel");
       a.p(obj4, "giftStoreRepository");
       a.p(obj5, "sendGiftTracer");
       a.p(obj6, "bizLogParams");
       super(p0);
       ok.g = obj2;
       ok.h = obj3;
       ok.i = obj5;
       ok.j = obj6;
       a uoa = new a(false);
       ok.c = uoa;
       obj3 = new h(obj1, uoa, obj4);
       ok.d = obj3;
       obj1 = PatchProxy.apply(null, ok, LiveLitePopularityTicketManager.class, "1");
       if (obj1 != PatchProxyResult.class) {
          obj6 = obj1;
       }else {
          Object obj7 = obj2.get();
          a.m(obj7);
          obj2 = new ArrayList();
          obj2.add(obj7);
          obj6 = new c(obj7, obj2);
       }
       a uoa1 = obj4;
       h oh = obj3;
       obj1 = new a(p5, p6, p11, obj6, p10, p13.o6(), p9, new LiveLitePopularityTicketManager$b(ok));
       ok.e = uoa1;
       obj1 = new a(p2, p3, uoa1, p7, p8, p14);
       ok.f = v9;
       LiveGiftTag lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
       lIVE_POPULAR.appendTag("LiveLitePopularityTicketManager");
       b.P(lIVE_POPULAR, "LivePopularityTicketManager init");
       uoa.b(obj, new LiveLitePopularityTicketManager$1(ok));
       oh.b(obj, new LiveLitePopularityTicketManager$2(ok));
       if (!PatchProxy.applyVoid(null, oh, h.class, "1")) {
          lIVE_POPULAR.appendTag("LiveLitePopularityTicketModel");
          b.P(lIVE_POPULAR, "fetchPopularityData start");
          b9.a(oh.l);
          oh.l = oh.j.W().doOnError(new a(oh)).filter(c.b).map(new f(oh)).filter(g.b).concatMap(new e(oh)).subscribe(new b(oh), c.b);
       }
       return;
    }
    public final void b(Boolean p0,s p1){
       boolean b;
       Integer integer;
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePopularityTicketManager.class, "4")) {
          return;
       }
       if (a.g(p0, Boolean.FALSE)) {
          this.f.c();
          return;
       }else {
          LiveLitePopularityTicketManager tf = this.f;
          Objects.requireNonNull(tf);
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(p1, tf, uoa, "2")) {
             LiveGiftTag lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
             String str = "PopularitySideBarHandler";
             lIVE_POPULAR.appendTag(str);
             b.S(lIVE_POPULAR, "addPopularityTicketEntryItem", "liveLitePopularityTicketStatus", p1);
             if (p1 instanceof s$b) {
                b = true;
                tf.f = b;
                tf.c = p1;
                if (!PatchProxy.applyVoidOneRefs(p1, tf, uoa, "10")) {
                   lIVE_POPULAR.appendTag(str);
                   b.S(lIVE_POPULAR, "addPopularitySideBarItem", "liveLiteGiftGuideStatus", p1);
                   a c = p1.a().c;
                   if (PatchProxy.isSupport(uoa)) {
                      integer = PatchProxy.applyOneRefs(Integer.valueOf(c), tf, uoa, "11");
                      if (integer != PatchProxyResult.class) {
                      }else if(c != b){
                         integer = (c != 2)? null: Integer.valueOf(3);
                      }else {
                         integer = Integer.valueOf(6);
                      }
                   }else {
                      goto label_0078 ;
                   }
                   tf.d = integer;
                   if (integer != null) {
                      int i = integer.intValue();
                      a = tf.a;
                      if (a == null) {
                         b uob = new b(tf.n, p1, tf.o, tf.p, tf.q, 9, "FANS_GIFT", "https://static.yximgs.com/udata/pkg/kwai-client-image/live_lite_attach/live_lite_quick_gift_effect.webp");
                         tf.l.f(i, a, b);
                         tf.a = a;
                      }else {
                         a.l(p1);
                      }
                   }else {
                      lIVE_POPULAR.appendTag(str);
                      b.S(lIVE_POPULAR, "addPopularitySideBarItem: replacePlan invalid!", "replacePlan", Integer.valueOf(p1.a().c));
                   }
                }
                if (tf.l.j()) {
                   tf.a(p1);
                }
             }
          }
          return;
       }
    }
    public void onDestroy(LifecycleOwner p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePopularityTicketManager.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       LiveLitePopularityTicketManager td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(null, td, h.class, "2")) {
          b.P(LiveGiftTag.LIVE_POPULARITY.appendTag("LiveLitePopularityTicketModel"), "release, when onDestroy");
          b9.a(td.l);
          td.i.b();
       }
       td = this.f;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(null, td, a.class, "1")) {
          b9.a(td.j);
          b9.a(td.k);
          td.f = false;
          td.h = true;
          td.c = null;
          a = td.a;
          if (a != null) {
             a.o();
          }
       }
       td = this.e;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(null, td, a.class, "5")) {
          k1.n(td);
       }
       return;
    }
}
