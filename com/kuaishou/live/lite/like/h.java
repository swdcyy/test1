package com.kuaishou.live.lite.like.h;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.like.c;
import com.kuaishou.live.lite.sidebar.e;
import ga1.d;
import ok.o;
import wb3.c;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import mrd.a;
import com.kuaishou.live.lite.like.f;
import androidx.lifecycle.Lifecycle;
import wb3.j;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.sidebar.e$a;
import java.util.Objects;
import com.kuaishou.live.lite.like.f$a;
import oh3.j;

public class h extends ViewController	// class@0009f6
{
    public final c j;
    public final e k;
    public final d l;
    public final o m;
    public final c n;
    public final f o;
    public final a p;
    public b q;

    public void h(c p0,e p1,d p2,o p3,c p4,LiveActionTrigger p5,a p6){
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       this.p = p6;
       f uof = new f(p0, p2, p3, p4, this.getLifecycle(), p5);
       this.o = p1;
       this.q = p6.subscribe(new j(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.k.b(this.o);
       return;
    }
    public void J2(){
       f f;
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       h tj = this.j;
       if (tj != null) {
          tj.c();
       }
       tj = this.o;
       if (tj != null) {
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoid(null, tj, f.class, "7")) {
             f = tj.f;
             if (f != null) {
                f.b();
                tj.f = null;
             }
          }
       }
       j.a(this.q);
       return;
    }
}
