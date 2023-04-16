package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$a;
import nsd.u;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq6.a;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$c;
import android.os.Looper;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$d;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$b;
import lr6.a;
import wq6.f;
import wq6.h;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wq6.g;
import zq6.b;
import bo5.a;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$e;
import zq6.p;
import zq6.u;
import zq6.s;
import xq6.b;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$f;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$g;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$h;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$i;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$j;
import zq6.i;
import qsa.b;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$k;
import erd.g;
import crd.b;
import brd.t;
import lr6.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$l;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.os.Handler;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import co5.g;
import ekd.c;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.library.widget.popup.bubble.a$c;
import pr6.d;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$m;
import erd.r;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$n;
import io.reactivex.internal.functions.Functions;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import java.util.Objects;
import android.graphics.Rect;
import jn5.c;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.IconifyRadioButtonPresenter$doShowBubble$1;
import com.kwai.library.widget.popup.common.c$b;
import msd.a;
import com.google.gson.JsonObject;
import jn5.g;
import android.app.Activity;
import kzc.c;
import cg6.b;
import com.yxcorp.gifshow.widget.popup.c;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import com.kwai.kcube.TabIdentifier;
import gr6.b;
import lr6.f;

public final class a extends PresenterV2	// class@001722
{
    public final a$b A;
    public final IconifyRadioButtonNew B;
    public a p;
    public b q;
    public h r;
    public f s;
    public PagerSlidingTabStrip$d t;
    public d u;
    public boolean v;
    public final a w;
    public int x;
    public final Handler y;
    public final a$d z;
    public static final a$a C;

    static {
       a.C = new a$a(null);
    }
    public void a(IconifyRadioButtonNew p0){
       a.p(p0, "textView");
       super();
       this.B = p0;
       this.w = new a();
       this.y = new a$c(this, Looper.getMainLooper());
       this.z = new a$d(this);
       this.A = new a$b(this);
    }
    public static final a P8(a p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("barController");
       }
       return p0;
    }
    public static final f R8(a p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("containerController");
       }
       return p0;
    }
    public static final h S8(a p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("kcubeTab");
       }
       return p0;
    }
    public static final PagerSlidingTabStrip$d V8(a p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("stripTab");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a ts = this.s;
       String str = "containerController";
       if (ts == null) {
          a.S(str);
       }
       this.v = ts.x("ato_operate");
       ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       b uob = ts.y();
       a tw = this.w;
       a tr = this.r;
       String str1 = "kcubeTab";
       if (tr == null) {
          a.S(str1);
       }
       p s = a.s;
       a.o(s, "HomeTopStateId.TAB_TEXT");
       tw.a(uob.g(tr, s, new a$e(this)));
       tw = this.w;
       tr = this.r;
       if (tr == null) {
          a.S(str1);
       }
       s = a.t;
       a.o(s, "HomeTopStateId.TAB_IMAGE");
       tw.a(uob.g(tr, s, new a$f(this)));
       tw = this.w;
       tr = this.r;
       if (tr == null) {
          a.S(str1);
       }
       s = a.u;
       a.o(s, "HomeTopStateId.TAB_TEXT_TYPEFACE");
       tw.a(uob.g(tr, s, new a$g(this)));
       tw = this.w;
       tr = this.r;
       if (tr == null) {
          a.S(str1);
       }
       s = a.w;
       a.o(s, "HomeTopStateId.TAB_BUBBLE");
       tw.a(uob.g(tr, s, new a$h(this)));
       p n = a.n;
       a.o(n, "HomeTopStateId.CLEAR_SCREEN_PROGRESS");
       this.w.a(uob.b(n, new a$i(this)));
       ArrayList uArrayList = new ArrayList();
       n = a.x;
       a.o(n, "HomeTopStateId.TAB_ANIMATE");
       uArrayList.add(n);
       n = a.y;
       a.o(n, "HomeTopStateId.TAB_RED_DOT_NOTIFY");
       uArrayList.add(n);
       n = a.z;
       a.o(n, "HomeTopStateId.TAB_NUMBER_NOTIFY");
       uArrayList.add(n);
       n = a.A;
       a.o(n, "HomeTopStateId.TAB_IMAGE_NOTIFY");
       uArrayList.add(n);
       n = a.B;
       a.o(n, "HomeTopStateId.TAB_TRIANGLE_NOTIFY");
       uArrayList.add(n);
       n = a.D;
       a.o(n, "HomeTopStateId.TAB_ROTATE_DEGREES");
       uArrayList.add(n);
       n = a.E;
       a.o(n, "HomeTopStateId.TAB_TRIANGLE_ALPHA");
       uArrayList.add(n);
       n = a.F;
       a.o(n, "HomeTopStateId.TAB_TRIANGLE_ALPHA_WITH_DIRECTION");
       uArrayList.add(n);
       n = a.C;
       a.o(n, "HomeTopStateId.TAB_TRIANGLE_COLOR");
       uArrayList.add(n);
       tr = this.w;
       a tr1 = this.r;
       if (tr1 == null) {
          a.S(str1);
       }
       tr.a(uob.c(tr1, uArrayList, new a$j(this)));
       ts = this.q;
       if (ts == null) {
          a.S("barEventBus");
       }
       this.X7(ts.b.subscribe(new a$k(this)));
       ts = this.p;
       if (ts == null) {
          a.S("barController");
       }
       ts.J(this.z);
       this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new a$l(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       this.B.animate().cancel();
       this.y.removeMessages(1001);
       a tp = this.p;
       if (tp == null) {
          a.S("barController");
       }
       tp.l(this.z);
       tp = this.t;
       if (tp == null) {
          a.S("stripTab");
       }
       View view = tp.b();
       a.o(view, "stripTab.customView");
       view.getViewTreeObserver().removeOnGlobalLayoutListener(this.A);
       return;
    }
    public final boolean W8(g p0){
       boolean b = true;
       if (p0 == null || (p0.a == null || (p0.b == null || (p0.i != null || p0.l != b)))) {
          b = false;
       }
       return b;
    }
    public final void X8(PagerSlidingTabStrip$d p0,g p1){
       boolean b1;
       ViewParent parent;
       View view;
       Object obj = this;
       a obj1 = p0;
       Object obj2 = p1;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, uoa, "6")) {
          return;
       }
       if (obj1 == null || (obj2 != null && obj2.b != null)) {
          String str = c.b(p0.b());
          if (str != null) {
             Log.g("IconifyRadioButtonPresenter", "ignore bubble, bottom bar is covered : "+str);
             return;
          }else {
             g b = obj2.b;
             a.m(b);
             b.o0(p0.b());
             a u = obj.u;
             String str1 = "fragmentWrapper";
             if (u == null) {
                a.S(str1);
             }
             if (!u.K0()) {
                if (obj.W8(obj2)) {
                   obj1 = obj.u;
                   if (obj1 == null) {
                      a.S(str1);
                   }
                   obj.X7(obj1.h().f().filter(a$m.b).subscribe(new a$n(obj), Functions.d()));
                   Log.g("IconifyRadioButtonPresenter", "delay show, home fragment unselect");
                }else {
                   Log.g("IconifyRadioButtonPresenter", "ignore bubble, fragment is unselect");
                }
                return;
             }else {
                View obj3 = PatchProxy.applyOneRefs(obj1, obj, uoa, "9");
                if (obj3 != PatchProxyResult.class) {
                   b1 = obj3.booleanValue();
                }else {
                   obj3 = p0.b();
                   while (true) {
                      ViewParent viewParent = null;
                      if (obj3 != null) {
                         if (obj3.getAlpha() - 0x3c23d70a < 0 || obj3.getVisibility()) {
                         label_0106 :
                            b1 = false;
                         }else if(obj3.getParent() instanceof View){
                            parent = obj3.getParent();
                            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                         }else {
                            parent = null;
                         }
                      }else {
                         view = p0.b();
                         if (view == null) {
                            goto label_0106 ;
                         }else {
                            u = obj.p;
                            if (u == null) {
                               a.S("barController");
                            }
                            Rect rect = u.m();
                            int[] ointArray = new int[2];
                            view.getLocationOnScreen(ointArray);
                            if (ointArray[viewParent] >= rect.left && ((float)ointArray[viewParent] + ((float)view.getWidth() * 0.20f)) - (float)rect.right <= 0) {
                               b1 = true;
                            }else {
                               goto label_0106 ;
                            }
                         }
                      }
                   }
                }
                if (!b1) {
                   if (obj.W8(obj2)) {
                      Log.g("IconifyRadioButtonPresenter", "delay show, top bar is not visible");
                   }else {
                      Log.g("IconifyRadioButtonPresenter", "ignore bubble, bottom bar is not visible");
                   }
                   return;
                }else if(PatchProxy.applyVoidOneRefs(obj2, obj, uoa, "7")){
                   g b2 = obj2.b;
                   if (b2 != null) {
                      obj2.i = true;
                      a.m(b2);
                      a.o(b2, "tabBubble.mBubbleBuilder!!");
                      IconifyRadioButtonPresenter$doShowBubble$1 uodoShowBubb = new IconifyRadioButtonPresenter$doShowBubble$1(obj2);
                      c uoc = new c(obj2.c, b2, obj2.d, uodoShowBubb, null, obj2.f, obj2.e, obj2.g, obj2.h);
                      g.h(b1);
                   }
                }
             }
          }
       }
       return;
    }
    public final void Y8(PagerSlidingTabStrip$d p0,h p1,View p2,g p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "5")) {
          return;
       }
       if (p3.a != null && p3.b != null) {
          this.X8(p0, p3);
       }else {
          Activity activity = this.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             List list = b.a().l(activity);
             if (q.f(list)) {
                return;
             }else {
                a.m(list);
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   a.o(uoa, "bubble");
                   a$c uoc = uoa.c0();
                   a.o(uoc, "bubble.builder");
                   if (uoc.g0() == p2) {
                      uoa.o();
                   }
                }
             }
          }
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       a ts = this.s;
       String str = "containerController";
       if (ts == null) {
          a.S(str);
       }
       a tr = this.r;
       String str1 = "kcubeTab";
       if (tr == null) {
          a.S(str1);
       }
       if (!ts.O(tr.M2())) {
          return;
       }else {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          b uob = ts.y();
          a tr1 = this.r;
          if (tr1 == null) {
             a.S(str1);
          }
          p w = a.w;
          a.o(w, "HomeTopStateId.TAB_BUBBLE");
          g og = uob.e(tr1, w);
          if (this.W8(og)) {
             tr1 = this.t;
             if (tr1 == null) {
                a.S("stripTab");
             }
             this.X8(tr1, og);
          }
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a obj = this.r8("BAR_CONTROLLER");
       a.o(obj, "inject\(ActionBarAccessIds.BAR_CONTROLLER\)");
       this.p = obj;
       obj = this.r8("KCUBE_CONTAINER_CONTROLLER");
       a.o(obj, "inject\(ActionBarAccessId¡­UBE_CONTAINER_CONTROLLER\)");
       this.s = obj;
       obj = this.r8("KCUBE_TAB");
       a.o(obj, "inject\(ActionBarAccessIds.KCUBE_TAB\)");
       this.r = obj;
       obj = this.q8(PagerSlidingTabStrip$d.class);
       a.o(obj, "inject\(PagerSlidingTabStrip.Tab::class.java\)");
       this.t = obj;
       obj = this.q8(d.class);
       a.o(obj, "inject\(FragmentWrapper::class.java\)");
       this.u = obj;
       obj = this.p;
       if (obj == null) {
          a.S("barController");
       }
       this.q = obj.c();
       return;
    }
    public final void onHomeSplashStateEvent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       p0 = p0.a;
       if (p0 == 4 || p0 == 5) {
          a tt = this.t;
          String str = "stripTab";
          if (tt == null) {
             a.S(str);
          }
          View view = tt.b();
          a.o(view, "stripTab.customView");
          if (view.getWidth() > 0) {
             this.Z8();
             return;
          }else {
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             view = tt.b();
             a.o(view, "stripTab.customView");
             view.getViewTreeObserver().addOnGlobalLayoutListener(this.A);
          }
       }
       return;
    }
}
