package com.kuaishou.krn.page.KrnFragment;
import je.d;
import ik0.m;
import ik0.i;
import ik0.f;
import ik0.h;
import androidx.fragment.app.Fragment;
import fi0.h;
import java.lang.String;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.os.Parcelable;
import com.kuaishou.krn.delegate.BundleLoadMode;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.lang.Boolean;
import ik0.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import lk0.b;
import java.lang.Throwable;
import com.kuaishou.krn.page.c;
import zj0.x;
import lj0.c;
import zj0.u;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import java.util.Objects;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import com.facebook.react.bridge.FragmentLifecycleEventListener;
import je.e;
import java.lang.Integer;
import android.view.View;
import android.widget.FrameLayout;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.view.ViewGroup;
import ik0.b;
import com.kuaishou.krn.page.a;
import com.kuaishou.krn.page.c$b;
import kk0.a;
import kk0.a$a;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import ik0.c;
import ik0.g;
import ik0.j;
import ik0.k;
import kk0.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import ek0.d;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Number;
import android.view.Window;
import ik0.e;
import android.content.Intent;
import com.facebook.react.a;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.bridge.NativeModule;
import android.content.Context;
import android.view.ViewTreeObserver;
import mk0.e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kuaishou.krn.model.PluginTrackInfo;
import com.kuaishou.krn.model.LoadingStateTrack;
import com.kuaishou.krn.model.LoadingStateTrack$LoadType;
import hg.a;
import com.kuaishou.krn.delegate.k;
import com.kuaishou.krn.context.KrnContextBindingManager;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.System;
import java.lang.IllegalArgumentException;
import android.view.LayoutInflater;
import ag6.a;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import java.lang.StringBuilder;
import qrd.p;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import android.view.KeyEvent;
import ae.e;
import od.a;
import zd.b;
import nj0.b;
import com.kuaishou.krn.delegate.c;

public class KrnFragment extends Fragment implements d, m, i, f, h	// class@00090d
{
    public FrameLayout b;
    public KrnReactRootView c;
    public FrameLayout d;
    public KwaiEmptyStateView e;
    public LaunchModel f;
    public KrnDelegate g;
    public a h;
    public e i;
    public View j;
    public View k;
    public Window l;
    public a m;
    public c n;
    public j o;
    public boolean p;

    public void KrnFragment(){
       super();
       this.p = true;
       h.b.a("KrnFragment constructor");
    }
    public static KrnFragment Vg(LaunchModel p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, null, KrnFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putParcelable("rn_launch_model", p0);
       KrnFragment krnFragment = new KrnFragment();
       krnFragment.setArguments(obj);
       return krnFragment;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, KrnFragment.class, "45")) {
          return;
       }
       KrnFragment tg = this.g;
       if (tg != null) {
          tg.s(null, true);
       }
       return;
    }
    public void D2(boolean p0){
       if (PatchProxy.isSupport(KrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KrnFragment.class, "39")) {
          return;
       }
       KrnFragment th = this.h;
       if (th != null && th.Wc(p0)) {
          return;
       }
       b.a(this.getActivity(), p0);
       return;
    }
    public final void Gd(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "25")) {
          return;
       }
       this.n.e(p0);
       return;
    }
    public void Gg(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "43")) {
          return;
       }
       x ox = this.getKrnContext().k();
       if (ox instanceof u) {
          ox.E(p0);
       }
       return;
    }
    public void Ja(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnFragment.class, "48")) {
          return;
       }
       KrnFragment tg = this.g;
       if (tg != null) {
          tg.Ja();
          if (this.g.g() != null) {
             KrnReactRootView krnReactRoot = this.g.g();
             Objects.requireNonNull(krnReactRoot);
             if (!PatchProxy.applyVoid(objArray, krnReactRoot, ReactRootView.class, "47")) {
                krnReactRoot.G = LifecycleState.BEFORE_CREATE;
                Iterator iterator = krnReactRoot.F.iterator();
                while (iterator.hasNext()) {
                   FragmentLifecycleEventListener uFragmentLif = iterator.next();
                   try{
                      uFragmentLif.onFragmentDestroy();
                   }catch(java.lang.RuntimeException e2){
                      krnReactRoot.C(e2);
                      goto label_0039 ;
                   }
                }
             }
          }
       }
       return;
    }
    public void Lc(){
       if (PatchProxy.applyVoid(null, this, KrnFragment.class, "26")) {
          return;
       }
       this.n.d();
       return;
    }
    public void N7(String[] p0,int p1,e p2){
       if (PatchProxy.isSupport(KrnFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KrnFragment.class, "35")) {
          return;
       }
       KrnFragment tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.isSupport(KrnDelegate.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, tg, KrnDelegate.class, "33")) {
          tg.g = p2;
          tg.c.requestPermissions(p0, p1);
       }
       return;
    }
    public void Rb(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "44")) {
          return;
       }
       x ox = this.getKrnContext().k();
       if (ox instanceof u) {
          ox.G(p0);
       }
       return;
    }
    public final boolean Ug(){
       KrnFragment obj = PatchProxy.apply(null, this, KrnFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       boolean b = false;
       if (obj != null && obj.g().getBoolean("enableRootViewCache", b)) {
          b = true;
       }
       return b;
    }
    public void Vc(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "36")) {
          return;
       }
       this.g.x(p0);
       return;
    }
    public final void Wg(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "6")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "13")) {
          this.b = p0.findViewById(0x7f0a1603);
          this.c = p0.findViewById(0x7f0a1604);
          this.d = p0.findViewById(0x7f0a1609);
          int i = 0x7f0a1605;
          this.e = p0.findViewById(i);
          if (!PatchProxy.applyVoid(objArray, this, KrnFragment.class, "14") && this.n == null) {
             c uoc = new c(this.b, objArray);
             this.n = uoc;
             uoc.c(new a(this));
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "15") && this.o == null) {
             KrnFragment tm = this.m;
             if (tm == null) {
                tm = PatchProxy.apply(objArray, this, KrnFragment.class, "41");
                if (tm != PatchProxyResult.class) {
                }else {
                   a$a uoa = new a$a();
                   uoa.b(this.getActivity().getResources().getDrawable(R.drawable.arg_RES_7f080f70));
                   uoa.f(R.color.arg_RES_7f06202a);
                   uoa.d(R.color.arg_RES_7f06202c);
                   uoa.e(R.dimen.arg_RES_7f07047f);
                   uoa.c(R.color.arg_RES_7f06202b);
                   tm = uoa.a();
                }
             }
             this.o = new j(p0.findViewById(i), this.f, new c(this, p0, this.f, tm));
          }
       }
    label_00d2 :
       if (!PatchProxy.applyVoid(objArray, this, KrnFragment.class, "27")) {
          KrnFragment to = this.o;
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoid(objArray, to, j.class, "3") && to.b.n()) {
             to.c.m1();
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, KrnFragment.class, "29") && !TextUtils.x(this.f.e())) {
          try{
             this.b.setBackgroundColor(Color.parseColor(this.f.e()));
          }catch(java.lang.Exception e7){
             d.k("parseColor error", e7);
          }
       }
    }
    public int checkPermission(String p0,int p1,int p2){
       if (PatchProxy.isSupport(KrnFragment.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KrnFragment.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.getActivity().checkPermission(p0, p1, p2);
    }
    public int checkSelfPermission(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getActivity().checkSelfPermission(p0);
    }
    public void df(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnFragment.class, "47")) {
          return;
       }
       KrnFragment tg = this.g;
       if (tg != null) {
          tg.df();
          if (this.g.g() != null) {
             KrnReactRootView krnReactRoot = this.g.g();
             Objects.requireNonNull(krnReactRoot);
             if (!PatchProxy.applyVoid(objArray, krnReactRoot, ReactRootView.class, "46")) {
                krnReactRoot.G = LifecycleState.BEFORE_RESUME;
                Iterator iterator = krnReactRoot.F.iterator();
                while (iterator.hasNext()) {
                   FragmentLifecycleEventListener uFragmentLif = iterator.next();
                   try{
                      uFragmentLif.onFragmentPause();
                   }catch(java.lang.RuntimeException e2){
                      krnReactRoot.C(e2);
                      goto label_0039 ;
                   }
                }
             }
          }
       }
       return;
    }
    public final void fc(){
       if (PatchProxy.applyVoid(null, this, KrnFragment.class, "23")) {
          return;
       }
       this.n.f();
       return;
    }
    public void g5(boolean p0){
       if (PatchProxy.isSupport(KrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KrnFragment.class, "49")) {
          return;
       }
       this.p = p0;
       KrnFragment tg = this.g;
       if (tg != null) {
          tg.u(p0);
       }
       return;
    }
    public Activity getActivity(){
       return super.getActivity();
    }
    public Window getAttachedWindow(){
       return this.l;
    }
    public e getDegradeHandler(){
       return this.i;
    }
    public Object getKrnContext(){
       return this.getKrnContext();
    }
    public c getKrnContext(){
       Object[] objArray = null;
       KrnFragment obj = PatchProxy.apply(objArray, this, KrnFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj != null) {
          objArray = obj.e();
       }
       return objArray;
    }
    public KrnDelegate getKrnDelegate(){
       return this.g;
    }
    public LaunchModel getLaunchModel(){
       return this.f;
    }
    public void lg(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnFragment.class, "46")) {
          return;
       }
       KrnFragment tg = this.g;
       if (tg != null) {
          tg.lg();
          if (this.g.g() != null) {
             KrnReactRootView krnReactRoot = this.g.g();
             Objects.requireNonNull(krnReactRoot);
             if (!PatchProxy.applyVoid(objArray, krnReactRoot, ReactRootView.class, "45")) {
                krnReactRoot.G = LifecycleState.RESUMED;
                Iterator iterator = krnReactRoot.F.iterator();
                while (iterator.hasNext()) {
                   FragmentLifecycleEventListener uFragmentLif = iterator.next();
                   try{
                      uFragmentLif.onFragmentResume();
                   }catch(java.lang.RuntimeException e2){
                      krnReactRoot.C(e2);
                      goto label_0039 ;
                   }
                }
             }
          }
       }
       return;
    }
    public c m1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KrnFragment obj = PatchProxy.apply(objArray, this, KrnFragment.class, "40");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.o;
       Objects.requireNonNull(obj);
       c uoc = PatchProxy.apply(objArray, obj, j.class, "5");
       if (uoc != patchProxyRe) {
       }else {
          uoc = obj.c.m1();
       }
       return uoc;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KrnFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KrnFragment.class, "11")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       KrnFragment tg = this.g;
       Objects.requireNonNull(tg);
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (!PatchProxy.isSupport(krnDelegate) || (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, tg, KrnDelegate.class, "21") && (!PatchProxy.isSupport(krnDelegate) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Boolean.TRUE, tg, KrnDelegate.class, "22")))) {
          tg.e.r().A(tg.c, p0, p1, p2);
       }
       return;
    }
    public boolean onBackPressed(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KrnFragment obj = PatchProxy.apply(objArray, this, KrnFragment.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, KrnDelegate.class, "20");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj.e.r().B();
          b = true;
       }
       return b;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "22")) {
          return;
       }
       super.onConfigurationChanged(p0);
       KrnFragment tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, KrnDelegate.class, "32")) {
          a uoa = tg.e.r();
          KrnDelegate c = tg.c;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidTwoRefs(c, p0, uoa, a.class, "28")) {
             UiThreadUtil.assertOnUiThread();
             ReactContext reactContext = uoa.n();
             if (reactContext != null) {
                reactContext.getNativeModule(AppearanceModule.class).onConfigurationChanged(c);
             }
          }
          KrnDelegate f = tg.f;
          if (f != null) {
             KrnDelegate e = tg.e;
             if (e != null) {
                a uoa1 = e.r();
                if (!PatchProxy.applyVoidOneRefs(uoa1, f, KrnReactRootView.class, "17") && uoa1 != null) {
                   f.getViewTreeObserver().addOnPreDrawListener(new e(f, uoa1));
                }
             }
          }
       }
    label_006e :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "2")) {
          return;
       }
       LaunchModel launchModel = PatchProxy.apply(null, this, KrnFragment.class, "12");
       if (launchModel != PatchProxyResult.class) {
       }else {
          launchModel = this.getArguments().getParcelable("rn_launch_model");
          if (launchModel == null) {
             throw new IllegalArgumentException("Cannot loadApp because LaunchModel is null!");
          }
       }
       this.f = launchModel;
       long l = launchModel.j().c();
       long l1 = this.f.j().b();
       super.onCreate(p0);
       LoadingStateTrack loadingState = new LoadingStateTrack(LoadingStateTrack$LoadType.NORMAL_BUSINESS_BUNDLE, this.f.a(), this.f.j());
       if (this.f.j().d() > 0) {
          loadingState.l(this.f.j().d());
       }else {
          loadingState.l(a.e());
       }
       k ok = new k(this, this.f, loadingState, l, l1);
       this.g = this.f.j();
       this.f.j().u(this.p);
       this.g.m();
       KrnContextBindingManager.b.a(this.g.e());
       this.g.e().k().j();
       if (this.g.e().y()) {
          LoadingStateTrack loadingState1 = this.g.e().o();
          Objects.requireNonNull(loadingState1);
          if (!PatchProxy.applyVoid(null, loadingState1, LoadingStateTrack.class, "38")) {
             loadingState1 = loadingState1.k;
             Objects.requireNonNull(loadingState1);
             if (!PatchProxy.applyVoid(null, loadingState1, KrnBundleLoadInfo.class, "7")) {
                loadingState1.B0 = System.currentTimeMillis();
                if (loadingState1.c != null) {
                   a.d(0, "container_init", a.e(), 5);
                }
             }
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KrnFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (!this.Ug()) {
          return a.c(p0, 0x7f0d06d1, p1, false);
       }
       KrnFragment tj = this.j;
       if (tj != null) {
          return tj;
       }
       View view = a.c(p0, R.layout.arg_RES_7f0d06d1, p1, false);
       this.j = view;
       this.Wg(view);
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KrnFragment.class, "10")) {
          return;
       }
       super.onDestroy();
       this.g.n();
       KrnContextBindingManager.b.b(this.g.e());
       if (ExpConfigKt.f()) {
          KdsLeakDetector.g.e(this, "KrnFragment", this.getLaunchModel().a(), this.getLaunchModel().b(), 8000);
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       this.x();
       KrnFragment tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(objArray, tg, KrnDelegate.class, "10")) {
          d.e("onDestroyView: "+tg.e());
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, ExpConfigKt.class, "14");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = ExpConfigKt.n.getValue();
          }
          if (uBoolean.booleanValue()) {
             KrnInternalManager.c.b().l(3);
          }
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(KrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KrnFragment.class, "38")) {
          return;
       }
       super.onHiddenChanged(p0);
       String str = (p0)? "hide": "show";
       this.g.j(str);
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       KrnFragment obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KrnFragment.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KrnFragment.class, "17");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (PatchProxy.isSupport(krnDelegate)) {
          Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, obj, krnDelegate, "28");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(obj.e.r().o().t() && p0 == 90){
             p1.startTracking();
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_003f ;
       }
       return b;
    }
    public boolean onKeyLongPress(int p0,KeyEvent p1){
       KrnFragment obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KrnFragment.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KrnFragment.class, "18");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(KrnDelegate.class)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, obj, KrnDelegate.class, "29");
          if (p1 != patchProxyRe) {
             b = p1.booleanValue();
          }else {
          label_003f :
             a uoa = obj.e.r();
             if (uoa.o().t() && p0 == 90) {
                uoa.S();
                b = true;
             }else {
                b = false;
             }
          }
       }else {
          goto label_003f ;
       }
       return b;
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       KrnFragment obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KrnFragment.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KrnFragment.class, "19");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (PatchProxy.isSupport(krnDelegate)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, obj, krnDelegate, "35");
          if (p1 != patchProxyRe) {
             b = p1.booleanValue();
          }else {
          label_003f :
             a uoa = obj.e.r();
             if (uoa.o().t()) {
                if (p0 == 82) {
                   uoa.S();
                }else {
                   KrnDelegate i = obj.i;
                   a.c(i);
                   if (i.a(p0, obj.c.getCurrentFocus())) {
                      uoa.o().F();
                   }
                }
                b = true;
             }
             b = false;
          }
       }else {
          goto label_003f ;
       }
       return b;
    }
    public boolean onNewIntent(Intent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KrnFragment obj = PatchProxy.applyOneRefs(p0, this, KrnFragment.class, "20");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, KrnDelegate.class, "30");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj.e.r().G(p0);
          b = true;
       }
       return b;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, KrnFragment.class, "8")) {
          return;
       }
       super.onPause();
       this.g.o();
       return;
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       if (PatchProxy.isSupport(KrnFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnFragment.class, "32")) {
          return;
       }
       KrnFragment tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.isSupport(KrnDelegate.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, tg, KrnDelegate.class, "34")) {
          tg.h = new b(tg, p0, p1, p2);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, KrnFragment.class, "7")) {
          return;
       }
       super.onResume();
       this.g.p();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!this.Ug()) {
          this.Wg(p0);
       }
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       if (PatchProxy.isSupport(KrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KrnFragment.class, "21")) {
          return;
       }
       KrnFragment tg = this.g;
       Objects.requireNonNull(tg);
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (!PatchProxy.isSupport(krnDelegate) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tg, krnDelegate, "31")) {
          tg.e.r().H(p0);
       }
       return;
    }
    public void setAttachedWindow(Window p0){
       this.l = p0;
    }
    public void setCloseHandler(a p0){
       this.h = p0;
    }
    public void setDegradeHandler(e p0){
       this.i = p0;
    }
    public void setKrnDelegateConfig(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnFragment.class, "37")) {
          return;
       }
       this.g.t(p0);
       return;
    }
    public void setKrnStateController(c p0){
       this.n = p0;
    }
    public void setKrnTopBarController(j p0){
       this.o = p0;
    }
    public void setTopBarConfig(a p0){
       this.m = p0;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, KrnFragment.class, "24")) {
          return;
       }
       this.n.b();
       return;
    }
}
