package com.kuaishou.merchant.transaction.purchase.presenter.r;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.r$a;
import com.kuaishou.merchant.transaction.purchase.presenter.r$b;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import oj0.a;
import com.kuaishou.merchant.transaction.purchase.presenter.k;
import com.kuaishou.merchant.transaction.purchase.presenter.r$e;
import android.app.Activity;
import com.yxcorp.gifshow.util.rx.RxBus;
import wd4.c;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.b;
import erd.r;
import um4.w;
import erd.g;
import crd.b;
import ce4.a;
import com.kuaishou.merchant.transaction.purchase.presenter.l;
import com.kuaishou.merchant.transaction.purchase.presenter.o;
import com.kuaishou.krn.event.a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kwai.library.widget.popup.common.c;
import ue4.o;
import com.kuaishou.merchant.transaction.base.pay.OrderEventProcessor;
import com.google.gson.JsonObject;
import vm4.e;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.System;
import lnc.b9;
import com.kuaishou.merchant.transaction.purchase.presenter.j0$b;
import com.kuaishou.merchant.transaction.purchase.presenter.y0$b;
import com.google.gson.JsonArray;
import com.kuaishou.merchant.transaction.purchase.presenter.w0$c;
import java.lang.Number;
import com.kuaishou.merchant.transaction.purchase.presenter.y$c;
import com.kuaishou.merchant.transaction.purchase.presenter.e$c;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import com.kuaishou.merchant.transaction.purchase.presenter.u0$b;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.purchase.model.PrepayParam;
import com.kuaishou.merchant.transaction.purchase.presenter.r$f;
import vm4.b;
import vm4.c;
import ojd.c;
import sm4.b;
import sm4.a;
import okhttp3.RequestBody;
import java.util.Map;
import androidx.collection.ArrayMap;
import java.lang.Throwable;
import sm4.d;
import em4.a;
import erd.o;
import cjd.e;
import um4.v;
import erd.a;
import com.kuaishou.merchant.transaction.purchase.presenter.p;
import ue4.n;
import com.kuaishou.merchant.transaction.purchase.presenter.CreateOrderPresenter$CreateOrderEventProcessor$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import ue4.g;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.purchase.presenter.r$c;
import com.kuaishou.merchant.transaction.purchase.presenter.r$d;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.purchase.presenter.o0$d;
import com.kuaishou.merchant.basic.model.AddressInfo;
import lnc.a1;
import u07.t$a;
import com.kuaishou.merchant.transaction.purchase.presenter.m;
import u07.u;
import u07.f;
import com.kuaishou.merchant.transaction.purchase.presenter.n;
import com.kwai.library.widget.popup.common.c$b;
import um4.y;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import em4.m;
import java.util.Collections;
import e17.i;
import com.kuaishou.merchant.transaction.purchase.presenter.w0$b;
import em4.p;
import com.kuaishou.merchant.transaction.purchase.presenter.l0$b;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$f;
import um4.c0;
import com.kuaishou.merchant.transaction.purchase.presenter.g0$d;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import com.kuaishou.merchant.transaction.purchase.presenter.v$b;
import kc4.c$a;

public class r extends PresenterV2 implements g	// class@0009a6
{
    public c$a A;
    public l0$b B;
    public u0$b C;
    public y$c D;
    public v$b E;
    public Map F;
    public AddressInfo G;
    public String H;
    public MerchantPurchaseFragment I;
    public a J;
    public PurchasePageParams K;
    public Handler L;
    public c M;
    public b N;
    public boolean O;
    public String P;
    public long Q;
    public PaymentMethodInfo R;
    public int S;
    public long T;
    public long U;
    public final a V;
    public r$e W;
    public String p;
    public r$h q;
    public r$g r;
    public a0$f s;
    public PaymentMethodPanelPresenter$d t;
    public j0$b u;
    public y0$b v;
    public w0$c w;
    public o0$d x;
    public g0$d y;
    public e$c z;

    public void r(){
       super();
       this.q = new r$a(this);
       this.r = new r$b(this);
       this.L = new Handler(Looper.getMainLooper());
       this.P = "";
       this.S = -1;
       k ok = PatchProxy.apply(null, this, r.class, "27");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k(this);
       }
       this.V = ok;
       return;
    }
    public static void P8(r p0){
       p0.Y8();
    }
    public void E8(){
       z a;
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "3")) {
          return;
       }
       this.W = new r$e(this.getActivity(), this, this.P);
       if (!PatchProxy.applyVoid(objArray, this, or, "4")) {
          RxBus f = RxBus.f;
          a = d.a;
          this.X7(f.f(c.class).observeOn(a).filter(b.b).subscribe(new w(this)));
          this.X7(f.f(a.class).observeOn(a).filter(l.b).subscribe(new o(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "25")) {
          a uoa = a.b();
          if (uoa == null) {
             a.g(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "registerSubmitOrderEvent: manager null");
          }else {
             uoa.a("MerchantPurchaseSubmitOrder", this.V);
          }
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, r.class, "2");
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, r.class, "6");
    }
    public void J8(){
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "5")) {
          return;
       }
       this.Q = 0;
       this.S = 0;
       this.T = 0;
       this.U = 0;
       this.R = objArray;
       o.b(this.M);
       this.M = objArray;
       r tN = this.N;
       if (tN != null) {
          tN.dispose();
       }
       tN = this.L;
       if (tN != null) {
          tN.removeCallbacksAndMessages(objArray);
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "26")) {
          a uoa = a.b();
          if (uoa != null) {
             uoa.c("MerchantPurchaseSubmitOrder", this.V);
          }
       }
       or = this.W;
       if (or != null) {
          or.d();
       }
       return;
    }
    public void R8(boolean p0,int p1,JsonObject p2){
       String str15;
       String str16;
       r or2;
       String str17;
       String str18;
       String str19;
       JsonObject jsonObject;
       r$c uoc;
       String str21;
       JsonObject jsonObject1;
       JsonObject jsonObject2;
       long l;
       JsonObject jsonObject4;
       PaymentMethodInfo paymentMetho1;
       PaymentMethodInfo mProvider;
       String obj3;
       r or = this;
       int i = p1;
       p obj = p2;
       e uoe = e.class;
       r or1 = r.class;
       if (PatchProxy.isSupport(or1) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, r.class, "10")) {
          return;
       }
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       a.s(pURCHASE, "CreateOrderPresenter", "createOrder: first "+p0+", type "+i);
       or.T = System.currentTimeMillis();
       b9.a(or.N);
       String str = "carrierEntry";
       String str1 = "carrierType";
       String str2 = "CreateOrderPresenter";
       String str3 = "carrierId";
       String str4 = "payProvider";
       String str5 = "agreementInfo";
       String str6 = "mobile";
       String str7 = "rechargeAccountParam";
       String str8 = "";
       JsonElement String str9 = "transparentCreateOrderParam";
       String str10 = "userAuthenticationId";
       String str11 = "PurchaseUtils";
       String str12 = "cpsParam";
       String str13 = "12";
       String str14 = "extInfo";
       if (PatchProxy.isSupport(or1)) {
          ArrayMap obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p1), obj, or, or1, str13);
          if (obj1 != PatchProxyResult.class) {
             str15 = str3;
             str16 = str13;
             or2 = or1;
             str17 = str6;
             str18 = str;
             str19 = str1;
             jsonObject = obj1;
             str5 = str4;
             str4 = str5;
          label_044d :
             r$f uof = new r$f();
             t ot = PatchProxy.applyTwoRefs(jsonObject, uof, null, b.class, "3");
             if (ot != PatchProxyResult.class) {
             }else if(c.a()){
                c uoc1 = c.d(jsonObject);
                uof.a = uoc1;
                ot = a.a().d(uoc1);
             }else {
                String str20 = "freightInsurance";
                r$f uof1 = uof;
                str21 = "serverExpTag";
                str11 = "traceTag";
                String str22 = "preCreateParam";
                String str23 = "saleAuthorization";
                String str24 = "providerChannelType";
                str16 = "remark";
                obj1 = PatchProxy.applyOneRefs(jsonObject, null, uoe, str16);
                if (obj1 != PatchProxyResult.class) {
                }else {
                   try{
                      obj1 = new ArrayMap();
                      if (jsonObject != null) {
                         jsonObject1 = jsonObject.d0();
                         JsonElement jsonElement = jsonObject1.e0(str9);
                         if (jsonElement != null) {
                            obj1.put(str9, jsonElement.w());
                            jsonObject1.z0(str9);
                         }
                         str9 = jsonObject1.e0(str15);
                         if (str9 != null) {
                            obj1.put(str15, str9.w());
                            jsonObject1.z0(str15);
                         }
                         str9 = jsonObject1.e0(str19);
                         if (str9 != null) {
                            obj1.put(str19, str9.w());
                            jsonObject1.z0(str19);
                         }
                         str9 = jsonObject1.e0(str18);
                         if (str9 != null) {
                            obj1.put(str18, str9.w());
                            jsonObject1.z0(str18);
                         }
                         str9 = str14;
                         JsonElement jsonElement1 = jsonObject1.e0(str9);
                         if (jsonElement1 != null) {
                            obj1.put(str9, jsonElement1.toString());
                            jsonObject1.z0(str9);
                         }
                         str9 = str12;
                         jsonElement1 = jsonObject1.e0(str9);
                         if (jsonElement1 != null) {
                            obj1.put(str9, jsonElement1.toString());
                            jsonObject1.z0(str9);
                         }
                         str9 = jsonObject1.e0(str23);
                         if (str9 != null) {
                            obj1.put(str23, str9.w());
                            jsonObject1.z0(str23);
                         }
                         JsonElement jsonElement2 = jsonObject1.e0(str11);
                         if (jsonElement2 != null) {
                            obj1.put(str11, jsonElement2.w());
                            jsonObject1.z0(str11);
                         }
                         jsonElement2 = jsonObject1.e0(str21);
                         if (jsonElement2 != null) {
                            obj1.put(str21, jsonElement2.w());
                            jsonObject1.z0(str21);
                         }
                         jsonElement2 = jsonObject1.e0("serverExpTagList");
                         if (jsonElement2 != null) {
                            obj1.put("serverExpTagList", jsonElement2.w());
                            jsonObject1.z0("serverExpTagList");
                         }
                         jsonElement2 = jsonObject1.e0("likeExpTag");
                         if (jsonElement2 != null) {
                            obj1.put("likeExpTag", jsonElement2.w());
                            jsonObject1.z0("likeExpTag");
                         }
                         jsonElement2 = jsonObject1.e0("act");
                         if (jsonElement2 != null) {
                            obj1.put("act", jsonElement2.w());
                            jsonObject1.z0("act");
                         }
                         jsonElement2 = jsonObject1.e0(str20);
                         if (jsonElement2 != null) {
                            obj1.put(str20, Integer.valueOf(jsonElement2.p()));
                            jsonObject1.z0(str20);
                         }
                         str23 = str17;
                         JsonElement jsonElement3 = jsonObject1.e0(str23);
                         if (jsonElement3 != null) {
                            obj1.put(str23, jsonElement3.w());
                            jsonObject1.z0(str23);
                         }
                         str23 = str16;
                         jsonElement3 = jsonObject1.e0(str23);
                         if (jsonElement3 != null) {
                            obj1.put(str23, jsonElement3.w());
                            jsonObject1.z0(str23);
                         }
                         str23 = str10;
                         jsonElement3 = jsonObject1.e0(str23);
                         if (jsonElement3 != null) {
                            obj1.put(str23, Long.valueOf(jsonElement3.t()));
                            jsonObject1.z0(str23);
                         }
                         str23 = str7;
                         jsonElement3 = jsonObject1.e0(str23);
                         if (jsonElement3 != null) {
                            obj1.put(str23, jsonElement3.toString());
                            jsonObject1.z0(str23);
                         }
                         str23 = str4;
                         jsonElement3 = jsonObject1.e0(str23);
                         if (jsonElement3 != null) {
                            obj1.put(str23, jsonElement3.toString());
                            jsonObject1.z0(str23);
                         }
                         str23 = str5;
                         jsonElement3 = jsonObject1.e0(str23);
                         if (jsonElement3 != null) {
                            obj1.put(str23, jsonElement3.w());
                            jsonObject1.z0(str23);
                         }
                         str23 = str24;
                         jsonElement3 = jsonObject1.e0(str23);
                         if (jsonElement3 != null) {
                            obj1.put(str23, jsonElement3.w());
                            jsonObject1.z0(str23);
                         }
                         str23 = str22;
                         jsonElement3 = jsonObject1.e0(str23);
                         if (jsonElement3 != null) {
                            obj1.put(str23, jsonElement3.w());
                            jsonObject1.z0(str23);
                         }
                         Iterator iterator = jsonObject1.entrySet().iterator();
                         while (iterator.hasNext()) {
                            Map$Entry uEntry = iterator.next();
                            str3 = uEntry.getKey();
                            obj1.put(str3, uEntry.getValue().toString());
                         }
                      }
                   }catch(java.lang.Exception e0){
                      a.l(MerchantTransactionLogBiz.PURCHASE, str11, "convertJsonToFormForPageInfo failed", e0);
                   }
                }
             }
             or = this;
             ot = ot.retryWhen(new d(or.J, uof)).map(new e()).subscribeOn(d.b).observeOn(d.a).doFinally(new v(or));
             obj = new p(or);
             if (PatchProxy.isSupport(or2)) {
                uoc = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), jsonObject, or, or2, "13");
                if (uoc != PatchProxyResult.class) {
                }else {
                label_06a1 :
                   n.a(2, str8);
                   Activity activity = this.getActivity();
                   if (activity == null) {
                      a.s(MerchantTransactionLogBiz.PURCHASE, str2, "create CreateOrderErrorConsumer failed for null activity");
                   }
                   r w = or.W;
                   if (w == null || (!PatchProxy.applyVoidOneRefs(jsonObject, w, r$e.class, "1") && jsonObject != null)) {
                      w.h = g.c(jsonObject.toString(), new CreateOrderPresenter$CreateOrderEventProcessor$1(w).getType());
                   }
                label_06dc :
                   if (activity == null) {
                      uoc = new r$c(or, null);
                   }else {
                      uoc = new r$d(this, activity, p0, jsonObject, or.W);
                   }
                }
             }else {
                goto label_06a1 ;
             }
             or.N = ot.subscribe(obj, uoc);
             return;
          }
       }
       String str25 = 3;
       if (i != 1 && (i == 2 || (i == str25 && obj != null))) {
          jsonObject2 = p2.d0();
          str15 = str3;
          str16 = str13;
          or2 = or1;
          str17 = str6;
          str18 = str;
          str19 = str1;
       }else {
          jsonObject2 = new JsonObject();
          r k = or.K;
          r h = or.H;
          str25 = or.u.b();
          str16 = str13;
          str13 = or.v.a();
          String str26 = str;
          int i1 = or.v.d();
          String str27 = str1;
          JsonArray jsonArray = or.w.a();
          String str28 = str3;
          str17 = str6;
          PaymentMethodInfo obj2 = PatchProxy.apply(null, or, or1, "22");
          if (obj2 != PatchProxyResult.class) {
             l = obj2.longValue();
          }else {
             l = -1;
             int i2 = 0;
             if (or.D.a() - i2 > 0) {
                l = or.D.a();
             }
             if (or.E.a() - i2 > 0) {
                l = or.E.a();
             }
          }
          jsonObject1 = or.z.b();
          PaymentMethodInfo paymentMetho = or.t.a();
          or2 = or1;
          JsonObject jsonObject3 = or.C.b();
          if (PatchProxy.isSupport(uoe)) {
             Object[] objArray = new Object[11];
             objArray[0] = jsonObject2;
             objArray[1] = k;
             objArray[2] = h;
             objArray[3] = str25;
             objArray[4] = str13;
             objArray[5] = Integer.valueOf(i1);
             objArray[6] = jsonArray;
             objArray[7] = Long.valueOf(l);
             objArray[8] = jsonObject1;
             objArray[9] = paymentMetho;
             objArray[10] = jsonObject3;
             jsonObject4 = jsonObject3;
             paymentMetho1 = paymentMetho;
             if (PatchProxy.applyVoid(objArray, null, uoe, "10")) {
                str18 = str26;
                str19 = str27;
                str15 = str28;
             }
          }else {
             jsonObject4 = jsonObject3;
             paymentMetho1 = paymentMetho;
          }
          jsonObject2.a0("reqVersion", Integer.valueOf(1));
          if (!TextUtils.isEmpty(h)) {
             jsonObject2.c0(str9, h);
          }else {
             a.s(pURCHASE, str11, "transfer params is empty");
          }
          JsonObject jsonObject5 = e.c("MerchantPurchaseCommitData");
          if (jsonObject5 != null) {
             Iterator iterator1 = jsonObject5.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                str19 = uEntry1.getKey();
                jsonObject2.G(str19, uEntry1.getValue());
             }
          }
          if (!TextUtils.isEmpty(str25)) {
             str21 = str17;
             jsonObject2.c0(str21, str25);
          }else {
             str21 = str17;
          }
          if (k != null) {
             if (!TextUtils.isEmpty(k.mCarrierId)) {
                str15 = str28;
                jsonObject2.c0(str15, k.mCarrierId);
             }else {
                str15 = str28;
             }
             if (!TextUtils.isEmpty(k.mCarrierType)) {
                str19 = str27;
                jsonObject2.c0(str19, k.mCarrierType);
             }else {
                str19 = str27;
             }
             if (!TextUtils.isEmpty(k.mCarrierEntry)) {
                str18 = str26;
                jsonObject2.c0(str18, k.mCarrierEntry);
             }else {
                str18 = str26;
             }
             if (!TextUtils.isEmpty(k.mExtType) || !TextUtils.x(k.mExtValue)) {
                JsonObject jsonObject6 = new JsonObject();
                str6 = str14;
                jsonObject2.G(str6, jsonObject6);
                str17 = str21;
                if (!TextUtils.isEmpty(k.mExtType)) {
                   str14 = str6;
                   jsonObject6.c0("extType", k.mExtType);
                }else {
                   str14 = str6;
                }
                if (!TextUtils.isEmpty(k.mExtValue)) {
                   jsonObject6.c0("extValue", k.mExtValue);
                }
             }else {
                str17 = str21;
             }
             if (TextUtils.isEmpty(k.mPromoteId) && (!TextUtils.isEmpty(k.mPromoteChannel) || !TextUtils.isEmpty(k.mKwaiMerchantCpsTrack))) {
                jsonObject5 = new JsonObject();
                str25 = str12;
                jsonObject2.G(str25, jsonObject5);
                if (!TextUtils.isEmpty(k.mPromoteId)) {
                   str12 = str25;
                   jsonObject5.c0("promoteId", k.mPromoteId);
                }else {
                   str12 = str25;
                }
                if (!TextUtils.isEmpty(k.mPromoteChannel)) {
                   jsonObject5.c0("promoteChannel", k.mPromoteChannel);
                }
                if (!TextUtils.isEmpty(k.mKwaiMerchantCpsTrack)) {
                   jsonObject5.c0("kwaiMerchantCpsTrack", k.mKwaiMerchantCpsTrack);
                }
             }
             if (!TextUtils.isEmpty(k.mSaleAuthorization)) {
                jsonObject2.c0("saleAuthorization", k.mSaleAuthorization);
             }
             if (!TextUtils.isEmpty(k.mTraceTag)) {
                jsonObject2.c0("traceTag", k.mTraceTag);
             }
             PurchasePageParams purchasePage = PatchProxy.applyOneRefs(k, null, o.class, "26");
             if (purchasePage != PatchProxyResult.class) {
             }else if(!TextUtils.isEmpty(k.mServerExpTagInUri)){
                purchasePage = k.mServerExpTagInUri;
             }else {
                purchasePage = o.l();
                if (TextUtils.isEmpty(purchasePage)) {
                   purchasePage = str8;
                }
             }
             if (!TextUtils.isEmpty(purchasePage)) {
                jsonObject2.c0("serverExpTag", purchasePage);
             }
             str21 = o.l();
             if (!TextUtils.isEmpty(str21)) {
                jsonObject2.c0("serverExpTagList", str21);
             }
             if (!TextUtils.isEmpty(k.mLikeExpTag)) {
                jsonObject2.c0("likeExpTag", k.mLikeExpTag);
             }
          }else {
             str17 = str21;
             str18 = str26;
             str19 = str27;
             str15 = str28;
          }
          if (o.t(l)) {
             str25 = str10;
             jsonObject2.a0(str25, Long.valueOf(l));
          }else {
             str25 = str10;
          }
          if (!TextUtils.isEmpty(str13)) {
             jsonObject5 = new JsonObject();
             jsonObject2.G(str7, jsonObject5);
             jsonObject5.c0("account", str13);
             jsonObject5.a0("accountType", Integer.valueOf(i1));
          }
          if (jsonArray != null && jsonArray.size() > 0) {
             jsonObject2.G("rechargeAccountListParam", jsonArray);
          }
          str21 = str5;
          if (jsonObject1 != null) {
             jsonObject2.G(str21, jsonObject1);
          }
          obj2 = paymentMetho1;
          if (paymentMetho1 != null && !TextUtils.isEmpty(obj2.mProvider)) {
             mProvider = obj2.mProvider;
             str6 = str4;
          }else {
             str6 = str4;
             obj3 = str8;
          }
          jsonObject2.c0(str6, mProvider);
          mProvider = (obj2 != null && !TextUtils.isEmpty(obj2.mProviderChannelType))? obj2.mProviderChannelType: str8;
          jsonObject2.c0("providerChannelType", mProvider);
          if (jsonObject4 != null) {
             Iterator iterator2 = jsonObject4.entrySet().iterator();
             while (iterator2.hasNext()) {
                Map$Entry uEntry2 = iterator2.next();
                JsonObject jsonObject7 = jsonObject2.d0();
                Iterator iterator3 = iterator2;
                obj3 = uEntry2.getKey();
                str5 = str6;
                Object obj4 = uEntry2.getValue();
                if (PatchProxy.applyVoidThreeRefs(jsonObject7, obj3, obj4, null, e.class, "11") || (obj3 != null && jsonObject7.e0(obj3) != null)) {
                   str4 = str21;
                   str10 = str25;
                   a.g(MerchantTransactionLogBiz.PURCHASE, str11, "重复下单参数："+obj3+"。原有值："+jsonObject7.e0(obj3).toString()+",新值： "+obj4);
                }else {
                   str4 = str21;
                   str10 = str25;
                }
                jsonObject2.G(uEntry2.getKey(), uEntry2.getValue());
                iterator2 = iterator3;
                str21 = str4;
                str6 = str5;
                str25 = str10;
             }
          }
          str4 = str21;
          str10 = str25;
          str5 = str6;
          jsonObject2.a0("batchType", Integer.valueOf(k.mBatchType));
          jsonObject2.c0("preCreateParam", PrepayParam.forCreateOrderUnionApi(obj2));
       label_044c :
          jsonObject = jsonObject2;
          goto label_044d ;
       }
       str5 = str4;
       str4 = str5;
       goto label_044c ;
    }
    public void S8(int p0,String p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, or, "21")) {
          return;
       }
       if (this.J == null) {
          a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "mContract null while invalidating page");
          return;
       }else {
          MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
          StringBuilder str = "invalidatePage: action ";
          String str1 = (p0 != 1000)? "unknown": "refreshPage";
          a.s(pURCHASE, "CreateOrderPresenter", str+str1);
          this.J.U7(p0, p1);
          return;
       }
    }
    public void V8(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "19")) {
          return;
       }
       r tL = this.L;
       if (tL != null) {
          tL.postAtFrontOfQueue(p0);
       }
       return;
    }
    public void W8(long p0,String p1,String p2,long p3,int p4,int p5,String p6){
       Object obj = this;
       r or = r.class;
       int i = 1;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,Long.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, obj, or, "18")) {
             return;
          }
       }
       if (obj.x == null) {
          a.g(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "mPrepayService null");
          obj.O = i;
          this.Y8();
          return;
       }else {
          a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "startPrepay");
          obj.x.a(p0, p1, obj.R, p2, p3, p4, p5, p6);
          return;
       }
    }
    public void X8(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "7")) {
          return;
       }
       this.p = "";
       if (2 == e.b(this.F, this.G)) {
          if (!PatchProxy.applyVoid(null, this, or, "8")) {
             Activity activity = this.getActivity();
             if (activity == null) {
                a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "dialog can\'t be brought up for activity null");
             }else {
                this.p = a1.p(0x7f1033f2);
                t$a uoa = new t$a(activity);
                uoa.y0(R.string.arg_RES_7f1033f2);
                uoa.S0(R.string.arg_RES_7f1033c3);
                uoa.Q0(R.string.arg_RES_7f1033c9);
                uoa.u0(new m(this));
                t$a uoa1 = f.e(uoa);
                uoa1.t0(n.b);
                uoa1.p();
                this.M = uoa1.Y(new y(this));
                m.r();
             }
          }
          a.y("PURCHASE_INTERCEPT_CREATE_ORDER_KEY_LOG", MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "address intercept create order.", Collections.emptyMap());
          return;
       }else {
          int i = 0x7f11066a;
          if (this.u.a() && TextUtils.x(this.u.b())) {
             this.p = a1.p(0x7f10338b);
             i.a(i, R.string.arg_RES_7f10338b);
             a.y("PURCHASE_INTERCEPT_CREATE_ORDER_KEY_LOG", MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "phoneNumber intercept create order.", Collections.emptyMap());
             return;
          }else if(this.v.b() && TextUtils.x(this.v.a())){
             i.d(i, this.v.e());
             this.p = this.v.e();
             a.y("PURCHASE_INTERCEPT_CREATE_ORDER_KEY_LOG", MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "rechargeAccount intercept create order.", Collections.emptyMap());
             return;
          }else {
             w0$b uob = this.w.b();
             if (this.w.c() && (uob != null && uob.a == null)) {
                w0$b b = uob.b;
                this.p = b;
                i.d(i, b);
                a.y("PURCHASE_INTERCEPT_CREATE_ORDER_KEY_LOG", MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "rechargeAccountMultiRow intercept create order.", Collections.emptyMap());
                return;
             }else if(this.z.a()){
                this.p = a1.p(0x7f103213);
                a.y("PURCHASE_AGREEMENT_KEY_LOG", MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "agreement intercept create order.", Collections.emptyMap());
                return;
             }else if(!p0 && this.D.d()){
                this.p = this.D.b();
                a.y("PURCHASE_INTERCEPT_CREATE_ORDER_KEY_LOG", MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "crossBorder intercept create order.", Collections.emptyMap());
                return;
             }else if(!p0 && this.E.d()){
                this.p = this.E.b();
                a.y("PURCHASE_INTERCEPT_CREATE_ORDER_KEY_LOG", MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "crossBorderCC intercept create order.", Collections.emptyMap());
                return;
             }else if(this.B.a() && TextUtils.x(this.B.getPoiId())){
                this.p = a1.p(0x7f1033fa);
                i.a(i, R.string.arg_RES_7f1033fa);
                a.y("PURCHASE_INTERCEPT_CREATE_ORDER_KEY_LOG", MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "poiInfo intercept create order.", Collections.emptyMap());
                return;
             }else if(!p0 && this.C.a()){
                r tC = this.C;
                JsonObject jsonObject = PatchProxy.apply(null, this, or, "24");
                if (jsonObject != PatchProxyResult.class) {
                }else {
                   jsonObject = new JsonObject();
                   JsonObject jsonObject1 = this.u.c();
                   if (jsonObject1 != null && jsonObject1.size() > 0) {
                      jsonObject.G("phoneNumber", jsonObject1);
                   }
                   jsonObject1 = this.v.c();
                   if (jsonObject1 != null && jsonObject1.size() > 0) {
                      jsonObject.G("rechargeAccount", jsonObject1);
                   }
                   JsonArray jsonArray = this.w.a();
                   if (jsonArray != null && jsonArray.size() > 0) {
                      jsonObject.G("rechargeAccountMultiRow", jsonArray);
                   }
                }
                tC.c(jsonObject);
                return;
             }else {
                this.Q = 0;
                this.S = 0;
                this.T = 0;
                this.U = 0;
                PaymentMethodInfo paymentMetho = this.t.a();
                this.R = paymentMetho;
                this.J.ha(paymentMetho);
                b9.a(this.N);
                this.L.removeCallbacksAndMessages(null);
                this.R8(true, 0, null);
                if (this.s.a()) {
                   this.s.b();
                }
                return;
             }
          }
       }
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, r.class, "20")) {
          return;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "stopLoadingIfNeeded: mShouldStopLoading "+this.O);
       if (this.O != null) {
          r tJ = this.J;
          if (tJ != null) {
             tJ.l7();
          }
          this.O = false;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, r.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(r.class, new c0());
       }else {
          obj.put(r.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.s = this.r8("follow_ks_shop_upload_service");
       this.t = this.r8("payment_method_service");
       this.u = this.r8("phone_recharge_service");
       this.v = this.r8("recharge_service");
       this.w = this.r8("recharge_multi_row_service");
       this.x = this.r8("prepay_service");
       this.y = this.r8("pay_service");
       this.F = this.t8("page_module_info");
       this.G = this.t8("address_id");
       this.H = this.t8("transfer_params");
       this.J = this.q8(a.class);
       this.K = this.r8("page_params");
       this.I = this.r8("FRAGMENT");
       this.D = this.r8("cross_border_service");
       this.E = this.r8("cross_border_cc_service");
       this.z = this.r8("agreement_service");
       this.A = this.r8("address_service");
       this.B = this.r8("poi_info_service");
       this.C = this.r8("rn_panel_service");
       this.P = this.r8("ID_PAGE_IDENTIFY_KEY");
       return;
    }
}
