package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import an6.h;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$b;
import nsd.u;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import kzb.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$c;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$h;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$f;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$d;
import java.lang.Integer;
import o56.c;
import o56.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dn6.b;
import java.util.Map;
import a0c.g;
import q87.c;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter;
import an6.k;
import ozb.c;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import ozb.n;
import ozb.e;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter;
import qrd.l1;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import lnc.u1;
import android.app.Activity;
import hn5.c;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.util.rx.RxBus;
import nk9.e;
import brd.t;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$onBind$1;
import ozb.i;
import msd.l;
import erd.g;
import crd.b;
import ujc.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$onBind$2;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import tkd.b;
import tkd.d;
import ap5.a;
import wh5.a;
import zca.b;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$onBind$3;
import java.util.List;
import fr6.d;
import wq6.l;
import an6.o;
import java.lang.Boolean;
import an6.h$a;
import rzb.g;
import an6.l;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils;
import ko5.d;
import ko5.c;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$e;
import pm6.j;
import android.util.SparseLongArray;
import java.lang.System;
import an6.e;
import lnc.i3;
import com.yxcorp.gifshow.postentrance.util.b;
import jn5.a$a;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import jn5.b;
import jn5.a;
import k2b.e0;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import ozb.l;
import java.util.HashMap;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import ezb.f;
import b66.k$a;
import java.util.Iterator;
import java.lang.Iterable;
import ozb.q;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$g;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.edge.reco.ctr.CTRPredictor;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$a;

public class HomePostBubblePresenterV2 extends PresenterV2 implements h, g	// class@001025
{
    public final HomePostBubblePresenterV2$c A;
    public final HomePostBubblePresenterV2$h B;
    public final HomePostBubblePresenterV2$f C;
    public final f D;
    public final d E;
    public final int F;
    public final int G;
    public boolean p;
    public l q;
    public d r;
    public List s;
    public final HomePostBubbleManager t;
    public final a u;
    public HomePostOperationBubblePresenter v;
    public CameraViewSwitcher w;
    public HomePostBubblePresenterV2$a x;
    public final List y;
    public List z;
    public static final HomePostBubblePresenterV2$b H;

    static {
       HomePostBubblePresenterV2.H = new HomePostBubblePresenterV2$b(null);
    }
    public void HomePostBubblePresenterV2(d p0,int p1,int p2){
       Object[] objArray1;
       a.p(p0, "fragment");
       super();
       this.E = p0;
       this.F = p1;
       this.G = p2;
       this.p = true;
       this.t = new HomePostBubbleManager();
       a uoa = new a(p0, p2);
       this.u = uoa;
       this.y = new ArrayList();
       this.A = new HomePostBubblePresenterV2$c(this);
       this.B = new HomePostBubblePresenterV2$h(this);
       this.C = new HomePostBubblePresenterV2$f(this);
       this.D = new HomePostBubblePresenterV2$d(this);
       int i = 0;
       String str = "home_entrance_bubble";
       if (p1) {
          uoa.f = Integer.valueOf(p1);
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, HomePostBubblePresenterV2.class, "5")) {
                String str1 = b.b.a().get("bubbleType");
                if (str1 != null) {
                   objArray = Integer.valueOf(Integer.parseInt(str1));
                }
                if (objArray == null) {
                   objArray1 = new Object[i];
                   g.C().w(str, "testBubbleType is null", objArray1);
                   this.W8();
                }else if(objArray.intValue() == 3){
                   this.P8(new HomeLocalNewUserBubblePresenter(p0, uoa, p1, p2));
                }else if(objArray.intValue() == 34){
                   this.P8(new c(p0, uoa, p1, p2));
                }else if(objArray.intValue() == 16){
                   if (HomePostEntranceExpUtil.a() > 0) {
                      this.P8(new n(p0, uoa, p1, p2));
                   }
                }else if(objArray.intValue() == 33){
                   this.P8(new e(p0, uoa, p1, p2));
                }else {
                   HomePostOperationBubblePresenter homePostOper = new HomePostOperationBubblePresenter(p0, uoa, p1, p2);
                   this.P8(homePostOper);
                   this.v = homePostOper;
                }
             }
          }else {
             this.W8();
          }
       }else {
          objArray1 = new Object[i];
          g.C().t(str, "HomePostBubblePresenterV2 target view is null", objArray1);
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomePostBubblePresenterV2.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 onBind", objArray);
       if (this.F == null) {
          return;
       }
       HomePostBubblePresenterV2 tu = this.u;
       HomePostBubblePresenterV2 tw = this.w;
       if (tw == null) {
          a.S("cameraViewSwitcher");
       }
       tu.e = tw;
       this.t.c(this);
       this.X8();
       a.b().registerActivityLifecycleCallbacks(this.A);
       u1.a(this);
       if (this.getActivity() instanceof c) {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          q.p0(activity).v0(this.C);
       }
       RxBus f = RxBus.f;
       this.X7(f.f(e.class).subscribe(new i(new HomePostBubblePresenterV2$onBind$1(this))));
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(e.class, mAIN).subscribe(new i(new HomePostBubblePresenterV2$onBind$2(this))));
       if (NasaSlidePlayExperimentUtil.d()) {
          if (d.a(-2061018968).AT() || a.f()) {
             this.t.d(3);
          }
          this.X7(f.g(b.class, mAIN).subscribe(new i(new HomePostBubblePresenterV2$onBind$3(this))));
       }
       tu = this.z;
       if (tu != null) {
          tu.add(this.B);
       }
       tu = this.s;
       if (tu != null) {
          tu.add(this.D);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomePostBubblePresenterV2.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 onUnbind", objArray);
       u1.b(this);
       if (this.getActivity() instanceof c) {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          q.p0(activity).C0(this.C);
       }
       this.t.i(this);
       a.b().unregisterActivityLifecycleCallbacks(this.A);
       HomePostBubblePresenterV2 tz = this.z;
       if (tz != null) {
          tz.remove(this.B);
       }
       tz = this.s;
       if (tz != null) {
          tz.remove(this.D);
       }
       tz = this.q;
       if (tz != null) {
          HomePostBubblePresenterV2 tr = this.r;
          a.m(tr);
          tz.m(tr);
       }
       this.t.f(true);
       this.t.e();
       return;
    }
    public void M0(o p0,boolean p1){
       HomePostBubblePresenterV2 homePostBubb = HomePostBubblePresenterV2.class;
       if (PatchProxy.isSupport(homePostBubb) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, homePostBubb, "15")) {
          return;
       }
       a.p(p0, "bubbleItem");
       h$a.b(this, p0, p1);
       if (p1) {
          g.a.a(p0, 2);
       }
       return;
    }
    public final void P8(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomePostBubblePresenterV2.class, "6")) {
          return;
       }
       this.y.add(p0);
       this.U7(p0);
       PatchProxy.onMethodExit(HomePostBubblePresenterV2.class, "6");
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, HomePostBubblePresenterV2.class, "19")) {
          return;
       }
       this.t.f(true);
       return;
    }
    public final HomePostBubbleManager S8(){
       return this.t;
    }
    public void U3(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2.class, "21")) {
          return;
       }
       a.p(p0, "bubbleItem");
       h$a.c(this, p0);
       return;
    }
    public final a V8(){
       return this.u;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, HomePostBubblePresenterV2.class, "4")) {
          return;
       }
       HomePostOperationBubblePresenter homePostOper = new HomePostOperationBubblePresenter(this.E, this.u, this.F, this.G);
       this.P8(homePostOper);
       this.v = homePostOper;
       this.P8(new HomeLocalNewUserBubblePresenter(this.E, this.u, this.F, this.G));
       CameraEntranceUtils h = CameraEntranceUtils.h;
       if (h.e() || h.b(Integer.valueOf(34))) {
          this.P8(new c(this.E, this.u, this.F, this.G));
       }
       if (HomePostEntranceExpUtil.a() > 0) {
          this.P8(new n(this.E, this.u, this.F, this.G));
       }
       this.P8(new e(this.E, this.u, this.F, this.G));
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, HomePostBubblePresenterV2.class, "10")) {
          return;
       }
       d uod = c.a(this.E.g());
       a.o(uod, "IKCubeHomeTabDataStore.get\(fragment.activity\)");
       l ol = uod.d();
       this.q = ol;
       if (ol != null) {
          this.r = new HomePostBubblePresenterV2$e(this);
          Object[] objArray = new Object[0];
          g.C().w("home_entrance_bubble", "init tab change listener, cube", objArray);
          HomePostBubblePresenterV2 tr = this.r;
          a.m(tr);
          ol.a(tr);
       }
       return;
    }
    public void d7(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2.class, "16")) {
          return;
       }
       a.p(p0, "bubbleItem");
       int i = p0.hashCode();
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), null, oj, "7")) {
          j.a = false;
          long l = j.b.get(i);
          if (l > 0) {
             j.a(l, System.currentTimeMillis());
             j.b.delete(i);
          }
       }
       h$a.a(this, p0);
       g.a.a(p0, 1);
       e uoe = p0.g();
       i3 oi3 = (uoe != null)? uoe.h(): null;
       if (!PatchProxy.applyVoidTwoRefs(p0, oi3, null, b.class, "5")) {
          a$a uoa = new a$a();
          uoa.c(b.b(p0));
          uoa.g(2);
          uoa.d("BottomPost");
          if (oi3 != null) {
             uoa.b(a.a.h(oi3.e(), JsonObject.class));
          }
          b.a.c(uoa.a(), null);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2.class, "7")) {
          return;
       }
       a.p(p0, "rootView");
       this.x = null;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomePostBubblePresenterV2.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, HomePostBubblePresenterV2.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(HomePostBubblePresenterV2.class, new l());
       }else {
          obj.put(HomePostBubblePresenterV2.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomePostBubblePresenterV2.class, "1")) {
          return;
       }
       this.s = this.t8("HOME_CAMERA_BTN_CLICK_DELEGATES");
       this.z = this.t8("HOME_SWPIE_TO_PROFILE_LISTENERS");
       Object obj = this.r8("camera_view_switcher");
       a.o(obj, "inject\(CameraEntranceAcc¡­Ids.CAMERA_VIEW_SWITCHER\)");
       this.w = obj;
       return;
    }
    public void o4(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2.class, "18")) {
          return;
       }
       a.p(p0, "bubbleItem");
       int i = p0.hashCode();
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), null, oj, "8")) {
          j.a = false;
          long l = j.b.get(i);
          if (l > 0) {
             j.a(l, -1);
             j.b.delete(i);
          }
       }
       this.u.q(false);
       Object[] objArray = new Object[false];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 resetCameraView", objArray);
       if (this.x != null) {
          HomePostBubblePresenterV2 tw = this.w;
          if (tw == null) {
             a.S("cameraViewSwitcher");
          }
          HomePostBubblePresenterV2 tx = this.x;
          a.m(tx);
          tw.a(tx);
       }
       return;
    }
    public final void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2.class, "14")) {
          return;
       }
       a.p(p0, "event");
       p0 = p0.a;
       if (p0 == 2 || p0 == 3) {
          Object[] objArray = new Object[0];
          g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 handleStartUpEvent", objArray);
          Iterator iterator = this.y.iterator();
          while (iterator.hasNext()) {
             PresenterV2 presenterV2 = iterator.next();
             if (presenterV2 instanceof q) {
                if (this.p != null) {
                   k1.r(new HomePostBubblePresenterV2$g(presenterV2), 0);
                }else {
                   presenterV2.X0();
                }
             }
          }
          this.p = false;
       }
       return;
    }
    public void w3(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2.class, "17")) {
          return;
       }
       a.p(p0, "bubbleItem");
       int i = p0.hashCode();
       j oj = j.class;
       boolean b = true;
       String str = null;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), str, oj, "6")) {
          j.a = b;
          j.b.put(i, System.currentTimeMillis());
       }
       CTRPredictor.v.r(4);
       if (!PatchProxy.applyVoid(str, str, b.class, "2")) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             b.a.clear();
          }
       }
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 onBubbleShow, bubbleItem "+p0.getPriority(), objArray);
       this.u.q(b);
       g.a.a(p0, 0);
       e uoe = p0.g();
       i3 oi3 = (uoe != null)? uoe.h(): str;
       if (!PatchProxy.applyVoidTwoRefs(p0, oi3, str, b.class, "3")) {
          a$a uoa = new a$a();
          uoa.c(b.b(p0));
          uoa.g(2);
          uoa.d("BottomPost");
          if (oi3 != null) {
             uoa.b(a.a.h(oi3.e(), JsonObject.class));
          }
          b.a.e(uoa.a(), str);
       }
       if (this.x == null) {
          Object[] objArray1 = new Object[0];
          g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 onBubbleShow, create cameraBubbleItem", objArray1);
          this.x = new HomePostBubblePresenterV2$a(this);
       }
       HomePostBubblePresenterV2 tx = this.x;
       a.m(tx);
       e uoe1 = p0.g();
       if (uoe1 != null) {
          str = uoe1.i();
       }
       tx.c = str;
       HomePostBubblePresenterV2 tw = this.w;
       if (tw == null) {
          a.S("cameraViewSwitcher");
       }
       tx = this.x;
       a.m(tx);
       tw.k(tx);
       return;
    }
}
