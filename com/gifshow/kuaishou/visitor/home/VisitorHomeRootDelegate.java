package com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate;
import nn5.a;
import androidx.fragment.app.Fragment;
import com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wq6.f;
import wq6.l;
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
import xr6.c$a;
import xr6.c;
import yq6.d;
import un5.a;
import uh.a;
import yq6.a;
import z1.a;
import uh.b;
import msd.l;
import wkd.b;
import gb5.a;
import android.view.View;
import com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate$2;
import android.content.Context;
import android.widget.LinearLayout;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tua.h;
import fr6.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import vjc.b;

public class VisitorHomeRootDelegate extends a	// class@0015db
{
    public final i g;
    public TabIdentifier h;
    public TabIdentifier i;

    public void VisitorHomeRootDelegate(Fragment p0){
       super(p0);
       this.g = new VisitorHomeRootDelegate$a(this);
    }
    public boolean c(){
       f obj = PatchProxy.apply(null, this, VisitorHomeRootDelegate.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a();
       l ol = this.b();
       if (obj == null || ol == null) {
          return false;
       }
       return ol.q(obj.N().M2(), b.B);
    }
    public void d(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeRootDelegate.class, "7")) {
          return;
       }
       if (this.a() != null && this.d.getActivity() != null) {
          h oh = c.a(this.d.getActivity()).c(p0);
          if (oh == null) {
             if (this.d.getActivity() != null) {
                e.d(this.d.getActivity(), p0);
             }
             return;
          }else {
             h oh1 = this.l().R(b.B);
             String str = "NewIntent";
             if (oh1 != null && oh1.a().M(oh.M2())) {
                this.l().V(oh1.M2(), c.a(str).a());
             }
             this.l().V(oh.M2(), c.a(str).a());
             this.l().d().b(oh, a.a, new a(p0));
          }
       }
       return;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, VisitorHomeRootDelegate.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a() == null) {
          return false;
       }
       return this.a().d().a(a.b, new b(true), Boolean.FALSE).booleanValue();
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, VisitorHomeRootDelegate.class, "1")) {
          return;
       }
       b.a(0x8708467).a("bottomNavigationPageInit");
       return;
    }
    public View g(View p0){
       VisitorHomeRootDelegate$2 obj = PatchProxy.applyOneRefs(p0, this, VisitorHomeRootDelegate.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new VisitorHomeRootDelegate$2(this, p0.getContext(), p0);
       obj.addView(p0);
       return obj;
    }
    public void h(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, VisitorHomeRootDelegate.class, "10")) {
          return;
       }
       p0.U7(new h(this.m()));
       PatchProxy.onMethodExit(VisitorHomeRootDelegate.class, "10");
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, VisitorHomeRootDelegate.class, "2")) {
          return;
       }
       b.a(0x8708467).z("bottomNavigationPageInit");
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, VisitorHomeRootDelegate.class, "9")) {
          return;
       }
       super.j();
       this.l().b(this.g);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeRootDelegate.class, "4")) {
          return;
       }
       this.l().W(this.g);
       this.n(this.l().j());
       super.k(p0);
       return;
    }
    public void n(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeRootDelegate.class, "5")) {
          return;
       }
       this.i = this.h;
       this.h = p0.M2();
       RxBus.f.b(new b(this.d.getActivity()));
       return;
    }
}
