package com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentRnContainerFragment$a;
import zj0.x;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentRnContainerFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.DynamicTabInfo$RnConfigInfo;
import ix9.e;
import lnc.i3;
import com.kwai.soc.arch.rubas.base.Rubas;
import k2b.u1;
import zj0.w;
import rj0.c;
import rj0.a;
import java.lang.Long;
import fk0.l;
import rj0.b;
import com.kuaishou.krn.model.LaunchModel;

public class CommentRnContainerFragment$a implements x	// class@001389
{
    public final CommentRnContainerFragment a;

    public void CommentRnContainerFragment$a(CommentRnContainerFragment p0){
       this.a = p0;
       super();
    }
    public void A(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentRnContainerFragment$a.class, "4")) {
          return;
       }
       DynamicTabInfo$RnConfigInfo mBundleId = this.a.E.mBundleId;
       String str = "bundleId";
       if (!PatchProxy.applyVoidOneRefs(mBundleId, null, e.class, "3")) {
          i3 oi31 = e.a();
          oi31.d(str, mBundleId);
          Rubas.d(e.e, oi31);
       }
       i3 oi3 = i3.f();
       oi3.d(str, this.a.E.mBundleId);
       oi3.d("componentName", this.a.E.mComponentName);
       oi3.d("rnQueryParams", this.a.D);
       u1.R("COMMENT_WONDERFUL_CONTAINER_LOAD_ERROR", oi3.e(), 14);
       return;
    }
    public void B(){
       w.k(this);
    }
    public void H(){
       w.s(this);
    }
    public void J(){
       w.v(this);
    }
    public void a(c p0,a p1,long p2){
       w.w(this, p0, p1, p2);
    }
    public void b(long p0){
       w.n(this, p0);
    }
    public void c(){
       w.l(this);
    }
    public void d(long p0){
       CommentRnContainerFragment$a uoa = CommentRnContainerFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "2")) {
          return;
       }
       DynamicTabInfo$RnConfigInfo mBundleId = this.a.E.mBundleId;
       if (!PatchProxy.applyVoidOneRefs(mBundleId, null, e.class, "2")) {
          i3 oi3 = e.a();
          oi3.d("bundleId", mBundleId);
          Rubas.d(e.d, oi3);
       }
       return;
    }
    public void e(long p0,Throwable p1){
       w.i(this, p0, p1);
    }
    public void f(long p0){
       w.f(this, p0);
    }
    public void g(long p0,Throwable p1){
       w.e(this, p0, p1);
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommentRnContainerFragment$a.class, "3")) {
          return;
       }
       DynamicTabInfo$RnConfigInfo mBundleId = this.a.E.mBundleId;
       if (!PatchProxy.applyVoidOneRefs(mBundleId, objArray, e.class, "1")) {
          i3 oi3 = e.a();
          oi3.d("bundleId", mBundleId);
          Rubas.d(e.c, oi3);
       }
       return;
    }
    public void j(){
       w.p(this);
    }
    public void m(){
       w.t(this);
    }
    public void o(l p0){
       w.u(this, p0);
    }
    public void p(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentRnContainerFragment$a.class, "1")) {
          return;
       }
       DynamicTabInfo$RnConfigInfo mBundleId = this.a.E.mBundleId;
       if (!PatchProxy.applyVoidOneRefs(mBundleId, null, e.class, "4")) {
          i3 oi3 = e.a();
          oi3.d("bundleId", mBundleId);
          Rubas.d(e.b, oi3);
       }
       return;
    }
    public void r(){
       w.c(this);
    }
    public void s(LaunchModel p0){
       w.r(this, p0);
    }
    public void t(long p0,long p1){
       w.h(this, p0, p1);
    }
    public void u(long p0){
       w.o(this, p0);
    }
    public void v(Throwable p0){
       w.j(this, p0);
    }
    public void w(){
       w.g(this);
    }
    public void y(LaunchModel p0,long p1,long p2){
       w.q(this, p0, p1, p2);
    }
}
