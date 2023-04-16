package com.yxcorp.gifshow.aicut.logic.b;
import com.yxcorp.gifshow.aicut.logic.b$a;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import h69.g;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import o69.l2;
import erd.a;
import o69.m2;
import com.yxcorp.gifshow.aicut.logic.a;
import erd.g;
import java.lang.Integer;

public final class b	// class@00196b
{
    public final float a;
    public float b;
    public int c;
    public b d;
    public final b$a e;
    public final boolean f;
    public float g;

    public void b(float p0,b$a p1,boolean p2){
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
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (this.f == null) {
          objArray = new Object[0];
          g.D().w("ProgressSmoother", "start: not enable ignore ", objArray);
          return;
       }else {
          Object obj = PatchProxy.apply(objArray, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             uob = this.d;
             b = (uob != null && !uob.isDisposed())? true: false;
          }
          if (b) {
             objArray = new Object[0];
             g.D().A("ProgressSmoother", "start: has started", objArray);
             return;
          }else {
             objArray = new Object[0];
             g.D().w("ProgressSmoother", "start: ", objArray);
             this.d = t.interval(100, TimeUnit.MILLISECONDS).observeOn(d.a).doFinally(new l2(this)).subscribe(new m2(this), a.b);
             return;
          }
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       Object[] objArray = new Object[0];
       g.D().s("ProgressSmoother", "stop\(\) called", objArray);
       this.d.dispose();
       this.d = null;
       this.g = 0;
       this.b = 0;
       this.c = 0;
       return;
    }
    public void c(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
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
