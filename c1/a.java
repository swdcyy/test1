package c1.a;
import c1.c;
import java.lang.Object;
import c1.b;
import android.content.res.ColorStateList;
import c1.d;
import android.view.View;
import android.content.Context;
import android.graphics.drawable.Drawable;
import c1.e;
import java.lang.Math;

public class a implements c	// class@000cbc
{

    public void a(){
       super();
    }
    public ColorStateList a(b p0){
       return this.p(p0).b();
    }
    public float b(b p0){
       return (this.l(p0) * 2.00f);
    }
    public float c(b p0){
       return this.p(p0).c();
    }
    public void d(){
    }
    public void e(b p0,float p1){
       p0.f().setElevation(p1);
    }
    public void f(b p0,float p1){
       this.p(p0).h(p1);
    }
    public void g(b p0,Context p1,ColorStateList p2,float p3,float p4,float p5){
       p0.c(new d(p2, p3));
       View view = p0.f();
       view.setClipToOutline(true);
       view.setElevation(p4);
       this.j(p0, p5);
    }
    public void h(b p0){
       this.j(p0, this.c(p0));
    }
    public void i(b p0){
       this.j(p0, this.c(p0));
    }
    public void j(b p0,float p1){
       this.p(p0).g(p1, p0.g(), p0.e());
       this.n(p0);
    }
    public float k(b p0){
       return p0.f().getElevation();
    }
    public float l(b p0){
       return this.p(p0).d();
    }
    public float m(b p0){
       return (this.l(p0) * 2.00f);
    }
    public void n(b p0){
       if (!p0.g()) {
          p0.a(0, 0, 0, 0);
          return;
       }else {
          float f = this.c(p0);
          float f1 = this.l(p0);
          p0.a((int)Math.ceil((double)e.c(f, f1, p0.e())), (int)Math.ceil((double)e.d(f, f1, p0.e())), (int)Math.ceil((double)e.c(f, f1, p0.e())), (int)Math.ceil((double)e.d(f, f1, p0.e())));
          return;
       }
    }
    public void o(b p0,ColorStateList p1){
       this.p(p0).f(p1);
    }
    public final d p(b p0){
       return p0.d();
    }
}
