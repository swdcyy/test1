package bh0.a;
import a51.c;
import bh0.a$a;
import nsd.u;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import bh0.a$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hf3.a;
import fq5.b;
import com.kuaishou.livestream.message.nano.LiveHousePendantMessages$SCLiveHousePendant;
import lf3.g;
import com.kuaishou.house.live.lottery.view.HouseLotteryPendantView;
import kotlin.jvm.internal.a;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.house.live.lottery.HouseLotteryPendantData;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import bh0.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import sr5.a;
import ah0.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;
import java.util.Objects;
import java.lang.Long;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.System;
import ch0.a;
import android.os.CountDownTimer;
import bh0.c;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import java.lang.CharSequence;
import android.text.TextUtils;
import tkd.b;
import tkd.d;
import xx5.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import og0.b;
import java.lang.StringBuilder;
import vq5.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import kotlin.Pair;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import com.google.gson.JsonObject;
import ng0.c;
import ng0.b;
import com.google.gson.JsonElement;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import bh0.a$c;
import bh0.a$d;
import erd.g;
import crd.b;
import lp3.i;

public final class a extends c	// class@000384
{
    public m A;
    public HouseLotteryPendantView B;
    public boolean C;
    public HouseLotteryPendantData D;
    public final g E;
    public b v;
    public a w;
    public LiveTopPendantTempPlayService x;
    public i y;
    public d z;
    public static final List F;
    public static final a$a G;

    static {
       a.G = new a$a(null);
       a.F = LiveLogTag.LIVE_HOUSE.appendTag("LiveHouseLotteryPendantPresenter");
    }
    public void a(){
       super();
       this.C = true;
       this.E = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.E8();
       a tv = this.v;
       if (tv != null) {
          tv = tv.u();
          if (tv != null) {
             tv.u0(1101, LiveHousePendantMessages$SCLiveHousePendant.class, this.E);
          }
       }
       this.X8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tB = this.B;
       if (tB != null) {
          tB.e();
       }
       tB = this.v;
       if (tB != null) {
          tB = tB.u();
          if (tB != null) {
             tB.o(1101, this.E);
          }
       }
       tB = this.A;
       if (tB != null) {
          a tx = this.x;
          if (tx == null) {
             a.S("mTopPendantService");
          }
          tx.c(tB);
       }
       this.C = true;
       this.D = null;
       super.J8();
       return;
    }
    public final View S8(){
       a obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B == null) {
          View view = this.m8();
          a.o(view, "rootView");
          Context context = view.getContext();
          a.o(context, "rootView.context");
          HouseLotteryPendantView houseLottery = new HouseLotteryPendantView(context, null, 0, 6, null);
          this.B = obj;
       }
       obj = this.B;
       a.m(obj);
       return obj;
    }
    public final void V8(HouseLotteryPendantData p0){
       a x;
       HouseLotteryPendantData houseLottery = this;
       a obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(obj, houseLottery, uoa, "6")) {
          return;
       }
       a obj1 = PatchProxy.applyOneRefs(obj, houseLottery, uoa, "7");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj == null){
          b.r(a.F, "data is null");
       }else if(houseLottery.D == null){
          obj1 = houseLottery.D;
          a.m(obj1);
          if (p0.getMServerTime() - obj1.getMServerTime() <= 0) {
          }
       }
    label_0044 :
       if (!b) {
          return;
       }else {
          houseLottery.D = obj;
          a.m(p0);
          String str = "mTopPendantService";
          if (p0.getMEnableShow()) {
             if (!PatchProxy.applyVoidOneRefs(obj, houseLottery, uoa, "9")) {
                if (houseLottery.A == null) {
                   obj1 = PatchProxy.apply(null, houseLottery, uoa, "10");
                   if (obj1 != patchProxyRe) {
                   }else if(houseLottery.A == null){
                      houseLottery.A = new b(houseLottery);
                   }
                   obj1 = houseLottery.A;
                   a.m(obj1);
                   houseLottery.A = obj1;
                }
                b.P(a.F, "add pendant");
                x = houseLottery.x;
                if (x == null) {
                   a.S(str);
                }
                obj1 = houseLottery.A;
                a.m(obj1);
                x.b(obj1);
                if (houseLottery.C != null && !PatchProxy.applyVoid(null, houseLottery, uoa, "16")) {
                   x = houseLottery.v;
                   ClientContent$LiveStreamPackage liveStreamPa = (x != null)? x.a(): null;
                   obj1 = houseLottery.v;
                   BaseFragment uBaseFragmen = (obj1 != null)? obj1.b(): null;
                   if (uBaseFragmen != null && liveStreamPa != null) {
                      a w = houseLottery.w;
                      FeedLogCtx uFeedLogCtx = (w != null)? w.c0(): null;
                      if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, uBaseFragmen, uFeedLogCtx, null, c.class, "13")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "HOUSE_LOTTERY_PENDENT";
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.liveStreamPackage = liveStreamPa;
                         u1.B0(new ShowMetaData().setLogPage(uBaseFragmen).setType(10).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx));
                      }
                   }
                }
             label_0102 :
                houseLottery.C = false;
                if (!PatchProxy.applyVoidOneRefs(obj, houseLottery, uoa, "12")) {
                   View view = this.S8();
                   Objects.requireNonNull(view, "null cannot be cast to non-null type com.kuaishou.house.live.lottery.view.HouseLotteryPendantView");
                   long mEndTimeMs = p0.getMEndTimeMs();
                   String mTitle = p0.getMTitle();
                   if (!PatchProxy.isSupport(HouseLotteryPendantView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(mEndTimeMs), mTitle, view, HouseLotteryPendantView.class, "2")) {
                      view.e();
                      Long obj2 = b.a(0x3b1f7b44);
                      a.o(obj2, "Singleton.get\(HttpSntpClient::class.java\)");
                      obj2 = obj2.a();
                      if (obj2 == null) {
                         obj2 = Long.valueOf(System.currentTimeMillis());
                      }
                      a.o(obj2, "Singleton.get\(HttpSntpCl¡­ystem.currentTimeMillis\(\)");
                      long l = mEndTimeMs - obj2.longValue();
                      if (!view.b(l)) {
                         HouseLotteryPendantView.d(view, mTitle, false, 2, null);
                      }else {
                         a uoa1 = new a(view, mTitle, l, l, 1000);
                         view.e = mEndTimeMs;
                         mEndTimeMs.start();
                      }
                   }
                   view.setBackgroundUrl(p0.getMBackgroundUrl());
                   view.setOnClickListener(new c(houseLottery, obj));
                }
             }
          }else if(PatchProxy.applyVoid(null, houseLottery, uoa, "8")){
             obj = houseLottery.A;
             if (obj != null) {
                b.P(a.F, "remove pendant");
                x = houseLottery.x;
                if (x == null) {
                   a.S(str);
                }
                x.c(obj);
             }
          }
          return;
       }
    }
    public final void W8(HouseLotteryPendantData p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "14")) {
          return;
       }
       String mActionUrl = p0.getMActionUrl();
       d obj = PatchProxy.applyOneRefs(mActionUrl, this, uoa, "15");
       if (obj != PatchProxyResult.class) {
          mActionUrl = obj;
       }else if(TextUtils.isEmpty(mActionUrl)){
          obj = d.a(-734569516);
          a tv = this.v;
          String str = null;
          if (tv != null) {
             LiveStreamFeedWrapper liveStreamFe = tv.r5();
             if (liveStreamFe != null) {
                liveStreamFe = liveStreamFe.mEntity;
             label_003c :
                mActionUrl = obj.tY(mActionUrl, liveStreamFe);
                a.o(mActionUrl, "routeUrlWithTunaParam");
                uoa = this.v;
                if (uoa != null) {
                   LiveStreamFeedWrapper liveStreamFe1 = uoa.r5();
                   if (liveStreamFe1 != null) {
                      liveStreamFe1 = liveStreamFe1.mEntity;
                   label_0053 :
                      tv = this.v;
                      if (tv != null) {
                         str = tv.getLiveStreamId();
                      }
                      mActionUrl = b.a(mActionUrl, liveStreamFe1, str);
                   }
                }
                String str1 = str;
                goto label_0053 ;
             }
          }
          String str2 = str;
          goto label_003c ;
       }
       if (!TextUtils.isEmpty(mActionUrl)) {
          b.P(a.F, "jump with url : "+mActionUrl);
          uoa = this.z;
          if (uoa == null) {
             a.S("mLiveRouterManager");
          }
          a.m(mActionUrl);
          uoa.r4(mActionUrl, this.getContext());
       }
       return;
    }
    public final void X8(){
       boolean b;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       JsonObject obj = PatchProxy.apply(objArray, this, uoa, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          uoa = this.w;
          if (uoa != null) {
             LiveStreamFeedWrapper liveStreamFe = uoa.j0();
             if (liveStreamFe != null) {
                liveStreamFe = liveStreamFe.mEntity;
             label_002b :
                if (b.c(liveStreamFe).getFirst().booleanValue()) {
                   uoa = this.v;
                   LiveSceneType liveSceneTyp = (uoa != null)? uoa.u5(): objArray;
                   if (liveSceneTyp == LiveSceneType.Audience) {
                      b = true;
                   }
                }
                b = false;
             }
          }
          Object[] objArray1 = objArray;
          goto label_002b ;
       }
       if (!b) {
          return;
       }else {
          obj = new JsonObject();
          a tv = this.v;
          String liveStreamId = (tv != null)? tv.getLiveStreamId(): objArray;
          obj.c0("liveStreamId", liveStreamId);
          tv = this.v;
          if (tv != null) {
             objArray = tv.d();
          }
          obj.c0("authorId", objArray);
          this.X7(b.b().b(obj.toString()).observeOn(d.b).map(new e()).observeOn(d.a).subscribe(new a$c(this), a$d.b));
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.v = this.t8("LIVE_BASIC_CONTEXT");
       this.w = this.t8("LIVE_PLAY_CALLER_CONTEXT");
       Object obj = this.q8(LiveTopPendantTempPlayService.class);
       a.o(obj, "inject\(LiveTopPendantTempPlayService::class.java\)");
       this.x = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.y = obj;
       obj = this.r8("LIVE_ROUTER_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_ROUTER_SERVICE\)");
       this.z = obj;
       return;
    }
}
