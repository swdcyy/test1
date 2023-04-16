package com.kwai.nearby.local.presenter.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.presenter.p$b;
import nsd.u;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.autoplay.state.f;
import tkd.b;
import tkd.d;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import com.kwai.nearby.local.presenter.p$d;
import com.kwai.nearby.local.presenter.p$e;
import com.kwai.nearby.local.presenter.p$c;
import com.kwai.nearby.local.presenter.p$a;
import vc7.d0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrb.a;
import q87.c;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dd7.b0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import dd7.c0;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import dd7.a0;
import dd7.d0;
import lha.a;
import t45.d;
import brd.z;
import dd7.z;
import qd7.a;
import dd7.y;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.view.GestureDetector$OnDoubleTapListener;
import hd7.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qd7.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import ro5.c0;
import qc7.g;
import com.kwai.library.widget.popup.common.c;
import ko5.d;
import ko5.c;
import wq6.l;
import wq6.g;
import wq6.e;
import wq6.h;
import nr4.a$a;
import mc7.i;
import dsb.a;
import zsd.u;
import android.graphics.Bitmap;
import qd7.b;
import k2b.f3;
import lnc.i3;
import android.app.Activity;
import android.text.TextPaint;
import lnc.a1;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.nearby.local.presenter.p$f;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.nearby.local.presenter.p$g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import ro5.g;
import com.google.gson.JsonObject;
import z1.a;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import qrd.p;
import xr6.c;
import xr6.c$a;
import xr6.c$b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import android.view.Window;
import android.view.View;
import wkd.b;
import tjc.c;
import com.yxcorp.image.request.a;
import hd.c;
import jd.c;
import s0d.a;
import s0d.e;
import dd7.e0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import com.kwai.nearby.local.presenter.p$h;
import java.lang.Runnable;
import ekd.k1;

public final class p extends PresenterV2	// class@000fc5
{
    public boolean A;
    public final e B;
    public final p$e C;
    public final p$c D;
    public final d E;
    public final f p;
    public final b q;
    public d0 r;
    public e s;
    public c t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public boolean x;
    public final int y;
    public String z;
    public static final p$b F;

    static {
       p.F = new p$b(null);
    }
    public void p(d p0){
       a.p(p0, "mFragmentWrapper");
       super();
       this.E = p0;
       this.p = new f(p0);
       b uob = d.a(0xded02ea);
       a.o(uob, "PluginManager.get\(ThanosPlugin::class.java\)");
       this.w = uob.PL();
       this.y = 0x28a8;
       this.z = "";
       this.B = new p$d(this);
       this.C = new p$e(this);
       this.D = new p$c(this);
       this.q = new p$a(this);
    }
    public static final d0 P8(p p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mPageState");
       }
       return p0;
    }
    public void E8(){
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "2")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().s("HomeLocalTopBubblePresenter", "onBind", objArray1);
       String[] stringArray = new String[]{"Push.Webserver.NearbyRelationBubble"};
       f.e().o(this.B, stringArray);
       if (!PatchProxy.applyVoid(objArray, this, op, "4")) {
          this.X7(RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new b0(this), Functions.d()));
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "5")) {
          this.X7(this.p.d().distinctUntilChanged().subscribe(new c0(this), Functions.d()));
          if (!PatchProxy.applyVoid(objArray, this, op, "6")) {
             FragmentActivity uFragmentAct = this.E.g();
             if (uFragmentAct instanceof FragmentActivity) {
                q.p0(uFragmentAct).v0(this.D);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "8")) {
          this.X7(this.E.h().i().distinctUntilChanged().subscribe(new a0(this), Functions.d()));
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "9")) {
          p tr = this.r;
          if (tr == null) {
             a.S("mPageState");
          }
          this.X7(tr.g().distinctUntilChanged().subscribe(new d0(this), Functions.d()));
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "10")) {
          this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new z(this), Functions.e));
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "11")) {
          this.X7(RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new y(this), Functions.d()));
       }
       a.b().registerActivityLifecycleCallbacks(this.q);
       op = this.s;
       if (op != null) {
          op.c(this.C);
       }
       return;
    }
    public void J8(){
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "3")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().s("HomeLocalTopBubblePresenter", "onUnbind", objArray1);
       f.e().w(this.B);
       this.p.a();
       if (!PatchProxy.applyVoid(objArray, this, op, "7")) {
          FragmentActivity uFragmentAct = this.E.g();
          if (uFragmentAct instanceof FragmentActivity) {
             q.p0(uFragmentAct).C0(this.D);
          }
       }
       a.b().unregisterActivityLifecycleCallbacks(this.q);
       op = this.s;
       if (op != null) {
          op.g(this.C);
       }
       return;
    }
    public final boolean R8(){
       Object obj = PatchProxy.apply(null, this, p.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(c.b()) ^ 0x01);
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, p.class, "24")) {
          return;
       }
       if (this.v != null) {
          Object[] objArray = new Object[0];
          a.C().s("HomeLocalTopBubblePresenter", "hideAvatar", objArray);
          TabIdentifier d = b.d;
          c0.s(this.E, d);
          c0.D(this.E, d);
          RxBus.f.b(new g(0));
          this.v = false;
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, p.class, "23")) {
          return;
       }
       p tt = this.t;
       if (tt != null) {
          tt.o();
       }
       this.t = null;
       return;
    }
    public final boolean W8(){
       FragmentActivity obj = PatchProxy.apply(null, this, p.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.E.g();
       if (obj instanceof FragmentActivity) {
          d uod = c.a(obj);
          a.o(uod, "IKCubeHomeTabDataStore.get\(activity\)");
          if (a.g(uod.d().k().N().M2(), b.e)) {
             return true;
          }
       }
       return false;
    }
    public final void X8(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "22")) {
          return;
       }
       i.g(null);
       c.a = p0.d;
       RxBus.f.b(new a());
       return;
    }
    public final String Y8(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, p.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u.g2(p0, "${user}", p1, false, 4, null);
    }
    public final void Z8(a$a p0,Bitmap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("HomeLocalTopBubblePresenter", "showAvatar", objArray);
       TabIdentifier d = b.d;
       c0.E(this.E, d, p1);
       c0.m(this.E, d, "   ");
       this.v = true;
       RxBus.f.b(new g(true));
       this.X8(p0);
       p tw = this.w;
       String str = String.valueOf(this.y);
       p tz = this.z;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(tw), str, tz, null, b.class, "3")) {
          a.p(str, "popId");
          a.p(tz, "popContent");
          String str1 = (tw != null)? "3291786": "2808610";
          f3 uof3 = f3.l(str1, "NEARBY_TAB_SPECIAL_CARD");
          i3 oi3 = i3.f();
          oi3.d("special_style", "HEAD_PORTRAIT");
          oi3.d("pop_id", str);
          oi3.d("pop_content", tz);
          uof3.m(oi3.e());
          uof3.g();
       }
       return;
    }
    public final void a9(Bitmap p0,a$a p1){
       a$a a;
       String str = this;
       Object obj = p0;
       Object obj1 = p1;
       p op = p.class;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, str, op, "19")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       this.V8();
       Activity activity = this.getActivity();
       a.m(activity);
       a.o(activity, "activity!!");
       String str1 = PatchProxy.applyTwoRefs(obj1, activity, str, op, "26");
       String str2 = 2;
       if (str1 != PatchProxyResult.class) {
       }else {
          TextPaint textPaint = new TextPaint();
          textPaint.setTextSize((float)a1.e(14.00f));
          a = obj1.a;
          a$a c = obj1.c;
          a.o(a, "pattern");
          String str3 = "username";
          a.o(c, str3);
          String str4 = str.Y8(a, c);
          float f = textPaint.measureText(str4);
          double d = ((double)n.k(activity) * 0x3fe3333333333333) - (double)a1.e(12.00f);
          int i1 = 50;
          int i2 = i1 - 1;
          while (i1 > 0 && (c.length() >= str2 && (double)f - d > 0)) {
             a.o(c, str3);
             int i3 = c.length() - 1;
             c = c.substring(0, i3);
             a.o(c, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             str4 = str.Y8(a, c+"...");
             f = textPaint.measureText(str4);
             i1 = i2;
             str2 = 2;
          }
          str1 = str4;
       }
       str.z = str1;
       Object[] objArray = new Object[0];
       a.C().s("HomeLocalTopBubblePresenter", "showBubble "+str.z, objArray);
       Activity activity1 = this.getActivity();
       a.m(activity1);
       a uoa = new a(activity1);
       uoa.I0(str.y);
       uoa.K0(KwaiBubbleOption.g);
       uoa.C0((- a1.d(R.dimen.arg_RES_7f07034b)));
       uoa.D0(BubbleInterface$Position.BOTTOM);
       uoa.F0(str.z);
       uoa.P(true);
       uoa.T(5000);
       uoa.z(false);
       uoa.A(false);
       uoa.L(p$f.b);
       uoa.M(new p$g(str, obj1, obj));
       a uoa1 = uoa;
       int i = (str.A != null)? 3: 2;
       g og = new g(uoa1, "TopNearby", 0x28a8, true, null, i, str.z);
       c0.c(str.E, b.d, uoa);
       return;
    }
    public final void b9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p.class, "20")) {
          return;
       }
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, LocalConfigKeyHelper.class, "10");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = LocalConfigKeyHelper.j.getValue();
       }
       if (uBoolean.booleanValue()) {
          p tr = this.r;
          String str = "mPageState";
          if (tr == null) {
             a.S(str);
          }
          if (tr.e()) {
             tr = this.r;
             if (tr == null) {
                a.S(str);
             }
             tr.k(5);
          }else {
             FragmentActivity uFragmentAct = this.E.g();
             if (uFragmentAct != null) {
                d uod = c.a(uFragmentAct);
                a.o(uod, "IKCubeHomeTabDataStore.get\(it\)");
                TabIdentifier d = b.d;
                a.o(d, "HomeTabIdentifier.LOCAL");
                uod.d().n(d, c.e.c("LOCAL_RELATION_BUBBLE_CLICK").a());
             }
          }
       }
       return;
    }
    public final void c9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p.class, "12")) {
          return;
       }
       a$a uoa = a$a.class;
       String str = i.a.getString("topBarBubbleInfo", "");
       if (str != null && str != "") {
          objArray = b.a(str, uoa);
       }
       if (objArray != null) {
          this.d9(objArray);
       }
       return;
    }
    public final void d9(a$a p0){
       boolean b;
       p op1;
       p op = p.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op, "13")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, op, "14");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.p.c()){
          obj = this.getActivity();
          if (obj != null) {
             Window window = obj.getWindow();
             if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                   decorView = (!decorView.getVisibility())? 1: 0;
                   if (decorView == 1) {
                      op1 = 1;
                   label_004c :
                      if (op1 && this.u != null) {
                         TabIdentifier obj1 = PatchProxy.apply(objArray, this, op, "15");
                         if (obj1 != patchProxyRe) {
                            b = obj1.booleanValue();
                         }else {
                            obj1 = b.c;
                            b = (!c0.B(this.E, obj1) && (!c0.y(this.E, obj1) && (!c0.C(this.E, obj1) && (!c0.b(this.E, obj1) && (c0.p(this.E, obj1) || c0.L(this.E, obj1))))))? true: false;
                         }
                         if (b) {
                            objArray = new Object[0];
                            a.C().s("HomeLocalTopBubblePresenter", "Has notify in follow tab, show later.", objArray);
                         }else if(this.W8()){
                            objArray = new Object[0];
                            a.C().s("HomeLocalTopBubblePresenter", "Is in operate tab, show later.", objArray);
                         }else if(b.a(-1608526086).S()){
                            objArray = new Object[0];
                            a.C().s("HomeLocalTopBubblePresenter", "Is in splash page, show later.", objArray);
                         }else {
                            b = true;
                         }
                      }
                   }
                }
             }
          }
          op1 = null;
          goto label_004c ;
       }
    label_00d6 :
       b = false;
       if (!b) {
          Object[] objArray1 = new Object[0];
          a.C().s("HomeLocalTopBubblePresenter", "Can not show bubble, save bubble info for later process.", objArray1);
          i.g(p0);
          return;
       }else {
          b = TextUtils.x(p0.b) ^ 1;
          this.A = b;
          if (b) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, op, "17")) {
                a.d(a.u(p0.b).l(new c()).q(), new e0(this, p0));
             }
          }else {
             k1.o(new p$h(this, p0));
          }
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       Object obj = this.r8("HOME_LOCAL_PAGE_STATE");
       a.o(obj, "inject\(HomeLocalAccessIds.PAGE_STATE\)");
       this.r = obj;
       this.s = this.t8("HOME_LOCAL_TOP_TAB_VIEW");
       return;
    }
}
