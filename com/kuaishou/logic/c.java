package com.kuaishou.logic.c;
import com.kuaishou.logic.c$a;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j75.a;
import java.lang.Boolean;
import android.os.Looper;
import gq.a;
import q87.c;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import pr3.g;
import erd.a;
import pr3.h;
import lq.f;
import erd.g;
import java.lang.IllegalStateException;
import java.lang.Integer;

public final class c	// class@0014bc
{
    public final float a;
    public float b;
    public int c;
    public b d;
    public final c$a e;
    public final boolean f;
    public float g;

    public void c(float p0,c$a p1,boolean p2){
       super();
       if (p0 <= 0) {
          throw new IllegalArgumentException("too small estimateProgressSeconds="+p0);
       }
       this.a = p0 * 10.00f;
       this.e = p1;
       this.f = p2;
       return;
    }
    public void a(){
       Object[] objArray1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       a uoa = a.class;
       if (!PatchProxy.applyVoid(objArray, objArray, uoa, "26")) {
          Object obj1 = PatchProxy.apply(objArray, objArray, uoa, "28");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): Looper.getMainLooper().equals(Looper.myLooper());
          if (!b1) {
             throw new IllegalStateException("ensureUIThread: currend thread is non ui thread.");
          }
       }
       if (this.f == null) {
          objArray1 = new Object[0];
          a.D().w("ProgressSmoother", "start: not enable ignore ", objArray1);
          return;
       }else {
          Object obj = PatchProxy.apply(objArray, this, uoc, "2");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             c td = this.d;
             b = (td != null && !td.isDisposed())? true: false;
          }
          if (b) {
             objArray1 = new Object[0];
             a.D().A("ProgressSmoother", "start: has started", objArray1);
             return;
          }else {
             objArray1 = new Object[0];
             a.D().w("ProgressSmoother", "start: ", objArray1);
             this.d = t.interval(100, TimeUnit.MILLISECONDS).observeOn(d.a).doFinally(new g(this)).subscribe(new h(this), f.b);
             return;
          }
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("ProgressSmoother", "stop\(\) called", objArray);
       this.d.dispose();
       this.d = null;
       this.g = 0;
       this.b = 0;
       this.c = 0;
       return;
    }
    public void c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "5")) {
          return;
       }
       if (p0 >= 0) {
          int i = 100;
          if (p0 <= i) {
             if (this.f == null) {
                this.e.a(p0);
                return;
             }else {
                this.g = (float)p0;
                if (p0 == i) {
                   this.c = p0;
                   this.e.a(p0);
                }
                return;
             }
          }
       }
       throw new IllegalArgumentException("percent="+p0);
    }
}
