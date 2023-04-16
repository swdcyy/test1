package com.yxcorp.gifshow.activity.BasePostActivity;
import com.kwai.horae.a$c;
import j36.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.horae.lifecycle.a;
import com.yxcorp.gifshow.activity.BasePostActivity$a;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.ax2c.PreLoader;
import android.view.ViewGroup;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import java.lang.Boolean;
import cq.a;
import java.lang.Runnable;
import android.os.MessageQueue;
import android.os.Looper;
import fw8.n;
import android.os.MessageQueue$IdleHandler;
import j36.f;
import lq.i;
import android.content.Intent;
import android.app.Activity;
import android.os.Parcelable;
import ekd.j0;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.BoolArg;
import com.kuaishou.android.post.PostPageArg;
import o56.f;
import java.lang.Number;
import lnc.a1;
import android.os.Bundle;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkConfigManager;
import c35.i;
import com.kuaishou.viewbinder.IViewBinder;
import com.kwai.framework.activitycontext.ActivityContext;
import java.util.Iterator;
import com.kwai.framework.activitycontext.ActivityContext$a;
import xf6.g;
import lnc.d7;
import e17.i;
import j36.a;
import v46.e;
import lq.l;
import ua9.a;
import m56.f;
import com.yxcorp.gifshow.util.t0;
import m56.g;
import p16.a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import xf6.l;
import android.view.Window;
import com.yxcorp.gifshow.widget.test.BundleRecycleView;
import qzc.a;
import java.util.TreeSet;
import com.yxcorp.gifshow.util.f0;
import java.util.Comparator;
import com.yxcorp.gifshow.util.g0;
import java.lang.CharSequence;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import ekd.q;
import g9c.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lq.e;
import qi9.b;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.camera.record.album.RecordAlbumActivity;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.activity.BasePostActivity$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import lnc.i1;
import com.yxcorp.utility.TextUtils;
import w46.a;
import w46.a$a;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingActivity;
import com.yxcorp.utility.j;
import qka.a;
import ekd.i;
import com.kwai.feature.post.api.util.g;
import java.util.concurrent.TimeUnit;
import brd.a0;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.activity.h;
import com.yxcorp.gifshow.activity.i;
import erd.g;
import crd.b;
import o36.g;

public abstract class BasePostActivity extends GifshowActivity implements a$c, g	// class@001334
{
    public a A;
    public e B;
    public final int C;
    public i D;
    public boolean E;
    public boolean F;
    public boolean G;
    public j H;
    public IViewBinder I;
    public a J;
    public l K;
    public String y;
    public boolean z;
    public static boolean L;
    public static int M;
    public static int N;

    public void BasePostActivity(){
       super();
       int n = BasePostActivity.N;
       BasePostActivity.N = n + 1;
       this.C = n;
       this.E = false;
       this.F = false;
       this.G = false;
       this.J = new a(this);
       this.K = new BasePostActivity$a(this);
    }
    public static int A3(){
       return BasePostActivity.M;
    }
    public static View C3(Context p0,int p1){
       BasePostActivity uBasePostAct = BasePostActivity.class;
       if (PatchProxy.isSupport(uBasePostAct)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uBasePostAct, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return PreLoader.getInstance().getOrWait(p0, p1, null, false);
    }
    public void Aa(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "34")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("BasePostActivity:"+this.getClass().getSimpleName(), "onRenderBegin\(\)", objArray);
       return;
    }
    public String B3(){
       return "UNKNOWN";
    }
    public List B9(){
       Object obj = PatchProxy.apply(null, this, BasePostActivity.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("BasePostActivity:"+this.getClass().getSimpleName(), "bindNextPage\(\)", objArray);
       return null;
    }
    public boolean D3(){
       Object obj = PatchProxy.apply(null, this, BasePostActivity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("BasePostActivity", "isPostSessionEntry "+this.E, objArray);
       return this.E;
    }
    public void E3(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "28")) {
          return;
       }
       Looper.myQueue().addIdleHandler(new n(p0));
       return;
    }
    public String E7(){
       return f.a(this);
    }
    public void F3(boolean p0){
       this.F = p0;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "38")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("BasePostActivity:"+this.getClass().getSimpleName(), "onPageDestroy\(\)", objArray);
       return;
    }
    public boolean N(){
       return false;
    }
    public void Of(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "35")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("BasePostActivity:"+this.getClass().getSimpleName(), "onRenderEnd\(\)", objArray);
       return;
    }
    public List W4(){
       Object obj = PatchProxy.apply(null, this, BasePostActivity.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("BasePostActivity:"+this.getClass().getSimpleName(), "onPreloadResource\(\)", objArray);
       return null;
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "36")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("BasePostActivity:"+this.getClass().getSimpleName(), "onRenderIdle\(\)", objArray);
       return;
    }
    public List c4(){
       Object obj = PatchProxy.apply(null, this, BasePostActivity.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("BasePostActivity:"+this.getClass().getSimpleName(), "onPreloadData\(\)", objArray);
       return null;
    }
    public void finish(){
       Intent intent;
       BasePostActivity uBasePostAct = BasePostActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBasePostAct, "19")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uBasePostAct, "22") && this.u3()) {
          uBasePostAct = this.D;
          if (uBasePostAct == null || !uBasePostAct.D()) {
             if (intent != null) {
                this.startActivity(intent);
             }
          }
       }
       super.finish();
       this.F = true;
       return;
    }
    public void finishAffinity(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "20")) {
          return;
       }
       boolean b = true;
       this.F = b;
       if (i.h()) {
          i.m().c0(b);
       }
       this.setResult(0);
       if (i.h()) {
          i.m().r();
       }else {
          super.finishAffinity();
       }
       if (i.g().getFromThirdParty().get(Boolean.FALSE).booleanValue()) {
          f.d(this);
       }
       return;
    }
    public int getStatusColor(){
       Object obj = PatchProxy.apply(null, this, BasePostActivity.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.a(0x7f060073);
    }
    public boolean isDarkImmersiveMode(){
       return false;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(BasePostActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, BasePostActivity.class, "12")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p1 == -1) {
          BasePostActivity tD = this.D;
          if (tD == null || tD.D()) {
             this.setResult(-1, p2);
             this.finish();
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "4")) {
          return;
       }
       boolean i = 0;
       Object[] objArray = new Object[i];
       a.D().w("hwcfg_BasePostActivity", "DPBenchmarkConfigManager stop", objArray);
       DPBenchmarkConfigManager.getInstance().stop();
       this.J.e();
       Intent intent = this.getIntent();
       if (this instanceof i && this.I == null) {
          this.I = this.V5(-1);
       }
       objArray = 1;
       String str = "discard_current_post_session";
       boolean b = (intent != null && j0.a(intent, str, i))? true: false;
       if (intent != null) {
          intent.putExtra(str, i);
       }
       Iterator iterator = ActivityContext.g().d().iterator();
       while (true) {
          if (iterator.hasNext()) {
             ActivityContext$a uoa = iterator.next();
             if (uoa == null) {
                continue ;
             }else {
                Activity uActivity = uoa.a();
                if (uActivity == null || (!uActivity instanceof BasePostActivity || (uActivity.getClass() == this.getClass() && uActivity.isFinishing()))) {
                   continue ;
                }
             }
          }else {
             objArray = 0;
          }
          if (i.h()) {
             if (b) {
                this.w3(intent);
             }else {
                this.D = i.m().c(this);
                i = (p0 != null && p0.containsKey("INTENT_SET_POST_SESSION_ENTRY"))? p0.getBoolean("INTENT_SET_POST_SESSION_ENTRY"): j0.a(intent, "INTENT_SET_POST_SESSION_ENTRY", i);
                this.E = i;
             }
          }else if(p0 != null){
             Object[] objArray1 = new Object[i];
             a.D().w("BasePostActivity", "PostSession is null but savedInstanceState is not null, finish.", objArray1);
             this.finish();
          }else {
             this.w3(intent);
          }
          super.onCreate(p0);
          if (i.h()) {
             i.g().onActivityCreate(intent, this.C);
             if (this.E != null) {
                i.m().J();
             }
          }
          if (g.j()) {
             this.z3();
          }
          this.v3(null);
          if (!objArray && d7.l()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f101691);
             this.finish();
             break ;
          }
          break ;
       }
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BasePostActivity.class, "11")) {
          return;
       }
       this.J.f();
       super.onDestroy();
       if (g.j()) {
          this.z3();
       }
       BasePostActivity tA = this.A;
       if (tA != null) {
          tA.a();
       }
       tA = this.B;
       if (tA != null) {
          tA.H();
       }
       tA = this.D;
       if (tA != null) {
          tA.R(this, this.F);
          this.D.U(this.K);
          this.K = objArray;
          i.P(this.C);
       }
       if (this.E != null && this.D != null) {
          Intent intent = new Intent();
          intent.putExtra("POST_SESSION_RESULT", this.D.D());
          this.q.onActivityResult(0, -1, intent);
       }
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "17")) {
          return;
       }
       BasePostActivity tD = this.D;
       if (tD != null) {
          tD.E().a();
       }
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "18")) {
          return;
       }
       BasePostActivity tD = this.D;
       if (tD != null) {
          tD.E().c();
       }
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "7")) {
          return;
       }
       super.onNewIntent(p0);
       if (i.h()) {
          i.g().onNewIntent(p0, this.C, this.D3());
          return;
       }else {
          Object[] objArray = new Object[0];
          a.D().w("BasePostActivity", "Create PostSession in onNewIntent "+this, objArray);
          this.w3(p0);
          return;
       }
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "10")) {
          return;
       }
       super.onPause();
       if (this.isFinishing()) {
          Object[] objArray = new Object[0];
          a.D().w("BasePostActivity", "onPause: activity is finishing."+this, objArray);
          i.P(this.C);
       }
       return;
    }
    public void onResume(){
       TreeSet b1;
       BasePostActivity b1;
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "13")) {
          return;
       }
       if (this instanceof a && (i.h() && !i.m().I())) {
          this.finish();
          PostUtils.E("BasePostActivity", this+" onResume ", new IllegalArgumentException("EditSession is null"), true);
       }
    label_0041 :
       super.onResume();
       boolean b = false;
       if (l.c("key_ks_show_bundle_data", b)) {
          Window window = this.getWindow();
          String str = "bundle_data";
          View view = window.getDecorView().findViewWithTag(str);
          if (view != null) {
             window.getDecorView().findViewById(0x1020002).removeView(view);
          }
          BundleRecycleView uBundleRecyc = new BundleRecycleView(this);
          uBundleRecyc.setTag(str);
          a uoa = new a();
          b1 = (!l.c("key_ks_show_bundle_data_reverse", b))? new TreeSet(f0.b): new TreeSet(g0.b);
          if (this.getIntent().getExtras() == null) {
             i.d(R.style.arg_RES_7f11066a, "getExtras is null");
          }else {
             b1.addAll(this.getIntent().getExtras().keySet());
             ArrayList uArrayList = new ArrayList();
             Iterator b11 = b1.iterator();
             while (b11.hasNext()) {
                String str1 = b11.next();
                if (this.getIntent().getExtras().get(str1) != null) {
                   uArrayList.add(str1+" ->"+this.getIntent().getExtras().get(str1).toString());
                }
             }
             if (!q.f(uArrayList)) {
                uoa.W0(uArrayList);
                uBundleRecyc.setLayoutManager(new LinearLayoutManager(this));
                uBundleRecyc.setAdapter(uoa);
                b11 = uArrayList.iterator();
                while (b11.hasNext()) {
                   str = b11.next();
                }
                window.getDecorView().findViewById(0x1020002).addView(uBundleRecyc);
             }
          }
       }
       this.y3();
       b1 = this.D;
       if (b1 != null) {
          b1.k().p(this.getIntent());
          if (this.G == null) {
             this.D.f(this.K);
             this.G = true;
          }
       }
       if (b.a()) {
          Fresco.getImagePipeline().clearMemoryCaches();
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "21")) {
          return;
       }
       super.onSaveInstanceState(p0);
       p0.putBoolean("INTENT_SET_POST_SESSION_ENTRY", this.E);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "8")) {
          return;
       }
       super.onStart();
       BasePostActivity tA = this.A;
       if (tA != null) {
          tA.b();
       }
       tA = this.B;
       if (tA != null) {
          tA.J();
       }
       if (!i.h()) {
          Object[] objArray = new Object[0];
          a.D().w("BasePostActivity", "onStart: PostSession is unavailable, finish "+this, objArray);
          this.finish();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "9")) {
          return;
       }
       super.onStop();
       BasePostActivity tA = this.A;
       if (tA != null) {
          tA.c();
       }
       tA = this.B;
       if (tA != null) {
          tA.I();
       }
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       BasePostActivity uBasePostAct = BasePostActivity.class;
       if (PatchProxy.isSupport(uBasePostAct) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBasePostAct, "25")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       if (p0) {
          this.y3();
       }
       return;
    }
    public void r2(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "37")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("BasePostActivity:"+this.getClass().getSimpleName(), "onPageCreate\(\)", objArray);
       return;
    }
    public View r5(){
       Object obj = PatchProxy.apply(null, this, BasePostActivity.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getWindow() != null) {
          return this.getWindow().getDecorView();
       }
       return null;
    }
    public void setContentView(int p0){
       BasePostActivity uBasePostAct = BasePostActivity.class;
       if (PatchProxy.isSupport(uBasePostAct) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBasePostAct, "15")) {
          return;
       }
       super.setContentView(p0);
       if (this.z4() != null) {
          a uoa = new a(this, this);
          this.A = uoa;
          uoa.d();
       }
       e uoe = new e(this);
       this.B = uoe;
       uoe.s2();
       return;
    }
    public void setContentView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "14")) {
          return;
       }
       super.setContentView(p0);
       if (this instanceof i) {
          BasePostActivity tI = this.I;
          if (tI != null) {
             tI.bindViews(p0);
          }
       }
       if (this.z4() != null) {
          a uoa = new a(this, this);
          this.A = uoa;
          uoa.d();
       }
       e uoe = new e(this);
       this.B = uoe;
       uoe.s2();
       return;
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BasePostActivity.class, "16")) {
          return;
       }
       super.setContentView(p0, p1);
       if (this.z4() != null) {
          a uoa = new a(this, this);
          this.A = uoa;
          uoa.d();
       }
       e uoe = new e(this);
       this.B = uoe;
       uoe.s2();
       return;
    }
    public boolean u3(){
       return this instanceof RecordAlbumActivity;
    }
    public void v3(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "5")) {
          return;
       }
       try{
          this.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new BasePostActivity$b(this, p0));
       }catch(java.lang.Exception e3){
          i1.c(e3);
       }
       return;
    }
    public final void w3(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePostActivity.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("BasePostActivity", "Create PostSession in "+this, objArray);
       this.E = true;
       i oi = i.V();
       oi.b0(j0.a(p0, "INTENT_GO_HOME_ON_POST_COMPLETE", true));
       i oi1 = oi.c(this);
       this.D = oi1;
       oi1.k().p(p0);
       if (!TextUtils.x(j0.f(p0, "photo_task_id"))) {
          a.f.a().j(j0.f(p0, "photo_task_id"));
       }
       return;
    }
    public boolean x3(){
       return this instanceof SmartAlbumLoadingActivity;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "26")) {
          return;
       }
       if (!this.x3()) {
          return;
       }
       Window window = this.getWindow();
       if (this.H == null) {
          this.H = new j(window);
       }
       if (a.a()) {
          window.clearFlags(1024);
          window.addFlags(2048);
          if (!this.isCustomImmersiveMode()) {
             i.i(this, this.getStatusColor(), this.isDarkImmersiveMode(), false);
          }
       }else {
          this.H.a();
       }
       g.z(this.getWindow());
       return;
    }
    public final void z3(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity.class, "24")) {
          return;
       }
       a0.Y(3, TimeUnit.SECONDS).T(d.c).G(d.a).R(h.b, i.b);
       return;
    }
    public String z4(){
       Object obj = PatchProxy.apply(null, this, BasePostActivity.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null) {
          this.y = g.b(this);
          this.z = true;
       }
       return this.y;
    }
}
