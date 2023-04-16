package com.kuaishou.merchant.home2.dynamic.presenter.PageRefreshPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mrd.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.t;
import fy3.c;
import erd.g;
import crd.b;
import yr3.b;
import fy3.d;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.home2.dynamic.presenter.PageRefreshPresenter$a;
import java.util.Map;
import java.lang.Boolean;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;
import java.util.HashMap;
import c04.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.google.gson.JsonObject;
import yz7.e;
import su.g$a;
import su.g;
import com.kuaishou.merchant.pagedy.a;
import com.kuaishou.pagedy.PageDy;
import brd.y;

public class PageRefreshPresenter extends PresenterV2 implements LifecycleObserver	// class@001763
{
    public BaseFragment p;
    public t q;
    public final c r;
    public boolean s;
    public boolean t;

    public void PageRefreshPresenter(){
       super();
       this.r = a.g();
       this.s = true;
       this.t = true;
    }
    public static final BaseFragment P8(PageRefreshPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("rootFragment");
       }
       return p0;
    }
    public void E8(){
       PageRefreshPresenter pageRefreshP = PageRefreshPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pageRefreshP, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, pageRefreshP, "5")) {
          this.X7(this.r.throttleLatest(200, TimeUnit.MILLISECONDS).subscribe(new c(this)));
       }
       PageRefreshPresenter tp = this.p;
       if (tp == null) {
          a.S("rootFragment");
       }
       if (!PatchProxy.applyVoidOneRefs(tp, this, pageRefreshP, "7") && tp instanceof b) {
          this.X7(tp.Hd(new d(this)));
       }
       pageRefreshP = this.p;
       if (pageRefreshP == null) {
          a.S("rootFragment");
       }
       pageRefreshP.getLifecycle().addObserver(this);
       pageRefreshP = this.q;
       if (pageRefreshP != null) {
          this.X7(pageRefreshP.subscribe(new PageRefreshPresenter$a(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PageRefreshPresenter.class, "3")) {
          return;
       }
       PageRefreshPresenter tp = this.p;
       if (tp == null) {
          a.S("rootFragment");
       }
       tp.getLifecycle().removeObserver(this);
       return;
    }
    public final void R8(boolean p0,Map p1){
       g og;
       PageRefreshPresenter tp;
       PageRefreshPresenter pageRefreshP = PageRefreshPresenter.class;
       if (PatchProxy.isSupport(pageRefreshP) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, pageRefreshP, "6")) {
          return;
       }
       if (p0) {
          int i = 1;
          Set set = (p1 == null || p1.isEmpty())? 1: null;
          if (!set && (i ^ p1.keySet().isEmpty())) {
             Iterator iterator = p1.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (str != null) {
                   Map map = p1.get(str);
                   String str1 = "back";
                   List list = (map != null)? map.get(str1): null;
                   if (list != null) {
                      HashMap hashMap = new HashMap();
                      hashMap.put("pageName", str);
                      hashMap.put("sceneCode", str1);
                      hashMap.put("payInfo", a.b.a(a.b()));
                      Map map1 = p1.get(str);
                      List list1 = (map1 != null)? map1.get(str1): null;
                      hashMap.put("components", e.f(list1));
                      g$a uoa = new g$a(this.S8(), "", "");
                      uoa.v(this.V8());
                      uoa.u(hashMap);
                      og = uoa.a();
                      tp = this.p;
                      if (tp == null) {
                         a.S("rootFragment");
                      }
                      if (PatchProxy.applyVoidTwoRefs(tp, og, null, a.class, "8")) {
                         continue ;
                      }
                   }
                }
                a.b();
                PageDy.e().m(tp, og);
             }
          }
       }
       return;
    }
    public String S8(){
       return "BUYER_HOME_PAGE";
    }
    public String V8(){
       return "/rest/app/square/home/mall/dynamic/refresh";
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PageRefreshPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FEED_FRAGMENT");
       this.q = this.t8("MERCHANT_BUYER_TAB_SELECTED_FOR_PAGE_REFRESH");
       return;
    }
    public final void resume(){
       if (PatchProxy.applyVoid(null, this, PageRefreshPresenter.class, "4")) {
          return;
       }
       if (this.s != null) {
          this.s = false;
       }else {
          this.r.onNext(Boolean.TRUE);
       }
       return;
    }
}
