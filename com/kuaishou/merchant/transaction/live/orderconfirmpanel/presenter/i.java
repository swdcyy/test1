package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
import im8.g;
import rk0.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$a;
import java.util.HashSet;
import nk4.b0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import fk4.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import qk4.d;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import lk4.b;
import lk4.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import com.yxcorp.utility.TextUtils;
import brd.t;
import cjd.e;
import erd.o;
import nk4.g0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BuyButton;
import java.lang.CharSequence;
import android.app.Activity;
import com.kuaishou.merchant.router.b;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderPaymentRequestInfo;
import java.util.List;
import com.kuaishou.merchant.transaction.base.sku.c;
import java.util.LinkedHashMap;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import java.lang.Iterable;
import android.text.TextUtils;
import e17.i;
import oi4.a;
import oi4.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.basic.model.AddressInfo;
import kc4.x;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.j;
import qk4.e;
import kc4.c$b;
import kc4.c$a;
import com.kuaishou.merchant.transaction.base.address.model.AddressEditParams$a;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import com.yxcorp.utility.n;
import lnc.a1;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import nk4.e0;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressEditActivity;
import qk4.b;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OffshoreInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$PurchaseAgreementInfo;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$AgreementInfo;
import java.util.Collection;
import ekd.q;
import u07.t$a;
import zj4.b;
import nk4.a0;
import zj4.b$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import nk4.d0;
import u07.u;
import nk4.c0;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import nk4.h0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderPaymentRequestInfo$CreateOrderParam;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemInfo;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.base.purchasepanel.OrderConfirmLogParam;
import ne4.a;
import com.kuaishou.merchant.transaction.live.base.pay.b;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.base.model.payment.CashierData;
import android.view.View;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$f;
import qi4.e;
import gk4.c;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PayButtonEnableCondition;
import crd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import oe4.a;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.h;
import erd.r;
import nk4.f0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import androidx.lifecycle.MutableLiveData;
import nk4.z;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.CrossBorderInfo;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import mu4.d;
import ju4.d;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$MoneyInfo;
import com.kuaishou.merchant.api.core.model.Commodity$FakeText;
import yd4.b;
import ekd.j;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.Float;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import lnc.b9;
import java.lang.ref.WeakReference;
import com.kuaishou.merchant.transaction.base.pay.OrderEventProcessor;
import androidx.fragment.app.KwaiDialogFragment;
import android.text.style.ImageSpan;
import f3.h;
import lnc.ia;
import ekd.m1;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import nk4.l0;
import java.util.Map;
import com.kuaishou.merchant.transaction.base.model.PayResultQueryResponse;
import sk4.a;
import sk4.d;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.transaction.base.model.PayResultQueryResponse$PayResultAction;
import com.kuaishou.merchant.transaction.base.event.PageCloseEvent;
import android.net.Uri;
import ot3.h0;
import e17.i$b;
import rk4.a;
import tkd.b;
import tkd.d;
import fs5.a;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.api.core.model.Commodity$SpikeInfo;
import rk4.c;
import android.text.SpannableStringBuilder;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$e;
import gk4.c$a;
import android.text.style.ReplacementSpan;
import ot3.p0;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import android.graphics.Typeface;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$d;
import android.text.style.ClickableSpan;
import nk4.y;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ExpressInfo;
import com.yxcorp.gateway.pay.loading.PayLoadingDialog;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo$PayLoadingInfo;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;

public class i extends b implements g	// class@00082b
{
    public LiveMerchantBaseContext A;
    public c B;
    public MerchantLivePurchasePanelFragment$b C;
    public View D;
    public View E;
    public View F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public View L;
    public TextView M;
    public PayButtonEnableCondition N;
    public c O;
    public ImageSpan P;
    public ImageSpan Q;
    public KwaiDialogFragment R;
    public SpannableStringBuilder S;
    public b T;
    public PageInfoReqParam U;
    public final HashSet U0;
    public OrderPaymentRequestInfo V;
    public String V0;
    public b W;
    public final d W0;
    public a X;
    public String X0;
    public a Y;
    public a Z;
    public c s;
    public boolean t;
    public d u;
    public e v;
    public c$a w;
    public b x;
    public MerchantLivePurchasePanelResponse y;
    public MerchantLivePurchasePanelFragment z;

    public void i(Fragment p0){
       super(p0);
       this.t = false;
       this.u = new i$a(this);
       this.U0 = new HashSet();
       this.W0 = new b0(this);
       this.Y = ViewModelProviders.of(this.P8()).get(a.class);
    }
    public void B9(PageInfoReqParam p0,boolean p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi, "43")) {
          return;
       }
       this.C9(p0, p1, false);
       return;
    }
    public final void C9(PageInfoReqParam p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, i.class, "44")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       boolean b = false;
       i oi = (p2 || this.u.h())? 1: null;
       if (!oi) {
          return;
       }else {
          oi = this.U;
          if (oi != p0) {
             p0.mNotUseUnownedCoupon = oi.mNotUseUnownedCoupon;
             this.U = p0;
          }
          this.S8();
          if (!p2 && (p1 && this.U.mShouldRequest == null)) {
             return;
          }else {
             this.x9(b);
             this.U.update(this.y);
             i tU = this.U;
             tU = this.C;
             this.X7(a.a().d(tU.mReselectedEventType, tU.mReselectedParamsString, tU.mTransparentParam, tU.mNotUseUnownedCoupon, String.valueOf(this.C.F), tU.G, TextUtils.k(tU.E)).map(new e()).subscribe(new g0(this), new i$c(this)));
             return;
          }
       }
    }
    public void D9(){
       int i;
       int b;
       int i3;
       ArrayList uArrayList1;
       Iterator iterator;
       i v;
       i a;
       MerchantLivePurchasePanelResponse mPurchaseAgr;
       String str1;
       String str3;
       String str = this;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, str, oi, "35")) {
          return;
       }
       this.S8();
       MerchantLivePurchasePanelResponse mBuyButton = str.y.mBuyButton;
       if (mBuyButton != null) {
          str.X0 = mBuyButton.mBtnClickInterceptLogReason;
       }
       i obj = PatchProxy.apply(objArray, str, oi, "6");
       SkuSpecification skuSpecifica = 4;
       i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          str3 = this.b9();
          if (this.d9() == skuSpecifica && !TextUtils.x(str3)) {
             b.k(this.P8(), str3);
             b = true;
          }else {
             b = false;
          }
       }
       if (!PatchProxy.applyVoid(objArray, str, oi, "47") && str.V == null) {
          str.V = new OrderPaymentRequestInfo(str.y);
       }
       if (b) {
          return;
       }else {
          obj = PatchProxy.apply(objArray, str, oi, "5");
          int i1 = 7;
          int i2 = 3;
          i oi1 = 2;
          MerchantLivePurchasePanelResponse$AgreementInfo uAgreementIn = 0x7f11066a;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             b = this.d9();
             LinkedHashMap obj3 = PatchProxy.apply(objArray, str, oi, "8");
             boolean b1 = (obj3 != PatchProxyResult.class)? obj3.booleanValue(): this.m9();
             if (b1) {
                if (!PatchProxy.applyVoid(objArray, str, oi, "7")) {
                   obj3 = str.B.c();
                   str1 = "ÇëÑ¡Ôñ";
                   ArrayList uArrayList2 = new ArrayList();
                   Iterator iterator1 = str.B.d().iterator();
                   while (iterator1.hasNext()) {
                      SkuSpecification skuSpecifica1 = iterator1.next();
                      if (!obj3.containsKey(skuSpecifica1.mPropName)) {
                         uArrayList2.add(skuSpecifica1.mPropName);
                      }
                      skuSpecifica = 4;
                   }
                   str1 = str1+TextUtils.join(" ", uArrayList2);
                   str.X0 = str1;
                   i.d(uAgreementIn, str1);
                }
                b = false;
             }else {
                String str2 = "11";
                if (b == oi1) {
                   str3 = this.b9();
                   a obj4 = PatchProxy.applyOneRefs(str3, str, oi, "9");
                   if (obj4 != PatchProxyResult.class) {
                      b = obj4.booleanValue();
                   }else if(!TextUtils.x(str3)){
                      i.d(uAgreementIn, str3);
                      obj4 = b.a(this.P8());
                      a = str.y;
                      Objects.requireNonNull(obj4);
                      if (!PatchProxy.applyVoidTwoRefs(a, str3, obj4, a.class, str2)) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "MERCHANT_SKU_PURCHASE_INVALID";
                         i3 oi3 = i3.f();
                         oi3.d("invalid_reason", str3);
                         uElementPack.params = oi3.e();
                         u1.y0(obj4.e(a), i1, uElementPack, new ClientContent$ContentPackage());
                      }
                      b = 1;
                   }else {
                      b = 0;
                   }
                   b = b ^ i;
                }else if(b == i2){
                   if (PatchProxy.applyVoid(objArray, str, oi, "10")) {
                   label_0155 :
                      i3 = 2;
                   }else {
                      str1 = "LiveAudienceOrderConfirmPanelBottomBarPresenter";
                      if (!this.P8() instanceof GifshowActivity) {
                         a.h(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str1, "tryCreateAddress", "activity", "invalid");
                         goto label_0155 ;
                      }else {
                         FragmentActivity uFragmentAct1 = this.P8();
                         mBuyButton = str.y.mAddressInfo;
                         Object obj5 = PatchProxy.applyTwoRefs(uFragmentAct1, mBuyButton, str, oi, str2);
                         if (obj5 != PatchProxyResult.class) {
                            b = obj5.booleanValue();
                         }else if(!x.h(mBuyButton)){
                            if (TextUtils.x(mBuyButton.mAddUri)) {
                               a.h(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str1, "tryLev4Address", "addUri", "empty");
                            }else {
                               oi1 = str.y;
                               j oj = str1;
                               j oj1 = str1;
                               i oi2 = oi1;
                               i3 = 2;
                               oj = new j(this, str.u, str.v, str.B, oi2, oi1.mAddressInfo);
                               str.w.a(uFragmentAct1, mBuyButton.mAddUri, oj1);
                               b = true;
                            label_01cc :
                               if (!b) {
                                  AddressEditParams$a uoa1 = new AddressEditParams$a();
                                  str2 = PatchProxy.apply(objArray, str, oi, "13");
                                  str1 = "";
                                  if (str2 != PatchProxyResult.class) {
                                  }else {
                                     v = str.y;
                                     if (v != null) {
                                        mPurchaseAgr = v.mItemInfo;
                                        if (mPurchaseAgr != null) {
                                           str2 = TextUtils.k(mPurchaseAgr.mId);
                                        }
                                     }
                                     str2 = str1;
                                  }
                                  uoa1.f(str2);
                                  uoa1.e(true);
                                  uoa1.d(str.z.Pa());
                                  uoa1.c(((n.j(this.P8()) - str.z.Pa()) - a1.d(R.dimen.arg_RES_7f070319)));
                                  uoa1.b(true);
                                  str2 = PatchProxy.apply(objArray, str, oi, "14");
                                  if (str2 != PatchProxyResult.class) {
                                  }else {
                                     v = str.A;
                                     if (v != null) {
                                        str1 = TextUtils.k(v.getLiveAuthorId());
                                     }
                                     str2 = str1;
                                  }
                                  uoa1.h(str2);
                                  MerchantAddressEditActivity.C3(this.P8(), uoa1, new e0(str));
                               }
                            }
                         }
                         b = false;
                         i3 = 2;
                         goto label_01cc ;
                      }
                   }
                   b = 0;
                label_024e :
                   if (!b) {
                      return;
                   }else if(str.W == null){
                      return;
                   }else if(str.t != null){
                      obj = str.x;
                      if (obj != null && obj.a()) {
                         str.x.b();
                         return;
                      }
                   }
                   mBuyButton = str.y.mOffShoreInfo;
                   b1 = (mBuyButton != null && mBuyButton.mUserAuthenticated == null)? true: false;
                   if (b1) {
                      OffshoreInfo mCertificati = mBuyButton.mCertificationRequirementTip;
                      str.X0 = mCertificati;
                      i.d(R.style.arg_RES_7f11066a, mCertificati);
                      return;
                   }else {
                      List obj1 = PatchProxy.apply(objArray, str, oi, "39");
                      if (obj1 != PatchProxyResult.class) {
                         b = obj1.booleanValue();
                      }else {
                         obj = str.y;
                         mPurchaseAgr = obj.mPurchaseAgreementInfo;
                         b1 = (mPurchaseAgr != null && mPurchaseAgr.mShowAgreement != null)? true: false;
                         PaymentMethodInfo selectedPaym = obj.getSelectedPaymentInfo();
                         obj = (selectedPaym != null && selectedPaym.isAgreementValid())? 1: null;
                         uArrayList1 = PatchProxy.apply(objArray, str, oi, "40");
                         if (uArrayList1 != PatchProxyResult.class) {
                         }else {
                            uArrayList1 = new ArrayList();
                            iterator = this.Y8().iterator();
                            while (iterator.hasNext()) {
                               uArrayList1.add(iterator.next().mAgreementIdentifyKey);
                            }
                         }
                         if (b1 || (obj && !str.U0.containsAll(uArrayList1))) {
                            b = true;
                         }else {
                            b = false;
                         }
                      }
                      if (b) {
                         if (!PatchProxy.applyVoid(objArray, str, oi, "42")) {
                            obj1 = this.Y8();
                            if (!q.f(obj1)) {
                               ArrayList uArrayList = new ArrayList();
                               uArrayList1 = new ArrayList();
                               iterator = obj1.iterator();
                               while (iterator.hasNext()) {
                                  MerchantLivePurchasePanelResponse$AgreementInfo uAgreementIn1 = iterator.next();
                                  uArrayList.add(uAgreementIn1.mAgreementUrlText);
                                  uArrayList1.add(uAgreementIn1.mAgreementIdentifyKey);
                               }
                               t$a uoa = new t$a(this.P8());
                               MerchantLivePurchasePanelResponse$PurchaseAgreementInfo mAgreementTi = str.y.mPurchaseAgreementInfo.mAgreementTip;
                               str.X0 = mAgreementTi;
                               uoa.X0(mAgreementTi);
                               uoa.v0(new b(uoa, obj1, new a0(str, obj1)));
                               uoa.N0(R.layout.arg_RES_7f0d06a7);
                               uoa.O0(uArrayList);
                               uoa.S0(R.string.arg_RES_7f1033c6);
                               uoa.u0(new d0(str, uArrayList1));
                               uoa.w0(true);
                               uoa.Q0(R.string.arg_RES_7f1033c9);
                               uoa.t0(new c0(str));
                               uoa.v(true);
                               uoa.L(new PopupInterface$g(R.layout.arg_RES_7f0d02ec));
                               uoa.p();
                               str.s = uoa.Y(new h0(str));
                            }
                         }
                         return;
                      }else if(PatchProxy.applyVoid(objArray, str, oi, "37")){
                         if (!TextUtils.x(str.C.K)) {
                            str.V.mCreateOrderParam.mAdActionType = str.C.K;
                         }
                         if (!TextUtils.x(str.C.J)) {
                            str.V.mCreateOrderParam.mCampaignType = str.C.J;
                         }
                      }
                      str.V.update(str.y);
                      obj = str.W;
                      FragmentActivity uFragmentAct = this.P8();
                      v = str.V;
                      OrderPaymentRequestInfo mCreateOrder = v.mCreateOrderParamStr;
                      OrderPaymentRequestInfo mCashierData = v.mCashierData;
                      MerchantLivePurchasePanelResponse mItemInfo = str.y.mItemInfo;
                      boolean b2 = (mItemInfo != null && mItemInfo.mSupportFreightInsurance != null)? true: false;
                      HashMap hashMap = PatchProxy.apply(objArray, str, oi, "38");
                      if (hashMap != PatchProxyResult.class) {
                      }else if(str.C == null){
                         hashMap = new HashMap();
                      }else {
                         hashMap = new HashMap();
                         if (!TextUtils.x(str.C.K)) {
                            hashMap.put("adActionType", str.C.K);
                         }
                         if (!TextUtils.x(str.C.J)) {
                            hashMap.put("campaignType", str.C.J);
                         }
                         if (!TextUtils.x(str.C.L)) {
                            hashMap.put("extType", str.C.L);
                         }
                      }
                      Object obj2 = hashMap;
                      a = str.A;
                      HashMap hashMap1 = a.c(str.y.mLogParam);
                      Objects.requireNonNull(obj);
                      b uob = b.class;
                      if (PatchProxy.isSupport(uob)) {
                         Object[] objArray1 = new Object[]{uFragmentAct,mCreateOrder,mCashierData,Integer.valueOf(5),Boolean.valueOf(b2),obj2,a,hashMap1};
                         uob = PatchProxy.apply(objArray1, obj, uob, "1");
                         if (uob != PatchProxyResult.class) {
                         label_0488 :
                            str.X7(uob);
                            return;
                         }
                      }
                      uob = obj.k(uFragmentAct, mCreateOrder, mCashierData, "", 5, b2, obj2, a, hashMap1);
                      goto label_0488 ;
                   }
                }else {
                   i3 = 2;
                   b = 1;
                   goto label_024e ;
                }
             }
          }
          i3 = 2;
          goto label_024e ;
       }
    }
    public void E8(){
       int i;
       int b;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "19")) {
          return;
       }
       i obj = PatchProxy.apply(objArray, this, oi, "27");
       i = 1;
       int i1 = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!this.y.isEmpty()){
          obj = this.y;
          if (obj.mBuyButton != null || obj.mMoneyInfo != null) {
             b = false;
          }
       }
       b = true;
       int i2 = 8;
       if (b) {
          this.D.setVisibility(i2);
          return;
       }else {
          this.W = new b(this.z, new i$f(this));
          this.v.a(this.u);
          obj = this.O;
          obj.e = this.A;
          obj.f = this.y;
          obj.g = this.z;
          this.D.setVisibility(i1);
          MerchantLivePurchasePanelResponse mBuyButton = this.y.mBuyButton;
          boolean b1 = (mBuyButton != null && mBuyButton.mCanClick != null)? true: false;
          this.N = new PayButtonEnableCondition(i, b1);
          this.E9(i);
          if (!PatchProxy.applyVoid(objArray, this, oi, "67")) {
             this.X = new a();
             this.X7(RxBus.f.f(a.class).observeOn(d.a).filter(h.b).subscribe(new f0(this)));
          }
          a uoa = b.a(this.P8());
          ClientContent$LiveStreamPackage liveStreamPa = this.h9();
          i ty = this.y;
          MerchantLivePurchasePanelResponse mBuyButton1 = ty.mBuyButton;
          int i3 = (mBuyButton1 == null)? 0: mBuyButton1.mCanClick;
          uoa.S(liveStreamPa, ty, i3, this.c9());
          this.J0(this.Y.s0(), new z(this));
          MerchantLivePurchasePanelResponse mCrossBorder = this.y.mCrossBorderInfo;
          if (mCrossBorder == null || mCrossBorder.mUserAuthenticationId > 0) {
             i = false;
          }
          this.t = i;
          obj = this.L;
          if (this.s9()) {
             i1 = 8;
          }
          obj.setVisibility(i1);
          b = (this.s9())? -1: a1.e(160.00f);
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(b), this, oi, "26")) {
             ConstraintLayout$LayoutParams layoutParams = this.E.getLayoutParams();
             layoutParams.width = b;
             this.E.setLayoutParams(layoutParams);
          }
          if (!PatchProxy.applyVoid(objArray, this, oi, "21")) {
             this.V0 = d.c(this.R8(), "KwaishopCCrmMember_JoinChange", this.W0);
          }
          return;
       }
    }
    public final void E9(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "28")) {
          return;
       }
       this.F9(p0, null);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, i.class, "17")) {
          return;
       }
       this.O = new c(this.m8(), this.u);
       return;
    }
    public void F9(boolean p0,BuyButton p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oi, "29")) {
          return;
       }
       i tK = this.K;
       BuyButton uBuyButton = 8;
       i = 0;
       int i1 = (this.t9())? 0: 8;
       tK.setVisibility(i1);
       this.q9(this.y.getSelectedPaymentInfo(), this.y.mMoneyInfo);
       if (p1 == null) {
          MerchantLivePurchasePanelResponse mBuyButton = this.y.mBuyButton;
          if (mBuyButton != null) {
             p1 = mBuyButton.copyNewButton();
             p1.mDisableDescription = this.l9();
             p1.mShowAnimate = this.l9();
             String str = (this.l9())? TextUtils.k(this.y.mFakeText.mFakeButtonText): mBuyButton.mBtnTitle;
             p1.mBtnTitle = str;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p1, this, oi, "50") && p1 != null) {
          if (!PatchProxy.applyVoidOneRefs(p1, this, oi, "51")) {
             if (p1.mShowAnimate != null) {
                this.T.c();
             }else {
                this.T.b();
             }
          }
          this.G.setText(TextUtils.k(p1.mBtnTitle));
          if (!PatchProxy.applyVoidOneRefs(p1, this, oi, "52")) {
             if (p1.mDisableDescription != null || TextUtils.x(p1.mDescription)) {
                this.I.setVisibility(uBuyButton);
             }else {
                this.I.setVisibility(i);
                this.I.setText(p1.mDescription);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p1, this, oi, "53") && !j.h(p1.mBackgroundColors)) {
             StateListDrawable stateListDra = new StateListDrawable();
             int len = p1.mBackgroundColors.length;
             int[] ointArray = new int[len];
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                ointArray[i2] = TextUtils.J(p1.mBackgroundColors[i2], a1.a(0x7f061dfb));
             }
             Object[] objArray = PatchProxy.applyOneRefs(ointArray, this, oi, "54");
             if (objArray != PatchProxyResult.class) {
             }else if(j.g(ointArray)){
                objArray = null;
             }else {
                objArray = new GradientDrawable();
                if (len > 1) {
                   objArray.setColors(ointArray);
                   objArray.setGradientType(i);
                   objArray.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
                }else {
                   objArray.setColor(ointArray[i]);
                }
                objArray.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f070a99));
             }
             if (objArray != null) {
                int[] ointArray1 = new int[i];
                stateListDra.addState(ointArray1, objArray);
                this.F.setBackground(stateListDra);
             }
          }
       }
    label_0135 :
       if (!PatchProxy.applyVoid(null, this, oi, "49")) {
          i tN = this.N;
          if (tN != null && tN.mEnable == null) {
             i = 1;
          }
          this.N = null;
          this.E.setEnabled((i ^ 0x01));
          float f = (!i)? 0: 0x3f000000;
          this.G9(f);
       }
       if (p0) {
          MerchantLivePurchasePanelResponse mBuyButton1 = this.y.mBuyButton;
          if (mBuyButton1 != null) {
             this.G9(mBuyButton1.mOpacity);
          }
       }
       return;
    }
    public final void G9(float p0){
       ObjectAnimator objectAnimat;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "30")) {
          return;
       }
       oi = this.T;
       float f = 0x3f800000 - p0;
       Objects.requireNonNull(oi);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), oi, uob, "1")) {
          b h = oi.h;
          if (h != null) {
             h.cancel();
          }
          h = oi.a;
          float alpha = h.getAlpha();
          if (PatchProxy.isSupport(uob)) {
             objectAnimat = PatchProxy.applyThreeRefs(h, Float.valueOf(alpha), Float.valueOf(f), null, b.class, "5");
             if (objectAnimat != PatchProxyResult.class) {
             label_007a :
                oi.h = objectAnimat;
                objectAnimat.start();
             }
          }
          float[] uofloatArray = new float[]{alpha,f};
          objectAnimat = ObjectAnimator.ofFloat(h, "alpha", uofloatArray);
          objectAnimat.setInterpolator(new LinearInterpolator());
          objectAnimat.setDuration(200);
          goto label_007a ;
       }
       this.G.setAlpha(f);
       this.I.setAlpha(f);
       this.H.setAlpha(f);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, i.class, "24")) {
          return;
       }
       i tO = this.O;
       Objects.requireNonNull(tO);
       if (!PatchProxy.applyVoid(null, tO, c.class, "6")) {
          tO.c();
       }
       tO = this.O;
       tO.b = null;
       tO.a = null;
       this.O = null;
       return;
    }
    public void J8(){
       i ts;
       b d;
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "20")) {
          return;
       }
       super.J8();
       this.W8();
       this.S = null;
       if (!PatchProxy.applyVoid(null, this, oi, "23")) {
          ts = this.X;
          if (ts != null) {
             ts.d();
             this.X = null;
          }
       }
       ts = this.s;
       if (ts != null && ts.K()) {
          this.s.o();
          this.s = null;
       }
       ts = this.W;
       if (ts != null) {
          Objects.requireNonNull(ts);
          if (!PatchProxy.applyVoid(null, ts, b.class, "21")) {
             b9.a(ts.a);
             b9.a(ts.b);
             b9.a(ts.c);
             ts.e = null;
             d = ts.d;
             if (d != null) {
                d.clear();
                ts.d = null;
             }
             ts.f = 0;
             ts.h = 0;
             ts.i = 0;
             ts.k = null;
             ts.l = 0;
             ts.m = 0;
             b n = ts.n;
             if (n != null) {
                n.d();
             }
          }
          this.W = null;
       }
       this.T.a();
       this.T.b();
       this.V8();
       this.t = false;
       if (!PatchProxy.applyVoid(null, this, oi, "22") && !TextUtils.x(this.V0)) {
          d.l(this.V0);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, i.class, "48")) {
          return;
       }
       if (this.U == null) {
          this.U = new PageInfoReqParam(this.y);
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, i.class, "25")) {
          return;
       }
       i tZ = this.Z;
       if (tZ != null) {
          tZ.o();
          this.Z = null;
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, i.class, "46")) {
          return;
       }
       i tR = this.R;
       if (tR != null) {
          tR.dismiss();
          this.R = null;
       }
       return;
    }
    public void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "68")) {
          return;
       }
       this.z.dismiss();
       return;
    }
    public final List Y8(){
       ArrayList obj = PatchProxy.apply(null, this, i.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       MerchantLivePurchasePanelResponse mPurchaseAgr = this.y.mPurchaseAgreementInfo;
       if (mPurchaseAgr != null) {
          MerchantLivePurchasePanelResponse$PurchaseAgreementInfo mAgreementUr = mPurchaseAgr.mAgreementUrl;
          if (mAgreementUr != null) {
             obj.addAll(mAgreementUr);
          }
       }
       PaymentMethodInfo selectedPaym = this.y.getSelectedPaymentInfo();
       if (selectedPaym != null && selectedPaym.isAgreementValid()) {
          obj.add(MerchantLivePurchasePanelResponse$AgreementInfo.from(selectedPaym));
       }
       return obj;
    }
    public ImageSpan Z8(){
       h obj = PatchProxy.apply(null, this, i.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Q == null) {
          obj = ia.a(R.drawable.arg_RES_7f080e1b);
          obj.setBounds(0, 0, a1.d(R.dimen.pv), a1.d(R.dimen.pv));
          this.Q = new ImageSpan(obj);
       }
       return this.Q;
    }
    public ImageSpan a9(){
       h obj = PatchProxy.apply(null, this, i.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.P == null) {
          obj = ia.a(R.drawable.arg_RES_7f080e1c);
          obj.setBounds(0, 0, a1.d(R.dimen.pv), a1.d(R.dimen.pv));
          this.P = new ImageSpan(obj);
       }
       return this.P;
    }
    public final String b9(){
       MerchantLivePurchasePanelResponse mBuyButton = this.y.mBuyButton;
       if (mBuyButton == null) {
          return "";
       }
       return mBuyButton.mButtonActionData;
    }
    public final String c9(){
       MerchantLivePurchasePanelResponse mBuyButton = this.y.mBuyButton;
       String str = (mBuyButton == null)? null: mBuyButton.mBtnTitle;
       return str;
    }
    public final int d9(){
       MerchantLivePurchasePanelResponse mBuyButton = this.y.mBuyButton;
       if (mBuyButton == null) {
          return -1;
       }
       return mBuyButton.mButtonType;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a2f05);
       this.E = m1.f(p0, 0x7f0a2f06);
       this.F = m1.f(p0, 0x7f0a052d);
       this.G = m1.f(p0, 0x7f0a2f08);
       this.H = m1.f(p0, 0x7f0a454f);
       this.I = m1.f(p0, 0x7f0a2f07);
       this.J = m1.f(p0, 0x7f0a2f0a);
       this.K = m1.f(p0, 0x7f0a2f09);
       m1.b(p0, new i$b(this), R.id.order_confirm_bottom_btn_container);
       this.L = m1.f(p0, 0x7f0a3206);
       this.T = new b(this.E, null, null, this.H);
       TextView textView = m1.f(p0, R.id.sku_tips);
       this.M = textView;
       textView.setClickable(false);
       return;
    }
    public FeedLogCtx e9(){
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, i.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj != null) {
          objArray = obj.getFeedLogCtx();
       }
       return objArray;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new l0());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public ClientContent$LiveStreamPackage h9(){
       i obj = PatchProxy.apply(null, this, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       ClientContent$LiveStreamPackage liveStreamPa = (obj != null)? obj.getLiveStreamPackage(): new ClientContent$LiveStreamPackage();
       return liveStreamPa;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "18")) {
          return;
       }
       this.y = this.q8(MerchantLivePurchasePanelResponse.class);
       this.z = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_PANEL_FRAGMENT");
       this.v = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE");
       this.A = this.t8("LIVE_BASE_CONTEXT");
       this.B = this.r8("LIVE_AUDIENCE_SKU_MANAGER");
       this.C = this.q8(MerchantLivePurchasePanelFragment$b.class);
       this.w = this.r8("ID_PANEL_ADDRESS_SERVICE");
       this.x = this.r8("ID_CROSS_BORDER_SERVICE");
       return;
    }
    public PageInfoReqParam j9(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S8();
       return this.U;
    }
    public boolean k9(PayResultQueryResponse p0,String p1){
       int i;
       i c;
       int i1;
       PayResultQueryResponse$PayResultAction obj4;
       boolean b1;
       PayResultQueryResponse mBuyResultJu;
       String str2;
       String str3;
       i$b uob;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, i.class, "70");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       boolean b = false;
       if (obj1 == null) {
          return b;
       }
       String str = null;
       i = 4;
       if (a.a()) {
          c = obj.C;
          i y = obj.y;
          i z = obj.z;
          d uod = d.class;
          i1 = 3;
          if (PatchProxy.isSupport(uod)) {
             Object[] objArray = new Object[]{obj1,obj2,c,y,z};
             obj4 = PatchProxy.apply(objArray, str, uod, "6");
             if (obj4 != patchProxyRe) {
                b1 = obj4.booleanValue();
             }else if(obj1.mBuyResultType != 1 && a.t().d("OrderConfirmPagePayResultFix", b)){
                d.f(p0);
                mBuyResultJu = obj1.mBuyResultJumpPage;
                int i2 = 0x7f102750;
                if (mBuyResultJu == i1) {
                   if (!d.e(obj1.mPayResultAction)) {
                      RxBus.f.c(new PageCloseEvent(h0.a(Uri.parse(c.x)).get("detail_page_id")));
                      uob = i.m();
                      uob.y(a1.p(i2));
                      uob.l(1);
                      i.z(uob);
                   }
                   d.d(obj1.mPayResultAction, y, obj2, z);
                }else if(mBuyResultJu == i){
                   d.d(obj1.mPayResultAction, y, obj2, z);
                }else if(c.F == 501){
                   uob = i.m();
                   uob.y(a1.p(i2));
                   uob.l(1);
                   i.z(uob);
                }
                b1 = true;
             }
             b1 = false;
          }else {
             goto label_0053 ;
          }
          if (b1) {
             this.y9();
             return 1;
          }
       }
       mBuyResultJu = obj1.mBuyResultJumpPage;
       c = (mBuyResultJu == 1)? 1: 0;
       PayResultQueryResponse mPayResultAc = obj1.mPayResultAction;
       String str1 = "";
       if (mPayResultAc == null) {
          if (obj1.mCrossBorderDeliverStatus == 1) {
             i y1 = obj.y;
             if (y1 != null) {
                MerchantLivePurchasePanelResponse mCrossBorder = y1.mCrossBorderInfo;
                if (mCrossBorder != null) {
                   str = TextUtils.e(mCrossBorder.mCertificationPageUrl, a.a(obj2, mCrossBorder.mTitle, mCrossBorder.mSkuImageUrl, mCrossBorder.mCustomsRequirements, obj.z.Pa()));
                }
             }
             str2 = str;
             str3 = str1;
             i1 = -1;
          label_0142 :
             HashMap hashMap = new HashMap();
             hashMap.put("tid", obj2);
             if (!TextUtils.x(obj1.mLivingPayData)) {
                hashMap.put("livingPayData", obj1.mLivingPayData);
             }
             if (obj1.mBuyResultType == 1 && (c && d.a(-1397441499).Ir(1, i1, str2, str3, hashMap))) {
                b = true;
             }
          label_0175 :
             return b;
          }
       }else {
          obj4 = mPayResultAc.mType;
          if (obj4 == 1) {
             i y2 = obj.y;
             if (y2 != null) {
                MerchantLivePurchasePanelResponse mCrossBorder1 = y2.mCrossBorderInfo;
                if (mCrossBorder1 != null) {
                   str = TextUtils.e(mCrossBorder1.mCertificationPageUrl, a.a(obj2, mCrossBorder1.mTitle, mCrossBorder1.mSkuImageUrl, mCrossBorder1.mCustomsRequirements, obj.z.Pa()));
                }
             }
          }else if(obj4 == i){
             PayResultQueryResponse$PayResultAction mUrl = mPayResultAc.mUrl;
          }else if(obj4 == 7 && mBuyResultJu != i){
             str1 = a.t().c("purchasePanelWRTTradeToast", str1);
          }
          str2 = str;
          str3 = str1;
          PayResultQueryResponse$PayResultAction payResultAct = obj4;
          goto label_0142 ;
       }
    label_013f :
       str2 = str;
       str3 = str1;
       i1 = 0;
       goto label_0142 ;
    }
    public final boolean l9(){
       OrderConfirmCommodity mSpikeInfo = this.C.q.mSpikeInfo;
       boolean b = (mSpikeInfo != null && (this.y.mFakeText != null && (mSpikeInfo.mSoldStatus == 2 && mSpikeInfo.mSoldStock < mSpikeInfo.mSpikeTotalStock)))? true: false;
       return b;
    }
    public final boolean m9(){
       boolean b1;
       i oi = i.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, oi, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.B.i != null) {
          Boolean uBoolean = PatchProxy.apply(objArray, this, oi, "33");
          if (uBoolean != patchProxyRe) {
          }else {
             MerchantLivePurchasePanelResponse mItemInfo = this.y.mItemInfo;
             b1 = (mItemInfo != null && mItemInfo.mIsHiddenSpecification != null)? true: false;
             uBoolean = Boolean.valueOf(b1);
          }
          if (!uBoolean.booleanValue() && !this.B.f()) {
             oi = this.B;
             Object obj1 = PatchProxy.applyOneRefs(oi, objArray, c.class, "2");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(oi == null){
                Iterator iterator = oi.d().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (!c.a(iterator.next())) {
                         b1 = false;
                         break ;
                      }
                   }
                }
             }
             b1 = true;
             if (!b1) {
             label_007d :
                return b;
             }
          }
       }
    label_007c :
       b = false;
       goto label_007d ;
    }
    public void n9(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "61")) {
          return;
       }
       if (q.f(this.y.mDiscountDetailInfos)) {
          return;
       }
       a uoa = b.a(this.P8());
       ClientContent$LiveStreamPackage liveStreamPa = this.h9();
       i ty = this.y;
       try{
          uoa.n(liveStreamPa, ty);
          i tO = this.O;
          if (tO != null) {
             tO.e(this.y.mDiscountDetailInfos, new i$e(this, p0));
          }
          this.S = p0;
          this.K.setText(p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void o9(SpannableStringBuilder p0,ReplacementSpan p1,ReplacementSpan p2){
       int this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "55")) {
          return;
       }
       if (p0 == null || (p1 != null && p2 != null)) {
          int spanStart = p0.getSpanStart(p1);
          int spanEnd = p0.getSpanEnd(p1);
          ReplacementSpan replacementS = -1;
          if (spanStart == replacementS && spanEnd == replacementS) {
             return;
          }else {
             ReplacementSpan[] spans = p0.getSpans(spanStart, spanEnd, ReplacementSpan.class);
             if (spans == null) {
                return;
             }else {
                int len = spans.length;
                this = 0;
                while (this < len) {
                   object oobject = spans[this];
                   if (oobject instanceof ImageSpan) {
                      p0.removeSpan(oobject);
                   }
                   this++;
                }
                p0.setSpan(p2, spanStart, spanEnd, 33);
             }
          }
       }
       return;
    }
    public void q9(PaymentMethodInfo p0,MerchantLivePurchasePanelResponse$MoneyInfo p1){
       int i;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, i.class, "62")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       if (!PatchProxy.applyVoidThreeRefs(spannableStr, p1, p0, this, i.class, "63")) {
          long l = (obj2 == null)? 0: obj2.mRealPayFee;
          if (obj1 != null && obj1.mHasBalance != null) {
             l = obj1.mDeposit;
          }
          String str = p0.m(l);
          if (obj2 == null || obj2.mDisplayType == null) {
             str = "-";
          }
          String str1 = str;
          MerchantLivePurchasePanelResponse mMoneyInfo = obj.y.mMoneyInfo;
          i = 0x7f070283;
          if (mMoneyInfo != null && !TextUtils.x(mMoneyInfo.mRealPayFeePrefixDesc)) {
             SpannableStringBuilderUtils.h(spannableStr, obj.y.mMoneyInfo.mRealPayFeePrefixDesc, a1.d(i), a1.a(R.color.arg_RES_7f061dfb));
             SpannableStringBuilderUtils.i(spannableStr, a1.d(R.dimen.arg_RES_7f07030a));
          }
          SpannableStringBuilderUtils.b(spannableStr, p0.f(str1, a1.d(i), a1.d(R.dimen.arg_RES_7f0702d6), Typeface.DEFAULT_BOLD, a1.d(R.dimen.arg_RES_7f0702e3), 1), a1.a(R.color.arg_RES_7f061dfb));
       }
       SpannableStringBuilderUtils.i(spannableStr, a1.d(R.dimen.arg_RES_7f070334));
       if (!PatchProxy.applyVoidThreeRefs(spannableStr, p0, p1, this, i.class, "64")) {
          if (obj1 != null && obj1.mHasBalance != null) {
             SpannableStringBuilderUtils.h(spannableStr, a1.r(R.string.arg_RES_7f1033fb, p0.m(obj1.mBalance)), a1.d(R.dimen.pv), a1.a(R.color.arg_RES_7f061dfb));
          }else if(obj2 != null && (obj2.mDisplayType != null && obj2.mDiscountFee > 0)){
             obj.u9(spannableStr, obj.y, true);
          }
       }
       obj.J.setText(spannableStr);
       return;
    }
    public final boolean s9(){
       BuyButton mButtonStyle;
       MerchantLivePurchasePanelResponse mBuyButton = this.y.mBuyButton;
       boolean b = false;
       mBuyButton = (mBuyButton == null)? 0: mBuyButton.mButtonStyle;
       if (mBuyButton == 1) {
          b = true;
       }
       return b;
    }
    public boolean t9(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, oi, "60");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       obj = this.y;
       MerchantLivePurchasePanelResponse mMoneyInfo = obj.mMoneyInfo;
       boolean b = false;
       if (mMoneyInfo == null || mMoneyInfo.mDisplayType == null) {
          return b;
       }
       if (obj.isPreSell()) {
          return b;
       }
       i = 0x7f070267;
       if (mMoneyInfo.mDiscountFee > 0) {
          if (!PatchProxy.applyVoidTwoRefs(spannableStr, mMoneyInfo, this, oi, "65")) {
             SpannableStringBuilderUtils.h(spannableStr, TextUtils.k(mMoneyInfo.mDiscountFeeDesc), a1.d(i), a1.a(R.color.arg_RES_7f061d96));
          }
       }else {
          this.u9(spannableStr, this.y, b);
       }
       int i1 = spannableStr.length();
       if (!PatchProxy.applyVoidOneRefs(spannableStr, this, oi, "56")) {
          SpannableStringBuilderUtils.i(spannableStr, a1.d(R.dimen.arg_RES_7f07034b));
          SpannableStringBuilderUtils.h(spannableStr, a1.p(R.string.arg_RES_7f10339f), a1.d(i), a1.a(R.color.arg_RES_7f061d96));
          SpannableStringBuilderUtils.i(spannableStr, a1.d(R.dimen.arg_RES_7f07031b));
          ImageSpan imageSpan = PatchProxy.apply(objArray, this, oi, "57");
          if (imageSpan != patchProxyRe) {
          }else {
             i tO = this.O;
             imageSpan = (tO == null || !tO.d())? this.a9(): this.Z8();
          }
          SpannableStringBuilderUtils.g(spannableStr, imageSpan);
       }
       this.S = spannableStr;
       SpannableStringBuilderUtils.j(this.K, spannableStr, i1, (spannableStr.length() - i1), new i$d(this, spannableStr), false, a1.a(R.color.arg_RES_7f061d96));
       this.L.setOnClickListener(new y(this, spannableStr));
       this.K.setText(spannableStr);
       b.a(this.P8()).R(this.h9(), this.y);
       return true;
    }
    public final void u9(SpannableStringBuilder p0,MerchantLivePurchasePanelResponse p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, i.class, "66")) {
          return;
       }
       MerchantLivePurchasePanelResponse mMoneyInfo = p1.mMoneyInfo;
       p1 = p1.mExpressInfo;
       if (p1 != null && mMoneyInfo != null) {
          if (this.y.isPreSell()) {
             return;
          }else if(!TextUtils.x(mMoneyInfo.mTaxOrExpressFeeDesc) && !TextUtils.x(mMoneyInfo.mTaxOrExpressFeeColor)){
             if (p1.mExpressFee > 0 && p2) {
                SpannableStringBuilderUtils.i(p0, a1.d(R.dimen.arg_RES_7f07031b));
                SpannableStringBuilderUtils.h(p0, mMoneyInfo.mTaxOrExpressFeeDesc, a1.d(R.dimen.pv), TextUtils.J(mMoneyInfo.mTaxOrExpressFeeColor, a1.a(R.color.arg_RES_7f061da9)));
             }else {
                SpannableStringBuilderUtils.h(p0, mMoneyInfo.mTaxOrExpressFeeDesc, a1.d(R.dimen.pv), TextUtils.J(mMoneyInfo.mTaxOrExpressFeeColor, a1.a(R.color.arg_RES_7f061de2)));
             }
             return;
          }else if(p1.mExpressFee > 0){
             if (p2) {
                SpannableStringBuilderUtils.i(p0, a1.d(R.dimen.arg_RES_7f07031b));
             }
             SpannableStringBuilderUtils.h(p0, a1.r(R.string.arg_RES_7f1033a2, p0.m(this.y.mExpressInfo.mExpressFee)), a1.d(R.dimen.pv), a1.a(R.color.arg_RES_7f061d96));
          }else {
             SpannableStringBuilderUtils.h(p0, a1.p(R.string.arg_RES_7f1033a0), a1.d(R.dimen.pv), a1.a(R.color.arg_RES_7f061de2));
          }
       }
       return;
    }
    public void x9(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "45")) {
          return;
       }
       if (!this.z.isAdded()) {
          return;
       }
       oi = this.R;
       if (oi != null) {
          oi.dismiss();
       }
       PaymentMethodInfo selectedPaym = this.y.getSelectedPaymentInfo();
       if (p0 && (selectedPaym != null && selectedPaym.needShowIconLoading())) {
          PayLoadingDialog payLoadingDi = new PayLoadingDialog();
          this.R = payLoadingDi;
          payLoadingDi.sh(selectedPaym.mPayLoadingInfo.mLoadingContent);
          this.R.th(selectedPaym.mPayLoadingInfo.mLoadingIconUrl);
       }else {
          ProgressFragment progressFrag = new ProgressFragment();
          this.R = progressFrag;
          progressFrag.Jh(a1.p(R.string.arg_RES_7f103461));
       }
       this.R.setCancelable(false);
       this.R.show(this.z.getChildFragmentManager(), "");
       return;
    }
    public void y9(){
       if (PatchProxy.applyVoid(null, this, i.class, "69")) {
          return;
       }
       this.z.dismiss();
       return;
    }
}
