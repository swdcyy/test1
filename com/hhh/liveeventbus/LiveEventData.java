package com.hhh.liveeventbus.LiveEventData;
import java.lang.Object;
import y0.b;
import bm.j;
import java.lang.String;
import x0.a;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.hhh.liveeventbus.LiveEventData$b;
import androidx.lifecycle.Observer;
import y0.b$d;
import java.util.Map$Entry;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import com.hhh.liveeventbus.LiveEventData$LifecycleBoundObserver;
import java.lang.IllegalArgumentException;
import androidx.lifecycle.LifecycleObserver;
import com.hhh.liveeventbus.LiveEventData$a;

public class LiveEventData	// class@00055d
{
    public final Object a;
    public final b b;
    public int c;
    public int d;
    public Object e;
    public Object f;
    public boolean g;
    public boolean h;
    public final Runnable i;
    public static final Object j;

    static {
       LiveEventData.j = new Object();
    }
    public void LiveEventData(){
       super();
       this.a = new Object();
       this.b = new b();
       this.c = -1;
       this.d = 0;
       Object j = LiveEventData.j;
       this.e = j;
       this.f = j;
       this.i = new j(this);
    }
    public static void a(String p0){
       if (a.f().c()) {
          return;
       }
       throw new IllegalStateException("Cannot invoke "+p0+" on a background thread");
    }
    public final void b(LiveEventData$b p0){
       if (p0.c == null) {
          return;
       }
       if (!p0.d()) {
          p0.a(false);
          return;
       }else {
          LiveEventData tc = this.c;
          if (p0.d >= tc) {
             return;
          }
          p0.d = tc;
          p0.b.onChanged(this.e);
          return;
       }
    }
    public void c(LiveEventData$b p0){
       boolean b = true;
       if (this.g != null) {
          this.h = b;
          return;
       }else {
          this.g = b;
          do {
             this.h = false;
             if (p0 != null) {
                this.b(p0);
                p0 = null;
             }else {
                b$d uod = this.b.l();
                while (uod.hasNext()) {
                   this.b(uod.next().getValue());
                   if (this.h == null) {
                   }
                }
             }
          } while (this.h == null);
          this.g = false;
          return;
       }
    }
    public int d(){
       return this.c;
    }
    public void e(LifecycleOwner p0,Observer p1){
       if (p0.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
          return;
       }
       LiveEventData$LifecycleBoundObserver lifecycleBou = new LiveEventData$LifecycleBoundObserver(this, p0, p1);
       LiveEventData$b uob = this.b.p(p1, lifecycleBou);
       if (uob != null && !uob.c(p0)) {
          throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
       }
       if (uob != null) {
          return;
       }
       p0.getLifecycle().addObserver(lifecycleBou);
       return;
    }
    public void f(Observer p0){
       LiveEventData$a uoa = new LiveEventData$a(this, p0);
       LiveEventData$b uob = this.b.p(p0, uoa);
       if (uob instanceof LiveEventData$LifecycleBoundObserver) {
          throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
       }
       if (uob != null) {
          return;
       }
       uoa.a(true);
       return;
    }
    public void g(Observer p0){
       LiveEventData.a("removeObserver");
       LiveEventData$b uob = this.b.q(p0);
       if (uob == null) {
          return;
       }
       uob.b();
       uob.a(false);
       return;
    }
    public void h(Object p0){
       LiveEventData.a("setValue");
       this.c = this.c + 1;
       this.e = p0;
       this.c(null);
    }
}
