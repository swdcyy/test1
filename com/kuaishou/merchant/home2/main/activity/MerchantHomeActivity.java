package com.kuaishou.merchant.home2.main.activity.MerchantHomeActivity;
import yz3.c;
import je.a;
import com.kuaishou.merchant.basic.activity.MerchantBaseActivity;
import android.os.SystemClock;
import ht3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment;
import java.lang.Integer;
import mv3.e;
import java.lang.StringBuilder;
import d30.c;
import com.kuaishou.cover.a;
import com.kuaishou.cover.Link;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import b04.e;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.content.Intent;
import android.net.Uri;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import ekd.x0;
import java.lang.Long;
import java.util.Set;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.HashMap;
import com.kuaishou.merchant.home2.skin.f;
import d04.g;
import e04.b;
import brd.t;
import crd.b;
import lnc.b9;
import d04.j;
import d04.i;
import erd.g;
import rw3.b;
import zw3.d;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import b04.d;
import b04.a;
import com.kuaishou.merchant.home2.main.Prefetch;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$Meta;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import a04.j;
import hx3.n;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils;
import ekd.i;
import com.kuaishou.merchant.home2.main.widget.MerchantHomeRootView;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import yz3.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zw3.b;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.kuaishou.merchant.pagedy.a;
import com.kuaishou.merchant.home2.skin.d;
import ok.h;
import com.kuaishou.merchant.home2.basic.stability.ExceptionCluesTags;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import xw3.e;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$a;
import hka.a;
import tkd.b;
import tkd.d;
import yr3.i;
import yz3.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class MerchantHomeActivity extends MerchantBaseActivity implements c, a	// class@00180b
{
    public b A;
    public b B;
    public b C;
    public d D;
    public final long z;
    public static final int E;

    public void MerchantHomeActivity(){
       super();
       this.z = SystemClock.elapsedRealtime();
    }
    public int O2(){
       return 1;
    }
    public boolean S(b p0){
       List obj = PatchProxy.applyOneRefs(p0, this, MerchantHomeActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && ("BUYER_HOME_PAGE2").equals(p0.C1())) {
          obj = this.getSupportFragmentManager().getFragments();
          if (!obj.isEmpty()) {
             int i = 0;
             if (obj.get(i).getClass() == MerchantDynamicHomeBuyerFragment.class) {
                i = true;
             }
             return i;
          }
       }
       return super.S(p0);
    }
    public void X0(){
    }
    public void d1(int p0){
       MerchantHomeActivity merchantHome = MerchantHomeActivity.class;
       if (PatchProxy.isSupport(merchantHome) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, merchantHome, "14")) {
          return;
       }
       this.u3(p0);
       if (!PatchProxy.isSupport(merchantHome) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, merchantHome, "15")) {
          int i = 1;
          int i1 = (p0 == i)? 3: 4;
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), null, uoe, "6") && e.f())) {
             c.d("MerchantCoverApi-onBuyerHomeTabChanged api trigger action: "+i1);
             a.a("BUYER_HOME_PAGE", i1, e.g(""));
          }
          Link link = Link.h();
          if (p0 != i) {
             i = false;
          }
          link.q(this, i, false);
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantHomeActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, MerchantHomeActivity.class, "17")) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public void onCreate(Bundle p0){
       int i3;
       String str;
       f uof;
       b uob1;
       d uod;
       a uoa;
       MerchantHomeActivity d;
       MerchantHomeActivity merchantHome1;
       MerchantHomeActivity merchantHome2;
       List list;
       Prefetch prefetch;
       Prefetch w;
       MerchantHomeActivity c;
       String key;
       Object obj2;
       j k;
       g e;
       t ot1;
       Set set;
       Iterator iterator;
       b uob = this;
       if (PatchProxy.applyVoidOneRefs(p0, uob, MerchantHomeActivity.class, "2")) {
          return;
       }
       e uoe = e.class;
       Object[] objArray = null;
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, uob, MerchantHomeActivity.class, "5")) {
          ViewModel viewModel = ViewModelProviders.of(this).get(uoe);
          Uri data1 = this.getIntent().getData();
          Objects.requireNonNull(viewModel);
          if (!PatchProxy.applyVoidOneRefs(data1, viewModel, uoe, "1")) {
             viewModel.b = QCurrentUser.ME.isLogined();
             if (data1 == null) {
                viewModel.d = "";
             }else {
                str = x0.a(data1, "pageSource");
                try{
                   viewModel.d = str;
                   viewModel.e = Long.parseLong(x0.b(data1, "t_click", "0"));
                }catch(java.lang.Exception e0){
                }
             }
          }
       }
    label_023b :
       uob.C.t0("activityOnCreateBegin");
       int i = 2;
       uob.C.onEvent(i, Long.valueOf(uob.z));
       int i1 = 3;
       uob.C.onEvent(i1);
       super.onCreate(objArray);
       i.h(uob, 0, b);
       MerchantHomeRootView merchantHome = PatchProxy.apply(objArray, uob, MerchantHomeActivity.class, "3");
       int i2 = 0x7f0a0945;
       if (merchantHome != PatchProxyResult.class) {
       }else {
          merchantHome = new MerchantHomeRootView(uob);
          merchantHome.setId(i2);
          FrameLayout uFrameLayout = new FrameLayout(uob);
          uFrameLayout.setId(R.id.fragment_container);
          uFrameLayout.setLayoutParams(new ConstraintLayout$LayoutParams(-1, -1));
          merchantHome.addView(uFrameLayout);
       }
       ViewGroup$LayoutParams layoutParams = PatchProxy.apply(objArray, uob, MerchantHomeActivity.class, "4");
       if (layoutParams != PatchProxyResult.class) {
       }else {
          layoutParams = new ViewGroup$LayoutParams(-1, -1);
       }
       uob.setContentView(merchantHome, layoutParams);
       merchantHome = uob.findViewById(i2);
       Objects.requireNonNull(merchantHome);
       t ot = PatchProxy.apply(objArray, merchantHome, MerchantHomeRootView.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = merchantHome.B.hide();
       }
       uob.A = ot.subscribe(new b(uob, merchantHome));
       Intent obj = PatchProxy.apply(objArray, uob, MerchantHomeActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          i3 = obj.intValue();
       }else {
          obj = PatchProxy.apply(objArray, uob, MerchantHomeActivity.class, "10");
          if (obj != PatchProxyResult.class) {
             b = obj.intValue();
          }else {
             obj = this.getIntent();
             Prefetch Object obj1 = PatchProxy.applyOneRefs(obj, uob, MerchantHomeActivity.class, "11");
             if (obj1 != PatchProxyResult.class) {
                objArray = obj1;
             }else if(obj != null && obj.getData() != null){
                Uri data = obj.getData();
                if (data.isHierarchical() && !TextUtils.x(data.getEncodedQuery())) {
                   objArray = data;
                }
             }
             if (objArray != null) {
                str = x0.a(objArray, "subpage");
                if (!("buyer").equals(str)) {
                   if (("seller").equals(str)) {
                      b = 2;
                   }
                }
             }
             b = 0;
          }
          if (b) {
             i3 = b;
          }else {
             i3 = b.e();
          }
       }
       if (i3 == i) {
          uob.C.onEvent(1024);
       }
       uob.u3(i3);
       if (this.getWindow().getAttributes() != null && this.getWindow().getAttributes().softInputMode != i1) {
          this.getWindow().setSoftInputMode(i1);
       }
       Objects.requireNonNull(d.a);
       this.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
       uob.C.t0("activityOnCreateEnd");
       a.b();
       e.a(this);
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantHomeActivity.class, "8")) {
          return;
       }
       super.onDestroy();
       MerchantHomeActivity tA = this.A;
       if (tA != null) {
          tA.dispose();
          this.A = objArray;
       }
       b9.a(this.B);
       f uof = f.p0(this);
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(objArray, uof, f.class, "6")) {
          g e = g.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(objArray, e, g.class, "6")) {
             b9.a(g.c);
          }
          uof.j = b9.c(uof.j, d.b);
       }
       ExceptionCluesTags.onActivityDestroyed();
       this.C.onEvent(16);
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, MerchantHomeActivity.class, "7")) {
          return;
       }
       super.onStop();
       this.C.onEvent(15);
       e.q0(this).p0();
       return;
    }
    public final void u3(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantHomeActivity merchantHome = MerchantHomeActivity.class;
       if (PatchProxy.isSupport(merchantHome) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, merchantHome, "12")) {
          return;
       }
       c supportFragm = this.getSupportFragmentManager();
       e uoe = supportFragm.beginTransaction();
       Fragment uFragment = supportFragm.findFragmentByTag("buyer");
       Fragment uFragment1 = supportFragm.findFragmentByTag("seller");
       int i = 1;
       if (p0 == i) {
          if (uFragment == null) {
             d a = d.a;
             Objects.requireNonNull(a);
             MerchantDynamicHomeBuyerFragment$a obj = PatchProxy.apply(null, a, d.class, "1");
             if (obj != patchProxyRe) {
             }else {
                obj = MerchantDynamicHomeBuyerFragment.M;
                Objects.requireNonNull(obj);
                obj = PatchProxy.apply(null, obj, MerchantDynamicHomeBuyerFragment$a.class, "1");
                if (obj != patchProxyRe) {
                }else {
                   obj = new MerchantDynamicHomeBuyerFragment();
                }
             }
             uFragment = obj;
             uoe.g(R.id.fragment_container, uFragment, "buyer");
          }
          this.F2(uFragment);
          uoe.E(uFragment);
          if (uFragment1 != null) {
             uoe.s(uFragment1);
          }
          uoe.m();
       }else if(uFragment1 != null){
          uoe.E(uFragment1);
          if (uFragment != null) {
             uoe.s(uFragment);
          }
          uoe.m();
       }else {
          b9.a(this.B);
          t ot = PatchProxy.apply(null, this, merchantHome, "13");
          if (ot != patchProxyRe) {
          }else {
             ot = d.a(-617244917).n20(this, i);
          }
          this.B = ot.subscribe(new a(uoe, uFragment));
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt(b.d("user")+"merchant_last_shop2", p0);
       g.a(uEditor);
       return;
    }
}
