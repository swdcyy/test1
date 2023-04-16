package com.kuaishou.merchant.transaction.purchase.presenter.f0;
import erd.g;
import com.kuaishou.merchant.transaction.purchase.presenter.g0;
import com.kuaishou.merchant.transaction.purchase.model.PayResultQueryParam;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.model.PayResultQueryResponse;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import java.lang.System;
import k2b.e0;
import em4.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import ue4.k;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import tkd.b;
import tkd.d;
import fs5.a;
import java.util.Map;
import um4.h1;
import java.lang.Runnable;
import um4.g1;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import um4.m1;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import com.kuaishou.merchant.basic.util.f;

public final class f0 implements g	// class@000974
{
    public final g0 b;
    public final boolean c;
    public final long d;
    public final PayResultQueryParam e;
    public final int f;
    public final String g;

    public void f0(g0 p0,boolean p1,long p2,PayResultQueryParam p3,int p4,String p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       int i4;
       String str4;
       boolean b1;
       Activity activity;
       String str6;
       f0 uof0 = this;
       f0 b = uof0.b;
       f0 c = uof0.c;
       f0 d = uof0.d;
       f0 e = uof0.e;
       f0 f = uof0.f;
       f0 g = uof0.g;
       object oobject = p0;
       Objects.requireNonNull(b);
       g0 og0 = g0.class;
       int i = 0;
       int i1 = 2;
       int i2 = 1;
       if (PatchProxy.isSupport(og0)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(c),Long.valueOf(d),e,Integer.valueOf(f),g};
          if (!PatchProxy.applyVoid(objArray, b, og0, "6")) {
          label_0048 :
             MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
             StringBuilder str = "onPayResultQuerySuccess: data ";
             String str1 = (oobject != null)? oobject.toString(): null;
             a.s(pURCHASE, "PayPresenter", str+str1);
             b.F = System.currentTimeMillis();
             if (oobject == null) {
                a.s(pURCHASE, "PayPresenter", "onPayResultQuerySuccess: data null");
                b.P8();
                b.x = true;
                m.n(b.r, 3, b.A, d, "-1000");
             }else if(c != null){
                i2 = 1;
                String str2 = (oobject.mBuyResultType == i2)? "success": "unknown";
                b.Y8(str2);
             }else {
                str6 = 1;
             }
             i = 0x7f11066a;
             if (oobject.mBuyResultType == i2) {
                if (oobject.mBuyResultJumpPage == 2) {
                   if (!TextUtils.x(oobject.mBuyResultDesc)) {
                      i.d(i, oobject.mBuyResultDesc);
                   }
                   k.a.a(b.getActivity());
                }
             }else {
                str6 = 2;
             }
             HashMap hashMap = new HashMap();
             hashMap.put("tid", String.valueOf(d));
             f0 uof01 = f;
             f0 uof02 = g;
             hashMap.put("batchId", String.valueOf(b.B));
             if (!TextUtils.x(oobject.mLivingPayData)) {
                hashMap.put("livingPayData", oobject.mLivingPayData);
             }
             PayResultQueryResponse payResultQue = (oobject.mBuyResultJumpPage == 1 && TextUtils.n(b.t.mCarrierType, "2"))? 1: null;
             String str3 = "";
             int i3 = 1;
             if (oobject.mBuyResultType == i3 && (payResultQue && d.a(-1397441499).Go(i3, hashMap))) {
                a.s(pURCHASE, "PayPresenter", "back to live when pay success!");
                og0 = b.r;
                i4 = (oobject.mBuyResultType == i3)? 1: 2;
                m.n(og0, i4, b.A, d, oobject.mBuyResultType+str3);
             }else if(oobject.mBuyResultType == null){
                if (c != null && oobject.mRetryCount > null) {
                   str4 = str3;
                   h1 oh1 = new h1(b, d, e, oobject, uof02);
                   b.R8(hashMap);
                }else {
                   str4 = str3;
                   if (c == null && uof01 > null) {
                      g1 og1 = new g1(b, d, e, uof01, uof02);
                      b.R8(hashMap);
                   }else if(PatchProxy.applyVoid(null, b, og0, "7")){
                      activity = b.getActivity();
                      if (activity == null) {
                         a.s(pURCHASE, "PayPresenter", "popupQueryFailedDialog: Activity null");
                      }else {
                         t$a uoa = new t$a(activity);
                         uoa.y0(R.string.arg_RES_7f1033f5);
                         uoa.S0(R.string.arg_RES_7f1033e0);
                         uoa.p();
                         t$a uoa1 = f.e(uoa);
                         b.v = uoa1.Y(new m1(b));
                      }
                   }
                   b1 = true;
                   b.x = b1;
                }
                m.n(b.r, 3, b.A, d, oobject.mBuyResultType+str4);
             }else {
                str4 = str3;
                g0 og01 = null;
                if (!TextUtils.x(oobject.mJumpUrl)) {
                   if (!TextUtils.x(oobject.mBuyResultDesc)) {
                      i.d(R.style.arg_RES_7f11066a, oobject.mBuyResultDesc);
                   }
                   b.x = true;
                   PayResultQueryResponse mJumpUrl = oobject.mJumpUrl;
                   if (!PatchProxy.applyVoidOneRefs(mJumpUrl, b, og0, "9")) {
                      Activity activity1 = b.getActivity();
                      if (activity1 == null) {
                         a.s(pURCHASE, "PayPresenter", "jumpToPayResultAndCloseCurrentPage: activity null");
                      }else if(TextUtils.x(mJumpUrl) && !b.P8()){
                         a.s(pURCHASE, "PayPresenter", "jumpToOrderDetailAndCloseCurrentPage: link null and order detail url null");
                         k.a.a(activity1);
                      }else {
                         a.s(pURCHASE, "PayPresenter", "jumpToPayResultAndCloseCurrentPage: link "+mJumpUrl);
                         g0 t = b.t;
                         if (t != null) {
                            og01 = t.mCarrierType;
                         }
                         Uri obj = PatchProxy.applyTwoRefs(mJumpUrl, og01, b, og0, "10");
                         if (obj != PatchProxyResult.class) {
                            mJumpUrl = obj;
                         }else if(TextUtils.x(mJumpUrl) || TextUtils.x(og01)){
                            a.s(pURCHASE, "PayPresenter", "concatCarrierType: carrierType "+og01);
                         }else {
                            obj = x0.f(mJumpUrl);
                            if (obj != null) {
                               String str5 = "carrierType";
                               if (TextUtils.x(obj.getQueryParameter(str5))) {
                                  mJumpUrl = obj.buildUpon().appendQueryParameter(str5, og01).build().toString();
                               }
                            }
                         }
                         f.e(activity1, mJumpUrl);
                         k.a.a(activity1);
                      }
                   }
                   og0 = b.r;
                   i4 = (oobject.mBuyResultType == 1)? 1: 2;
                   m.n(og0, i4, b.A, d, oobject.mBuyResultType+str4);
                }else {
                   b1 = true;
                   b.x = b1;
                   b.P8();
                   og0 = b.r;
                   i4 = (oobject.mBuyResultType == b1)? 1: 2;
                   m.n(og0, i4, b.A, d, oobject.mBuyResultType+str4);
                }
             }
          }
       }else {
          goto label_0048 ;
       }
       return;
    }
}
