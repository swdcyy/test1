package com.facebook.react.uimanager.a$b;
import com.facebook.react.uimanager.j$x;
import com.facebook.react.uimanager.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.facebook.react.uimanager.UIManagerModule;
import gf.b;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.j;
import ze.m;
import android.view.View;
import ze.i;
import java.lang.Runnable;
import gf.g;
import gf.e;
import ze.j;
import com.facebook.react.uimanager.j$w;
import com.facebook.react.uimanager.j$b0;
import java.lang.StringBuilder;
import cb.a;

public class a$b implements j$x	// class@001337
{
    public int a;
    public long b;
    public final a c;

    public void a$b(a p0){
       this.c = p0;
       super();
    }
    public void a(long p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "3")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          UIManagerModule uIManagerMod1 = this.c.b();
          if (uIManagerMod1 != null && this.c.e.hasValue()) {
             View view1 = uIManagerMod1.getUIImplementation().k().m().p(this.c.c);
             if (view1 == null) {
                this.c.e.l = 1;
             }else if(this.c.e.k != null){
                g.a(view1, new i(this));
                this.c.e.k = false;
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          UIManagerModule uIManagerMod = this.c.b();
          if (uIManagerMod != null && this.c.d.hasValue()) {
             View view = uIManagerMod.getUIImplementation().k().m().p(this.c.d.m);
             if (view == null) {
                this.c.d.o = 1;
             }else if(this.c.d.n != null){
                g.a(view, new j(this));
                this.c.d.n = false;
             }
          }
       }
       this.b = this.b + (a.c() - p0);
       return;
    }
    public void b(j$w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       long l = a.c();
       if (this.c.d.hasValue() && (p0 instanceof j$b0 && p0.a == this.c.d.m)) {
          this.c.d.n = true;
          this.c.d.k = a.c();
          this.c.d.l = this.b;
          this.b = 0;
          a.x("LCPDetector", this.c.d.a()+" uiOperation "+p0);
       }
    label_0068 :
       a d = this.c.d;
       d.i = d.i + (a.c() - l);
       return;
    }
    public void c(j$w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       if (this.c.d.hasValue() && this.a != this.c.d.m) {
          p0.j = a.c();
          this.a = this.c.d.m;
          this.b = 0;
       }
       return;
    }
}
