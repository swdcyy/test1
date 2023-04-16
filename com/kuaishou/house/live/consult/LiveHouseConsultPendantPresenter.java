package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import h41.a;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$a;
import nsd.u;
import com.kuaishou.house.live.prerequest.a$b;
import com.kuaishou.house.live.stat.HouseStatLogger;
import oy.a;
import rq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$d;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$c;
import java.util.concurrent.atomic.AtomicReference;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$f;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;
import og0.a;
import java.lang.Boolean;
import sg0.a;
import kotlin.jvm.internal.a;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2$a;
import fq5.b;
import sg0.b$a;
import sg0.b;
import aq5.d;
import java.util.Arrays;
import aq5.a;
import aq5.b;
import le1.a;
import lp3.c;
import lp3.i;
import le1.a$a;
import hf3.a;
import lf3.g;
import tj3.k;
import tj3.e;
import com.kuaishou.house.live.stat.HouseStatLogger$PreRequestData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import og0.b;
import android.content.Context;
import vq5.d;
import xh7.b;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$b;
import qh7.b;
import qh7.a;
import pq5.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Integer;
import java.util.HashMap;
import ah0.c;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import sr5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;
import java.lang.System;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import ng0.c;
import ng0.b;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$h;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$i;
import erd.g;
import crd.b;
import kotlin.Pair;
import java.lang.Number;
import com.kuaishou.protobuf.nearby.locallife.live.nano.LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo;
import com.yxcorp.gifshow.util.rx.RxBus;
import mg0.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$g;
import io.reactivex.internal.functions.Functions;

public final class LiveHouseConsultPendantPresenter extends a	// class@000777
{
    public a$b A;
    public int B;
    public int C;
    public final HouseStatLogger D;
    public a E;
    public int F;
    public boolean G;
    public final AudienceBizRelation[] H;
    public final a$a I;
    public final b J;
    public c K;
    public boolean L;
    public AtomicReference M;
    public b N;
    public boolean O;
    public final LiveHouseConsultPendantPresenter$f P;
    public final p Q;
    public final LiveHouseConsultPendantPresenter$e R;
    public b s;
    public e t;
    public i u;
    public int v;
    public a w;
    public d x;
    public boolean y;
    public boolean z;
    public static final LiveHouseConsultPendantPresenter$a S;

    static {
       LiveHouseConsultPendantPresenter.S = new LiveHouseConsultPendantPresenter$a(null);
    }
    public void LiveHouseConsultPendantPresenter(){
       super();
       this.A = new a$b();
       this.D = new HouseStatLogger();
       this.E = a.e();
       this.F = a.g;
       AudienceBizRelation[] uAudienceBiz = new AudienceBizRelation[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW,AudienceBizRelation.CHAT_VIDEO_VIEW};
       this.H = uAudienceBiz;
       this.I = new LiveHouseConsultPendantPresenter$d(this);
       this.J = new LiveHouseConsultPendantPresenter$c(this);
       this.M = new AtomicReference();
       this.O = true;
       this.P = new LiveHouseConsultPendantPresenter$f(this);
       this.Q = s.c(new LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2(this));
       this.R = new LiveHouseConsultPendantPresenter$e(this);
    }
    public final void P8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveHouseConsultPendantPresenter liveHouseCon = LiveHouseConsultPendantPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveHouseCon, "19")) {
          return;
       }
       int i = 0;
       a uoa = (this.s != null && a1.i(this.getActivity()))? 1: null;
       if (!uoa) {
          return;
       }else {
          HouseConsultPendantMessage houseConsult = this.R8();
          if (houseConsult != null) {
             Object obj = PatchProxy.applyOneRefs(houseConsult, null, a.class, "1");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(!houseConsult.getMShowType()){
                i = 1;
             }
             b = i;
             if (b) {
                this.X8();
                return;
             }else if(this.L == null){
                this.E.K(true);
                this.E.L();
                a uoa1 = new a();
                this.N = uoa1;
                LiveHouseConsultPendantPresenter ts = this.s;
                a.m(ts);
                Activity activity = this.getActivity();
                a.m(activity);
                a.o(activity, "activity!!");
                Object obj1 = PatchProxy.apply(null, this, liveHouseCon, "7");
                LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2$a omHouseConsu = (obj1 != patchProxyRe)? obj1: this.Q.getValue();
                uoa1.c(ts, houseConsult, activity, omHouseConsu, this.B);
             }else {
                LiveHouseConsultPendantPresenter tN = this.N;
                if (tN != null) {
                   tN.b(houseConsult);
                }
             }
             this.E.I();
          }
          return;
       }
    }
    public void Q(boolean p0){
       a uoa;
       long l;
       LiveHouseConsultPendantPresenter liveHouseCon = LiveHouseConsultPendantPresenter.class;
       if (PatchProxy.isSupport(liveHouseCon) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveHouseCon, "22")) {
          return;
       }
       super.Q(p0);
       LiveHouseConsultPendantPresenter ts = this.s;
       if (ts != null) {
          d uod = ts.A0();
          if (uod != null) {
             LiveHouseConsultPendantPresenter tH = this.H;
             uod.G5(this.J, Arrays.copyOf(tH, tH.length));
          }
       }
       ts = this.u;
       if (ts != null) {
          uoa = ts.c(a.class);
          if (uoa != null) {
             uoa.Nm(this.I);
          }
       }
       ts = this.s;
       if (ts != null) {
          uoa = ts.u();
          if (uoa != null) {
             uoa.o(1027, this.P);
          }
       }
       ts = this.D;
       ts.leaveLiveTimePeriod = ts.calculatePeriodTime();
       this.D.reportCustomLog();
       this.E.N();
       ts = this.E;
       liveHouseCon = this.t;
       if (liveHouseCon != null) {
          k ok = liveHouseCon.x();
          if (ok != null) {
             l = ok.K();
          label_0079 :
             ts.Q(l);
             this.E.r();
             this.z = false;
             this.y = false;
             this.O = true;
             this.X8();
             return;
          }
       }
       l = 0;
       goto label_0079 ;
    }
    public final HouseConsultPendantMessage R8(){
       Object obj = PatchProxy.apply(null, this, LiveHouseConsultPendantPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.get();
    }
    public final a$b S8(){
       return this.A;
    }
    public final void V8(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter.class, "24")) {
          return;
       }
       HouseStatLogger$PreRequestData preRequestDa = new HouseStatLogger$PreRequestData();
       preRequestDa.liveType = p0.a;
       preRequestDa.httpContent = p0.d;
       preRequestDa.sendTimePeriod = this.D.calculatePeriodTime(p0.b);
       preRequestDa.receiveTimePeriod = this.D.calculatePeriodTime(p0.c);
       this.D.addPreRequestData(preRequestDa);
       return;
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter.class, "14")) {
          return;
       }
       if (this.getActivity() != null) {
          Activity activity = this.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             if (a1.i(activity) && !TextUtils.x(p0)) {
                if (b.d(p0)) {
                   LiveHouseConsultPendantPresenter tx = this.x;
                   if (tx != null) {
                      tx.r4(p0, activity);
                   }
                }else {
                   a.b(new b(activity, p0), new LiveHouseConsultPendantPresenter$b(this, p0));
                }
             }
          }
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, LiveHouseConsultPendantPresenter.class, "28")) {
          return;
       }
       this.L = false;
       LiveHouseConsultPendantPresenter tK = this.K;
       if (tK != null) {
          tK.g9(this.R);
       }
       tK = this.N;
       if (tK != null) {
          tK.destroy();
       }
       this.N = null;
       return;
    }
    public final void Y8(){
       LiveStreamFeed mTypeViewLis;
       String liveStreamId;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHouseConsultPendantPresenter.class, "18")) {
          return;
       }
       this.E.J(true);
       this.E.V();
       if (this.O == null) {
          return;
       }
       boolean b = false;
       this.O = b;
       LiveHouseConsultPendantPresenter ts = this.s;
       ClientContent$LiveStreamPackage liveStreamPa = (ts != null)? ts.a(): objArray;
       LiveHouseConsultPendantPresenter ts1 = this.s;
       BaseFragment uBaseFragmen = (ts1 != null)? ts1.b(): objArray;
       HouseConsultPendantMessage houseConsult = this.R8();
       a uoa = a.g();
       uoa.c0("audience");
       LiveHouseConsultPendantPresenter ts2 = this.s;
       if (ts2 != null) {
          LiveStreamFeedWrapper liveStreamFe = ts2.r5();
          if (liveStreamFe != null) {
             liveStreamFe = liveStreamFe.mEntity;
             if (liveStreamFe != null) {
                mTypeViewLis = liveStreamFe.mTypeViewList;
                if (mTypeViewLis != null) {
                label_0056 :
                   uoa.S(mTypeViewLis);
                   uoa.T("consult");
                   LiveHouseConsultPendantPresenter ts3 = this.s;
                   if (ts3 != null) {
                      liveStreamId = ts3.getLiveStreamId();
                      if (liveStreamId != null) {
                      label_006b :
                         uoa.R(liveStreamId);
                         uoa.B(c.a(houseConsult));
                         uoa.r();
                         if (uBaseFragmen != null && liveStreamPa != null) {
                            ts3 = this.w;
                            if (ts3 != null) {
                               objArray = ts3.c0();
                            }
                            if (!PatchProxy.applyVoidFourRefs(houseConsult, liveStreamPa, uBaseFragmen, objArray, null, c.class, "7")) {
                               ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                               uElementPack.action2 = "AUTHOR_CONSULT_PENDANT";
                               uElementPack.params = a.a.q(c.a(houseConsult));
                               ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                               uContentPack.liveStreamPackage = liveStreamPa;
                               u1.B0(new ShowMetaData().setLogPage(uBaseFragmen).setType(10).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(objArray));
                            }
                         }
                      label_00ce :
                         return;
                      }
                   }
                   liveStreamId = "";
                   goto label_006b ;
                }
             }
          }
       }
       mTypeViewLis = new Integer[b];
       goto label_0056 ;
    }
    public final void Z8(){
       String liveStreamId;
       LiveStreamFeed mTypeViewLis;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHouseConsultPendantPresenter.class, "23")) {
          return;
       }
       LiveHouseConsultPendantPresenter tA = this.A;
       tA.a = 38;
       tA.b = System.currentTimeMillis();
       JsonObject jsonObject = new JsonObject();
       LiveHouseConsultPendantPresenter ts = this.s;
       if (ts != null) {
          objArray = ts.d();
       }
       jsonObject.c0("authorId", objArray);
       this.y = true;
       a uoa = a.f();
       ts = this.s;
       if (ts != null) {
          liveStreamId = ts.getLiveStreamId();
          if (liveStreamId != null) {
          label_003e :
             uoa.R(liveStreamId);
             uoa.c0("audience");
             ts = this.s;
             if (ts != null) {
                LiveStreamFeedWrapper liveStreamFe = ts.r5();
                if (liveStreamFe != null) {
                   liveStreamFe = liveStreamFe.mEntity;
                   if (liveStreamFe != null) {
                      mTypeViewLis = liveStreamFe.mTypeViewList;
                      if (mTypeViewLis != null) {
                      label_005c :
                         uoa.S(mTypeViewLis);
                         uoa.T("consult");
                         uoa.z("/rest/op/vc/poi/live/commerce/building/audience/getConsultCardInfo");
                         uoa.U(jsonObject.toString());
                         long l = System.currentTimeMillis();
                         b uob = b.b().d(jsonObject.toString()).observeOn(d.b).map(new e()).observeOn(d.a).subscribe(new LiveHouseConsultPendantPresenter$h(this, uoa, l), new LiveHouseConsultPendantPresenter$i(this, uoa, l));
                         a.o(uob, "LiveHouseApiService.get\(¡­\(\)\n          }\n        }\)");
                         this.X7(uob);
                         return;
                      }
                   }
                }
             }
             mTypeViewLis = new Integer[0];
             goto label_005c ;
          }
       }
       liveStreamId = "";
       goto label_003e ;
    }
    public final void a9(HouseConsultPendantMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter.class, "3")) {
          return;
       }
       this.M.set(p0);
       return;
    }
    public final void b9(boolean p0){
       LiveHouseConsultPendantPresenter liveHouseCon = LiveHouseConsultPendantPresenter.class;
       if (PatchProxy.isSupport(liveHouseCon) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveHouseCon, "12")) {
          return;
       }
       if (p0) {
          this.F = this.C;
          LiveHouseConsultPendantPresenter tN = this.N;
          if (tN != null && (this.L != null && tN != null)) {
             tN.a(this.B);
          }
       }else {
          this.F = a.g;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveHouseConsultPendantPresenter.class, "20")) {
          return;
       }
       super.j8();
       this.s = this.t8("LIVE_BASIC_CONTEXT");
       this.u = this.r8("LIVE_SERVICE_MANAGER");
       this.w = this.t8("LIVE_PLAY_CALLER_CONTEXT");
       this.K = this.s8(c.class);
       this.x = this.t8("LIVE_ROUTER_SERVICE");
       this.t = this.t8("LIVE_LOG_REPORTER");
       return;
    }
    public void x(boolean p0){
       LiveStreamFeed mTypeViewLis;
       long l;
       String liveStreamId;
       long l1;
       LiveHouseConsultPendantPresenter liveHouseCon = LiveHouseConsultPendantPresenter.class;
       if (PatchProxy.isSupport(liveHouseCon) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveHouseCon, "21")) {
          return;
       }
       this.E = a.e();
       Object[] objArray = null;
       String str = "consult";
       String str1 = "";
       String str2 = "audience";
       if (!PatchProxy.applyVoid(objArray, this, liveHouseCon, "11")) {
          LiveHouseConsultPendantPresenter tD = this.D;
          tD.role = str2;
          LiveHouseConsultPendantPresenter ts1 = this.s;
          if (ts1 != null) {
             liveStreamId = ts1.getLiveStreamId();
             if (liveStreamId != null) {
             label_003b :
                tD.liveStreamId = liveStreamId;
                tD = this.D;
                tD.messageType = str;
                ts1 = this.t;
                if (ts1 != null) {
                   k ok1 = ts1.x();
                   if (ok1 != null) {
                      l1 = ok1.M();
                   label_0054 :
                      tD.enterLiveTime = l1;
                   }
                }
                l1 = System.currentTimeMillis();
                goto label_0054 ;
             }
          }
          liveStreamId = str1;
          goto label_003b ;
       }
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, this, liveHouseCon, "10")) {
          liveHouseCon = this.E;
          liveHouseCon.c0(str2);
          LiveHouseConsultPendantPresenter ts = this.s;
          if (ts != null) {
             LiveStreamFeedWrapper liveStreamFe1 = ts.r5();
             if (liveStreamFe1 != null) {
                liveStreamFe1 = liveStreamFe1.mEntity;
                if (liveStreamFe1 != null) {
                   mTypeViewLis = liveStreamFe1.mTypeViewList;
                   if (mTypeViewLis != null) {
                   label_007a :
                      liveHouseCon.S(mTypeViewLis);
                      ts = this.s;
                      if (ts != null) {
                         str2 = ts.getLiveStreamId();
                         if (str2 != null) {
                            str1 = str2;
                         }
                      }
                      liveHouseCon.R(str1);
                      liveHouseCon.T(str);
                      LiveHouseConsultPendantPresenter tt = this.t;
                      if (tt != null) {
                         k ok = tt.x();
                         if (ok != null) {
                            l = ok.M();
                         label_00a1 :
                            liveHouseCon.C(l);
                         }
                      }
                      l = System.currentTimeMillis();
                      goto label_00a1 ;
                   }
                }
             }
          }
          mTypeViewLis = new Integer[b];
          goto label_007a ;
       }
       liveHouseCon = this.s;
       if (liveHouseCon != null) {
          d uod = liveHouseCon.A0();
          if (uod != null) {
             LiveHouseConsultPendantPresenter tH = this.H;
             uod.u5(this.J, Arrays.copyOf(tH, tH.length));
          }
       }
       liveHouseCon = this.u;
       if (liveHouseCon != null) {
          a uoa = liveHouseCon.c(a.class);
          if (uoa != null) {
             uoa.Jc(this.I);
          }
       }
       liveHouseCon = this.w;
       if (liveHouseCon != null) {
          LiveStreamFeedWrapper liveStreamFe = liveHouseCon.j0();
          if (liveStreamFe != null) {
             liveStreamFe = liveStreamFe.mEntity;
          label_00dd :
             LiveHouseConsultPendantPresenter obj = PatchProxy.applyOneRefs(liveStreamFe, objArray, b.class, "6");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                Pair pair = b.c(liveStreamFe);
                if (pair.getFirst().booleanValue() && pair.getSecond().intValue() == 38) {
                   b = true;
                }
             }
             if (b && (this.z == null && this.y == null)) {
                this.Z8();
             }
          label_011c :
             obj = this.s;
             if (obj != null) {
                a uoa1 = obj.u();
                if (uoa1 != null) {
                   uoa1.u0(1027, LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo.class, this.P);
                }
             }
             b uob = RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new LiveHouseConsultPendantPresenter$g(this), Functions.d());
             a.o(uob, "RxBus.INSTANCE.toObserva¡­unctions.emptyConsumer\(\)\)");
             this.X7(uob);
             obj = this.D;
             obj.registerSignalTimePeriod = obj.calculatePeriodTime();
             this.E.Z();
             return;
          }
       }
       Object[] objArray1 = objArray;
       goto label_00dd ;
    }
}
