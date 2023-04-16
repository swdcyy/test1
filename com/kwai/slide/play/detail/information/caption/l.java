package com.kwai.slide.play.detail.information.caption.l;
import rq7.a;
import jh5.a;
import pp7.a;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import qp7.x0;
import pp7.b;
import java.lang.Boolean;
import android.text.SpannableStringBuilder;
import java.lang.Integer;
import com.kwai.slide.play.detail.information.caption.l$b;
import java.lang.CharSequence;
import qrd.l1;
import com.kwai.slide.play.detail.information.caption.l$a;
import com.kwai.slide.play.detail.information.caption.l$c;
import nsd.u;

public final class l extends a	// class@0017e3
{
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public final a k;
    public final a l;

    public void l(){
       super(null);
    }
    public void l(a p0){
       super();
       this.d = new a(p0);
       this.e = new a(p0);
       this.f = new a(p0);
       this.g = new a(p0);
       this.h = new a(p0);
       this.i = new a(p0);
       this.j = new a(p0);
       this.k = new a(p0);
       this.l = new a(p0);
    }
    public final void g(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "13")) {
          return;
       }
       a.p(p0, "observer");
       this.i.d(this.c(), p0);
       return;
    }
    public final void h(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "15")) {
          return;
       }
       a.p(p0, "observer");
       this.k.d(this.c(), p0);
       return;
    }
    public final void i(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "11")) {
          return;
       }
       a.p(p0, "observer");
       this.h.d(this.c(), p0);
       return;
    }
    public final void j(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "7")) {
          return;
       }
       a.p(p0, "observer");
       this.f.d(this.c(), p0);
       return;
    }
    public final void k(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "9")) {
          return;
       }
       a.p(p0, "observer");
       this.g.d(this.c(), p0);
       return;
    }
    public final void l(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "18")) {
          return;
       }
       a.p(p0, "observer");
       this.j.d(this.c(), p0);
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, l.class, "17")) {
          return;
       }
       this.j.f(Boolean.TRUE);
       return;
    }
    public final void n(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "8")) {
          return;
       }
       this.f.f(Boolean.valueOf(p0));
       return;
    }
    public final void o(SpannableStringBuilder p0,boolean p1,boolean p2,int p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Integer.valueOf(p3), this, l.class, "1")) {
          return;
       }
       a.p(p0, "sp");
       l$b uob = new l$b();
       uob.b().append(p0);
       uob.b = p1;
       uob.c = p2;
       uob.d = p3;
       this.d.f(uob);
       return;
    }
    public final void p(SpannableStringBuilder p0,SpannableStringBuilder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "19")) {
          return;
       }
       this.l.f(new l$a(p0, p1));
       return;
    }
    public final void q(SpannableStringBuilder p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ol, "3")) {
          return;
       }
       a.p(p0, "sp");
       l$c uoc = new l$c(p0, p1, false, false, 12, null);
       this.e.f(v8);
       return;
    }
    public final void r(SpannableStringBuilder p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, l.class, "4")) {
          return;
       }
       a.p(p0, "sp");
       l$c uoc = new l$c(p0, p1, p2, false, 8, null);
       this.e.f(v8);
       return;
    }
    public final void s(SpannableStringBuilder p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, l.class, "5")) {
          return;
       }
       a.p(p0, "sp");
       this.e.f(new l$c(p0, p1, p2, p3));
       return;
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, l.class, "10")) {
          return;
       }
       this.g.f(Boolean.TRUE);
       return;
    }
}
