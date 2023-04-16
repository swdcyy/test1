package com.kuaishou.live.core.show.wishlight.render.a$b;
import cz2.d;
import com.kuaishou.live.core.show.wishlight.render.a;
import java.lang.Object;
import pz2.c;
import cz2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pz2.i;
import zf1.d;
import xy2.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Boolean;
import java.util.Collection;
import hz2.c;
import com.kuaishou.live.core.show.wishlight.render.a$b$a;
import java.lang.Runnable;
import t45.c;

public final class a$b implements d	// class@0012b3
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       c.a(this, p0);
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "3")) {
          return;
       }
       a.p(p0, "task");
       a f = this.a.f;
       if (f != null) {
          f.b(p0);
       }
       return;
    }
    public void c(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "4")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "reason");
       a f = this.a.f;
       if (f != null) {
          f.c(p0, p1);
       }
       return;
    }
    public void f(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "task");
       a f = this.a.f;
       if (f != null) {
          f.e(p0);
       }
       if (p0 instanceof a) {
          a b = this.a.b;
          ArrayList uArrayList = new ArrayList(u.Y(b, 10));
          Iterator iterator = b.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             a.o(uoa, "it");
             this.a.k(uoa);
             uArrayList.add(Boolean.valueOf(this.a.b.remove(uoa)));
          }
       }
       return;
    }
    public void g(c p0,boolean p1,String p2,c p3){
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, a$b.class, "5")) {
          return;
       }
       a.p(p0, "task");
       a.p(p3, "renderRecord");
       this.a.i(p1, p2);
       return;
    }
    public void onReceivedEffectEvent(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "2")) {
          return;
       }
       a.p(p1, "eventJson");
       if (!this.a.m()) {
          return;
       }
       c.a(new a$b$a(this, p0, p1));
       return;
    }
}
