package com.kuaishou.live.gzone.v2.activity.e;
import com.kwai.live.gzone.widget.e;
import android.app.Activity;
import w53.n;
import tkd.b;
import tkd.d;
import ym5.a;
import lnc.a1;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import oq5.c;
import oq5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.b;
import lnc.b9;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.ColorDrawable;
import java.lang.Number;
import android.view.View;
import android.os.Bundle;
import f37.o0;
import brd.t;
import c77.p;
import w53.o;
import erd.g;
import com.kuaishou.live.gzone.v2.activity.c;
import im8.c;
import java.lang.Boolean;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.gzone.v2.activity.e$a;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;

public class e extends e	// class@001cbb
{
    public final c A;
    public boolean B;
    public boolean C;
    public int D;
    public b E;
    public c x;
    public a y;
    public b z;

    public void e(Activity p0){
       super(p0);
       this.A = new n(this);
       if (d.a(0x4c5dd1b8).f2()) {
          this.p.b0(a1.e(0x43cf0000));
       }else {
          this.p.a0(true);
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       e ty = this.y;
       if (ty != null) {
          a v = ty.v;
          if (v != null) {
             v.Q0(this.A);
          }
       }
       this.x.destroy();
       b9.a(this.z);
       b9.a(this.E);
       return;
    }
    public Drawable b0(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ColorDrawable(0);
    }
    public int d0(){
       return 0x7f0d0bdb;
    }
    public int e0(){
       e obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       if (obj == null) {
          return 0;
       }
       return obj.S(this.u());
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       o0.p(this.q, this.y.v.H2());
       e ty = this.y;
       int i = 0;
       if (ty == null) {
          this.q(i);
          return;
       }else {
          a p = ty.p;
          if (p != null) {
             this.z = p.Ja().subscribe(new o(this));
          }
          p = this.y.v;
          if (p != null) {
             p.H6(this.A);
          }
          this.f.setClickable(true);
          c uoc = new c();
          this.x = uoc;
          uoc.f(p0);
          Object[] objArray = new Object[]{this.y,this,new c("enableH5", Boolean.valueOf(this.B)),new c("enableNative", Boolean.valueOf(this.C))};
          this.x.i(objArray);
          this.D = p0.getResources().getConfiguration().orientation;
          this.E = this.y.O().m().subscribe(new e$a(this));
          return;
       }
    }
    public boolean j0(){
       return true;
    }
    public void l0(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       Lifecycle$State currentState = this.y.O().getLifecycle().getCurrentState();
       if (currentState != Lifecycle$State.RESUMED && currentState != Lifecycle$State.STARTED) {
          return;
       }
       p0 = p0.orientation;
       if (this.D != p0) {
          this.D = p0;
          this.q(0);
       }
       return;
    }
}
