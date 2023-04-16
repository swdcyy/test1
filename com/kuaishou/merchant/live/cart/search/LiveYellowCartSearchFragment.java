package com.kuaishou.merchant.live.cart.search.LiveYellowCartSearchFragment;
import h44.a;
import k34.g0;
import com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldAdaptLogBottomSheetFragment;
import com.kuaishou.merchant.live.cart.search.LiveYellowCartSearchFragment$a;
import nsd.u;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.cart.search.LiveYellowCartSearchFragment$_callerContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import ds3.a;
import android.view.View;
import android.os.Bundle;
import j44.a;
import androidx.fragment.app.Fragment;
import e44.d;
import w54.a;
import w54.c;
import iv.a;
import g44.a;
import java.util.Arrays;
import com.kuaishou.merchant.base.rmc.e;
import g54.a;
import android.view.ViewGroup;
import brd.x;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import com.kuaishou.ksmvvm.command.KSCommand;
import x54.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import brd.t;
import com.kuaishou.pagedy.PageDy;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawFrameLayout;
import lnc.i3;
import or5.d;
import xp5.g;
import java.lang.Integer;
import java.lang.Number;
import android.view.Window;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import k34.f0;
import o34.h;
import p34.a;
import java.util.UUID;
import u54.a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;
import android.os.Build$VERSION;
import com.kwai.sdk.switchconfig.a;
import android.view.LayoutInflater;
import xm4.a;
import ekd.m1;
import et3.a;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.kuaishou.merchant.basic.util.h;
import androidx.fragment.app.KwaiDialogFragment;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.util.HashMap;

public final class LiveYellowCartSearchFragment extends LiveMerchantFoldAdaptLogBottomSheetFragment implements a, g0	// class@001a08
{
    public final a E;
    public a F;
    public String G;
    public PresenterV2 H;
    public final p I;
    public ViewGroup J;
    public WatchDispatchDrawFrameLayout K;
    public HashMap L;
    public static final LiveYellowCartSearchFragment$a M;

    static {
       LiveYellowCartSearchFragment.M = new LiveYellowCartSearchFragment$a(null);
    }
    public void LiveYellowCartSearchFragment(){
       super();
       this.E = new a();
       this.H = new PresenterV2();
       this.I = s.c(new LiveYellowCartSearchFragment$_callerContext$2(this));
       this.uh(R.style.arg_RES_7f11035e);
    }
    public String C1(){
       return "MERCHANT_AUDIENCE_ON_SALE_SEARCH";
    }
    public String D1(){
       return "观众端商品列表搜索页";
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, LiveYellowCartSearchFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.b.c().I1();
    }
    public void Jh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveYellowCartSearchFragment.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartSearchFragment.class, "7")) {
          a.a.a(this);
       }
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartSearchFragment.class, "8")) {
          this.H.U7(new d());
          this.H.U7(new a(this));
          this.H.U7(new c(this));
       }
       this.H.f(p0);
       Object[] objArray = a.a(this.Lh());
       this.H.i(Arrays.copyOf(objArray, objArray.length));
       a p = this.E.p;
       if (p != null) {
          p.a();
       }
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartSearchFragment.class, "9")) {
          p = new a();
          p.e(this);
          p.d(this.Lh());
          p.g(this.J);
          p.f(this.Ih());
          LiveYellowCartSearchFragment tF = this.F;
          if (tF != null) {
             KSCommand kSCommand = tF.r0();
             if (kSCommand != null) {
                kSCommand.b(p);
             }
          }
       }
       return;
    }
    public ClientEvent$ExpTagTrans K5(){
       Object obj = PatchProxy.apply(null, this, LiveYellowCartSearchFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.b.c().K5();
    }
    public final a Lh(){
       Object obj = PatchProxy.apply(null, this, LiveYellowCartSearchFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.getValue();
    }
    public String Me(){
       return "fragment_audience_shop_search";
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, LiveYellowCartSearchFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = this.E.a().getLiveStreamPackage();
       return obj;
    }
    public boolean eg(){
       return true;
    }
    public t getDispatchDrawObservable(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       DynamicPageCenter obj = PatchProxy.apply(objArray, this, LiveYellowCartSearchFragment.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PageDy.e().h(this);
       if (obj != null) {
          t ot = PatchProxy.apply(objArray, obj, DynamicPageCenter.class, "37");
          if (ot != patchProxyRe) {
          }else {
             DynamicPageCenter u = obj.u;
             ot = (u != null)? u.hide(): objArray;
          }
          if (ot != null) {
             objArray = ot;
          }else {
          label_0036 :
             LiveYellowCartSearchFragment tK = this.K;
             if (tK != null) {
                objArray = tK.getDispatchDrawObservable();
             }
          }
       }else {
          goto label_0036 ;
       }
       return objArray;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, LiveYellowCartSearchFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("exp_tag", this.E.b.a().getExpTag());
       obj.d("server_exp_tag", this.E.a().getServerExpTag());
       obj.c("carrier_type", Integer.valueOf(2));
       obj.d("carrier_id", this.E.a().getLiveStreamId());
       return obj.e();
    }
    public Window getWindow(){
       Object[] objArray = null;
       Dialog obj = PatchProxy.apply(objArray, this, LiveYellowCartSearchFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getDialog();
       if (obj != null) {
          objArray = obj.getWindow();
       }
       return objArray;
    }
    public a h(){
       Object obj = PatchProxy.apply(null, this, LiveYellowCartSearchFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Lh();
    }
    public String h5(){
       return this.G;
    }
    public ViewGroup j0(){
       return f0.a(this);
    }
    public String o(){
       return "MERCHANT_LIVE_CART_SEARCH_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveYellowCartSearchFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       LiveYellowCartSearchFragment tE = this.E;
       tE.e = this;
       tE.n = this;
       tE.m = new h();
       tE.q = new a();
       tE.f = this;
       this.G = UUID.randomUUID().toString();
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartSearchFragment.class, "14")) {
          this.F = ViewModelProviders.of(this, new a(this)).get(a.class);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LiveYellowCartSearchFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       if (Build$VERSION.SDK_INT > 23 && a.t().d("enableInputMethodCoverFragment", true)) {
          obj = uDialog.getWindow();
          if (obj != null) {
             View decorView = obj.getDecorView();
             if (decorView != null) {
                decorView.setSystemUiVisibility(1024);
             }
          }
       }
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setSoftInputMode(48);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveYellowCartSearchFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d04e1, p1, false);
       this.J = m1.f(view, 0x7f0a3995);
       this.K = m1.f(view, 0x7f0a4321);
       h.d(this, a.a, false);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveYellowCartSearchFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       if (!this.H.y8()) {
          this.H.destroy();
       }
       a p = this.E.p;
       if (p != null) {
          p.b();
       }
       b.a(0x4b316083).X("MERCHANT_LIVE_CART_SEARCH_PAGE", this.G);
       this.G = null;
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartSearchFragment.class, "20")) {
          LiveYellowCartSearchFragment tL = this.L;
          if (tL != null) {
             tL.clear();
          }
       }
       return;
    }
}
