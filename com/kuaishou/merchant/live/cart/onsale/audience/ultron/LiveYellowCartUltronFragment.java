package com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment;
import h44.a;
import k34.g0;
import k2b.e0;
import k2b.j0;
import com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldAdaptBottomSheetFragment;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment$a;
import nsd.u;
import java.lang.System;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment$_callerContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import java.lang.String;
import k2b.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ds3.a;
import android.view.View;
import android.os.Bundle;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import j44.a;
import androidx.fragment.app.Fragment;
import e44.d;
import e54.d;
import e54.m;
import e54.n;
import e54.h;
import y44.a;
import z44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter;
import z04.b;
import e54.a;
import iv.a;
import g44.a;
import java.util.Arrays;
import com.kuaishou.merchant.base.rmc.e;
import java.lang.Integer;
import java.lang.Boolean;
import lnc.l1;
import lnc.a1;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.api.core.LiveMerchantSkin;
import et3.a;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.kuaishou.merchant.basic.util.h;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import android.app.Activity;
import brd.t;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawConstraintLayout;
import lnc.i3;
import androidx.lifecycle.MutableLiveData;
import f54.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import java.util.Map;
import g44.b;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.view.Window;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.ViewGroup;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.content.res.Configuration;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;
import kotlin.jvm.internal.a;
import android.view.ViewTreeObserver;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import o34.h;
import p34.a;
import java.util.UUID;
import e34.b;
import w44.b;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import w44.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import com.kwaishou.merchant.troubleshooting.core.model.KeyNode;
import com.kwaishou.merchant.troubleshooting.core.model.Node;
import g44.c;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.os.Build$VERSION;
import android.view.LayoutInflater;
import xm4.a;
import ekd.m1;
import com.yxcorp.utility.n;
import android.content.Context;
import androidx.fragment.app.KwaiDialogFragment;
import d54.b;
import java.util.List;
import ds3.l;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper;
import java.util.HashMap;
import g54.a;
import g44.d;
import com.kuaishou.ksmvvm.command.KSCommand;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public final class LiveYellowCartUltronFragment extends LiveMerchantFoldAdaptBottomSheetFragment implements a, g0, e0, j0	// class@00197c
{
    public final long E;
    public final a F;
    public a G;
    public String H;
    public boolean I;
    public PresenterV2 J;
    public final p K;
    public ViewGroup L;
    public View M;
    public WatchDispatchDrawConstraintLayout N;
    public HashMap O;
    public static final LiveYellowCartUltronFragment$a P;

    static {
       LiveYellowCartUltronFragment.P = new LiveYellowCartUltronFragment$a(null);
    }
    public void LiveYellowCartUltronFragment(){
       super();
       this.E = System.currentTimeMillis();
       this.F = new a();
       this.J = new PresenterV2();
       this.K = s.c(new LiveYellowCartUltronFragment$_callerContext$2(this));
       this.uh(R.style.arg_RES_7f11035e);
    }
    public String C1(){
       return "MERCHANT_AUDIENCE_ON_SALE_ULTRON";
    }
    public String D1(){
       return "观众端商品列表页";
    }
    public int D4(){
       return d0.h(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveYellowCartUltronFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Mh()) {
          objArray = this.F.b.c().I1();
       }
       return objArray;
    }
    public void Jh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveYellowCartUltronFragment.class, "4")) {
          return;
       }
       a.s(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveYellowCartUltronFragment", "onRealViewCreated start");
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveYellowCartUltronFragment.class, "11")) {
          a.a.a(this);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveYellowCartUltronFragment.class, "12")) {
          this.J.U7(new d());
          this.J.U7(new d(this));
          this.J.U7(new m(this));
          this.J.U7(new n(this));
          this.J.U7(new h(this));
          this.J.U7(new a(this));
          this.J.U7(new a(this));
          this.J.U7(new LiveAudienceShopPreloadPresenter());
          if (b.c) {
             this.J.U7(new a(this));
          }
       }
       this.J.f(p0);
       Object[] objArray1 = a.a(this.Nh());
       this.J.i(Arrays.copyOf(objArray1, objArray1.length));
       a p = this.F.p;
       if (p != null) {
          p.a();
       }
       return;
    }
    public ClientEvent$ExpTagTrans K5(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveYellowCartUltronFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Mh()) {
          objArray = this.F.b.c().K5();
       }
       return objArray;
    }
    public int Lb(){
       return d0.j(this);
    }
    public final void Lh(View p0,int p1,boolean p2){
       if (PatchProxy.isSupport(LiveYellowCartUltronFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, LiveYellowCartUltronFragment.class, "14")) {
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
          liveMerchant = this.F.a().getLiveMerchantSkin();
       }
       h.e(this, p0, liveMerchant, a.a, p1);
       return;
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, LiveYellowCartUltronFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.Mh();
    }
    public String Me(){
       return "fragment_audience_shop";
    }
    public final boolean Mh(){
       Object obj = PatchProxy.apply(null, this, LiveYellowCartUltronFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableYellowCartNewPageShow", true);
    }
    public ClientContent$ContentPackage Nf(){
       return null;
    }
    public final a Nh(){
       Object obj = PatchProxy.apply(null, this, LiveYellowCartUltronFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public String P7(){
       return d0.i(this);
    }
    public ClientContent$ContentPackage Q3(){
       return null;
    }
    public void S2(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveYellowCartUltronFragment.class, "28")) {
          return;
       }
       if (this.getActivity() instanceof j0) {
          FragmentActivity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.IPageLogger");
          activity.S2(p0);
       }
       return;
    }
    public String a2(){
       return "";
    }
    public void b2(int p0){
       if (PatchProxy.isSupport(LiveYellowCartUltronFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveYellowCartUltronFragment.class, "29")) {
          return;
       }
       if (this.getActivity() instanceof j0) {
          FragmentActivity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.IPageLogger");
          activity.b2(p0);
       }
       return;
    }
    public Activity cd(){
       return d0.f(this);
    }
    public boolean eg(){
       Object obj = PatchProxy.apply(null, this, LiveYellowCartUltronFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Mh();
    }
    public t getDispatchDrawObservable(){
       Object[] objArray = null;
       LiveYellowCartUltronFragment obj = PatchProxy.apply(objArray, this, LiveYellowCartUltronFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj != null) {
          objArray = obj.getDispatchDrawObservable();
       }
       return objArray;
    }
    public int getPage(){
       return 0;
    }
    public String getPageParams(){
       String str;
       Object[] objArray = null;
       i3 obj = PatchProxy.apply(objArray, this, LiveYellowCartUltronFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.Mh()) {
          return "";
       }
       obj = i3.f();
       LiveYellowCartUltronFragment tG = this.G;
       if (tG != null) {
          MutableLiveData mutableLiveD = tG.q0();
          if (mutableLiveD != null) {
             Track value = mutableLiveD.getValue();
             if (value != null) {
                objArray = value.getUrlPackageParams();
             }
          }
       }
       if (!b.a || objArray == null) {
          obj.d("author_id", this.F.a().getLiveAuthorId());
          obj.d("live_id", this.F.a().getLiveStreamId());
          obj.d("server_exp_tag", this.F.a().getServerExpTag());
          obj.c("carrier_type", Integer.valueOf(2));
          obj.d("carrier_id", this.F.a().getLiveStreamId());
          str = obj.e();
       }else {
          Iterator iterator = objArray.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getKey() != null && uEntry.getValue() != null) {
                obj.d(uEntry.getKey(), uEntry.getValue().toString());
             }
          }
          str = obj.e();
       }
       return str;
    }
    public Window getWindow(){
       Object[] objArray = null;
       Dialog obj = PatchProxy.apply(objArray, this, LiveYellowCartUltronFragment.class, "19");
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
       Object obj = PatchProxy.apply(null, this, LiveYellowCartUltronFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Nh();
    }
    public String h5(){
       String str;
       LiveYellowCartUltronFragment obj = PatchProxy.apply(null, this, LiveYellowCartUltronFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.Mh())? this.H: "";
       return obj;
    }
    public ViewGroup j0(){
       return this.L;
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public String o(){
       String obj = PatchProxy.apply(null, this, LiveYellowCartUltronFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.Mh())? "MERCHANT_LIVE_SMALL_CART_GOODS_LIST_SUBPAGE": "";
       return obj;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveYellowCartUltronFragment.class, "8")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (a.t().d("MERCHANT_CART_CONTAINER_IS_NEED_DISMISS", true)) {
          this.dismissAllowingStateLoss();
       }else {
          LiveYellowCartUltronFragment tM = this.M;
          if (tM != null) {
             int i = (l1.a())? 8: 0;
             tM.setVisibility(i);
          }
          if (this.getView() != null) {
             View view = this.getView();
             a.m(view);
             view.getViewTreeObserver().addOnGlobalLayoutListener(new LiveYellowCartUltronFragment$b(this, view));
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       String id;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveYellowCartUltronFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       LiveYellowCartUltronFragment tF = this.F;
       tF.e = this;
       e0 uoe0 = (this.Mh())? this: this.F.b.c();
       tF.n = uoe0;
       tF.m = new h();
       tF.q = new a();
       tF.f = this;
       this.H = UUID.randomUUID().toString();
       b.p(this.z);
       b a = b.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(this, a, b.class, "1")) {
          String str = a.d(this);
          TroubleShooting a1 = TroubleShooting.a;
          FragmentActivity activity = this.getActivity();
          Application application = (activity != null)? activity.getApplication(): null;
          a1.F(application, str, a.d());
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = null;
          objectRef.element = this.m().compose(this.Ug(FragmentEvent.DETACH)).subscribe(new a(str, objectRef), Functions.d());
          LiveCartNode[] liveCartNode = LiveCartNode.values();
          int len = liveCartNode.length;
          int i = 0;
          while (i < len) {
             object oobject = liveCartNode[i];
             LiveCartNode parent = oobject.getParent();
             if (parent != null) {
                KeyNode node = parent.getNode();
                if (node != null) {
                   id = node.getId();
                label_00b4 :
                   if (oobject.isEnv()) {
                      TroubleShooting.a.f(str, oobject.getNode(), id);
                   }else {
                      TroubleShooting.a.j(str, id, oobject.getNode());
                   }
                   i = i + 1;
                }
             }
             id = null;
             goto label_00b4 ;
          }
       }
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartUltronFragment.class, "17")) {
          this.G = ViewModelProviders.of(this, new c(this)).get(a.class);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LiveYellowCartUltronFragment.class, "10");
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
          obj.setSoftInputMode(51);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveYellowCartUltronFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d04e2, p1, false);
       this.L = m1.f(view, 0x7f0a3995);
       this.M = m1.f(view, 0x7f0a02fb);
       this.N = m1.f(view, 0x7f0a02f8);
       LiveYellowCartUltronFragment tL = this.L;
       Objects.requireNonNull(tL, "null cannot be cast to non-null type android.view.ViewGroup");
       if (l1.a()) {
          i = 0;
       }else {
          FragmentActivity activity = this.getActivity();
          a.m(activity);
          FragmentActivity activity1 = this.getActivity();
          a.m(activity1);
          i = (int)(((float)n.j(activity) * ((float)1 - a.a)) - (float)n.A(activity1));
       }
       this.Lh(tL, i, false);
       return view;
    }
    public void onDestroyView(){
       a b;
       if (PatchProxy.applyVoid(null, this, LiveYellowCartUltronFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       if (!this.J.y8()) {
          this.J.destroy();
       }
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartUltronFragment.class, "15")) {
          b.k(this.F.a(), (System.currentTimeMillis() - this.E), this.F.b.c());
          b = this.F.b;
          b.u(this.F.a(), b.a.b(this), b.j, b.c(), this.F.c.h);
       }
       a p = this.F.p;
       if (p != null) {
          p.b();
       }
       if (this.Mh()) {
          b.a(0x4b316083).X(this.o(), this.H);
       }
       LiveShopPreloadHelper.h("MERCHANT_AUDIENCE_ON_SALE_ULTRON");
       this.H = null;
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartUltronFragment.class, "31")) {
          LiveYellowCartUltronFragment tO = this.O;
          if (tO != null) {
             tO.clear();
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveYellowCartUltronFragment.class, "6")) {
          return;
       }
       super.onResume();
       this.S2(this);
       if (!b.a) {
          this.b2(1);
       }
       if (this.I == null) {
          b.q(this.z);
          this.I = true;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveYellowCartUltronFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       a.s(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveYellowCartUltronFragment", "onViewCreated start");
       if (!PatchProxy.applyVoid(null, this, LiveYellowCartUltronFragment.class, "13")) {
          b.a.f(this, LiveCartNode.RENDER_START, "LiveYellowCartUltronFragment", "loadPage", "cartInfo", this.F.c);
          a uoa = new a();
          uoa.e(this);
          uoa.d(this.Nh());
          uoa.g(this.L);
          uoa.f(this.Ih());
          uoa.e = new d(this);
          LiveYellowCartUltronFragment tG = this.G;
          if (tG != null) {
             KSCommand kSCommand = tG.v0();
             if (kSCommand != null) {
                kSCommand.b(uoa);
             }
          }
       }
       return;
    }
    public String pg(){
       return d0.k(this);
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
}
