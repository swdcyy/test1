package com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import em4.a;
import hka.a;
import sd4.a;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.transaction.purchase.k0;
import em4.j;
import erd.b;
import io.reactivex.subjects.PublishSubject;
import em4.f;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Objects;
import em4.g;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vm4.c;
import we4.i;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kuaishou.merchant.transaction.purchase.f0;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import vm4.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.purchase.model.PageInfo;
import com.kuaishou.merchant.transaction.purchase.model.ProductInfo;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.net.Uri;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.view.View;
import android.os.Bundle;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import androidx.core.widget.NestedScrollView;
import em4.l;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import um4.a;
import com.kuaishou.merchant.transaction.purchase.presenter.q0;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.purchase.presenter.AddressUIPresenter;
import com.kuaishou.merchant.transaction.purchase.presenter.c0;
import re4.g;
import com.kuaishou.merchant.transaction.purchase.presenter.j0;
import com.kuaishou.merchant.transaction.purchase.presenter.y0;
import com.kuaishou.merchant.transaction.purchase.presenter.w0;
import com.kuaishou.merchant.transaction.purchase.presenter.u0;
import com.kuaishou.merchant.transaction.purchase.presenter.l0;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter;
import com.kuaishou.merchant.transaction.purchase.presenter.a0;
import com.kuaishou.merchant.transaction.purchase.presenter.g;
import com.kuaishou.merchant.transaction.purchase.presenter.j;
import um4.r2;
import um4.c1;
import com.kuaishou.merchant.transaction.purchase.presenter.y;
import com.kuaishou.merchant.transaction.purchase.presenter.v;
import um4.b1;
import um4.n0;
import com.kuaishou.merchant.transaction.purchase.presenter.e;
import um4.l;
import com.kuaishou.merchant.transaction.purchase.presenter.d0;
import java.lang.Throwable;
import com.kuaishou.merchant.transaction.base.util.TransactionPreloadConfigHelper$PagePreLoadConfig;
import com.kuaishou.merchant.transaction.base.util.TransactionPreloadConfigHelper;
import com.kuaishou.merchant.transaction.base.model.CrossBorderInfo;
import ue4.o;
import java.util.Map;
import com.kuaishou.merchant.preload.net.cache.PreloadCache;
import sa4.a;
import java.util.HashMap;
import android.util.Pair;
import ta4.b;
import com.kuaishou.merchant.basic.fragment.f;
import ta4.a;
import njd.a;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.retrofit.model.KwaiException;
import ot3.k0;
import lnc.a1;
import java.lang.Boolean;
import brd.t;
import lnc.i3;
import com.google.gson.JsonArray;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.merchant.transaction.purchase.model.ProductInfo$TagLabel;
import com.kuaishou.merchant.transaction.purchase.i0;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import com.kuaishou.merchant.transaction.purchase.h0;
import ekd.q$a;
import java.lang.Iterable;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gateway.pay.loading.PayLoadingDialog;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo$PayLoadingInfo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import em4.e;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.purchase.g0;
import erd.o;
import brd.x;
import cjd.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.merchant.transaction.purchase.e0$a;
import crd.b;
import lnc.b9;
import em4.b;
import erd.g;
import em4.d;
import em4.i;
import erd.a;
import em4.k;
import com.kuaishou.merchant.transaction.purchase.l0;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import fg6.a;
import com.kuaishou.merchant.transaction.purchase.model.PageInfoResponse;
import com.google.gson.Gson;
import java.lang.System;
import android.content.Context;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.merchant.transaction.purchase.j0;
import brd.w;
import erd.c;
import em4.c;
import em4.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;

public class MerchantPurchaseFragment extends MerchantBaseFragment implements a, a, a	// class@0008f1
{
    public final k0 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public i G;
    public String H;
    public final c I;
    public final ViewTreeObserver$OnPreDrawListener J;
    public Throwable K;
    public final PublishSubject L;
    public boolean M;
    public final List N;
    public e0 O;
    public View m;
    public KwaiLoadingView n;
    public KwaiEmptyStateView o;
    public NestedScrollView p;
    public KwaiDialogFragment q;
    public PresenterV2 r;
    public PresenterV2 s;
    public boolean t;
    public final MerchantPurchaseFragment$a u;
    public PurchasePageParams v;
    public JsonObject w;
    public String x;
    public PageInfo y;
    public b z;
    public static final int P;

    public void MerchantPurchaseFragment(){
       super();
       this.s = new PresenterV2();
       this.u = new MerchantPurchaseFragment$a();
       this.v = new PurchasePageParams();
       this.w = new JsonObject();
       this.A = new k0(new j(this));
       this.C = true;
       this.D = false;
       this.E = false;
       this.F = true;
       this.I = PublishSubject.g();
       this.J = new f(this);
       this.L = PublishSubject.g();
       this.M = a.t().d("enableMerchantPurchasePageBackLogReport", false);
       ArrayList uArrayList = new ArrayList();
       this.N = uArrayList;
       Objects.requireNonNull(uArrayList);
       this.O = new g(uArrayList);
    }
    public static void gh(MerchantPurchaseFragment p0,String p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, MerchantPurchaseFragment.class, "20")) {
       }else if(c.b()){
          boolean b = (p0.K == null)? true: false;
          p0.ih(b);
       }
       if (p0.lh(p1)) {
          Object[] objArray = new Object[]{p0.u};
          p0.r.i(objArray);
          objArray = new Object[]{p0.u};
          p0.s.i(objArray);
          p0.t = true;
          p0.C = false;
       }
       return;
    }
    public String C1(){
       return "MERCHANT_PURCHASE_PAGE";
    }
    public String D1(){
       return "电商买家侧提单页";
    }
    public void He(i p0){
       this.G = p0;
    }
    public int M(){
       return 1;
    }
    public void Pc(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchaseFragment.class, "27")) {
          return;
       }
       if (this.B != null) {
          a.s(MerchantTransactionLogBiz.PURCHASE, "MerchantPurchaseFragment", "start loading on loading state");
          return;
       }else {
          this.B = true;
          MerchantPurchaseFragment tn = this.n;
          if (tn != null) {
             tn.setVisibility(0);
             this.n.h();
             this.n.setOnTouchListener(f0.b);
          }
          tn = this.o;
          if (tn != null && !tn.getVisibility()) {
             this.o.setVisibility(8);
          }
          return;
       }
    }
    public void Qc(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "25")) {
          return;
       }
       if (p0 == null) {
          a.s(MerchantTransactionLogBiz.PURCHASE, "MerchantPurchaseFragment", "reselect: params null");
          return;
       }else {
          this.Pc();
          this.jh(p0);
          return;
       }
    }
    public void U7(int p0,String p1){
       MerchantPurchaseFragment ty;
       long l;
       JsonObject jsonObject;
       long l1;
       e uoe = e.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(MerchantPurchaseFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, MerchantPurchaseFragment.class, "22")) {
          return;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "MerchantPurchaseFragment", "invalidate: action "+p0);
       if (p0 == 1000) {
          ty = this.y;
          if (ty != null) {
             PageInfo mProductInfo = ty.mProductInfo;
             if (mProductInfo != null) {
                ProductInfo mCount = mProductInfo.mCount;
                if (mCount != null) {
                   l = mCount.longValue();
                label_0051 :
                   if (!l - -1) {
                      l = this.v.mItemCount;
                   }
                   ty = this.y;
                   if (ty != null && ty.mResponseVersion == 1) {
                      jsonObject = PatchProxy.applyOneRefs(p1, null, uoe, "4");
                      if (jsonObject != patchProxyRe) {
                      }else {
                         try{
                            jsonObject = new JsonObject();
                            jsonObject.a0("reselectedEventType", Integer.valueOf(800));
                            jsonObject.G("reselectedParams", null);
                            if (!TextUtils.isEmpty(p1)) {
                               Iterator iterator = c.d(p1).r().entrySet().iterator();
                               while (iterator.hasNext()) {
                                  Map$Entry uEntry = iterator.next();
                                  jsonObject.c0(uEntry.getKey(), uEntry.getValue().w());
                               }
                            }
                         }catch(java.lang.Exception e0){
                         }
                      }
                   }else {
                      jsonObject = e.g(this.v, l);
                   }
                   this.Qc(jsonObject);
                }
             }
          }
          l = -1;
          goto label_0051 ;
       }else if(p0 == 1003){
          ty = this.y;
          if (ty != null && ty.mResponseVersion == 1) {
             jsonObject = PatchProxy.apply(null, null, uoe, "5");
             if (jsonObject != patchProxyRe) {
             }else {
                jsonObject = new JsonObject();
                jsonObject.a0("reselectedEventType", Integer.valueOf(800));
             }
          }else {
             ty = this.v;
             MerchantPurchaseFragment obj = PatchProxy.apply(null, this, MerchantPurchaseFragment.class, "23");
             if (obj != patchProxyRe) {
                l1 = obj.longValue();
             }else {
                obj = this.y;
                if (obj != null) {
                   PageInfo mProductInfo1 = obj.mProductInfo;
                   if (mProductInfo1 != null) {
                      ProductInfo mCount1 = mProductInfo1.mCount;
                      if (mCount1 != null) {
                         l1 = mCount1.longValue();
                      label_0106 :
                         if (!l1 - -1) {
                            l1 = this.v.mItemCount;
                         }
                      }
                   }
                }
                l1 = -1;
                goto label_0106 ;
             }
             jsonObject = e.g(ty, l1);
          }
          this.v.mCreateOrderFailTransparentData = p1;
          this.Qc(jsonObject);
       }
    }
    public boolean Xg(){
       return false;
    }
    public boolean ch(){
       return true;
    }
    public String dh(){
       MerchantPurchaseFragment obj = PatchProxy.apply(null, this, MerchantPurchaseFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null) {
          PurchasePageParams mRawUri = obj.mRawUri;
          if (mRawUri != null) {
             return mRawUri.toString();
          }
       }
       return "";
    }
    public void e5(int p0,JsonObject p1){
       if (PatchProxy.isSupport(MerchantPurchaseFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, MerchantPurchaseFragment.class, "24")) {
          return;
       }
       if (p1 == null) {
          a.s(MerchantTransactionLogBiz.PURCHASE, "MerchantPurchaseFragment", "reselect: value null");
          return;
       }else {
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("reselectedEventType", Integer.valueOf(p0));
          jsonObject.G("reselectedParams", p1);
          jsonObject.G("batchReselectedParams", p1);
          this.Qc(jsonObject);
          return;
       }
    }
    public void f1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "34")) {
          return;
       }
       MerchantPurchaseFragment tq = this.q;
       if (tq instanceof ProgressFragment) {
          tq.Jh(p0);
       }
       return;
    }
    public void fh(View p0,Bundle p1){
       View$OnTouchListener onTouchListe;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantPurchaseFragment.class, "4")) {
          return;
       }
       this.m = p0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "12")) {
          this.n = p0.findViewById(0x7f0a2921);
          KwaiEmptyStateView kwaiEmptySta = p0.findViewById(R.id.empty_view);
          this.o = kwaiEmptySta;
          kwaiEmptySta.q(2);
          this.p = p0.findViewById(0x7f0a3750);
          this.o.p(new l(this));
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "13") && p0 != null) {
          ViewTreeObserver viewTreeObse = p0.getViewTreeObserver();
          if (viewTreeObse != null && viewTreeObse.isAlive()) {
             viewTreeObse.addOnPreDrawListener(this.J);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "15")) {
          a uoa = new a();
          this.r = uoa;
          uoa.f(p0);
          this.s.U7(new q0(this));
          this.s.U7(new AddressUIPresenter());
          this.s.U7(new c0());
          this.s.U7(new g());
          this.s.U7(new j0());
          this.s.U7(new y0());
          this.s.U7(new w0());
          this.s.U7(new u0(this));
          this.s.U7(new l0());
          this.s.U7(new PaymentMethodPanelPresenter());
          this.s.U7(new a0());
          this.s.U7(new g());
          this.s.U7(new j());
          this.s.U7(new r2());
          this.s.U7(new c1());
          this.s.U7(new y());
          this.s.U7(new v());
          this.s.U7(new b1());
          this.s.U7(new n0());
          this.s.U7(new e());
          this.s.U7(new l());
          this.s.U7(new d0());
          this.s.f(p0);
       }
       int i = 1;
       Object[] objArray = new Object[i];
       int i1 = 0;
       objArray[i1] = this.u;
       this.r.i(objArray);
       MerchantPurchaseFragment tK = this.K;
       if (tK != null) {
          this.kh(tK);
       }else {
          JsonObject jsonObject = this.w.d0();
          String str = null;
          MerchantPurchaseFragment merchantPurc = null;
          String str1 = PatchProxy.applyFourRefs(jsonObject, null, null, null, this, MerchantPurchaseFragment.class, "10");
          if (str1 != PatchProxyResult.class) {
          }else if(TransactionPreloadConfigHelper.c().mEnableUseCache == null){
             str1 = "";
          }else {
             Map map = e.a(o.v(jsonObject, str, merchantPurc, 0, null, null));
             PreloadCache d = PreloadCache.d;
             HashMap hashMap = PatchProxy.applyOneRefs(map, this, MerchantPurchaseFragment.class, "11");
             if (hashMap != PatchProxyResult.class) {
             }else {
                hashMap = new HashMap();
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String value = uEntry.getValue();
                   value = (value != null)? value.toString(): null;
                   hashMap.put(uEntry.getKey(), value);
                }
             }
             Pair pair = d.b(new a("/rest/app/trade/c/v1/ks/order/page/info", hashMap));
             this.l.h(pair.second);
             pair = pair.first;
             if (pair != null) {
                str1 = pair.b().a();
             }else {
                str1 = null;
             }
          }
          if (!TextUtils.x(str1)) {
             if (!PatchProxy.applyVoidOneRefs(str1, this, MerchantPurchaseFragment.class, "19") && this.lh(str1)) {
                objArray = new Object[i];
                objArray[i1] = this.u;
                this.r.i(objArray);
                objArray = new Object[i];
                objArray[i1] = this.u;
                this.s.i(objArray);
                this.t = i;
                this.F = i1;
             }
             tK = this.K;
             if (!PatchProxy.applyVoidOneRefs(tK, this, MerchantPurchaseFragment.class, "29")) {
                this.B = i1;
                MerchantPurchaseFragment tn = this.n;
                if (tn != null) {
                   tn.setVisibility(8);
                   this.n.i();
                   this.n.setOnTouchListener(null);
                }
                tn = this.o;
                if (tn != null) {
                   int i2 = (this.F != null)? 0: 8;
                   tn.setVisibility(i2);
                   if (this.F != null) {
                      tn = tK instanceof KwaiException;
                      this.o.d(k0.a(tK));
                      this.o.o("重试");
                      merchantPurc = this.o;
                      KwaiException mErrorMessag = (tn)? tK.mErrorMessage: a1.p(R.string.arg_RES_7f1033ce);
                      merchantPurc.h(mErrorMessag);
                      tK = this.o;
                      i = (tn)? 0x7f081707: 0x7f0805f4;
                      tK.i(i);
                   }
                }
                tK = this.p;
                if (tK != null) {
                   if (this.F != null) {
                      i1 = 8;
                   }
                   tK.setVisibility(i1);
                }
             }
          }else {
             this.Pc();
          }
          this.L.onNext(Boolean.TRUE);
       }
       return;
    }
    public t getDispatchDrawObservable(){
       return this.I;
    }
    public String getPageParams(){
       PurchasePageParams mSellerId;
       JsonArray jsonArray1;
       o oo = o.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i3 obj = PatchProxy.apply(objArray, this, MerchantPurchaseFragment.class, "37");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.x(this.H) && this.D != null) {
          obj = i3.f();
          String str = "";
          obj.d("item_activity_type", this.v.mItemActivityType+str);
          PurchasePageParams mRawUri = this.v.mRawUri;
          String str1 = (mRawUri == null)? str: mRawUri.toString();
          obj.d("url", str1);
          MerchantPurchaseFragment tv = this.v;
          String str2 = PatchProxy.applyOneRefs(tv, objArray, oo, "12");
          if (str2 != patchProxyRe) {
          }else if(tv == null){
             mSellerId = tv.mItemId;
             if (mSellerId > 0) {
                str2 = String.valueOf(mSellerId);
             }else if(!TextUtils.x(tv.mItemParam)){
                jsonArray1 = c.d(tv.mItemParam).q();
                if (jsonArray1.size() == 1) {
                   str2 = jsonArray1.e0(0).r().e0("itemId").w();
                }
             }
          }
          str2 = str;
          obj.d("item_id", str2);
          obj.d("carrier_type", TextUtils.k(this.v.mCarrierType));
          obj.d("carrier_entry", TextUtils.k(this.v.mCarrierEntry));
          tv = this.v;
          str2 = PatchProxy.applyOneRefs(tv, objArray, oo, "13");
          if (str2 != patchProxyRe) {
          }else if(tv == null){
             mSellerId = tv.mSellerId;
             if (mSellerId > 0) {
                str2 = String.valueOf(mSellerId);
             }else if(!TextUtils.x(tv.mItemParam)){
                jsonArray1 = c.d(tv.mItemParam).q();
                if (jsonArray1.size() == 1) {
                   str2 = jsonArray1.e0(0).r().e0("sellerId").w();
                }
             }
          }
          str2 = str;
          obj.d("seller_id", str2);
          str1 = (QCurrentUser.me() == null)? str: TextUtils.k(QCurrentUser.me().getId());
          obj.d("buyer_id", str1);
          obj.d("server_exp_tag", TextUtils.k(this.v.mServerExpTagInUri));
          obj.d("carrier_id", TextUtils.k(this.v.mCarrierId));
          str1 = (this.v.mEntranceScene >= null)? this.v.mEntranceScene+str: str;
          obj.d("entrance_scene", str1);
          obj.d("promote_id", TextUtils.k(this.v.mPromoteId));
          obj.d("promote_channel", TextUtils.k(this.v.mPromoteChannel));
          obj.d("batch_type", this.v.mBatchType+str);
          tv = this.v;
          MerchantPurchaseFragment obj1 = PatchProxy.applyOneRefs(tv, objArray, oo, "14");
          if (obj1 != patchProxyRe) {
             str = obj1;
          }else if(tv == null){
             PurchasePageParams mSkuId = tv.mSkuId;
             if (mSkuId > 0) {
                str = String.valueOf(mSkuId);
             }else if(!TextUtils.x(tv.mItemParam)){
                JsonArray jsonArray = c.d(tv.mItemParam).q();
                if (jsonArray.size() == 1) {
                   str = jsonArray.e0(0).r().e0("skuId").w();
                }
             }
          }
          obj.d("sku_id", str);
          obj1 = this.K;
          if (obj1 != null) {
             obj.d("error_text", obj1.getMessage());
          }
          if (!PatchProxy.applyVoidOneRefs(obj, this, MerchantPurchaseFragment.class, "38")) {
             obj1 = this.y;
             if (obj1 != null) {
                PageInfo mProductInfo = obj1.mProductInfo;
                if (mProductInfo != null) {
                   ProductInfo mHeadPicture = mProductInfo.mHeadPictureLabel;
                   String str3 = "无标签";
                   ProductInfo$TagLabel mTagName = (mHeadPicture != null && !TextUtils.x(mHeadPicture.mTagName))? mHeadPicture.mTagName: str3;
                   obj.d("item_picture_label", mTagName);
                   mHeadPicture = this.y.mProductInfo.mItemTitleLabel;
                   mTagName = (mHeadPicture != null && !TextUtils.x(mHeadPicture.mTagName))? mHeadPicture.mTagName: str3;
                   obj.d("item_name_left_label", mTagName);
                   mHeadPicture = this.y.mProductInfo.mBannerLabel;
                   mTagName = (mHeadPicture != null && !TextUtils.x(mHeadPicture.mTagName))? mHeadPicture.mTagName: str3;
                   obj.d("item_below_bar_label", mTagName);
                   mHeadPicture = this.y.mProductInfo.mServiceRule;
                   if (mHeadPicture != null) {
                      q.c(mHeadPicture, i0.a);
                      String str4 = TextUtils.join(",", q.g(mHeadPicture, h0.a));
                      if (!TextUtils.x(str4)) {
                         str3 = str4;
                      }
                      obj.d("item_name_below_pink_label", str3);
                   }else {
                      obj.d("item_name_below_pink_label", str3);
                   }
                }
             }
          }
          this.H = obj.e();
       }
       return this.H;
    }
    public void ha(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "32")) {
          return;
       }
       if (!this.isAdded()) {
          return;
       }
       MerchantPurchaseFragment tq = this.q;
       if (tq != null) {
          tq.dismiss();
       }
       if (p0 != null && p0.needShowIconLoading()) {
          PayLoadingDialog payLoadingDi = new PayLoadingDialog();
          this.q = payLoadingDi;
          payLoadingDi.sh(p0.mPayLoadingInfo.mLoadingContent);
          this.q.th(p0.mPayLoadingInfo.mLoadingIconUrl);
       }else {
          ProgressFragment progressFrag = new ProgressFragment();
          this.q = progressFrag;
          progressFrag.Jh(a1.p(R.string.arg_RES_7f103461));
       }
       this.q.setCancelable(false);
       this.q.show(this.getChildFragmentManager(), "");
       return;
    }
    public final t hh(JsonObject p0,String p1,JsonObject p2,CrossBorderInfo p3,List p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(MerchantPurchaseFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, MerchantPurchaseFragment.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e uoe = new e(p0, p1, p2, p3, p4, p5);
       return t.fromCallable(obj).subscribeOn(d.c).flatMap(g0.b).compose(this.eh()).retryWhen(this.A).map(new e());
    }
    public final void ih(boolean p0){
       if (PatchProxy.isSupport(MerchantPurchaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MerchantPurchaseFragment.class, "35")) {
          return;
       }
       if (this.D == null) {
          boolean b = true;
          this.D = b;
          this.E = b;
          this.H = "";
          if (!p0) {
             b = 2;
          }
          this.b2(b);
          Iterator iterator = this.N.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
    public final void jh(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "17")) {
          return;
       }
       b9.a(this.z);
       MerchantPurchaseFragment tu = this.u;
       this.z = this.hh(this.w.d0(), this.x, p0, tu.u, tu.l, tu.d.mCreateOrderFailTransparentData).observeOn(d.a).doOnSubscribe(new b(this)).doOnError(new d(this)).doFinally(new i(this)).subscribe(new k(this), super(this.getActivity()));
       return;
    }
    public void kh(Throwable p0){
       MerchantPurchaseFragment to1;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "31")) {
          return;
       }
       boolean b = false;
       this.B = b;
       MerchantPurchaseFragment tn = this.n;
       if (tn != null) {
          tn.setVisibility(8);
          this.n.i();
          this.n.setOnTouchListener(null);
       }
       tn = this.o;
       if (tn != null) {
          int i = (this.C != null)? 0: 8;
          tn.setVisibility(i);
          if (this.C != null) {
             v1 = p0 instanceof KwaiException;
             this.o.d(k0.a(p0));
             this.o.o("重试");
             MerchantPurchaseFragment to = this.o;
             KwaiException mErrorMessag = (tn)? p0.mErrorMessage: a1.p(R.string.arg_RES_7f1033ce);
             to.h(mErrorMessag);
             to1 = this.o;
             int i1 = (tn)? 0x7f081707: 0x7f0805f4;
             to1.i(i1);
          }
       }
       to1 = this.p;
       if (to1 != null) {
          if (this.C != null) {
             b = 8;
          }
          to1.setVisibility(b);
       }
       return;
    }
    public void l7(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchaseFragment.class, "30")) {
          return;
       }
       this.kh(null);
       if (!PatchProxy.applyVoid(null, this, MerchantPurchaseFragment.class, "33")) {
          MerchantPurchaseFragment tq = this.q;
          if (tq != null) {
             tq.dismiss();
             this.q = null;
          }
       }
       return;
    }
    public final boolean lh(String p0){
       Gson obj = PatchProxy.applyOneRefs(p0, this, MerchantPurchaseFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       String str = "MerchantPurchaseFragment";
       if (TextUtils.x(p0)) {
          a.s(MerchantTransactionLogBiz.PURCHASE, str, "updateParams: response null");
          return b;
       }else {
          obj = a.a;
          PageInfoResponse pageInfoResp = obj.h(p0, PageInfoResponse.class);
          JsonObject jsonObject = obj.h(p0, JsonObject.class);
          if (pageInfoResp != null && (pageInfoResp.mData != null && jsonObject != null)) {
             String str1 = "data";
             if (jsonObject.s0(str1)) {
                PageInfoResponse mData = pageInfoResp.mData;
                this.y = mData;
                PageInfo mPageInfoTra = mData.mPageInfoTransparentParam;
                this.x = mPageInfoTra;
                MerchantPurchaseFragment tu = this.u;
                tu.q = mPageInfoTra;
                tu.e = jsonObject.m0(str1).toString();
                MerchantPurchaseFragment tu1 = this.u;
                tu1.f = mData.mPageModuleInfo;
                tu1.g = mData.mProductInfo;
                tu1.h = mData.mRetentionMsg;
                tu1.i = mData.mAddressInfo;
                tu1.j = mData.mUpgradeAddressGuideModel;
                tu1.m = mData.mFollowingInfo;
                tu1.k = mData.mPoiInfo;
                tu1.l = mData.mCashierConfig;
                tu1.n = mData.mMoneyInfo;
                tu1.o = mData.mCanSale;
                tu1.p = mData.mBottomTip;
                tu1.r = mData.mToastMsg;
                tu1.s = mData.mToastMsgType;
                tu1.t = mData.mIsFoldPayList;
                tu1.u = mData.mCrossBorderInfo;
                tu1.v = mData.mAgreementInfoV2;
                tu1.w = mData.mRechargeConfigList;
                tu1.x = mData.mAnnouncementInfo;
                tu1.y = mData.mShowProviderSize;
                tu1.z = mData.mBuyButton;
                tu1.A = mData.mPromotionEventLogParam;
                MerchantPurchaseFragment$a d = tu1.d;
                if (!d.mPerfRequestSuccessTime) {
                   d.mPerfRequestSuccessTime = System.currentTimeMillis();
                }
                return true;
             }
          }
          a.s(MerchantTransactionLogBiz.PURCHASE, str, "updateParams: pageInfo null");
          return b;
       }
    }
    public String o(){
       String str = (this.E != null)? "MERCHANT_PURCHASE_PAGE": "";
       return str;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "1")) {
          return;
       }
       super.onAttach(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantPurchaseFragment.class, "8")) {
          if (this.getArguments() != null) {
             PurchasePageParams purchasePage = b.a(this.getArguments().getParcelable("data"));
             if (purchasePage != null) {
                this.v = purchasePage;
             }
          }
          this.w = o.a(this.v, this.getContext());
          MerchantPurchaseFragment tu = this.u;
          tu.b = this;
          tu.c = this;
          tu.C = this.O;
          tu.d = this.v;
       }
       if (!PatchProxy.applyVoid(objArray, this, MerchantPurchaseFragment.class, "9")) {
          this.z = t.zip(this.hh(this.w.d0(), null, null, null, null, null), this.L, j0.a).observeOn(d.a).doOnError(new c(this)).doFinally(new h(this)).subscribe(new k(this), new l0(this.getActivity()));
       }
       return;
    }
    public boolean onBackPressed(){
       MerchantPurchaseFragment obj = PatchProxy.apply(null, this, MerchantPurchaseFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.G;
       boolean b = (obj != null && obj.onBackPressed())? true: false;
       return b;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0.mPerfCreateTime = System.currentTimeMillis();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantPurchaseFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d04f0, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchaseFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       MerchantPurchaseFragment tr = this.r;
       if (tr != null) {
          tr.destroy();
       }
       this.s.destroy();
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantPurchaseFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       MerchantPurchaseFragment tr = this.r;
       if (tr != null) {
          tr.unbind();
       }
       if (this.t != null) {
          this.s.unbind();
       }
       if (!PatchProxy.applyVoid(objArray, this, MerchantPurchaseFragment.class, "14")) {
          tr = this.m;
          if (tr != null) {
             ViewTreeObserver viewTreeObse = tr.getViewTreeObserver();
             if (viewTreeObse != null && viewTreeObse.isAlive()) {
                viewTreeObse.removeOnPreDrawListener(this.J);
             }
          }
       }
       b9.a(this.z);
       this.l7();
       return;
    }
}
