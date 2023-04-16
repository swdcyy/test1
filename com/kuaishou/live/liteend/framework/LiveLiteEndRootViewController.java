package com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.lite.LiveLiteParam;
import k2b.e0;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ma3.b;
import com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController$EndPresenterLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ma3.a;
import android.app.Activity;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig;
import lp3.g;
import v51.b;
import java.util.Set;
import trd.d1;
import c93.a$b;
import xp5.g;
import or5.d;
import e93.a;
import com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$1;
import com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$2;
import c93.a;
import msd.l;
import xp5.i;
import trd.c1;
import com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$3;
import com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$4;
import pg1.e;
import com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$5;
import com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$6;
import id3.h;
import com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$7;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$8;
import d93.c;
import be3.a;
import android.view.View;
import android.view.ViewGroup;
import eq3.d;
import vb3.n;
import vb3.e;
import e93.c;
import za3.d;
import e93.d;
import za3.i;
import e93.b;
import id3.a;
import yqb.c;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import xc3.j;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController$loadPresenterOnLifecycle$1;
import gb3.a;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import androidx.lifecycle.LifecycleRegistry;
import gq3.a;
import androidx.lifecycle.Lifecycle$Event;
import crd.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteEndRootViewController extends ViewController	// class@000bca
{
    public LiveLiteModelManager j;
    public c k;
    public a l;
    public final b m;
    public final LiveLiteEndRootViewController$EndPresenterLoader n;
    public a o;
    public final BaseFragment p;
    public final LiveLiteParam q;
    public final e0 r;
    public final a s;
    public final a t;

    public void LiveLiteEndRootViewController(BaseFragment p0,LiveLiteParam p1,e0 p2,a p3,a p4){
       a.p(p0, "hostFragment");
       a.p(p1, "liveLiteParam");
       a.p(p2, "logPage");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.m = new b();
       this.n = new LiveLiteEndRootViewController$EndPresenterLoader(this);
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.o = uoa;
    }
    public void F2(){
       Object[] objArray;
       LiveLiteModelManager liveLiteMode1;
       LiveLiteEndRootViewController n;
       LiveLiteModelManager liveLiteMode = this;
       LiveLiteEndRootViewController liveLiteEndR = LiveLiteEndRootViewController.class;
       String str = "1";
       if (PatchProxy.applyVoid(null, liveLiteMode, liveLiteEndR, str)) {
          return;
       }
       liveLiteMode.Q2(R.layout.arg_RES_7f0d0c5b);
       a a = a.a;
       Activity uActivity = this.B2();
       LiveLiteEndRootViewController p = liveLiteMode.p;
       LiveLiteEndRootViewController q = liveLiteMode.q;
       LiveLiteEndRootViewController r = liveLiteMode.r;
       LiveLiteEndRootViewController t = liveLiteMode.t;
       Objects.requireNonNull(a);
       a uoa = a.class;
       int i = 5;
       String str1 = "2";
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[i];
          objArray[0] = uActivity;
          objArray[1] = p;
          objArray[2] = q;
          objArray[3] = r;
          objArray[4] = t;
          liveLiteMode1 = PatchProxy.apply(objArray, a, uoa, str);
          if (liveLiteMode1 != PatchProxyResult.class) {
          label_0109 :
             liveLiteMode.j = liveLiteMode1;
             liveLiteMode.k = new c();
             View view = this.P2();
             Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
             liveLiteMode.l = new a(this.B2(), view, this.E2());
             if (!PatchProxy.applyVoid(null, liveLiteMode, liveLiteEndR, "4")) {
                n = liveLiteMode.k;
                String str2 = "serviceManager";
                if (n == null) {
                   a.S(str2);
                }
                n on = n.class;
                p = liveLiteMode.l;
                String str3 = "mLayoutManager";
                if (p == null) {
                   a.S(str3);
                }
                n.d(on, p.f);
                n = liveLiteMode.k;
                if (n == null) {
                   a.S(str2);
                }
                e uoe = e.class;
                p = liveLiteMode.l;
                if (p == null) {
                   a.S(str3);
                }
                n.d(uoe, p.g);
                n = liveLiteMode.k;
                if (n == null) {
                   a.S(str2);
                }
                n.d(c.class, new d(liveLiteMode.p));
                n = liveLiteMode.s;
                if (n != null) {
                   LiveLiteEndRootViewController k = liveLiteMode.k;
                   if (k == null) {
                      a.S(str2);
                   }
                   k.d(d.class, new i(n));
                }
                n = liveLiteMode.k;
                if (n == null) {
                   a.S(str2);
                }
                a uoa1 = new a(this.B2(), liveLiteMode.p, liveLiteMode.q, liveLiteMode.o, null);
                n.d(b.class, i);
                n = liveLiteMode.k;
                if (n == null) {
                   a.S(str2);
                }
                n.d(LiveLiteRecommendSideBarService.class, new j(liveLiteMode.p));
             }
             n = liveLiteMode.n;
             Lifecycle$State cREATED = Lifecycle$State.CREATED;
             if (!PatchProxy.applyVoidTwoRefs(n, cREATED, liveLiteMode, liveLiteEndR, str1)) {
                this.getLifecycle().addObserver(new LiveLiteEndRootViewController$loadPresenterOnLifecycle$1(liveLiteMode, cREATED, n));
             }
             return;
          }
       }
       a.p(uActivity, "activity");
       a.p(p, "fragment");
       a.p(q, "liteParam");
       a.p(r, "logPage");
       LiveLiteModelConfig liveLiteMode2 = new LiveLiteModelConfig(b.a());
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[]{uActivity,p,liveLiteMode2,q,r,t};
          if (!PatchProxy.applyVoid(objArray, a, uoa, str1)) {
          label_0089 :
             a$b a1 = a$b.a;
             Class[] uClassArray = new Class[]{g.class,d.class,a.class};
             LiveLiteModelConfig liveLiteMode3 = liveLiteMode2;
             a$b uob = a1;
             liveLiteMode3.a(d1.k(), "直播间观众信息Model，可以用来获取\n1. LiveSteamId\n2. 主播信息\n3. QLivePlayConfig 等", uob, d1.u(uClassArray), new LiveLiteEndModelRegistry$registerLegacyService$1(q), LiveLiteEndModelRegistry$registerLegacyService$2.INSTANCE);
             liveLiteMode3.a(d1.k(), "LogPackage统一获取", uob, c1.f(i.class), new LiveLiteEndModelRegistry$registerLegacyService$3(q, r), LiveLiteEndModelRegistry$registerLegacyService$4.INSTANCE);
             liveLiteMode3.a(d1.k(), "直播间关注管理", uob, c1.f(e.class), new LiveLiteEndModelRegistry$registerLegacyService$5(uActivity), LiveLiteEndModelRegistry$registerLegacyService$6.INSTANCE);
             if (t != null) {
                liveLiteMode2.a(c1.f("wangmengyang"), "上下滑能力，获取当前上下滑状态，替换上下滑feed数据", a1, c1.f(h.class), new LiveLiteEndModelRegistry$registerLegacyService$7(p, t), LiveLiteEndModelRegistry$registerLegacyService$8.INSTANCE);
             }
          }
       }else {
          goto label_0089 ;
       }
       liveLiteMode1 = new LiveLiteModelManager(liveLiteMode2);
       goto label_0109 ;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteEndRootViewController.class, "3")) {
          return;
       }
       this.n.b();
       LiveLiteEndRootViewController tj = this.j;
       if (tj == null) {
          a.S("modelManager");
       }
       tj.b();
       tj = this.l;
       if (tj == null) {
          a.S("mLayoutManager");
       }
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(objArray, tj, a.class, "1")) {
          tj.a.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_DESTROY);
          tj.c.dispose();
          a h = tj.h;
          Objects.requireNonNull(h, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          h.l3(tj.g);
          b.Z(LiveLiteLogTag.LAYOUT_MANAGER, "LiveLiteLayoutManager "+tj+" onDestroy");
       }
       return;
    }
}
