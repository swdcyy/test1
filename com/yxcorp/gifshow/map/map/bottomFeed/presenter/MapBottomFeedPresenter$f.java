package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$f;
import zj0.x;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import java.lang.Object;
import java.lang.Throwable;
import zj0.w;
import rj0.c;
import rj0.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import js6.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u5b.a;
import java.lang.StringBuilder;
import q87.c;
import fk0.l;
import rj0.b;
import com.kuaishou.krn.model.LaunchModel;

public final class MapBottomFeedPresenter$f implements x	// class@001c87
{
    public final MapBottomFeedPresenter a;

    public void MapBottomFeedPresenter$f(MapBottomFeedPresenter p0){
       this.a = p0;
       super();
    }
    public void A(Throwable p0){
       w.a(this, p0);
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
       MapBottomFeedPresenter$f uof = MapBottomFeedPresenter$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "1")) {
          return;
       }
       w.m(this, p0);
       p0.y = true;
       if (this.a.z != null) {
          a.b.pt(this.a.getContext(), "REFRESH_FEED_DATA", this.a.x);
          p0.z = false;
          Object[] objArray = new Object[false];
          a.c.w("MapBottomFeedRefreshEvent", "dataToRnDetailList="+String.valueOf(this.a.x), objArray);
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
       w.b(this);
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
       w.d(this, p0);
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
