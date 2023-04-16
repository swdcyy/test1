package com.yxcorp.gifshow.prettify.e$b;
import n0c.b;
import com.yxcorp.gifshow.prettify.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.prettify.g;
import java.lang.Boolean;
import oa0.a;
import java.lang.Float;

public class e$b implements b	// class@001142
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       this.a.J.a(p0);
       return;
    }
    public void b(int p0,boolean p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.a.J.b(p0, p1);
       if (p0 == 3) {
          a.T0(false);
       }
       return;
    }
    public void c(int p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.a.J.c(p0);
       return;
    }
    public void d(float p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.a.J.d(p0);
       return;
    }
    public void e(int p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       this.a.J.e(p0);
       return;
    }
}
