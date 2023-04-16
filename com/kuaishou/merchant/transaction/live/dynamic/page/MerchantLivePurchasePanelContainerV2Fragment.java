package com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment;
import jj4.a;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import gd4.d;
import gd4.d$a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.CharSequence;
import kj4.a;
import kj4.a$a;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ma4.e;
import ma4.c;
import android.os.Bundle;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import android.net.Uri;
import android.net.Uri$Builder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import ue4.o;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import gu3.b;
import brd.t;
import t45.d;
import brd.z;
import jj4.c;
import erd.g;
import crd.b;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import java.lang.reflect.Type;
import java.util.Collection;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import qt3.i;
import android.content.Context;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment$b;
import qt3.i$a;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment$c;
import android.content.DialogInterface$OnKeyListener;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import ekd.m1;
import com.yxcorp.utility.n;
import jj4.b;
import android.view.View$OnClickListener;
import lnc.a1;
import sk4.c;
import et3.a;
import com.kuaishou.merchant.basic.util.h;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import lnc.b9;
import java.util.HashMap;

public final class MerchantLivePurchasePanelContainerV2Fragment extends MerchantBottomSheetFragment implements a	// class@0007af
{
    public MerchantPurchasePanelV2Fragment B;
    public b C;
    public boolean D;
    public HashMap E;
    public static final MerchantLivePurchasePanelContainerV2Fragment$a F;

    static {
       MerchantLivePurchasePanelContainerV2Fragment.F = new MerchantLivePurchasePanelContainerV2Fragment$a(null);
    }
    public void MerchantLivePurchasePanelContainerV2Fragment(){
       super();
    }
    public static void Lh(MerchantLivePurchasePanelContainerV2Fragment p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 0;
       }
       p0.Kh(p1);
       return;
    }
    public String C1(){
       return "MERCHANT_PURCHASE_HALF_PAGE";
    }
    public void K2(){
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelContainerV2Fragment.class, "19")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public final void Kh(int p0){
       Object[] objArray;
       String obj;
       if (PatchProxy.isSupport(MerchantLivePurchasePanelContainerV2Fragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantLivePurchasePanelContainerV2Fragment.class, "17")) {
          return;
       }
       try{
          objArray = null;
          obj = PatchProxy.apply(objArray, this, MerchantLivePurchasePanelContainerV2Fragment.class, "18");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             MerchantLivePurchasePanelContainerV2Fragment tB = this.B;
             if (tB == null) {
                a.S("mContentFragment");
             }
             if (!tB.isDetached()) {
                d$a n = d.n;
                MerchantLivePurchasePanelContainerV2Fragment tB1 = this.B;
                if (tB1 == null) {
                   a.S("mContentFragment");
                }
                objArray = n.a(tB1).s0();
             }
          }
       }catch(java.lang.Exception e0){
          a.l(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "MerchantLivePurchasePanelContainerFragment", "tryGetPageIdFail", e0);
       }
       obj = (objArray == null || !objArray.length())? 1: null;
       if (obj) {
          a.g(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "MerchantLivePurchasePanelContainerFragment", "forwardPageClosingEvent:noPageId");
          return;
       }else {
          a.A.a(objArray, p0);
          return;
       }
    }
    public final void Mh(boolean p0){
       if (PatchProxy.isSupport(MerchantLivePurchasePanelContainerV2Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MerchantLivePurchasePanelContainerV2Fragment.class, "21")) {
          return;
       }
       c uoc = d.a(-1103669376).k60();
       if (uoc != null) {
          if (p0) {
             uoc.b("MerchantOrderConfirm");
          }else {
             uoc.f("MerchantOrderConfirm");
          }
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       LiveMerchantBaseContext liveMerchant;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLivePurchasePanelContainerV2Fragment.class, "9")) {
          return;
       }
       super.onActivityCreated(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.apply(null, this, MerchantLivePurchasePanelContainerV2Fragment.class, "10") != patchProxyRe) {
       }else {
          FragmentActivity activity = this.getActivity();
          if (activity != null && !activity.isFinishing()) {
             e uoe = this.getChildFragmentManager().beginTransaction();
             MerchantPurchasePanelV2Fragment merchantPurc = PatchProxy.apply(null, this, MerchantLivePurchasePanelContainerV2Fragment.class, "11");
             if (merchantPurc != patchProxyRe) {
             }else {
                Bundle arguments = this.getArguments();
                if (arguments != null) {
                   Parcelable parcelable = arguments.getParcelable("MERCHANT_BASE_CONTEXT");
                   if (parcelable != null) {
                      liveMerchant = b.a(parcelable);
                   label_005b :
                      MerchantPurchasePanelV2Fragment$a z = MerchantPurchasePanelV2Fragment.z;
                      String str = PatchProxy.applyOneRefs(liveMerchant, this, MerchantLivePurchasePanelContainerV2Fragment.class, "12");
                      if (str != patchProxyRe) {
                      }else {
                         patchProxyRe = this.getArguments();
                         if (patchProxyRe != null) {
                            String str1 = patchProxyRe.getString("KEY_MERCHANT_ROUTER_URL");
                            if (str1 != null) {
                               Uri uri = Uri.parse(str1);
                               Uri$Builder uBuilder = uri.buildUpon();
                               if (!PatchProxy.applyVoidTwoRefs(uri, uBuilder, this, MerchantLivePurchasePanelContainerV2Fragment.class, "14")) {
                                  str = "queryMode";
                                  String queryParamet = uri.getQueryParameter(str);
                                  queryParamet = (queryParamet == null || !queryParamet.length())? 1: null;
                                  if (queryParamet) {
                                     uBuilder.appendQueryParameter(str, String.valueOf(true));
                                  }
                               }
                               if (!PatchProxy.applyVoidThreeRefs(uri, uBuilder, liveMerchant, this, MerchantLivePurchasePanelContainerV2Fragment.class, "13")) {
                                  str = "liveStreamId";
                                  str1 = uri.getQueryParameter(str);
                                  str1 = (str1 == null || !str1.length())? 1: null;
                                  if (str1 && liveMerchant != null) {
                                     str1 = liveMerchant.getLiveStreamId();
                                     str1 = (str1 == null || !str1.length())? 1: null;
                                     if (!str1) {
                                        uBuilder.appendQueryParameter(str, liveMerchant.getLiveStreamId());
                                     }
                                  }
                               }
                            label_00e5 :
                               str = uBuilder.build().toString();
                            }
                         }
                         str = "";
                      }
                      merchantPurc = z.a(str, liveMerchant, o.o(), o.n());
                   }
                }
                liveMerchant = null;
                goto label_005b ;
             }
             this.B = merchantPurc;
             int i = 0x7f0a23eb;
             if (merchantPurc == null) {
                a.S("mContentFragment");
             }
             uoe.v(i, merchantPurc);
             uoe.o();
             if (this.B == null) {
                a.S("mContentFragment");
             }
          }
       }
       this.Mh(true);
       if (!PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelContainerV2Fragment.class, "15")) {
          this.C = RxBus.f.k(b.class, false).observeOn(d.a).subscribe(new c(this));
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLivePurchasePanelContainerV2Fragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, MerchantLivePurchasePanelContainerV2Fragment.class, "2")) {
          List value = a.t().getValue("mt_purchase_panel_preload_tk_bundle", List.class, objArray);
          objArray = (value == null || value.isEmpty())? 1: 0;
          if (!objArray) {
             BundlePreloadUtil.c(value);
          }
       }
       this.uh(R.style.arg_RES_7f11035d);
       this.setCancelable(b);
       if (!this.sh()) {
          b = 2;
       }
       this.setStyle(b, this.u);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MerchantLivePurchasePanelContainerV2Fragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Context context = this.getContext();
       a.m(context);
       i oi = new i(context, this.getTheme());
       oi.setCanceledOnTouchOutside(true);
       oi.d(new MerchantLivePurchasePanelContainerV2Fragment$b(this));
       oi.setOnKeyListener(new MerchantLivePurchasePanelContainerV2Fragment$c(this));
       Window window = oi.getWindow();
       a.m(window);
       window.setSoftInputMode(51);
       window = oi.getWindow();
       a.m(window);
       window.addFlags(256);
       return oi;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantLivePurchasePanelContainerV2Fragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       boolean b = false;
       View view = a.d(p0, R.layout.arg_RES_7f0d04e9, p1, b);
       if (!PatchProxy.applyVoidOneRefs(view, this, MerchantLivePurchasePanelContainerV2Fragment.class, "5")) {
          if (!PatchProxy.applyVoidOneRefs(view, this, MerchantLivePurchasePanelContainerV2Fragment.class, "6")) {
             view1 = m1.f(view, R.id.top_placeholder_view);
             if (view1 != null) {
                if (n.I(this.getActivity())) {
                   view1.setVisibility(8);
                }else {
                   view1.setVisibility(b);
                   view1.setOnClickListener(new b(this));
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(view, this, MerchantLivePurchasePanelContainerV2Fragment.class, "7")) {
             view1 = m1.f(view, R.id.live_purchase_panel_content_container);
             if (n.I(this.getActivity())) {
                view1.setBackgroundColor(a1.a(R.color.arg_RES_7f06008c));
             }else {
                view1.setBackgroundResource(R.drawable.arg_RES_7f080250);
             }
          }
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantLivePurchasePanelContainerV2Fragment.class, "8")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             String str = arguments.getString("KEY_MERCHANT_ROUTER_URL", objArray);
             if (str != null) {
                float f = c.a.a(str, a.a);
                if (!n.I(this.getActivity())) {
                   b = a1.d(R.dimen.arg_RES_7f070310);
                }
                h.d(this, f, b);
             }
          }
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelContainerV2Fragment.class, "20")) {
          return;
       }
       super.onDestroy();
       this.Mh(false);
       b9.a(this.C);
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelContainerV2Fragment.class, "23")) {
       }else {
          MerchantLivePurchasePanelContainerV2Fragment tE = this.E;
          if (tE != null) {
             tE.clear();
          }
       }
       return;
    }
}
