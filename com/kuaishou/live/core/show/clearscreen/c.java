package com.kuaishou.live.core.show.clearscreen.c;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.LinkedList;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import dt5.b;
import java.util.Set;
import java.lang.Runnable;
import android.view.View;
import java.lang.Integer;
import android.animation.ValueAnimator;
import e42.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.clearscreen.c$b;
import android.animation.Animator$AnimatorListener;
import e42.g;
import java.util.Iterator;
import java.lang.Boolean;
import java.lang.Float;
import e42.d;
import com.kuaishou.live.core.show.clearscreen.c$a;
import e42.f;

public class c	// class@000a24
{
    public LinkedList a;
    public final Set b;
    public boolean c;
    public final int d;
    public boolean e;
    public final Set f;

    public void c(){
       super();
       this.b = new HashSet();
       this.f = new HashSet();
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
       }else {
          this.a = new LinkedList();
          this.g(true);
       }
       this.d = c.c(a.b().getResources()).widthPixels;
       return;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public final void b(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "12")) {
          return;
       }
       this.f.add(p0);
       return;
    }
    public void c(View[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          c ta = this.a;
          if (ta != null && !ta.contains(oobject)) {
             this.a.add(oobject);
             oobject.setTranslationX(0);
          }
          i = i + 1;
       }
       return;
    }
    public void d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "10")) {
          return;
       }
       for (int i = 0; i < this.a.size(); i = i + 1) {
          this.a.get(i).setTranslationX((float)p0);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       if (this.c != null && this.e != null) {
          this.e = false;
          this.f();
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(200);
          valueAnimato.addUpdateListener(new e(this));
          valueAnimato.addListener(new c$b(this));
          valueAnimato.start();
          this.b(new g(valueAnimato));
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       this.f.clear();
       return;
    }
    public void g(boolean p0){
       Iterator iterator;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       this.c = p0;
       if (!p0 && (!PatchProxy.applyVoid(null, this, uoc, "4") && this.e != null)) {
          this.e = false;
          this.f();
          this.d(false);
          this.h(0x3f800000);
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.c);
       }
       return;
    }
    public final void h(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "11")) {
          return;
       }
       for (int i = 0; i < this.a.size(); i = i + 1) {
          this.a.get(i).setAlpha(p0);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.f();
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0}).setDuration(200);
       valueAnimato.addUpdateListener(new d(this));
       valueAnimato.addListener(new c$a(this));
       valueAnimato.start();
       this.b(new f(valueAnimato));
       return;
    }
}
