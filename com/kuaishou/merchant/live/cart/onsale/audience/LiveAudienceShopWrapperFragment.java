package com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment;
import ml8.d;
import k34.g0;
import com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldAdaptBottomSheetFragment;
import mkc.b;
import mrd.a;
import k34.x;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import ekd.q;
import ht3.b;
import android.view.View;
import android.os.Bundle;
import crd.b;
import lnc.b9;
import ds3.a;
import com.kuaishou.merchant.api.core.LiveMerchantSkin;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.live.cart.onsale.audience.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import brd.t;
import java.lang.Boolean;
import java.lang.Integer;
import lnc.l1;
import lnc.a1;
import et3.a;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.kuaishou.merchant.basic.util.h;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment$Status;
import com.kuaishou.merchant.live.cart.onsale.audience.e;
import ok.h;
import ekd.m1;
import android.widget.FrameLayout;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawFrameLayout;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment$b;
import com.yxcorp.gifshow.widget.m;
import android.view.Window;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.ViewGroup;
import k34.f0;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import k34.w;
import android.content.res.Configuration;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;
import android.view.ViewTreeObserver;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.SystemClock;
import r74.d;
import android.os.Build$VERSION;
import android.view.LayoutInflater;
import xm4.a;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveAudienceShopWrapperFragment extends LiveMerchantFoldAdaptBottomSheetFragment implements d, g0	// class@00191e
{
    public BaseLiveAudienceShopFragment E;
    public View F;
    public View G;
    public FrameLayout H;
    public b I;
    public b J;
    public a$a K;
    public a L;
    public l M;
    public WatchDispatchDrawFrameLayout N;
    public boolean O;
    public final b P;
    public KwaiLoadingView Q;
    public final a R;
    public final a S;
    public boolean T;
    public b U;
    public boolean V;
    public long W;
    public final b X;
    public static final int Y;

    public void LiveAudienceShopWrapperFragment(){
       super();
       this.P = new b(0x7f0d0e97);
       this.R = a.g();
       this.S = a.g();
       this.T = false;
       this.X = new x(this);
       this.uh(R.style.arg_RES_7f11035e);
    }
    public static Fragment Mh(c p0){
       Fragment obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveAudienceShopWrapperFragment.class, "24");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       List fragments = p0.getFragments();
       if (q.f(fragments)) {
          return obj;
       }
       obj = fragments.get(0);
       if (q.f(obj.getChildFragmentManager().getFragments())) {
          return obj;
       }
       return LiveAudienceShopWrapperFragment.Mh(fragments.get(0).getChildFragmentManager());
    }
    public String C1(){
       b obj = PatchProxy.apply(null, this, LiveAudienceShopWrapperFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Nh();
       if (obj != null) {
          return obj.C1();
       }
       return "MERCHANT_AUDIENCE_ON_SALE";
    }
    public String D1(){
       b obj = PatchProxy.apply(null, this, LiveAudienceShopWrapperFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Nh();
       if (obj != null) {
          return obj.D1();
       }
       return "观众端商品列表页";
    }
    public void Jh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceShopWrapperFragment.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, LiveAudienceShopWrapperFragment.class, "16")) {
          b9.a(this.J);
          this.J = this.S.subscribe(new g(this, this.L.b.getLiveMerchantSkin()), Functions.d());
       }
       this.R.onNext(Boolean.TRUE);
       return;
    }
    public void Lh(View p0,int p1,boolean p2){
       if (PatchProxy.isSupport(LiveAudienceShopWrapperFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, LiveAudienceShopWrapperFragment.class, "14")) {
          return;
       }
       if (l1.a()) {
          p0.setBackgroundColor(a1.a(R.color.arg_RES_7f06008c));
       }else {
          p0.setBackgroundResource(R.drawable.arg_RES_7f080250);
       }
       LiveMerchantSkin liveMerchant = null;
       if (!p2) {
          LiveMerchantSkin liveMerchant1 = liveMerchant;
       }
       if (p2) {
          liveMerchant = this.L.b.getLiveMerchantSkin();
       }
       h.e(this, p0, liveMerchant, a.a, p1);
       return;
    }
    public String Me(){
       return "fragment_audience_shop";
    }
    public final b Nh(){
       List obj = PatchProxy.apply(null, this, LiveAudienceShopWrapperFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() != null && !this.getActivity().isFinishing()) {
          obj = this.getChildFragmentManager().getFragments();
          if (obj != null && !obj.isEmpty()) {
             Fragment uFragment = obj.get(0);
             if (uFragment instanceof b) {
                return uFragment;
             }
          }
       }
       return null;
    }
    public final void Oh(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopWrapperFragment.class, "19")) {
          return;
       }
       this.S.onNext(LiveAudienceShopWrapperFragment$Status.LOADING);
       this.I = b9.c(this.I, new e(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopWrapperFragment.class, "12")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a02fa);
       this.G = m1.f(p0, 0x7f0a02f9);
       this.H = m1.f(p0, 0x7f0a02fb);
       this.N = m1.f(p0, 0x7f0a02f7);
       m1.b(p0, new LiveAudienceShopWrapperFragment$b(this), R.id.audience_shop_root);
       return;
    }
    public t getDispatchDrawObservable(){
       LiveAudienceShopWrapperFragment obj = PatchProxy.apply(null, this, LiveAudienceShopWrapperFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj != null) {
          return obj.getDispatchDrawObservable();
       }
       return null;
    }
    public Window getWindow(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceShopWrapperFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getDialog().getWindow();
    }
    public ViewGroup j0(){
       return f0.a(this);
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopWrapperFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (!PatchProxy.applyVoid(null, this, LiveAudienceShopWrapperFragment.class, "15")) {
          this.K = new w(this);
       }
       this.Oh();
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       boolean b;
       boolean i;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopWrapperFragment.class, "11")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.O == null) {
          p0 = PatchProxy.apply(null, this, LiveAudienceShopWrapperFragment.class, "23");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else {
             i = true;
             b = (LiveAudienceShopWrapperFragment.Mh(this.getChildFragmentManager()) == null)? true: a.t().d("MERCHANT_CART_CONTAINER_IS_NEED_DISMISS", i);
          }
          if (b) {
             this.dismissAllowingStateLoss();
          }else {
          label_0043 :
             LiveAudienceShopWrapperFragment tH = this.H;
             i = (l1.a())? 8: 0;
             tH.setVisibility(i);
             if (this.getView() != null) {
                View view = this.getView();
                view.getViewTreeObserver().addOnGlobalLayoutListener(new LiveAudienceShopWrapperFragment$a(this, view));
             }
          }
       }else {
          goto label_0043 ;
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopWrapperFragment.class, "3")) {
          return;
       }
       this.W = SystemClock.elapsedRealtime();
       super.onCreate(p0);
       d.a(this).b();
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceShopWrapperFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       if (uDialog.getWindow().getDecorView() != null && (Build$VERSION.SDK_INT > 23 && a.t().d("enableInputMethodCoverFragment", true))) {
          uDialog.getWindow().getDecorView().setSystemUiVisibility(1024);
       }
    label_003d :
       uDialog.getWindow().setSoftInputMode(51);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceShopWrapperFragment.class, "8");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d04e3, p1, false);
       this.doBindView(view);
       if (l1.a()) {
          this.H.setVisibility(8);
       }
       View view1 = m1.f(view, R.id.audience_shop_root_view);
       int i = (l1.a())? 0: a1.d(R.dimen.arg_RES_7f070310);
       this.Lh(view1, i, false);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopWrapperFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.I);
       b9.a(this.J);
       this.O = false;
       this.K = null;
       return;
    }
}
