package com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.s5;
import k2b.e0;
import k2b.j0;
import ta9.b;
import kz6.g;
import n3d.a$a;
import tz6.b;
import tz6.c;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.util.LinkedList;
import java.util.ArrayList;
import com.yxcorp.gifshow.activity.x;
import java.util.concurrent.CopyOnWriteArrayList;
import ua9.a;
import androidx.fragment.app.FragmentActivity;
import zf6.g;
import android.app.Activity;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import java.lang.Integer;
import ukd.a;
import android.content.pm.ActivityInfo;
import java.lang.Exception;
import k2b.u1;
import android.content.pm.ApplicationInfo;
import com.yxcorp.utility.n;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.log.r;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.w0;
import nf6.i;
import android.content.Context;
import android.content.Intent;
import ekd.x0;
import java.lang.Number;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import k2b.d0;
import hka.a;
import java.util.List;
import fw8.r;
import java.util.Objects;
import java.util.Iterator;
import fw8.r$a;
import ekd.l1;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import ekd.j0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.TextUtils;
import fw8.p;
import com.kuaishou.commercial.splash.SplashV2Activity;
import o56.f;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import cw9.e;
import cw9.b;
import zf6.l;
import java.util.Locale;
import lnc.f4;
import qe6.d;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.ref.WeakReference;
import java.lang.System;
import q2b.i$a;
import fw8.s;
import q2b.i;
import android.view.KeyEvent;
import com.kwai.performance.stability.crash.monitor.anr.c$b;
import android.os.SystemClock;
import androidx.core.app.ComponentActivity;
import android.view.MotionEvent;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import com.kwai.performance.stability.crash.monitor.anr.b;
import com.kwai.performance.stability.crash.monitor.anr.c;
import java.util.HashMap;
import java.lang.Long;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue;
import n3d.a;
import java.util.Set;
import hka.b;
import android.content.res.TypedArray;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import hka.g;
import com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import f3b.o;
import fw8.m;
import androidx.activity.ComponentActivity;
import android.content.res.Configuration;
import lnc.a1;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.kwai.library.widget.popup.common.PopupInterface$i;
import com.kwai.library.widget.popup.common.e;
import android.os.Bundle;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import ekd.i;
import rz6.a;
import rz6.a$a;
import com.kwai.sdk.switchconfig.a;
import java.util.Arrays;
import android.graphics.Paint;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;
import lnc.b;
import lnc.p5;
import java.util.Collection;
import ekd.q;
import java.lang.Runnable;
import lnc.q5;
import e17.i;
import androidx.core.app.a;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import o56.d;
import wg7.b;
import android.content.ContextWrapper;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public abstract class GifshowActivity extends RxFragmentActivity implements s5, e0, j0, b, g, a$a, b, c	// class@001031
{
    public String c;
    public GifshowActivity$AnchorPoint d;
    public String e;
    public boolean f;
    public List g;
    public int h;
    public int i;
    public boolean j;
    public final List k;
    public m l;
    public List m;
    public x n;
    public final List o;
    public final List p;
    public a q;
    public final g r;
    public Handler s;
    public int t;
    public Boolean u;
    public int v;
    public ActivityInfo w;
    public static final int x;

    public void GifshowActivity(){
       super();
       this.c = null;
       this.h = 0;
       this.i = 0x7f010112;
       this.j = true;
       this.k = new LinkedList();
       this.m = new ArrayList();
       this.n = this.d3();
       this.o = new CopyOnWriteArrayList();
       this.p = new ArrayList();
       this.q = new a(this);
       this.r = new g(this);
       this.s = new Handler();
       this.u = null;
       this.v = -9999;
    }
    private boolean c3(){
       GifshowActivity gifshowActiv = GifshowActivity.class;
       Object obj = PatchProxy.applyWithListener(null, this, gifshowActiv, "75");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Build$VERSION.SDK_INT == 26 && (this.targetSdkVersionAbove26() && (-1 != this.getRequestedOrientation() && this.isTranslucentOrFloating())))? true: false;
       PatchProxy.onMethodExit(gifshowActiv, "75");
       return b;
    }
    private void resetScreenOrientation(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "79")) {
          return;
       }
       GifshowActivity tv = this.v;
       if (-9999 != tv) {
          this.setValue(tv);
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "79");
       return;
    }
    private void setValue(int p0){
       GifshowActivity gifshowActiv = GifshowActivity.class;
       if (PatchProxy.isSupport(gifshowActiv) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, gifshowActiv, "78")) {
          return;
       }
       try{
          if (this.w == null) {
             this.w = a.d(this, "mActivityInfo");
          }
          this.w.screenOrientation = p0;
       }catch(java.lang.Exception e4){
          u1.R("kwai://hookActivityInfo", e4.toString(), 21);
       }
       return;
    }
    private boolean targetSdkVersionAbove26(){
       GifshowActivity gifshowActiv = GifshowActivity.class;
       Object obj = PatchProxy.applyWithListener(null, this, gifshowActiv, "77");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getApplicationInfo().targetSdkVersion > 26) {
          PatchProxy.onMethodExit(gifshowActiv, "77");
          return true;
       }else {
          PatchProxy.onMethodExit(gifshowActiv, "77");
          return false;
       }
    }
    private void unSetScreenOrientation(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "74")) {
          return;
       }
       this.v = this.getRequestedOrientation();
       this.setValue(-1);
       PatchProxy.onMethodExit(GifshowActivity.class, "74");
       return;
    }
    private void z0(boolean p0){
       boolean b;
       GifshowActivity gifshowActiv = GifshowActivity.class;
       if (PatchProxy.isSupport(gifshowActiv) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, gifshowActiv, "43")) {
          return;
       }
       n.C(this);
       super.finish();
       if (this.j != null) {
          this.overridePendingTransition(this.h, this.i);
       }
       b.a(0x4b316083).y0(this);
       Uri obj = PatchProxy.apply(null, this, gifshowActiv, "44");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(TextUtils.isEmpty(this.e)){
          b = false;
       }else if((this.e).contains("utm_source=nps")){
          this.e = this.W2();
       }
       obj = w0.f(this.e);
       Intent intent = b.a(0x66dce92a).a(this, obj);
       this.startActivity(intent);
       if (x0.a(obj, "isBackAnimated") != null) {
          this.overridePendingTransition(this.h, this.i);
       }else {
          this.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       }
       b = true;
    }
    public int Ab(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f();
    }
    public Dialog D(Dialog p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GifshowActivity.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.V(p0, null);
    }
    public int D4(){
       return d0.h(this);
    }
    public void F2(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "16")) {
          return;
       }
       if (!this.k.contains(p0)) {
          this.k.add(0, p0);
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "16");
       return;
    }
    public void G2(Intent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "11")) {
          return;
       }
       if (p0 == null) {
          PatchProxy.onMethodExit(GifshowActivity.class, "11");
          return;
       }else {
          r or = r.c();
          Objects.requireNonNull(or);
          String str = PatchProxy.applyOneRefsWithListener(p0, or, r.class, "13");
          if (str != PatchProxyResult.class) {
          }else {
             Iterator iterator = or.a.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   r$a uoa = iterator.next();
                   if (uoa != null) {
                      str = uoa.c(p0);
                      if (!TextUtils.isEmpty(str)) {
                         PatchProxy.onMethodExit(r.class, "13");
                      }
                   }
                }else {
                   str = null;
                   PatchProxy.onMethodExit(r.class, "13");
                }
             }
          }
          if (TextUtils.isEmpty(str)) {
             str = this.M2(p0);
          }
          this.e = str;
          r.c().b(p0);
          PatchProxy.onMethodExit(GifshowActivity.class, "11");
          return;
       }
    }
    public final void H2(){
       if (PatchProxy.applyVoid(null, this, GifshowActivity.class, "29")) {
          return;
       }
       if (n.I(this)) {
          return;
       }
       if (l1.a(this) && !this.X2()) {
          int i = 1024;
          Window window = (this.getWindow().getAttributes().flags & i)? 1: null;
          this.getWindow().clearFlags(i);
          this.getWindow().addFlags(2048);
          if (Build$VERSION.SDK_INT >= 23 && window) {
             this.getWindow().getDecorView().setSystemUiVisibility(8192);
             TypedValue typedValue = new TypedValue();
             this.getTheme().resolveAttribute(R.attr.arg_RES_7f0400f4, typedValue, true);
             this.getWindow().setStatusBarColor(typedValue.data);
          }
       }
    label_006f :
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       return d0.e(this);
    }
    public ClientEvent$ExpTagTrans K5(){
       return d0.d(this);
    }
    public void L2(){
       if (PatchProxy.applyVoid(null, this, GifshowActivity.class, "42")) {
          return;
       }
       this.z0(false);
       return;
    }
    public int Lb(){
       return d0.j(this);
    }
    public int M(){
       return 0;
    }
    public String M2(Intent p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, GifshowActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "12");
       return j0.f(p0, "backUri");
    }
    public boolean N(){
       return true;
    }
    public x N2(){
       return this.n;
    }
    public ClientContent$ContentPackage Nf(){
       return null;
    }
    public int O2(){
       return 0;
    }
    public String O9(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.o();
       }catch(java.lang.Exception e0){
          Log.g("appGrayConfig", "getPages Exception "+this.getClass().getName());
          return "";
       }
    }
    public int P2(){
       return 0;
    }
    public String P7(){
       return d0.i(this);
    }
    public String Q2(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.R2(null);
    }
    public ClientContent$ContentPackage Q3(){
       return null;
    }
    public String R2(View p0){
       String str;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GifshowActivity obj = PatchProxy.applyOneRefs(p0, this, GifshowActivity.class, "55");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.n;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, x.class, "26");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PatchProxy.applyOneRefs(p0, obj, x.class, "28");
          Object[] objArray = null;
          if (obj1 != patchProxyRe) {
          }else {
             Integer integer = x.e(p0);
             obj1 = PatchProxy.apply(objArray, obj, x.class, "29");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                i = obj.c.Ab();
                if (!i) {
                   i = obj.c.f();
                }
             }
             obj1 = (i > 0)? String.valueOf(i): objArray;
             if (integer != null && integer.intValue() > 0) {
                str = (!TextUtils.isEmpty(obj1))? obj1+","+integer: String.valueOf(integer);
                obj1 = str;
             }
          }
          str = PatchProxy.apply(objArray, obj, x.class, "27");
          if (str != patchProxyRe) {
          }else {
             Intent intent = PatchProxy.apply(objArray, obj, x.class, "25");
             if (intent != patchProxyRe) {
             }else {
                intent = obj.c.getIntent();
             }
             if (intent != null) {
                str = j0.f(intent, "page_path");
             }else {
                str = objArray;
             }
          }
          if (!TextUtils.isEmpty(str)) {
             objArray = str;
          }
          if (!TextUtils.isEmpty(obj1)) {
             if (!TextUtils.isEmpty(objArray)) {
                obj1 = objArray+","+obj1;
             }
          }else {
             obj1 = objArray;
          }
       }
       return obj1;
    }
    public void S2(Fragment p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "56")) {
          return;
       }
       this.n.h(p0);
       PatchProxy.onMethodExit(GifshowActivity.class, "56");
       return;
    }
    public int T2(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return j0.b(this.getIntent(), "PREV_PAGE_ID", 0);
    }
    public String U2(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(j0.f(this.getIntent(), "PREV_URL"));
    }
    public Dialog V(Dialog p0,DialogInterface$OnDismissListener p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, GifshowActivity.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isFinishing()) {
          PatchProxy.onMethodExit(GifshowActivity.class, "47");
          return null;
       }else if(this.g == null){
          this.g = new ArrayList();
       }
       p0.setOnDismissListener(new p(this, p1));
       this.g.add(p0);
       p0.show();
       PatchProxy.onMethodExit(GifshowActivity.class, "47");
       return p0;
    }
    public Handler V2(){
       return this.s;
    }
    public String W2(){
       return this.e;
    }
    public boolean X2(){
       return this instanceof SplashV2Activity;
    }
    public final void Y2(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "9")) {
          return;
       }
       this.h = this.getIntent().getIntExtra("activityOpenExitAnimation", 0);
       this.i = this.getIntent().getIntExtra("activityCloseEnterAnimation", 0x7f010112);
       PatchProxy.onMethodExit(GifshowActivity.class, "9");
       return;
    }
    public boolean Z2(){
       return false;
    }
    public String a2(){
       return "";
    }
    public final boolean a3(){
       int i = 0x4b316083;
       boolean b = false;
       try{
          if (b.a(i).p() && !f.b(this)) {
             b = true;
          }
          return b;
       }catch(android.os.RemoteException e0){
          ExceptionHandler.handleCaughtException(e0);
          return b;
       }
    }
    public void attachBaseContext(Context p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "58")) {
          return;
       }
       AutoTracker.INSTANCE.onInit(this);
       p0 = l.w(b.k(e.h(p0)), "00", this.t);
       if (!d.g(f4.a())) {
          super.attachBaseContext(p0);
       }else {
          super.attachBaseContext(f4.d(p0, d.d(f4.a())));
          f4.c(a.a().a().getApplicationContext(), d.d(f4.a()));
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "58");
       return;
    }
    public void b2(int p0){
       GifshowActivity gifshowActiv = GifshowActivity.class;
       if (PatchProxy.isSupport(gifshowActiv) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, gifshowActiv, "52")) {
          return;
       }
       gifshowActiv = this.n;
       Objects.requireNonNull(gifshowActiv);
       x ox = x.class;
       if (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), gifshowActiv, ox, "22")) {
          Fragment uFragment = gifshowActiv.c();
          gifshowActiv.d = new WeakReference(uFragment);
          if (!x.g(gifshowActiv) || (gifshowActiv.e != null && gifshowActiv.f())) {
             long l = (gifshowActiv.b - null > 0)? System.currentTimeMillis() - gifshowActiv.b: -1;
             i$a uoa = u1.l(gifshowActiv).x(p0).l(l);
             if (uFragment instanceof s) {
                uFragment.Bf(uoa);
             }
             b.a(0x4b316083).Y0(uoa.b());
             gifshowActiv.b = -1;
          }
       }
       return;
    }
    public boolean b3(){
       return this.f;
    }
    public Activity cd(){
       return d0.f(this);
    }
    public x d3(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new x(this);
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GifshowActivity.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (c$b.g != null) {
          c$b.d = p0;
          c$b.e = SystemClock.elapsedRealtime();
          c$b.f = SystemClock.currentThreadTimeMillis();
       }
       boolean b = super.dispatchKeyEvent(p0);
       c$b.a(p0, this.getClass().getName());
       r or = r.c();
       Objects.requireNonNull(or);
       if (!PatchProxy.applyVoidTwoRefs(this, p0, or, r.class, "8")) {
          Iterator iterator = or.a.iterator();
          while (iterator.hasNext()) {
             r$a uoa = iterator.next();
             if (uoa != null) {
                uoa.k(this, p0);
             }
          }
       }
       return b;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       r obj = PatchProxy.applyOneRefsWithListener(p0, this, GifshowActivity.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = r.c();
       Objects.requireNonNull(obj);
       r or = r.class;
       String str = "7";
       if (!PatchProxy.applyVoidTwoRefsWithListener(this, p0, obj, or, str)) {
          Iterator iterator = obj.a.iterator();
          while (iterator.hasNext()) {
             r$a uoa = iterator.next();
             if (uoa != null) {
                uoa.h(this, p0);
             }
          }
          PatchProxy.onMethodExit(or, str);
       }
       if (c$b.g != null) {
          c$b.a = p0;
          c$b.b = SystemClock.elapsedRealtime();
          c$b.c = SystemClock.currentThreadTimeMillis();
       }
       boolean b = super.dispatchTouchEvent(p0);
       String name = this.getClass().getName();
       AnrMonitorConfig g = c$b.g;
       if (g != null && g.inputEventCostMinWall >= null) {
          c uoc = b.c().h();
          if (uoc != null && c$b.a == p0) {
             long l = SystemClock.elapsedRealtime() - c$b.b;
             long l1 = SystemClock.currentThreadTimeMillis() - c$b.c;
             if (c$b.g.withEventCost != null) {
                c$b.h.put("LastInputType", "Touch");
                c$b.h.put("LastEventType", Integer.valueOf(p0.getAction()));
                c$b.h.put("LastEventData", p0.getRawX()+"x"+p0.getRawY());
                c$b.h.put("LastEventCostWall", Long.valueOf(l));
                c$b.h.put("LastEventCostCpu", Long.valueOf(l1));
             }
             if (l - (long)c$b.g.inputEventCostMinWall > 0) {
                uoc.h.g("Time:"+System.currentTimeMillis()+", Wall:"+l+", Cpu:"+l1+", Now:"+System.currentTimeMillis()+", Event:"+p0+", Context:"+name);
             }
          }
       }
    label_013b :
       PatchProxy.onMethodExit(GifshowActivity.class, "64");
       return b;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GifshowActivity.class, "20")) {
          return;
       }
       GifshowActivity tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidOneRefs(p0, tq, a.class, "4")) {
          tq.d.add(p0);
       }
       return;
    }
    public void e3(){
    }
    public boolean eg(){
       return d0.a(this);
    }
    public int f(){
       return 0;
    }
    public void f3(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "45")) {
          return;
       }
       Intent intent = this.getIntent();
       if (intent != null && (intent.getData() != null && (intent.getData().toString()).contains("returnBack"))) {
          PatchProxy.onMethodExit(GifshowActivity.class, "45");
          return;
       }else {
          f.d(a.B);
          this.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
          PatchProxy.onMethodExit(GifshowActivity.class, "45");
          return;
       }
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, GifshowActivity.class, "41")) {
          return;
       }
       this.z0(true);
       return;
    }
    public final void g3(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "6")) {
          return;
       }
       b.a(0x4b316083).c();
       PatchProxy.onMethodExit(GifshowActivity.class, "6");
       return;
    }
    public int getPage(){
       return 0;
    }
    public String getPageParams(){
       return "";
    }
    public int getStatusColor(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l.o(-1);
    }
    public String getUrl(){
       return "";
    }
    public final void h3(Intent p0,View p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, GifshowActivity.class, "39")) {
          return;
       }
       if (p0 == null) {
          PatchProxy.onMethodExit(GifshowActivity.class, "39");
          return;
       }else {
          String str = PatchProxy.apply(null, this, GifshowActivity.class, "48");
          if (str != PatchProxyResult.class) {
          }else {
             str = this.getUrl();
             if (str != null && this.c != null) {
                str = str+"#"+this.c;
             }
          }
          p0.putExtra("PREV_URL", str);
          p0.putExtra("PREV_PAGE_ID", this.f());
          str = "page_path";
          if (!p0.hasExtra(str)) {
             p0.putExtra(str, this.R2(p1));
          }
          r or = r.c();
          Objects.requireNonNull(or);
          if (!PatchProxy.applyVoidTwoRefsWithListener(p0, p1, or, r.class, "14")) {
             Iterator iterator = or.a.iterator();
             while (iterator.hasNext()) {
                r$a uoa = iterator.next();
                if (uoa != null) {
                   uoa.d(p0, p1);
                }
             }
             PatchProxy.onMethodExit(r.class, "14");
          }
          PatchProxy.onMethodExit(GifshowActivity.class, "39");
          return;
       }
    }
    public String h5(){
       return d0.g(this);
    }
    public void i3(b p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "22")) {
          return;
       }
       if (!this.o.contains(p0)) {
          this.o.add(p0);
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "22");
       return;
    }
    public boolean isCustomImmersiveMode(){
       return this instanceof SplashV2Activity;
    }
    public boolean isDarkImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.r();
    }
    public boolean isInMultiWindowMode(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 30) {
          return super.isInMultiWindowMode();
       }
       if (this.u == null) {
          this.u = Boolean.valueOf(super.isInMultiWindowMode());
       }
       return this.u.booleanValue();
    }
    public boolean isTranslucentOrFloating(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = 0;
       try{
          TypedArray typedArray = this.obtainStyledAttributes(a.h("com.android.internal.R$styleable", "Window"));
          Object[] objArray = new Object[]{typedArray};
          i = a.b(ActivityInfo.class.getCanonicalName(), "isTranslucentOrFloating", objArray).booleanValue();
          typedArray.recycle();
       }catch(java.lang.Exception e1){
          u1.R("kwai://hookActivityInfo", e1.toString(), 21);
       }
       return i;
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public void k3(g p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "24")) {
          return;
       }
       if (!this.p.contains(p0)) {
          this.p.add(p0);
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "24");
       return;
    }
    public void l3(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "17")) {
          return;
       }
       this.k.remove(p0);
       PatchProxy.onMethodExit(GifshowActivity.class, "17");
       return;
    }
    public void m3(String p0){
       this.c = p0;
    }
    public void n3(GifshowActivity$AnchorPoint p0){
       this.d = p0;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, GifshowActivity.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int page = this.getPage();
       if (page) {
          return o.i(page);
       }
       return "";
    }
    public void o3(boolean p0){
       this.j = p0;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport2(GifshowActivity.class, "26") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, GifshowActivity.class, "26")) {
          return;
       }
       this.q.onActivityResult(p0, p1, p2);
       PatchProxy.onMethodExit(GifshowActivity.class, "26");
       return;
    }
    public void onBackPressed(){
       GifshowActivity tl;
       String str;
       int i1;
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "2")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (true) {
          if (iterator.hasNext()) {
             a uoa = iterator.next();
             try{
                int i = 0;
                i = uoa.onBackPressed();
             }catch(java.lang.Exception e5){
                e5.printStackTrace();
                Log.e("GifshowActivity", "onBackPressed\(\)", e5);
             }
          }else {
             try{
                super.onBackPressed();
             }catch(java.lang.IllegalStateException e0){
                this.finish();
             }
             PatchProxy.onMethodExit(e0, "2");
             return;
          }
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "60")) {
          return;
       }
       super.onConfigurationChanged(p0);
       a1.a = 0;
       a1.b = 0;
       String str = "63";
       if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, str)) {
          Configuration orientation = p0.orientation;
          if (orientation != null && this.getResources().getConfiguration().orientation != orientation) {
             this.getResources().updateConfiguration(new Configuration(p0), c.c(this.getResources()));
          }
          PatchProxy.onMethodExit(GifshowActivity.class, str);
       }
       l.u(this, "01", this.t);
       e.g(this.getResources());
       b.i(this.getResources());
       e.d().b(this);
       if (d.g(f4.a())) {
          f4.c(this.getApplicationContext(), d.d(f4.a()));
       }
       if (!this.o.isEmpty()) {
          Iterator iterator = this.o.iterator();
          while (iterator.hasNext()) {
             iterator.next().onConfigurationChanged(p0);
          }
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "60");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "1")) {
          return;
       }
       AutoTracker iNSTANCE = AutoTracker.INSTANCE;
       iNSTANCE.onCreate(this);
       iNSTANCE.trackFirstFrameOnActivity(this);
       r.c().f(this, p0);
       if (this.Z2()) {
          Edge2EdgeHelper.a(this.getWindow());
       }
       int i = this.O2();
       this.t = i;
       this.r.a(i);
       if (this.c3()) {
          this.unSetScreenOrientation();
       }
       super.onCreate(p0);
       this.resetScreenOrientation();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, GifshowActivity.class, "5") && (!this.Z2() && !this.isCustomImmersiveMode())) {
          int[] ointArray = new int[]{0x101020d};
          TypedArray typedArray = this.getTheme().obtainStyledAttributes(ointArray);
          if (!typedArray.getBoolean(0, 0)) {
             i.i(this, this.getStatusColor(), this.isDarkImmersiveMode(), 0);
          }
          typedArray.recycle();
       }
    label_007c :
       this.G2(this.getIntent());
       this.Y2();
       if (!PatchProxy.applyVoid(objArray, this, GifshowActivity.class, "53")) {
          GifshowActivity tn = this.n;
          Objects.requireNonNull(tn);
          if (PatchProxy.applyVoid(objArray, tn, x.class, "23") || (!x.g(tn) || (tn.e != null && tn.f()))) {
             tn.b = System.currentTimeMillis();
          }
       }
       try{
       label_00b6 :
          r.c().d(this, p0);
          if (!PatchProxy.applyVoid(objArray, this, GifshowActivity.class, "82") && this.N()) {
             a$a e = a.e;
             if (e.a().b()) {
                a uoa = e.a();
                Objects.requireNonNull(uoa);
                Window window = this.getWindow();
                if (window != null) {
                   objArray = window.getDecorView();
                }
                uoa.f(objArray, uoa.a(this));
             }else {
                String str = a.t().c("validGrayWhiteMaskPages", "");
                if (str != null && !str.isEmpty()) {
                   String[] stringArray = str.split(",");
                   if (stringArray != null && stringArray.length >= 1) {
                      stringArray = new String[]{str};
                      if (Arrays.asList(stringArray).contains("ALL")) {
                         Paint paint = new Paint();
                         ColorMatrix uColorMatrix = new ColorMatrix();
                         uColorMatrix.setSaturation(0);
                         paint.setColorFilter(new ColorMatrixColorFilter(uColorMatrix));
                         this.getWindow().getDecorView().setLayerType(2, paint);
                      }
                   }
                }
             }
          }
          AutoTracker.INSTANCE.registerPageInfoIfNull(this, this.o());
          PatchProxy.onMethodExit(GifshowActivity.class, "1");
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "13")) {
          return;
       }
       AutoTracker.INSTANCE.onDestroy(this);
       GifshowActivity tg = this.g;
       if (tg != null) {
          Iterator iterator = tg.iterator();
          while (iterator.hasNext()) {
             Dialog uDialog = iterator.next();
             uDialog.setOnDismissListener(null);
             uDialog.dismiss();
          }
       }
       this.s.removeCallbacksAndMessages(null);
       tg = this.q;
       tg.c = 0;
       tg.e = null;
       super.onDestroy();
       b.a(this);
       PatchProxy.onMethodExit(GifshowActivity.class, "13");
       return;
    }
    public void onEnterAnimationComplete(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "59")) {
          return;
       }
       p5 op5 = b.a(-87691847);
       if (!q.f(op5.a)) {
          Iterator iterator = op5.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
          }
          op5.a.clear();
       }
       if (!this.m.isEmpty()) {
          Iterator iterator1 = this.m.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a();
          }
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "59");
       return;
    }
    public void onMultiWindowModeChanged(boolean p0,Configuration p1){
       if (PatchProxy.isSupport2(GifshowActivity.class, "61") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, GifshowActivity.class, "61")) {
          return;
       }
       super.onMultiWindowModeChanged(p0, p1);
       this.u = Boolean.valueOf(p0);
       if (!q.f(this.p)) {
          Iterator iterator = this.p.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0, p1);
          }
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "61");
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "4")) {
          return;
       }
       super.onNewIntent(p0);
       this.setIntent(p0);
       this.G2(p0);
       this.Y2();
       r.c().e(this, p0);
       PatchProxy.onMethodExit(GifshowActivity.class, "4");
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "27")) {
          return;
       }
       AutoTracker.INSTANCE.onPause(this);
       super.onPause();
       this.f = false;
       this.c = null;
       PatchProxy.onMethodExit(GifshowActivity.class, "27");
       return;
    }
    public void onPostCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "83")) {
          return;
       }
       AutoTracker.INSTANCE.onViewCreated(this);
       super.onPostCreate(p0);
       PatchProxy.onMethodExit(GifshowActivity.class, "83");
       return;
    }
    public void onResume(){
       c uoc;
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "28")) {
          return;
       }
       AutoTracker.INSTANCE.onResume(this);
       this.b2(1);
       super.onResume();
       Log.b("PageDebugInfo", " activity => "+this.getClass().getSimpleName());
       this.H2();
       int a = l.a;
       if (a >= 20) {
          uoc = null;
       }else {
          l.a = a + 1;
          uoc = 1;
       }
       if (uoc) {
          l.t(a.a().a(), "13");
       }
       this.f = true;
       this.c = null;
       PatchProxy.onMethodExit(GifshowActivity.class, "28");
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "3")) {
          return;
       }
       super.onSaveInstanceState(p0);
       r or = r.c();
       Objects.requireNonNull(or);
       if (!PatchProxy.applyVoidOneRefsWithListener(p0, or, r.class, "15")) {
          Iterator iterator = or.a.iterator();
          while (iterator.hasNext()) {
             r$a uoa = iterator.next();
             if (uoa != null) {
                uoa.onSaveInstanceState(p0);
             }
          }
          PatchProxy.onMethodExit(r.class, "15");
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "3");
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "84")) {
          return;
       }
       AutoTracker.INSTANCE.onStart(this);
       super.onStart();
       PatchProxy.onMethodExit(GifshowActivity.class, "84");
       return;
    }
    public void p3(Intent p0,View p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, GifshowActivity.class, "33")) {
          return;
       }
       try{
          this.h3(p0, p1);
          super.startActivity(p0);
          this.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
       }catch(android.content.ActivityNotFoundException e0){
          i.a(R.style.arg_RES_7f11066a, 0x7f100070);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       PatchProxy.onMethodExit(e0, "33");
       return;
    }
    public String pg(){
       return d0.k(this);
    }
    public void q3(Intent p0,int p1,View p2){
       if (PatchProxy.isSupport2(GifshowActivity.class, "37") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), p2, this, GifshowActivity.class, "37")) {
          return;
       }
       try{
          this.h3(p0, p2);
          super.startActivityForResult(p0, p1);
          this.overridePendingTransition(p0.getIntExtra("start_enter_page_animation", R.anim.arg_RES_7f010109), p0.getIntExtra("start_exit_page_animation", R.anim.arg_RES_7f01004c));
       }catch(android.content.ActivityNotFoundException e0){
          i.a(R.style.arg_RES_7f11066a, 0x7f100070);
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
       }
       this.g3();
       PatchProxy.onMethodExit(e0, "37");
       return;
    }
    public void r3(Intent p0,int p1,Bundle p2,View p3){
       if (PatchProxy.isSupport2(GifshowActivity.class, "36") && PatchProxy.applyVoidFourRefsWithListener(p0, Integer.valueOf(p1), p2, p3, this, GifshowActivity.class, "36")) {
          return;
       }
       this.h3(p0, p3);
       a.j(this, p0, p1, p2);
       PatchProxy.onMethodExit(GifshowActivity.class, "36");
       return;
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, GifshowActivity.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.n) {
          PatchProxy.onMethodExit(GifshowActivity.class, "68");
          return b.a(p0, p1, this);
       }else {
          PatchProxy.onMethodExit(GifshowActivity.class, "68");
          return super.registerReceiver(p0, p1);
       }
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,int p2){
       if (PatchProxy.isSupport2(GifshowActivity.class, "66")) {
          Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, GifshowActivity.class, "66");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (d.n) {
          PatchProxy.onMethodExit(GifshowActivity.class, "66");
          return b.a(p0, p1, this);
       }else {
          PatchProxy.onMethodExit(GifshowActivity.class, "66");
          return super.registerReceiver(p0, p1, p2);
       }
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3){
       Object obj = PatchProxy.applyFourRefsWithListener(p0, p1, p2, p3, this, GifshowActivity.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.n) {
          PatchProxy.onMethodExit(GifshowActivity.class, "67");
          return b.a(p0, p1, this);
       }else {
          PatchProxy.onMethodExit(GifshowActivity.class, "67");
          return super.registerReceiver(p0, p1, p2, p3);
       }
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3,int p4){
       if (PatchProxy.isSupport2(GifshowActivity.class, "65")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, GifshowActivity.class, "65");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (d.n) {
          PatchProxy.onMethodExit(GifshowActivity.class, "65");
          return b.a(p0, p1, this);
       }else {
          PatchProxy.onMethodExit(GifshowActivity.class, "65");
          return super.registerReceiver(p0, p1, p2, p3, p4);
       }
    }
    public void s(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GifshowActivity.class, "21")) {
          return;
       }
       GifshowActivity tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidOneRefs(p0, tq, a.class, "5")) {
          tq.d.remove(p0);
       }
       return;
    }
    public void s3(b p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "23")) {
          return;
       }
       this.o.remove(p0);
       PatchProxy.onMethodExit(GifshowActivity.class, "23");
       return;
    }
    public void setContentView(int p0){
       if (PatchProxy.isSupport2(GifshowActivity.class, "69") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, GifshowActivity.class, "69")) {
          return;
       }
       super.setContentView(p0);
       r or = r.c();
       Objects.requireNonNull(or);
       if (!PatchProxy.isSupport2(r.class, "9") || !PatchProxy.applyVoidTwoRefsWithListener(this, Integer.valueOf(p0), or, r.class, "9")) {
          Iterator iterator = or.a.iterator();
          while (iterator.hasNext()) {
             r$a uoa = iterator.next();
             if (uoa != null) {
                uoa.j(this, p0);
             }
          }
          PatchProxy.onMethodExit(r.class, "9");
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "69");
       return;
    }
    public void setContentView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "70")) {
          return;
       }
       super.setContentView(p0);
       r or = r.c();
       Objects.requireNonNull(or);
       if (!PatchProxy.applyVoidTwoRefsWithListener(this, p0, or, r.class, "10")) {
          Iterator iterator = or.a.iterator();
          while (iterator.hasNext()) {
             r$a uoa = iterator.next();
             if (uoa != null) {
                uoa.b(this, p0);
             }
          }
          PatchProxy.onMethodExit(r.class, "10");
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "70");
       return;
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, GifshowActivity.class, "71")) {
          return;
       }
       super.setContentView(p0, p1);
       r or = r.c();
       Objects.requireNonNull(or);
       if (!PatchProxy.applyVoidThreeRefsWithListener(this, p0, p1, or, r.class, "11")) {
          Iterator iterator = or.a.iterator();
          while (iterator.hasNext()) {
             r$a uoa = iterator.next();
             if (uoa != null) {
                uoa.a(this, p0, p1);
             }
          }
          PatchProxy.onMethodExit(r.class, "11");
       }
       PatchProxy.onMethodExit(GifshowActivity.class, "71");
       return;
    }
    public void setRequestedOrientation(int p0){
       if (PatchProxy.isSupport2(GifshowActivity.class, "76") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, GifshowActivity.class, "76")) {
          return;
       }
       if (this.c3()) {
          try{
             this.unSetScreenOrientation();
             super.setRequestedOrientation(p0);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          this.resetScreenOrientation();
          PatchProxy.onMethodExit(GifshowActivity.class, "76");
          return;
       }else {
          try{
             super.setRequestedOrientation(p0);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          PatchProxy.onMethodExit(GifshowActivity.class, "76");
          return;
       }
    }
    public void startActivity(Intent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "32")) {
          return;
       }
       a.j(this, p0, -1, null);
       PatchProxy.onMethodExit(GifshowActivity.class, "32");
       return;
    }
    public void startActivityForResult(Intent p0,int p1){
       if (PatchProxy.isSupport2(GifshowActivity.class, "35") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, GifshowActivity.class, "35")) {
          return;
       }
       this.startActivityForResult(p0, p1, null);
       PatchProxy.onMethodExit(GifshowActivity.class, "35");
       return;
    }
    public void startActivityForResult(Intent p0,int p1,Bundle p2){
       if (PatchProxy.isSupport2(GifshowActivity.class, "38") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), p2, this, GifshowActivity.class, "38")) {
          return;
       }
       View view = null;
       try{
          this.h3(p0, view);
          super.startActivityForResult(p0, p1, p2);
          this.overridePendingTransition(p0.getIntExtra("start_enter_page_animation", R.anim.arg_RES_7f010109), p0.getIntExtra("start_exit_page_animation", R.anim.arg_RES_7f01004c));
       }catch(android.content.ActivityNotFoundException e0){
          i.a(R.style.arg_RES_7f11066a, 0x7f100070);
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
       }
       this.g3();
       PatchProxy.onMethodExit(e0, "38");
       return;
    }
    public void startActivityFromFragment(Fragment p0,Intent p1,int p2,Bundle p3){
       if (PatchProxy.isSupport2(GifshowActivity.class, "34") && PatchProxy.applyVoidFourRefsWithListener(p0, p1, Integer.valueOf(p2), p3, this, GifshowActivity.class, "34")) {
          return;
       }
       a.j(this, p1, p2, p3);
       PatchProxy.onMethodExit(GifshowActivity.class, "34");
       return;
    }
    public void supportFinishAfterTransition(){
       if (PatchProxy.applyVoidWithListener(null, this, GifshowActivity.class, "31")) {
          return;
       }
       super.supportFinishAfterTransition();
       PatchProxy.onMethodExit(GifshowActivity.class, "31");
       return;
    }
    public void t1(Intent p0,int p1,a p2){
       if (PatchProxy.isSupport2(GifshowActivity.class, "14") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), p2, this, GifshowActivity.class, "14")) {
          return;
       }
       this.q.t1(p0, p1, p2);
       PatchProxy.onMethodExit(GifshowActivity.class, "14");
       return;
    }
    public void t3(g p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GifshowActivity.class, "25")) {
          return;
       }
       this.p.remove(p0);
       PatchProxy.onMethodExit(GifshowActivity.class, "25");
       return;
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
}
