package com.yxcorp.gifshow.homeroot.c;
import nn5.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.homeroot.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wq6.f;
import wq6.l;
import com.yxcorp.gifshow.homeroot.b;
import ok.h;
import sb5.e;
import wq6.e;
import wq6.g;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import on5.b;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import android.app.Activity;
import com.yxcorp.gifshow.homepage.activity.e;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.Log;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xkd.b;
import android.net.Uri$Builder;
import java.util.Set;
import java.util.Iterator;
import o56.c;
import o56.a;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import ao5.c;
import sua.h;
import ib5.q;
import xr6.c$a;
import xr6.c;
import yq6.d;
import un5.a;
import sua.m;
import yq6.a;
import z1.a;
import po5.c;
import pr6.b;
import pr6.d;
import k2b.e0;
import sua.p;
import kotlin.jvm.internal.a;
import sua.o;
import bo5.a;
import zq6.p;
import co5.n;
import co5.m;
import co5.j;
import co5.f;
import co5.h;
import co5.q;
import oa5.a;
import sua.n;
import msd.l;
import wkd.b;
import gb5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tua.h;
import tua.e;
import com.kwai.feature.api.feed.home.HomePageExperimentManager;
import qrd.p;
import tua.p;
import tua.a;
import wf0.k0;
import java.util.Objects;
import xf0.d;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin;
import fr6.i;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import vjc.b;
import nsa.c;

public class c extends a	// class@001818
{
    public final i g;
    public TabIdentifier h;
    public TabIdentifier i;

    public void c(Fragment p0){
       super(p0);
       this.g = new c$a(this);
    }
    public boolean c(){
       f obj = PatchProxy.apply(null, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a();
       l ol = this.b();
       boolean b = false;
       if (obj != null && ol != null) {
          boolean b1 = e.e(b.b, Boolean.FALSE).booleanValue();
          if (ol.q(obj.N().M2(), b.B) && b1) {
             b = true;
          }
       }
       return b;
    }
    public void d(Intent p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "11")) {
          return;
       }
       if (this.a() != null && this.d.getActivity() != null) {
          h oh = c.a(this.d.getActivity()).c(p0);
          boolean b = true;
          if (oh == null) {
             if (this.d.getActivity() != null) {
                e.d(this.d.getActivity(), p0);
             }
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "15") && a.t().d("enableRecruitSpringTaskMain", b)) {
                Log.g("LiveRecruitTask", "KCubeHomeFactoryRegistry, parseJumpUrlIfNecessary");
                if (p0 != null && p0.getData() != null) {
                   Uri data = p0.getData();
                   String str = "jumpUrl";
                   String queryParamet = data.getQueryParameter(str);
                   if (!TextUtils.x(queryParamet)) {
                      Uri$Builder uBuilder = b.g(queryParamet).buildUpon();
                      Iterator iterator = data.getQueryParameterNames().iterator();
                      while (iterator.hasNext()) {
                         String str1 = iterator.next();
                         if (!TextUtils.n(str, str1)) {
                            uBuilder.appendQueryParameter(str1, data.getQueryParameter(str1));
                         }
                      }
                      a.b(b.j(a.a().f(), uBuilder.build().toString()), null);
                   }
                }
             }
             return;
          }else {
             uoc = c.a(this.d.requireActivity()).j();
             if (uoc instanceof h) {
                uoc.d = p0;
             }
             if (q.p0(this.d.getActivity()).s0()) {
                q.p0(this.d.getActivity()).o0(b);
             }
             h oh1 = this.l().R(b.B);
             String str2 = "NewIntent";
             if (oh1 != null && oh1.a().M(oh.M2())) {
                this.l().V(oh1.M2(), c.a(str2).a());
             }
             this.l().V(oh.M2(), c.a(str2).a());
             this.l().d().b(oh, a.a, new m(p0));
          }
       }
       return;
    }
    public boolean e(){
       boolean b1;
       TabIdentifier c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.a() == null) {
          return b;
       }
       boolean i = this.a().B();
       e0 uoe0 = this.e.e(c.C);
       if (!PatchProxy.applyVoidOneRefs(uoe0, objArray, p.class, "1")) {
          a.p(uoe0, "page");
          int i1 = o.b();
          if (i1) {
             p.a(uoe0, b, i1);
          }
       }
       if (i && i != 1) {
          i = this.o();
          if (!i && !PatchProxy.applyVoid(objArray, this, uoc, "7")) {
             c = b.c;
             TabIdentifier b2 = b.B;
             if (this.m().o(c, b2)) {
                m obj1 = PatchProxy.apply(objArray, this, uoc, "8");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   n on = this.m().l(c, a.y);
                   obj1 = this.m().l(c, a.z);
                   j oj = this.m().l(c, a.A);
                   f uof = this.m().l(c, a.G);
                   h oh = this.m().l(c, a.J);
                   q oq = this.m().l(c, a.K);
                   b1 = (on == null || (on.a == null && (obj1 == null || (obj1.a == null && (oj == null || (oj.a == null && (uof == null || (uof.a == null && (oh == null || (oh.a != null || (oq != null && oq.a != null)))))))))))? true: false;
                }
                if (b1) {
                   this.l().V(c, c.a("backToHome").a());
                }
             }
             this.l().V(b2, c.a("backToHome").a());
          }
          b1 = true;
       }else {
          b1 = false;
          i = false;
       }
       if (!b1) {
          i = this.o();
       }
       if (i || a.b()) {
          b = true;
       }
       return this.a().d().a(a.b, new n(b), Boolean.FALSE).booleanValue();
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       b.a(0x8708467).a("bottomNavigationPageInit");
       return;
    }
    public void h(PresenterV2 p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "14")) {
          return;
       }
       p0.U7(new h(this.m()));
       p0.U7(new e(this.l()));
       Boolean uBoolean = PatchProxy.apply(null, null, HomePageExperimentManager.class, "4");
       if (uBoolean == patchProxyRe) {
          uBoolean = HomePageExperimentManager.d.getValue();
       }
       if (uBoolean.booleanValue()) {
          p0.U7(new p(this.l(), this.m()));
       }
       p0.U7(new a());
       k0 ok0 = b.a(0x76bfb945);
       Objects.requireNonNull(ok0);
       d uod = PatchProxy.applyWithListener(null, ok0, k0.class, "1");
       if (uod != patchProxyRe) {
       }else {
          uod = new d();
          PatchProxy.onMethodExit(k0.class, "1");
       }
       p0.U7(uod);
       int i = -2043427941;
       if (d.a(i).hH()) {
          p0.U7(d.a(i).RG(this.m()));
       }
       PatchProxy.onMethodExit(c.class, "14");
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       b.a(0x8708467).z("bottomNavigationPageInit");
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       super.j();
       this.l().b(this.g);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.l().W(this.g);
       this.n(this.l().j());
       super.k(p0);
       return;
    }
    public void n(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.i = this.h;
       this.h = p0.M2();
       RxBus.f.b(new b(this.d.getActivity()));
       return;
    }
    public final boolean o(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = o.b();
       if (!i) {
          return false;
       }
       TabIdentifier b = b.B;
       if (b.equals(this.l().j().M2())) {
          Object obj1 = PatchProxy.apply(objArray, this, uoc, "9");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(c.b()){
             h oh = this.l().R(b);
             if (oh != null) {
                TabIdentifier tabIdentifie = oh.a().j().M2();
                if (b.c.equals(tabIdentifie) || (!b.b.equals(tabIdentifie) && !b.d.equals(tabIdentifie))) {
                   b1 = false;
                }
             }
          }
          b1 = true;
          if (!b1) {
             return false;
          }
       }
       this.l().V(b.f, c.a("NewReflux").a());
       p.a(this.e.e(c.C), true, i);
       return true;
    }
}
