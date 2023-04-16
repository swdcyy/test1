package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$a;
import nsd.u;
import wq6.f;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq6.a;
import java.util.BitSet;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$b;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$mOnTabSelectedListener$1;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1;
import jr6.b;
import tsa.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.BottomActionBarSkinHelper;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.homepage.BottomTabResourceHelper;
import gsa.j;
import ok.h;
import sb5.e;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.BottomActionBarSkinConfig;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import tyc.o0;
import android.content.Context;
import tyc.o0$a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.io.File;
import com.kwai.component.kcube.model.startup.c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import rsa.a;
import rsa.c;
import rsa.b;
import com.kwai.kcube.ext.actionbar.bottom.controller.BottomActionBarControllerImpl;
import com.kwai.kcube.ext.actionbar.bottom.BottomActionBar;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import nr6.h;
import android.widget.FrameLayout;
import android.view.View;
import ir6.c;
import gr6.b;
import gr6.c;
import com.kwai.kcube.ext.actionbar.bottom.region.TabLayoutRegion;
import jr6.a;
import lr6.f;
import jr6.f;
import com.google.android.material.tabs.TabLayout$d;
import mrd.a;
import java.lang.Boolean;
import com.google.android.material.tabs.BottomActionBarTabLayout$a;
import fr6.i;
import zq6.b;
import rn5.a;
import dta.a;
import zq6.p;
import zq6.u;
import zq6.s;
import xq6.b;
import dta.b;
import dta.c;
import dta.d;
import dta.e;
import dta.f;
import zq6.r;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$c;
import com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.widget.BottomTabView;

public abstract class BottomActionBarPresenter extends PresenterV2	// class@00174c
{
    public final d A;
    public int p;
    public a q;
    public BottomActionBar r;
    public a s;
    public a t;
    public final BitSet u;
    public b v;
    public final i w;
    public final TabLayout$d x;
    public final BottomActionBarPresenter$addTabListener$1 y;
    public final f z;
    public static final BottomActionBarPresenter$a B;

    static {
       BottomActionBarPresenter.B = new BottomActionBarPresenter$a(null);
    }
    public void BottomActionBarPresenter(f p0,d p1){
       a.p(p0, "mContainerController");
       a.p(p1, "fragmentWrapper");
       super();
       this.z = p0;
       this.A = p1;
       this.p = -1;
       this.t = new a();
       this.u = new BitSet();
       this.w = new BottomActionBarPresenter$b(this);
       this.x = new BottomActionBarPresenter$mOnTabSelectedListener$1(this);
       this.y = new BottomActionBarPresenter$addTabListener$1(this);
    }
    public static final b P8(BottomActionBarPresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mActionBarController");
       }
       return p0;
    }
    public static final a R8(BottomActionBarPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mBottomActionBarHelper");
       }
       return p0;
    }
    public void E8(){
       BottomActionBarPresenter uBottomActio1;
       String str3;
       p a;
       a uoa = this;
       BottomActionBarPresenter uBottomActio = BottomActionBarPresenter.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, uoa, uBottomActio, str)) {
          return;
       }
       BottomActionBarSkinHelper b = BottomActionBarSkinHelper.b;
       Activity activity = this.getActivity();
       Objects.requireNonNull(b);
       String str1 = "4";
       String str2 = "5";
       if (PatchProxy.applyVoidOneRefs(activity, b, BottomActionBarSkinHelper.class, str1) || (activity != null && b.a())) {
          BottomTabResourceHelper b1 = BottomTabResourceHelper.b;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoidOneRefs(activity, b1, BottomTabResourceHelper.class, str2)) {
             a.p(activity, "activity");
             BottomActionBarSkinConfig uBottomActio8 = e.c(j.b, objArray);
             if (uBottomActio8 != null) {
                a.o(uBottomActio8, "config");
                Iterator iterator = b1.b(uBottomActio8).iterator();
                while (iterator.hasNext()) {
                   List list = iterator.next();
                   int i = list.isEmpty() ^ 0x01;
                   if (i) {
                      String obj = list.get(0);
                      a.m(obj);
                      obj = obj.getUrl();
                      a.o(obj, "url[0]!!.url");
                      o0.c.a(activity).p0(obj, c.b(list), objArray);
                   }
                }
             }
          }
       }
       uoa.q = this.S8();
       c uoc = c.class;
       if (PatchProxy.applyVoid(objArray, uoa, uBottomActio, str1)) {
          uBottomActio1 = uBottomActio;
          str3 = str2;
       }else {
          BottomActionBarPresenter r = uoa.r;
          if (r == null) {
             a.S("mActionBar");
          }
          BottomActionBarPresenter q = uoa.q;
          str1 = "mAdapter";
          if (q == null) {
             a.S(str1);
          }
          BottomActionBarPresenter z = uoa.z;
          b uob1 = new b();
          c uoc1 = new c();
          Objects.requireNonNull(r);
          BottomActionBarPresenter uBottomActio2 = z;
          b uob2 = uob1;
          BottomActionBarControllerImpl uBottomActio3 = BottomActionBarControllerImpl.class;
          c uoc2 = uoc1;
          uBottomActio1 = uBottomActio;
          c uoc3 = uoc1;
          String str4 = str1;
          b uob3 = uob1;
          String str5 = str2;
          BottomActionBarPresenter uBottomActio4 = z;
          BottomActionBar uBottomActio5 = PatchProxy.applyFourRefs(q, uBottomActio2, uob2, uoc2, r, BottomActionBar.class, "1");
          if (uBottomActio5 != PatchProxyResult.class) {
          }else {
             a.p(q, "adapter");
             a.p(uBottomActio4, "containerController");
             a.p(uob3, "barEventBus");
             a.p(uoc3, "barGlobalContext");
             uBottomActio5 = r.b;
             if (uBottomActio5 != null) {
                if (!PatchProxy.applyVoid(null, uBottomActio5, uBottomActio3, "2")) {
                   uBottomActio5.c.b(uBottomActio5.h);
                   uBottomActio5.b.b(uBottomActio5.h);
                   uBottomActio5.d.b(uBottomActio5.h);
                }
                r.removeAllViews();
             }
             View view = r.findViewById(R.id.bottom_bar_container);
             a.o(view, "findViewById\(R.id.bottom_bar_container\)");
             View view1 = view;
             BottomActionBarControllerImpl uBottomActio6 = z;
             BottomActionBarControllerImpl uBottomActio7 = z;
             uBottomActio6 = new BottomActionBarControllerImpl(q, r, view1, uBottomActio4, uob3, uoc3);
             r.b = uBottomActio7;
             if (!PatchProxy.applyVoid(null, uBottomActio7, uBottomActio3, "1")) {
                uBottomActio7.c.a(uBottomActio7.h);
                uBottomActio7.b.a(uBottomActio7.h);
                uBottomActio7.d.a(uBottomActio7.h);
             }
             uBottomActio5 = r.b;
             Objects.requireNonNull(uBottomActio5, "null cannot be cast to non-null type com.kwai.kcube.ext.actionbar.bottom.controller.BottomActionBarController<GC, CC>");
          }
          uoa.v = uBottomActio5;
          String str6 = "mActionBarController";
          if (uBottomActio5 == null) {
             a.S(str6);
          }
          uBottomActio5.w(uoa.y);
          BottomActionBarPresenter v = uoa.v;
          if (v == null) {
             a.S(str6);
          }
          c uoc4 = v.t();
          r = uoa.s;
          if (r == null) {
             a.S("mBottomActionBarHelper");
          }
          Objects.requireNonNull(uoc4);
          if (!PatchProxy.applyVoidOneRefs(r, uoc4, uoc, str)) {
             a.p(r, "<set-?>");
             uoc4.e = r;
          }
          v = uoa.v;
          if (v == null) {
             a.S(str6);
          }
          uoc4 = v.t();
          BottomActionBarPresenter v1 = uoa.v;
          if (v1 == null) {
             a.S(str6);
          }
          f uof = v1.v();
          Objects.requireNonNull(uoc4);
          str3 = str5;
          if (!PatchProxy.applyVoidOneRefs(uof, uoc4, uoc, str3)) {
             a.p(uof, "<set-?>");
             uoc4.f = uof;
          }
          v = uoa.v;
          if (v == null) {
             a.S(str6);
          }
          v.create();
          v = uoa.v;
          if (v == null) {
             a.S(str6);
          }
          v.d();
          v = uoa.v;
          if (v == null) {
             a.S(str6);
          }
          v.r(uoa.x);
          v = uoa.v;
          if (v == null) {
             a.S(str6);
          }
          a uoa1 = v.c().b();
          v1 = uoa.q;
          if (v1 == null) {
             a.S(str4);
          }
          uoa1.onNext(Boolean.valueOf(v1.d()));
          v = uoa.v;
          if (v == null) {
             a.S(str6);
          }
          v.D(this.Y8());
       }
       uoa.z.W(uoa.w);
       if (!PatchProxy.applyVoid(null, uoa, uBottomActio1, str3)) {
          b uob = uoa.z.y();
          a = a.a;
          a.o(a, "HomeBottomStateId.VIEW_PAGER_SCROLLABLE");
          uoa.t.a(uob.b(a, new a(uoa)));
          a = a.b;
          a.o(a, "HomeBottomStateId.BOTTOM_SCHEME");
          uoa.t.a(uob.b(a, new b(uoa)));
          a = a.c;
          a.o(a, "HomeBottomStateId.BOTTOM_ALPHA");
          uoa.t.a(uob.b(a, new c(uoa)));
          a = a.d;
          a.o(a, "HomeBottomStateId.BOTTOM_SHOW_STATE");
          uoa.t.a(uob.b(a, new d(uoa)));
          a = a.f;
          a.o(a, "HomeBottomStateId.BOTTOM¡­HOW_EXCEPT_PROGRESS_STATE");
          uoa.t.a(uob.b(a, new e(uoa)));
          a = a.e;
          a.o(a, "HomeBottomStateId.TOP_DIVIDER_SHOW_STATE");
          uoa.t.a(uob.b(a, new f(uoa)));
       }
       p o = a.o;
       a.o(o, "HomeBottomStateId.BOTTOM_TAB_BADGE_READER");
       uoa.z.e0().a(o, new BottomActionBarPresenter$c(uoa));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, BottomActionBarPresenter.class, "1")) {
          return;
       }
       this.s = this.V8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, BottomActionBarPresenter.class, "6")) {
          return;
       }
       BottomActionBarPresenter tv = this.v;
       String str = "mActionBarController";
       if (tv == null) {
          a.S(str);
       }
       tv.b();
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       tv.destroy();
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       tv.j(this.x);
       this.z.b(this.w);
       this.t.c();
       this.t = new a();
       return;
    }
    public abstract a S8();
    public abstract a V8();
    public final d W8(){
       return this.A;
    }
    public final f X8(){
       return this.z;
    }
    public abstract BottomActionBarTabLayout$a Y8();
    public final boolean Z8(BottomTabView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomActionBarPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.getCurrentBadgeStatus())? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomActionBarPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = p0.findViewById(R.id.bottom_bar_and_grey_cover_container);
       a.o(p0, "rootView.findViewById\(R.¡­and_grey_cover_container\)");
       this.r = p0;
       return;
    }
}
