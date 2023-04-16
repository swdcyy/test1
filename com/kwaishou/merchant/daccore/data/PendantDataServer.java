package com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kwaishou.merchant.daccore.data.PendantDataServer$a;
import nsd.u;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.kwaishou.merchant.daccore.data.PendantDataServer$compositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwaishou.merchant.daccore.data.PendantDataServer$pendantTemplates$2;
import com.kwaishou.merchant.daccore.data.PendantDataServer$allTemplateIds$2;
import com.kuaishou.bowl.data.center.data.model.MaterialMapItem;
import java.lang.String;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import zsd.u;
import java.util.Set;
import java.lang.Long;
import java.util.concurrent.ConcurrentHashMap;
import f08.f;
import f08.f$a;
import c08.a;
import crd.a;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import fg6.a;
import java.lang.Class;
import com.google.gson.Gson;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.t0;
import java.lang.Throwable;
import su.g;
import fq5.b;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import ot3.l0;
import f08.b;
import f08.b$a;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import com.kwaishou.merchant.daccore.data.PendantDataServer$b;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalData;
import b08.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwaishou.merchant.troubleshooting.core.model.LogLevel;
import n08.a;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import o08.g;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import b08.d;
import erd.g;
import b08.e;
import crd.b;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Collection;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import su.o;
import b08.k;
import tu.h;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopResourceLivePendantData;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import com.kuaishou.bowl.data.center.data.model.TriggerTiming;
import trd.s0;
import zk.d;
import com.google.gson.JsonElement;
import java.lang.Exception;
import j08.a;
import ia4.e;
import com.kwai.framework.model.router.RouteType;
import j08.b;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import ssd.e;
import ssd.e$a;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import com.kwaishou.merchant.daccore.data.PendantDataServer$c;
import com.kwaishou.merchant.daccore.data.PendantDataServer$d;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwaishou.merchant.daccore.data.PendantDataServer$e;
import hf3.a;
import lf3.g;
import com.kwai.robust.PatchProxy;
import vu.i;

public final class PendantDataServer	// class@001313
{
    public final PublishSubject a;
    public final PublishSubject b;
    public g c;
    public final p d;
    public final p e;
    public final p f;
    public String g;
    public a h;
    public String i;
    public static final PendantDataServer$a j;

    static {
       PendantDataServer.j = new PendantDataServer$a(null);
    }
    public void PendantDataServer(){
       super();
       this.a = PublishSubject.g();
       this.b = PublishSubject.g();
       this.d = s.c(PendantDataServer$compositeDisposable$2.INSTANCE);
       this.e = s.c(PendantDataServer$pendantTemplates$2.INSTANCE);
       this.f = s.c(PendantDataServer$allTemplateIds$2.INSTANCE);
    }
    public final boolean a(MaterialMapItem p0,long p1,String p2,DataSource p3){
       f$a uoa;
       String str2;
       boolean b;
       String str = p2+'_'+p1;
       p0 = p0.uniqueId;
       int i = 1;
       StringBuilder str1 = (p0 == null || u.S1(p0))? 1: null;
       if (str1) {
          str1 = str+" data uniqueId is null";
          uoa = null;
       }else {
          str1 = null;
          uoa = 1;
       }
       if (this.b().contains(Long.valueOf(p1)) && !this.h().containsKey(Long.valueOf(p1))) {
          str2 = str+" pendantTemplate has be filtered";
          b = false;
       }else {
          str2 = str1;
          b = uoa;
       }
       if (str2 != null && !u.S1(str2)) {
          i = 0;
       }
       if (!i) {
          f$a.q(f.a, this.h, str2, str, p3, false, 16, null);
       }
       return b;
    }
    public final Set b(){
       return this.f.getValue();
    }
    public final PublishSubject c(){
       return this.b;
    }
    public final a d(){
       return this.d.getValue();
    }
    public final MaterialMap e(SignalPendant p0){
       MaterialMap materialMap;
       f$a a;
       try{
          materialMap = a.a.h(p0.eventData, MaterialMap.class);
       }catch(java.lang.Exception e0){
          Throwable throwable = e0;
          a = f.a;
          PendantDataServer ti = this.i;
          Pair[] pairArray = new Pair[1];
          int i = 0;
          p0 = p0.pendantCode;
          if (p0 == null) {
             String str = "";
          }
          pairArray[i] = r0.a("pendantCode", p0);
          f$a.v(a, ti, "new signal payload deSerialize error", throwable, false, t0.j0(pairArray), 8, null);
          materialMap = null;
       }
       return materialMap;
    }
    public final PublishSubject f(){
       return this.a;
    }
    public final g g(a p0){
       String str;
       String str1;
       String liveStreamId;
       String liveId;
       MerchantAudienceParams merchantAudi;
       if (p0 != null) {
          str = p0.e();
          if (str != null) {
          label_000d :
             if (p0 != null) {
                b uob = p0.b();
                if (uob != null) {
                   str1 = uob.d();
                label_001c :
                   if (p0 != null) {
                      b uob1 = p0.b();
                      if (uob1 != null) {
                         liveStreamId = uob1.getLiveStreamId();
                      label_002a :
                         if (p0 != null) {
                            PendantLiveContext pendantLiveC = p0.d();
                            if (pendantLiveC != null) {
                               liveId = pendantLiveC.getLiveId();
                            label_0038 :
                               g og = new g(str, str1, liveStreamId, liveId);
                               if (p0 != null) {
                                  LiveMerchantBaseContext liveMerchant = p0.c();
                                  if (liveMerchant != null) {
                                     merchantAudi = liveMerchant.getMerchantAudienceParams();
                                  label_0049 :
                                     og.e = l0.m(merchantAudi);
                                     b$a.e(b.a, "getPageContext kwaiLinkInfo:"+og.e, null, 2, null);
                                     return og;
                                  }
                               }
                               merchantAudi = null;
                               goto label_0049 ;
                            }
                         }
                         liveId = null;
                         goto label_0038 ;
                      }
                   }
                   liveStreamId = null;
                   goto label_002a ;
                }
             }
             str1 = null;
             goto label_001c ;
          }
       }
       str = "LIVE_WATCH";
       goto label_000d ;
    }
    public final ConcurrentHashMap h(){
       return this.e.getValue();
    }
    public final void i(MaterialMap p0,MaterialMapItem p1,String p2){
       f$a a;
       SignalPendant throughInfo;
       PendantDataServer pendantDataS = this;
       MaterialMap materialMap = p0;
       String str = "throughParam";
       try{
          Objects.requireNonNull(DynamicPendantSwitch.a);
          if (!a.t().d("addThroughtInfoFromSignal", false)) {
             return;
          }else if(materialMap){
             MaterialMap signalPendan = materialMap.signalPendant;
             if (signalPendan != null) {
                throughInfo = signalPendan.throughInfo;
             label_0023 :
                MaterialMapItem data = p1.data;
                if (throughInfo != null && (data != null && !data.s0(str))) {
                   data.c0(str, a.a.q(throughInfo));
                   Pair[] pairArray = new Pair[]{r0.a(str, throughInfo)};
                   f$a.f(f.a, pendantDataS.i, p2, "has insertThroughParamsForSignal", t0.j0(pairArray), false, 16, null);
                }
             }
          }
          throughInfo = null;
          goto label_0023 ;
       }catch(java.lang.Exception e0){
          a = f.a;
          PendantDataServer h = e0.h;
          if (materialMap) {
             materialMap = materialMap.pendantCode;
             if (materialMap != null) {
             label_0065 :
                f$a.q(a, h, "insertThroughParamsForSignal error", materialMap, DataSource.SIGNAL, false, 16, null);
             }
          }
          String str1 = "";
          goto label_0065 ;
       }
       label_0076 :
          return;
    }
    public final boolean j(SignalPendant p0){
       SignalPendant callbackApi = p0.callbackApi;
       boolean b = false;
       String str = (callbackApi == null || u.S1(callbackApi))? 1: null;
       if (!str && (a.g(p0.callbackApi, "/rest/app/resource/service/pendant/query/material") ^ 1)) {
          b = true;
       }
       return b;
    }
    public synchronized final void k(int p0,Map p1,DataSource p2){
       k1.o(new PendantDataServer$b(this, p2, p1, p0));
    }
    public final void l(SignalData p0){
       LinkedHashMap linkedHashMa;
       f$a a;
       SignalPendant pendantCode;
       b uob;
       MaterialMap materialMap;
       ArrayList uArrayList1;
       int i2;
       String str3;
       PendantDataServer pendantDataS = this;
       f$a.u(f.a, a.d(pendantDataS.h), "start process merge new signal", false, null, 12, null);
       Objects.requireNonNull(DynamicPendantSwitch.a);
       boolean b = false;
       boolean b1 = a.t().d("needBusinessHandleDACSignal", b);
       SignalData pendantInfoL = p0.pendantInfoList;
       if (pendantInfoL != null) {
          Iterator iterator = pendantInfoL.iterator();
          ArrayList uArrayList = null;
          linkedHashMa = null;
          while (iterator.hasNext()) {
             SignalPendant signalPendan = iterator.next();
             SignalPendant needServerPr = (signalPendan != null)? signalPendan.needServerProcess: null;
             int i = 3;
             boolean b2 = (needServerPr != null && (signalPendan == null || signalPendan.action != i))? true: false;
             SignalPendant needBusiness = (signalPendan != null)? signalPendan.needBusinessHandle: null;
             boolean b3 = (needBusiness != null && (signalPendan == null || signalPendan.action != i))? true: false;
             a = f.a;
             PendantDataServer i1 = pendantDataS.i;
             StringBuilder str = "";
             pendantCode = (signalPendan != null)? signalPendan.pendantCode: null;
             str = str+pendantCode+" signal request config,action:";
             Integer integer = (signalPendan != null)? Integer.valueOf(signalPendan.action): null;
             String str1 = str+integer;
             Pair[] pairArray = new Pair[5];
             pairArray[b] = r0.a("needServerProcess", Boolean.valueOf(b2));
             pairArray[1] = r0.a("needBusinessHandle", Boolean.valueOf(b3));
             pairArray[2] = r0.a("switchOfNeedBusinessHandleDACSignal", Boolean.valueOf(b1));
             SignalPendant callbackApi = (signalPendan != null)? signalPendan.callbackApi: null;
             pairArray[i] = r0.a("callbackApi", callbackApi);
             pairArray[4] = r0.a("DACLogLevel", Integer.valueOf(LogLevel.HIGH.getLevel()));
             f$a.u(a, i1, str1, null, t0.j0(pairArray), 4, null);
             if (b1 && b3) {
                a uoa = this.h().get(Long.valueOf(signalPendan.pendantResourceId));
                String str2 = (uoa != null)? a.b(uoa): null;
                if (str2 != null) {
                   PendantDataServer h = pendantDataS.h;
                   if (h != null) {
                      RNLive rNLive = h.f();
                      if (rNLive != null) {
                         f$a.u(a, a.d(rNLive.d), "new signal "+signalPendan.pendantCode+" call RNLive signalBusinessHandle", false, null, 12, null);
                         t ot = t.create(new g(rNLive, str2, signalPendan));
                         if (ot != null) {
                            ot = ot.observeOn(d.a);
                            if (ot != null) {
                               ot = ot.doOnError(new d(pendantDataS, signalPendan));
                               if (ot != null) {
                                  uob = ot.subscribe(new e(pendantDataS, signalPendan));
                               label_015d :
                                  if (uob != null) {
                                     this.d().c(uob);
                                  }
                               }
                            }
                         }
                      }
                   }
                   uob = null;
                   goto label_015d ;
                }
             }else {
                materialMap = pendantDataS.e(signalPendan);
                if (b2) {
                   if (b1 && pendantDataS.j(signalPendan)) {
                      pendantDataS.o(signalPendan);
                   }else if(uArrayList == null){
                      uArrayList = new ArrayList();
                   }
                   uArrayList.add(signalPendan);
                }else if(materialMap != null){
                   materialMap.signalPendant = signalPendan;
                }
                if (linkedHashMa == null) {
                   linkedHashMa = new LinkedHashMap();
                }
                materialMap = linkedHashMa.put(Long.valueOf(signalPendan.pendantResourceId), materialMap);
             }
             b = 0;
          }
          uArrayList1 = uArrayList;
       }else {
          linkedHashMa = null;
          uArrayList1 = null;
       }
       b1 = (uArrayList1 == null || uArrayList1.isEmpty())? true: false;
       if (!b1) {
          b1 = (uArrayList1 == null || uArrayList1.isEmpty())? true: false;
          if (!b1) {
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = null;
             ArrayList uArrayList2 = new ArrayList();
             LinkedHashMap linkedHashMa1 = new LinkedHashMap();
             Iterator iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                SignalPendant obj = iterator1.next();
                objectRef.element = a.C(objectRef.element, obj.pendantCode+' ');
                uArrayList2.add(Long.valueOf(obj.pendantResourceId));
                Long longx = Long.valueOf(obj.pendantResourceId);
                try{
                   str3 = a.a.q(obj.throughInfo);
                   i2 = 0;
                }catch(java.lang.Exception e0){
                   Throwable throwable = e0;
                   f$a a1 = f.a;
                   PendantDataServer i3 = pendantDataS.i;
                   Pair[] pairArray1 = new Pair[1];
                   obj = obj.pendantCode;
                   if (obj == null) {
                      String str4 = "";
                   }
                   pairArray1[0] = r0.a("pendantCode", obj);
                   f$a.v(a1, i3, "new signal throughInfo serialize error", throwable, false, t0.j0(pairArray1), 8, null);
                   str3 = null;
                }
                linkedHashMa1.put(longx, str3);
             }
             f$a.u(f.a, pendantDataS.i, "requestMergeMaterialFromSignal:"+objectRef.element, false, DyTroubleShooting.c.m(), 4, null);
             o.c().p(pendantDataS.g(pendantDataS.h), uArrayList2, linkedHashMa1, "signaling", uArrayList1, new k(pendantDataS, uArrayList1, objectRef));
          label_0289 :
             materialMap = (linkedHashMa == null || linkedHashMa.isEmpty())? 1: 0;
             if (!materialMap) {
                pendantDataS.k(-1, linkedHashMa, DataSource.SIGNAL);
             }
             return;
          }
       }
       i2 = 0;
       goto label_0289 ;
    }
    public final void m(LiveRoomSignalMessage$SCKwaishopResourceLivePendantData p0){
       LiveRoomSignalMessage$SCKwaishopResourceLivePendantData sCKwaishopRe2;
       MaterialMap materialMap;
       PendantDataServer pendantDataS = this;
       LiveRoomSignalMessage$SCKwaishopResourceLivePendantData sCKwaishopRe = p0;
       f$a.u(f.a, a.d(pendantDataS.h), "start process old signal:"+sCKwaishopRe.materialId+" action:"+sCKwaishopRe.action, false, null, 12, null);
       a uoa = this.h().get(Long.valueOf(sCKwaishopRe.materialId));
       LiveRoomSignalMessage$SCKwaishopResourceLivePendantData sCKwaishopRe1 = null;
       if (uoa != null) {
          MaterialDataItem materialData = uoa.c();
          if (materialData != null) {
             materialData = materialData.triggerTimings;
             if (materialData != null) {
                Iterator iterator = materialData.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      sCKwaishopRe2 = iterator.next();
                      if (!a.g(sCKwaishopRe2.triggerName, "signaling")) {
                         continue ;
                      }
                   }else {
                      sCKwaishopRe2 = sCKwaishopRe1;
                   }
                label_006f :
                   TriggerTiming needServerPr = (sCKwaishopRe2 != null)? sCKwaishopRe2.needServerProcess: sCKwaishopRe1;
                   String str = "true";
                   LiveRoomSignalMessage$SCKwaishopResourceLivePendantData sCKwaishopRe3 = (a.g(needServerPr, str) && sCKwaishopRe.action != 3)? 1: null;
                   TriggerTiming useAgreement = (sCKwaishopRe2 != null)? sCKwaishopRe2.useAgreementMaterial: sCKwaishopRe1;
                   boolean b = a.g(useAgreement, str);
                   if (sCKwaishopRe3) {
                      this.p(sCKwaishopRe.action, sCKwaishopRe.throughInfo, sCKwaishopRe.materialId, "signaling", null);
                      break ;
                   }else if(b){
                      if (uoa != null) {
                         MaterialDataItem materialData1 = uoa.c();
                         if (materialData1 != null) {
                            sCKwaishopRe1 = materialData1.getMaterialMap();
                         }
                      }
                      if (sCKwaishopRe1 != null) {
                         pendantDataS.k(sCKwaishopRe.action, s0.k(r0.a(Long.valueOf(sCKwaishopRe.materialId), sCKwaishopRe1)), DataSource.PAGE_AGGREMENT);
                         break ;
                      }
                   }else {
                      sCKwaishopRe3 = sCKwaishopRe.action;
                      Long longx = Long.valueOf(sCKwaishopRe.materialId);
                      try{
                         materialMap = a.a.h(sCKwaishopRe.eventData, MaterialMap.class);
                      }catch(java.lang.Exception e0){
                         Pair[] pairArray = new Pair[]{r0.a("materialId", Long.valueOf(sCKwaishopRe.materialId))};
                         f$a.v(f.a, pendantDataS.i, "old signal payload deSerialize error", e0, false, t0.j0(pairArray), 8, null);
                      }
                      pendantDataS.k(sCKwaishopRe3, s0.k(r0.a(longx, materialMap)), DataSource.SIGNAL);
                      break ;
                   }
                   break ;
                }
                return;
             }
          }
       }
       sCKwaishopRe2 = sCKwaishopRe1;
       goto label_006f ;
    }
    public final void n(boolean p0,SignalPendant p1,Object p2){
       MaterialMap datas;
       MaterialMapItem materialMapI;
       Integer integer;
       PendantDataServer pendantDataS = this;
       SignalPendant signalPendan = p1;
       Pair[] obj = p2;
       MaterialMap materialMap = pendantDataS.e(signalPendan);
       if (p0) {
          int i = 1;
          String str = "new signal ";
          int i1 = 0;
          if (materialMap != null) {
             datas = materialMap.datas;
             if (datas != null && datas.size() == i) {
                datas = materialMap.datas;
                if (datas != null) {
                   materialMapI = datas.get(i1);
                   if (materialMapI != null) {
                      materialMapI = materialMapI.uniqueId;
                   label_002c :
                      String str1 = (materialMapI == null || u.S1(materialMapI))? 1: null;
                      if (!str1) {
                         if (!obj) {
                            f$a.v(f.a, pendantDataS.i, str+signalPendan.pendantCode+" business data is null", null, false, null, 28, null);
                            return;
                         }else {
                            try{
                               MaterialMap datas2 = materialMap.datas;
                               if (datas2 != null) {
                                  MaterialMapItem materialMapI2 = datas2.get(i1);
                                  if (materialMapI2 != null) {
                                     d uod = new d();
                                     uod.d();
                                     materialMapI2.data = uod.b().x(obj).r();
                                  }
                               }
                            }catch(java.lang.Exception e0){
                               f$a.v(f.a, pendantDataS.i, str+signalPendan.pendantCode+" serialize business data error: "+e0.getMessage(), null, false, null, 28, null);
                               return;
                            }
                         }
                      }
                   }
                }
                materialMapI = null;
                goto label_002c ;
             }
          }
          f$a a = f.a;
          PendantDataServer i2 = pendantDataS.i;
          String str2 = str+signalPendan.pendantCode+" datas check error";
          obj = new Pair[2];
          String str3 = "";
          if (materialMap != null) {
             MaterialMap datas1 = materialMap.datas;
             if (datas1 != null) {
                integer = Integer.valueOf(datas1.size());
             label_00e4 :
                obj[i1] = r0.a("dataSize", integer);
                if (materialMap != null) {
                   materialMap = materialMap.datas;
                   if (materialMap != null) {
                      MaterialMapItem materialMapI1 = materialMap.get(i1);
                      if (materialMapI1 != null) {
                         materialMapI1 = materialMapI1.uniqueId;
                         if (materialMapI1 != null) {
                            str3 = materialMapI1;
                         }
                      }
                   }
                }
                obj[i] = r0.a("uniqueId", str3);
                f$a.v(a, i2, str2, null, false, t0.j0(obj), 12, null);
                return;
             }
          }
          integer = str3;
          goto label_00e4 ;
       }
    label_0113 :
       SignalPendant action = signalPendan.action;
       Map map = s0.k(r0.a(Long.valueOf(signalPendan.pendantResourceId), materialMap));
       DataSource mATERIAL = (p0)? DataSource.MATERIAL: DataSource.SIGNAL;
       pendantDataS.k(action, map, mATERIAL);
       return;
    }
    public final void o(SignalPendant p0){
       b a;
       String str1;
       SignalPendant randomRangeM = p0.randomRangeMillis;
       if (randomRangeM - null <= 0 || p0.needRandomCall == null) {
          randomRangeM = 1;
       }
       f$a.u(f.a, this.i, p0.pendantCode+" signal request callback api:"+p0.callbackApi+" randomCall:"+randomRangeM, false, null, 12, null);
       if (a.a == null) {
          a.a = e.b(new e(RouteType.MERCHANT, d.b), b.class);
       }
       a = a.a;
       SignalPendant callbackApi = p0.callbackApi;
       PendantDataServer th = this.h;
       String str = "";
       if (th != null) {
          b uob = th.b();
          if (uob != null) {
             str1 = uob.d();
             if (str1 != null) {
             label_0069 :
                PendantDataServer tg = this.g;
                if (tg != null) {
                   str = tg;
                }
                SignalPendant throughInfo = p0.throughInfo;
                if (throughInfo == null) {
                   throughInfo = new LinkedHashMap();
                }
                b uob1 = a.a(callbackApi, str1, str, throughInfo).observeOn(d.a).delaySubscription(e.b.o(randomRangeM), TimeUnit.MILLISECONDS).map(new e()).doOnError(new PendantDataServer$c(this, p0)).subscribe(new PendantDataServer$d(this, p0));
                if (uob1 != null) {
                   this.d().c(uob1);
                }
                return;
             }
          }
       }
       str1 = str;
       goto label_0069 ;
    }
    public final void p(int p0,String p1,long p2,String p3,SignalPendant p4){
       PendantDataServer pendantDataS = this;
       SignalPendant signalPendan = p4;
       f$a a = f.a;
       PendantDataServer i = pendantDataS.i;
       StringBuilder str = "requestMaterialFromSignal:";
       SignalPendant pendantCode = (signalPendan)? signalPendan.pendantCode: null;
       long l = p2;
       f$a.u(a, i, str+pendantCode+'_'+l, false, DyTroubleShooting.c.m(), 4, null);
       Long[] longArray = new Long[]{Long.valueOf(p2)};
       PendantDataServer$e uoe = new PendantDataServer$e(this, p4, l, p0);
       o.c().o(pendantDataS.g(pendantDataS.h), CollectionsKt__CollectionsKt.r(longArray), s0.k(r0.a(Long.valueOf(p2), p1)), p3, p4, a);
       return;
    }
    public final void q(a p0){
       b uob = p0.b();
       String str = null;
       a uoa = (uob != null)? uob.u(): str;
       if (uoa != null) {
          uoa.o(0, this.c);
       }
       o oo = o.c();
       String str1 = p0.e();
       if (str1 == null) {
          str1 = "LIVE_WATCH";
       }
       PendantLiveContext pendantLiveC = p0.d();
       if (pendantLiveC != null) {
          str = pendantLiveC.getLiveId();
       }
       Objects.requireNonNull(oo);
       if (!PatchProxy.applyVoidTwoRefs(str1, str, oo, o.class, "22")) {
          oo.e(str1).i(str);
       }
       f$a.k(f.a, this.h, "unRegister signal", null, 4, null);
       return;
    }
}
