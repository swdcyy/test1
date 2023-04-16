package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2;
import fg3.b;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SellerRankSignal;
import brd.t;
import ks3.k0;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$init$1;
import fg3.k;
import msd.l;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b;
import kotlin.jvm.internal.a;
import iy1.g;
import lp3.c;
import lp3.e;
import iy1.l;
import ky1.c;
import lnc.b9;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$d;
import java.lang.reflect.Type;
import el.a;
import kotlin.Pair;
import pm8.a;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$c;
import java.util.HashMap;
import java.lang.Number;
import android.text.format.DateUtils;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p91.m;
import fg3.d;
import com.kwai.framework.abtest.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$1;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2;
import qrd.l1;
import fg3.a;
import ks5.b;
import ks5.c;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SellerRankStrategy;
import java.lang.Integer;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import kotlin.jvm.internal.Ref$LongRef;
import java.lang.Math;
import fg3.i;
import java.lang.Runnable;
import fg3.c;
import fg3.g;
import p63.a;
import p63.a$a;
import p63.a$b;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import jt5.b;

public class LiveMerchantHourlyRankPendantPresenterV2 extends b	// class@000cc4
{
    public LiveMerchantHourlyRankPendantPresenterV2$b A;
    public d B;
    public c C;
    public List D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public e z;
    public static final LiveMerchantHourlyRankPendantPresenterV2$a I;

    static {
       LiveMerchantHourlyRankPendantPresenterV2.I = new LiveMerchantHourlyRankPendantPresenterV2$a(null);
    }
    public void LiveMerchantHourlyRankPendantPresenterV2(){
       super();
       this.F = true;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantPresenterV2.class, "4")) {
          return;
       }
       b uob = this.r.b(926, LiveRoomSignalMessage$SellerRankSignal.class).subscribe(new k(new LiveMerchantHourlyRankPendantPresenterV2$init$1(this)), LiveMerchantHourlyRankPendantPresenterV2$e.b);
       this.u = uob;
       this.X7(uob);
       this.A = new LiveMerchantHourlyRankPendantPresenterV2$b(this);
       LiveMerchantHourlyRankPendantPresenterV2 tz = this.z;
       if (tz == null) {
          a.S("mLiveServiceManager");
       }
       LiveMerchantHourlyRankPendantPresenterV2 tA = this.A;
       a.m(tA);
       tz.a(g.class).Xb(l.g, tA);
       return;
    }
    public void R8(){
       LiveMerchantHourlyRankPendantPresenterV2 liveMerchant = LiveMerchantHourlyRankPendantPresenterV2.class;
       if (PatchProxy.applyVoid(null, this, liveMerchant, "20")) {
          return;
       }
       b9.a(this.u);
       k1.n(this);
       this.u = null;
       if (!PatchProxy.applyVoid(null, this, liveMerchant, "21")) {
          this.Y8();
          this.Z8();
       }
       liveMerchant = this.z;
       if (liveMerchant == null) {
          a.S("mLiveServiceManager");
       }
       liveMerchant.a(g.class).S8(l.g);
       this.D = null;
       liveMerchant = this.A;
       if (liveMerchant != null) {
          liveMerchant.e();
       }
       this.A = null;
       this.G = false;
       this.H = false;
       return;
    }
    public final boolean S8(){
       Object first;
       Object[] objArray1;
       Number number;
       Object[] objArray = null;
       Pair obj = PatchProxy.apply(objArray, this, LiveMerchantHourlyRankPendantPresenterV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.t0(new LiveMerchantHourlyRankPendantPresenterV2$d().getType());
       HashMap hashMap = a.q0(new LiveMerchantHourlyRankPendantPresenterV2$c().getType());
       String str = "it.first";
       if (obj != null) {
          first = obj.getFirst();
          a.o(first, str);
          if (!DateUtils.isToday(first.longValue())) {
             a.O1(objArray);
             a.N1(objArray);
             hashMap = objArray;
          }else {
             objArray = obj;
          }
          objArray1 = objArray;
       }
       int i = a.u0();
       int i1 = a.r0();
       int i2 = 1;
       if (objArray1 != null) {
          String first1 = objArray1.getFirst();
          a.o(first1, str);
          if (DateUtils.isToday(first1.longValue()) && objArray1.getSecond().intValue() >= i) {
             objArray1 = 1;
          label_007d :
             if (hashMap != null) {
                a.o(hashMap, "countMap");
                if (hashMap.isEmpty() ^ i2) {
                   Iterator iterator = hashMap.entrySet().iterator();
                   while (true) {
                      number = null;
                      while (true) {
                         if (iterator.hasNext()) {
                            Map$Entry uEntry = iterator.next();
                            first1 = uEntry.getKey();
                            if (first1 != null) {
                               b tp = this.p;
                               a.o(tp, "mLiveBasicContext");
                               if (a.g(tp.getLiveStreamId(), first1)) {
                                  if (uEntry.getValue().intValue() >= i1) {
                                     number = 1;
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                         }else if(objArray1 || number != null){
                            i2 = false;
                            break ;
                         }
                         break ;
                      }
                      return i2;
                   }
                }
             }
             number = null;
             goto label_00c8 ;
          }
       }
       objArray1 = 0;
       goto label_007d ;
    }
    public final e V8(){
       LiveMerchantHourlyRankPendantPresenterV2 obj = PatchProxy.apply(null, this, LiveMerchantHourlyRankPendantPresenterV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj == null) {
          a.S("mLiveServiceManager");
       }
       return obj;
    }
    public final d W8(){
       return this.B;
    }
    public final void X8(LiveRoomSignalMessage$SellerRankSignal p0){
       double d;
       SharedPreferences$Editor uEditor;
       LiveMerchantHourlyRankPendantPresenterV2 liveMerchant = LiveMerchantHourlyRankPendantPresenterV2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMerchant, "5")) {
          return;
       }
       a.p(p0, "signal");
       this.x = p0.rankPendantName;
       this.v = p0.jumpTabId;
       this.H = p0.inRank;
       this.w = p0.jumpSubTabId;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, liveMerchant, "6");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): f.a("merchant_rank_new");
       this.G = b;
       if (b) {
          obj = "8";
          if (!PatchProxy.applyVoidOneRefs(p0, this, liveMerchant, obj)) {
             if (!TextUtils.x(this.x)) {
                if (!PatchProxy.applyVoidOneRefs(p0, this, liveMerchant, "11")) {
                   d uod = d.class;
                   if (!PatchProxy.applyVoid(objArray, this, liveMerchant, "12") && (this.B == null && this.getContext() != null)) {
                      Context context = this.getContext();
                      a.m(context);
                      a.o(context, "context!!");
                      d uod1 = new d(context);
                      LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$1 oinitNewPend = new LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$1(this);
                      String str1 = "callback";
                      if (!PatchProxy.applyVoidOneRefs(oinitNewPend, uod1, uod, "7")) {
                         a.p(oinitNewPend, str1);
                         uod1.c = oinitNewPend;
                      }
                      LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2 oinitNewPend1 = new LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2(this);
                      if (!PatchProxy.applyVoidOneRefs(oinitNewPend1, uod1, uod, obj)) {
                         a.p(oinitNewPend1, str1);
                         uod1.d = oinitNewPend1;
                      }
                      this.B = uod1;
                   }
                label_00a7 :
                   LiveMerchantHourlyRankPendantPresenterV2 tB = this.B;
                   if (tB != null) {
                      if (!tB.t()) {
                         tB.u(p0);
                         this.t.b(tB);
                      }else {
                         tB.u(p0);
                      }
                   }
                }
             }else {
                this.Y8();
             }
             if (this.F != null && !PatchProxy.applyVoidOneRefs(p0, this, liveMerchant, "9")) {
                LiveRoomSignalMessage$SellerRankSignal sellerRankSt = p0.sellerRankStrategy;
                if (sellerRankSt != null) {
                   LiveRoomSignalMessage$SellerRankStrategy userGuideDay = sellerRankSt.userGuideDayMaxCount;
                   LiveRoomSignalMessage$SellerRankStrategy userGuideRoo = sellerRankSt.userGuideRoomMaxCount;
                   LiveRoomSignalMessage$SellerRankStrategy userGuideInt = sellerRankSt.userGuideIntervalMillis;
                   if (!PatchProxy.isSupport(liveMerchant) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(userGuideDay), Integer.valueOf(userGuideRoo), Integer.valueOf(userGuideInt), this, LiveMerchantHourlyRankPendantPresenterV2.class, "16")) {
                      int i = a.r0();
                      if (userGuideDay != a.u0()) {
                         uEditor = a.a.edit();
                         uEditor.putInt("merchantRankGuideSumMaxCount", userGuideDay);
                         g.a(uEditor);
                      }
                      if (userGuideRoo != i) {
                         uEditor = a.a.edit();
                         uEditor.putInt("merchantRankGuideMaxCount", userGuideRoo);
                         g.a(uEditor);
                      }
                      if (userGuideInt != a.s0()) {
                         uEditor = a.a.edit();
                         uEditor.putInt("merchantRankGuideShowIntervalTime", userGuideInt);
                         g.a(uEditor);
                      }
                   }
                }
                if (this.D == null) {
                   LiveRoomSignalMessage$SellerRankSignal sellerRankSt1 = p0.sellerRankStrategy;
                   if (sellerRankSt1 != null) {
                      LiveRoomSignalMessage$SellerRankStrategy userGuideUpd = sellerRankSt1.userGuideUpdateDelayMillis;
                      if (userGuideUpd != null) {
                         String str = "signal.sellerRankStrateg¡­serGuideUpdateDelayMillis";
                         a.o(userGuideUpd, str);
                         sellerRankSt1 = (!userGuideUpd.length)? 1: null;
                         if (!sellerRankSt1) {
                            userGuideUpd = p0.sellerRankStrategy.userGuideUpdateDelayMillis;
                            a.o(userGuideUpd, str);
                            List list = ArraysKt___ArraysKt.Dy(userGuideUpd);
                            this.D = list;
                            if (!q.f(list) && !this.S8()) {
                               liveMerchant = this.D;
                               a.m(liveMerchant);
                               Iterator iterator = liveMerchant.iterator();
                               while (iterator.hasNext()) {
                                  Ref$LongRef longRef = new Ref$LongRef();
                                  d = Math.random() * (double)p0.randomDelayMills;
                                  long l = iterator.next().longValue() + (long)d;
                                  longRef.element = l;
                                  k1.s(new i(longRef, this, p0), this, l);
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, liveMerchant, "17")){
          if (!TextUtils.x(this.x)) {
             b tx = this.x;
             a.o(tx, "mRankMessage");
             if (!PatchProxy.applyVoidOneRefs(tx, this, liveMerchant, "18")) {
                if (!PatchProxy.applyVoid(objArray, this, liveMerchant, "19") && (this.C == null && this.getContext() != null)) {
                   Context context1 = this.getContext();
                   a.m(context1);
                   c uoc = new c(context1);
                   uoc.c = new g(this);
                   this.C = uoc;
                }
                liveMerchant = this.C;
                if (liveMerchant != null) {
                   if (!liveMerchant.t()) {
                      liveMerchant.u(tx);
                      this.t.b(liveMerchant);
                   }else {
                      liveMerchant.u(tx);
                   }
                }
             }
          }else {
             this.Z8();
          }
       }
    label_0200 :
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantPresenterV2.class, "22")) {
          return;
       }
       LiveMerchantHourlyRankPendantPresenterV2 tB = this.B;
       if (tB != null) {
          this.t.c(tB);
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantPresenterV2.class, "23")) {
          return;
       }
       LiveMerchantHourlyRankPendantPresenterV2 tC = this.C;
       if (tC != null) {
          this.t.c(tC);
       }
       return;
    }
    public final void a9(){
       LiveMerchantHourlyRankPendantPresenterV2 liveMerchant = LiveMerchantHourlyRankPendantPresenterV2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMerchant, "13")) {
          return;
       }
       a$a uoa = a.b.a().a("isNewMerchantRankStyle", String.valueOf(this.G));
       Object obj = PatchProxy.apply(objArray, this, liveMerchant, "7");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("enableMerchantRankStyleV3", false);
       this.q.c(LiveHourlyRankType.MERCHANT_RANK, "MERCHANT_RANK", this.v, uoa.a("isNewMerchantRankStyleV3", String.valueOf(b)).a("isInRank", String.valueOf(this.H)).a("merchantSubTabId", String.valueOf(this.w)).a("entrySrc", "5").b());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantPresenterV2.class, "3")) {
          return;
       }
       super.j8();
       Object obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.z = obj;
       return;
    }
}
