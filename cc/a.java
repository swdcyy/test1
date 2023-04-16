package cc.a;
import xb.x;
import ac.b;
import java.lang.Object;
import com.facebook.drawee.components.DraweeEventTracker;
import android.content.Context;
import com.facebook.drawee.components.DraweeEventTracker$Event;
import ac.a;
import android.graphics.drawable.Drawable;
import ab.e;
import xb.w;
import java.lang.System;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import cb.a;
import ab.d$b;
import ab.d;

public class a implements x	// class@000d03
{
    public boolean a;
    public boolean b;
    public boolean c;
    public b d;
    public a e;
    public final DraweeEventTracker f;

    public void a(b p0){
       super();
       this.a = false;
       this.b = false;
       this.c = true;
       this.e = null;
       this.f = DraweeEventTracker.a();
       if (p0 != null) {
          this.l(p0);
       }
       return;
    }
    public static a d(b p0,Context p1){
       return new a(p0);
    }
    public void a(boolean p0){
       if (this.c == p0) {
          return;
       }
       a tf = this.f;
       DraweeEventTracker$Event oN_DRAWABLE_ = (p0)? DraweeEventTracker$Event.ON_DRAWABLE_SHOW: DraweeEventTracker$Event.ON_DRAWABLE_HIDE;
       tf.b(oN_DRAWABLE_);
       this.c = p0;
       this.c();
       return;
    }
    public final void b(){
       if (this.a != null) {
          return;
       }
       this.f.b(DraweeEventTracker$Event.ON_ATTACH_CONTROLLER);
       this.a = true;
       a te = this.e;
       if (te != null && te.getHierarchy() != null) {
          this.e.onAttach();
       }
       return;
    }
    public final void c(){
       if (this.b != null && this.c != null) {
          this.b();
       }else {
          this.e();
       }
       return;
    }
    public final void e(){
       if (this.a == null) {
          return;
       }
       this.f.b(DraweeEventTracker$Event.ON_DETACH_CONTROLLER);
       this.a = false;
       if (this.h()) {
          this.e.onDetach();
       }
       return;
    }
    public a f(){
       return this.e;
    }
    public Drawable g(){
       a td = this.d;
       Drawable uDrawable = (td == null)? null: td.c();
       return uDrawable;
    }
    public boolean h(){
       a te = this.e;
       boolean b = (te != null && te.getHierarchy() == this.d)? true: false;
       return b;
    }
    public void i(){
       this.f.b(DraweeEventTracker$Event.ON_HOLDER_ATTACH);
       this.b = true;
       this.c();
    }
    public void j(){
       this.f.b(DraweeEventTracker$Event.ON_HOLDER_DETACH);
       this.b = false;
       this.c();
    }
    public void k(a p0){
       a ta = this.a;
       if (ta != null) {
          this.e();
       }
       if (this.h()) {
          this.f.b(DraweeEventTracker$Event.ON_CLEAR_OLD_CONTROLLER);
          this.e.setHierarchy(null);
       }
       this.e = p0;
       if (p0 != null) {
          this.f.b(DraweeEventTracker$Event.ON_SET_CONTROLLER);
          this.e.setHierarchy(this.d);
       }else {
          this.f.b(DraweeEventTracker$Event.ON_CLEAR_CONTROLLER);
       }
       if (ta != null) {
          this.b();
       }
       return;
    }
    public void l(b p0){
       this.f.b(DraweeEventTracker$Event.ON_SET_HIERARCHY);
       boolean b = this.h();
       this.m(null);
       e.d(p0);
       b uob = p0;
       this.d = uob;
       Drawable uDrawable = uob.c();
       boolean b1 = (uDrawable == null || uDrawable.isVisible())? true: false;
       this.a(b1);
       this.m(this);
       if (b) {
          this.e.setHierarchy(p0);
       }
       return;
    }
    public final void m(x p0){
       Drawable uDrawable = this.g();
       if (uDrawable instanceof w) {
          uDrawable.c(p0);
       }
       return;
    }
    public void onDraw(){
       if (this.a != null) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(System.identityHashCode(this)),Integer.valueOf(System.identityHashCode(this.e)),this.toString()};
       a.v(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", objArray);
       this.b = true;
       this.c = true;
       this.c();
       return;
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.c("controllerAttached", this.a);
       uob.c("holderAttached", this.b);
       uob.c("drawableVisible", this.c);
       uob.b("events", this.f.toString());
       return uob.toString();
    }
}
