package com.kwai.live.gzone.tab.page.a;
import gka.c0;
import g77.e;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage;
import crd.a;
import java.lang.Boolean;
import java.lang.Object;
import mrd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import g77.c;
import erd.g;
import crd.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;
import e3a.a;
import android.os.Bundle;
import i2b.a;

public abstract class a extends LiveGzoneLifeStatePage implements c0, e	// class@000e1d
{
    public View c;
    public Bundle d;
    public Context e;
    public ViewGroup f;
    public a g;
    public a h;
    public int i;

    public void a(){
       super();
       this.g = new a();
       this.h = a.h(Boolean.TRUE);
    }
    public boolean K0(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Boolean.TRUE.equals(this.h.i());
    }
    public t Z0(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.hide().distinctUntilChanged();
    }
    public void e(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "6")) {
          return;
       }
       b uob = this.n1().subscribe(new c(this));
       if (!PatchProxy.applyVoidOneRefs(uob, this, uoa, "13")) {
          this.g.c(uob);
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.c = this.p(LayoutInflater.from(this.e), this.f);
       return;
    }
    public final void g(){
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.g.dispose();
       this.g = new a();
       return;
    }
    public Activity k(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(this.e);
    }
    public Bundle l(){
       return this.d;
    }
    public abstract int m();
    public int n(){
       return this.i;
    }
    public t n1(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.hide().distinctUntilChanged().skip(1);
    }
    public View o(){
       return this.c;
    }
    public View p(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.g(p0, this.m(), p1, false);
    }
    public void q(){
    }
    public void r(){
    }
    public void s(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.h.onNext(Boolean.valueOf(p0));
       return;
    }
}
