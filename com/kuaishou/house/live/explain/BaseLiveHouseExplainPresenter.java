package com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter;
import a51.c;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$a;
import nsd.u;
import rq5.a;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$c;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.LinkedHashSet;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$d;
import com.kuaishou.house.live.stat.HouseStatLogger;
import oy.a;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$f;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fq5.b;
import tj3.k;
import tj3.e;
import java.lang.System;
import aq5.d;
import java.util.Arrays;
import aq5.b;
import le1.a;
import lp3.c;
import lp3.i;
import le1.a$a;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import lf3.g;
import mq5.h;
import mq5.b;
import com.kuaishou.live.house.model.HouseLiveExplainMessage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import sr5.a;
import ah0.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import yg0.a;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import pq5.c;
import vg0.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import by5.a;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$g;
import erd.g;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public abstract class BaseLiveHouseExplainPresenter extends c	// class@000785
{
    public i A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public final a[] F;
    public final a$a G;
    public final b H;
    public c I;
    public boolean J;
    public AtomicReference K;
    public ConcurrentLinkedQueue L;
    public LinkedHashSet M;
    public h N;
    public final HouseStatLogger O;
    public final a P;
    public c Q;
    public boolean R;
    public final BaseLiveHouseExplainPresenter$f S;
    public final p T;
    public final BaseLiveHouseExplainPresenter$e U;
    public b v;
    public e w;
    public a x;
    public b y;
    public d z;
    public static final BaseLiveHouseExplainPresenter$a V;

    static {
       BaseLiveHouseExplainPresenter.V = new BaseLiveHouseExplainPresenter$a(null);
    }
    public void BaseLiveHouseExplainPresenter(){
       super();
       this.D = a.g;
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW,AudienceBizRelation.CHAT_VIDEO_VIEW,AnchorBizRelation.CHAT_WITH_GUEST};
       this.F = uoaArray;
       this.G = new BaseLiveHouseExplainPresenter$c(this);
       this.H = new BaseLiveHouseExplainPresenter$b(this);
       this.K = new AtomicReference();
       this.L = new ConcurrentLinkedQueue();
       this.M = new LinkedHashSet();
       this.N = new BaseLiveHouseExplainPresenter$d(this);
       this.O = new HouseStatLogger();
       this.P = a.e();
       this.R = true;
       this.S = new BaseLiveHouseExplainPresenter$f(this);
       this.T = s.c(new BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2(this));
       this.U = new BaseLiveHouseExplainPresenter$e(this);
    }
    public void E8(){
       BaseLiveHouseExplainPresenter tF;
       a uoa;
       long l;
       String liveStreamId;
       long l1;
       BaseLiveHouseExplainPresenter uBaseLiveHou = BaseLiveHouseExplainPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseLiveHou, "23")) {
          return;
       }
       super.E8();
       String str = "explainCard";
       String str1 = "";
       String str2 = "anchor";
       if (!PatchProxy.applyVoid(objArray, this, uBaseLiveHou, "27")) {
          this.O.role = (a.g(this.X8(), "ANCHOR"))? str2: "audience";
          tF = this.O;
          BaseLiveHouseExplainPresenter tv1 = this.v;
          if (tv1 != null) {
             liveStreamId = tv1.getLiveStreamId();
             if (liveStreamId != null) {
             label_0043 :
                tF.liveStreamId = liveStreamId;
                tF = this.O;
                tF.messageType = str;
                tv1 = this.w;
                if (tv1 != null) {
                   k ok1 = tv1.x();
                   if (ok1 != null) {
                      l1 = ok1.M();
                   label_005c :
                      tF.enterLiveTime = l1;
                   }
                }
                l1 = System.currentTimeMillis();
                goto label_005c ;
             }
          }
          liveStreamId = str1;
          goto label_0043 ;
       }
       if (!PatchProxy.applyVoid(objArray, this, uBaseLiveHou, "28")) {
          uBaseLiveHou = this.P;
          String str3 = this.X8();
          if (str3.hashCode() != 0x7355b6b5 || !str3.equals("ANCHOR")) {
             str2 = "audience";
          }
          uBaseLiveHou.c0(str2);
          BaseLiveHouseExplainPresenter tv = this.v;
          if (tv != null) {
             str3 = tv.getLiveStreamId();
             if (str3 != null) {
                str1 = str3;
             }
          }
          uBaseLiveHou.R(str1);
          uBaseLiveHou.T(str);
          tv = this.w;
          if (tv != null) {
             k ok = tv.x();
             if (ok != null) {
                l = ok.M();
             label_00a6 :
                uBaseLiveHou.C(l);
             }
          }
          l = System.currentTimeMillis();
          goto label_00a6 ;
       }
       uBaseLiveHou = this.v;
       if (uBaseLiveHou != null) {
          d uod = uBaseLiveHou.A0();
          if (uod != null) {
             tF = this.F;
             uod.u5(this.H, Arrays.copyOf(tF, tF.length));
          }
       }
       uBaseLiveHou = this.A;
       if (uBaseLiveHou != null) {
          uoa = uBaseLiveHou.c(a.class);
          if (uoa != null) {
             uoa.Jc(this.G);
          }
       }
       uBaseLiveHou = this.v;
       if (uBaseLiveHou != null) {
          uoa = uBaseLiveHou.u();
          if (uoa != null) {
             uoa.u0(1005, SCLiveLocalLifeExplainCardSignal.class, this.S);
          }
       }
       uBaseLiveHou = this.y;
       if (uBaseLiveHou != null) {
          uBaseLiveHou.Km(this.N);
       }
       uBaseLiveHou = this.O;
       uBaseLiveHou.registerSignalTimePeriod = uBaseLiveHou.calculatePeriodTime();
       this.P.Z();
       return;
    }
    public void J8(){
       a uoa;
       long l;
       if (PatchProxy.applyVoid(null, this, BaseLiveHouseExplainPresenter.class, "24")) {
          return;
       }
       super.J8();
       this.Z8();
       this.c9();
       BaseLiveHouseExplainPresenter tv = this.v;
       if (tv != null) {
          d uod = tv.A0();
          if (uod != null) {
             BaseLiveHouseExplainPresenter tF = this.F;
             uod.G5(this.H, Arrays.copyOf(tF, tF.length));
          }
       }
       tv = this.A;
       if (tv != null) {
          uoa = tv.c(a.class);
          if (uoa != null) {
             uoa.Nm(this.G);
          }
       }
       tv = this.v;
       if (tv != null) {
          uoa = tv.u();
          if (uoa != null) {
             uoa.o(1005, this.S);
          }
       }
       tv = this.y;
       if (tv != null) {
          tv.le(this.N);
       }
       tv = this.O;
       tv.leaveLiveTimePeriod = tv.calculatePeriodTime();
       this.O.reportCustomLog();
       this.P.N();
       tv = this.P;
       BaseLiveHouseExplainPresenter tw = this.w;
       if (tw != null) {
          k ok = tw.x();
          if (ok != null) {
             l = ok.K();
          label_007f :
             tv.Q(l);
             this.P.r();
             return;
          }
       }
       l = 0;
       goto label_007f ;
    }
    public boolean S8(){
       return true;
    }
    public final HouseLiveExplainMessage V8(){
       Object obj = PatchProxy.apply(null, this, BaseLiveHouseExplainPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.get();
    }
    public void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveHouseExplainPresenter.class, "6")) {
          return;
       }
       a.p(p0, "productId");
       return;
    }
    public abstract String X8();
    public void Y8(HouseLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveHouseExplainPresenter.class, "12")) {
          return;
       }
       a.p(p0, "explainMessage");
       BaseLiveHouseExplainPresenter tv = this.v;
       FeedLogCtx uFeedLogCtx = null;
       ClientContent$LiveStreamPackage liveStreamPa = (tv != null)? tv.a(): uFeedLogCtx;
       BaseLiveHouseExplainPresenter tv1 = this.v;
       BaseFragment uBaseFragmen = (tv1 != null)? tv1.b(): uFeedLogCtx;
       if (uBaseFragmen != null && liveStreamPa != null) {
          tv1 = this.x;
          if (tv1 != null) {
             uFeedLogCtx = tv1.c0();
          }
          if (!PatchProxy.applyVoidFourRefs(p0, liveStreamPa, uBaseFragmen, uFeedLogCtx, null, c.class, "12")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "HOUSE_EXPLAIN_CARD_CLOSE_BUTTON";
             HashMap hashMap = new HashMap();
             hashMap.put("business_id", a.a(p0));
             hashMap.put("card_type", a.b(p0));
             hashMap.put("item_id", p0.getMProductId());
             hashMap.put("item_type", p0.getMSource());
             uElementPack.params = a.a.q(hashMap);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
             tagPackage.params = TextUtils.I(p0.getMExtParams());
             uContentPack.tagPackage = tagPackage;
             u1.B(new ClickMetaData().setType(1).setLogPage(uBaseFragmen).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx));
          }
       }
    label_00b1 :
       this.Z8();
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, BaseLiveHouseExplainPresenter.class, "26")) {
          return;
       }
       this.J = false;
       BaseLiveHouseExplainPresenter tI = this.I;
       if (tI != null) {
          tI.g9(this.U);
       }
       tI = this.Q;
       if (tI != null) {
          tI.destroy();
       }
       this.Q = null;
       return;
    }
    public final void a9(){
       LiveStreamFeed mTypeViewLis;
       String liveStreamId;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveHouseExplainPresenter.class, "15")) {
          return;
       }
       this.P.J(true);
       this.P.V();
       if (this.R == null) {
          return;
       }
       boolean b = false;
       this.R = b;
       this.e9();
       BaseLiveHouseExplainPresenter tv = this.v;
       ClientContent$LiveStreamPackage liveStreamPa = (tv != null)? tv.a(): objArray;
       BaseLiveHouseExplainPresenter tv1 = this.v;
       BaseFragment uBaseFragmen = (tv1 != null)? tv1.b(): objArray;
       HouseLiveExplainMessage houseLiveExp = this.V8();
       a uoa = a.g();
       String str = (a.g(this.X8(), "ANCHOR"))? "anchor": "audience";
       uoa.c0(str);
       BaseLiveHouseExplainPresenter tv2 = this.v;
       if (tv2 != null) {
          LiveStreamFeedWrapper liveStreamFe = tv2.r5();
          if (liveStreamFe != null) {
             liveStreamFe = liveStreamFe.mEntity;
             if (liveStreamFe != null) {
                mTypeViewLis = liveStreamFe.mTypeViewList;
                if (mTypeViewLis != null) {
                label_0068 :
                   uoa.S(mTypeViewLis);
                   uoa.T("explainCard");
                   BaseLiveHouseExplainPresenter tv3 = this.v;
                   if (tv3 != null) {
                      liveStreamId = tv3.getLiveStreamId();
                      if (liveStreamId != null) {
                      label_007d :
                         uoa.R(liveStreamId);
                         uoa.B(c.b(houseLiveExp));
                         uoa.r();
                         if (uBaseFragmen != null && liveStreamPa != null) {
                            tv3 = this.x;
                            if (tv3 != null) {
                               objArray = tv3.c0();
                            }
                            if (!PatchProxy.applyVoidFourRefs(houseLiveExp, liveStreamPa, uBaseFragmen, objArray, null, c.class, "10")) {
                               ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                               uElementPack.action2 = "HOUSE_EXPLAIN_CARD";
                               uElementPack.params = a.a.q(c.b(houseLiveExp));
                               ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                               uContentPack.liveStreamPackage = liveStreamPa;
                               ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
                               tagPackage.params = TextUtils.I(houseLiveExp.getMExtParams());
                               uContentPack.tagPackage = tagPackage;
                               u1.B0(new ShowMetaData().setLogPage(uBaseFragmen).setType(10).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(objArray));
                            }
                         }
                      label_00f1 :
                         return;
                      }
                   }
                   liveStreamId = "";
                   goto label_007d ;
                }
             }
          }
       }
       mTypeViewLis = new Integer[b];
       goto label_0068 ;
    }
    public boolean b9(HouseLiveExplainMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseLiveHouseExplainPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "explainMessage");
       return false;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, BaseLiveHouseExplainPresenter.class, "3")) {
          return;
       }
       while (!this.L.isEmpty()) {
          Integer integer = this.L.poll();
          int i = (integer != null)? integer.intValue(): 0;
          RxBus.f.b(new a(i, 1));
       }
       return;
    }
    public final void d9(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveHouseExplainPresenter.class, "17")) {
          return;
       }
       BaseLiveHouseExplainPresenter tv = this.v;
       if (tv != null) {
          LiveStreamFeedWrapper liveStreamFe = tv.r5();
          if (liveStreamFe != null) {
             if (!liveStreamFe.isAd()) {
                liveStreamFe = null;
             }
             if (liveStreamFe != null) {
                j0 oj0 = i0.a().e(308, liveStreamFe.mEntity).d(new BaseLiveHouseExplainPresenter$g(p0, p1));
                if (p1 == null) {
                   p1 = "";
                }
                oj0.q("merchant_item_type", p1).a();
             }
          }
       }
       return;
    }
    public final void e9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveHouseExplainPresenter.class, "16")) {
          return;
       }
       BaseLiveHouseExplainPresenter tv = this.v;
       if (tv != null) {
          LiveStreamFeedWrapper liveStreamFe = tv.r5();
          if (liveStreamFe != null) {
             if (liveStreamFe.isAd()) {
                objArray = liveStreamFe;
             }
             if (objArray != null) {
                i0.a().e(282, objArray.mEntity).d(BaseLiveHouseExplainPresenter$h.b).a();
             }
          }
       }
       return;
    }
    public abstract String h9(HouseLiveExplainMessage p0);
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BaseLiveHouseExplainPresenter.class, "22")) {
          return;
       }
       this.A = this.r8("LIVE_SERVICE_MANAGER");
       this.v = this.t8("LIVE_BASIC_CONTEXT");
       this.x = this.t8("LIVE_PLAY_CALLER_CONTEXT");
       this.y = this.t8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.I = this.s8(c.class);
       this.z = this.t8("LIVE_ROUTER_SERVICE");
       this.w = this.t8("LIVE_LOG_REPORTER");
       return;
    }
    public final void j9(boolean p0){
       BaseLiveHouseExplainPresenter uBaseLiveHou = BaseLiveHouseExplainPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveHou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBaseLiveHou, "19")) {
          return;
       }
       if (p0) {
          this.D = this.C;
          BaseLiveHouseExplainPresenter tQ = this.Q;
          if (tQ != null && tQ != null) {
             tQ.a(this.B);
          }
       }else {
          this.D = a.g;
       }
       return;
    }
}
