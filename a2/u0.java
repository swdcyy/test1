package a2.u0;
import android.os.Build$VERSION;
import a2.u0$k;
import a2.u0$l;
import java.lang.Object;
import a2.u0$j;
import a2.u0$i;
import a2.u0$h;
import a2.u0$g;
import android.view.WindowInsets;
import p1.b;
import java.lang.Math;
import android.view.View;
import z1.h;
import a2.i0;
import a2.d;
import z1.d;
import a2.u0$b;

public class u0	// class@0000b9
{
    public final u0$l a;
    public static final u0 b;

    static {
       u0.b = (Build$VERSION.SDK_INT >= 30)? u0$k.r: u0$l.b;
    }
    public void u0(u0 p0){
       super();
       if (p0 != null) {
          p0 = p0.a;
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 30 && p0 instanceof u0$k) {
             this.a = new u0$k(this, p0);
          }else if(sDK_INT >= 29 && p0 instanceof u0$j){
             this.a = new u0$j(this, p0);
          }else if(sDK_INT >= 28 && p0 instanceof u0$i){
             this.a = new u0$i(this, p0);
          }else if(p0 instanceof u0$h){
             this.a = new u0$h(this, p0);
          }else if(p0 instanceof u0$g){
             this.a = new u0$g(this, p0);
          }else {
             this.a = new u0$l(this);
          }
          p0.e(this);
       }else {
          this.a = new u0$l(this);
       }
       return;
    }
    public void u0(WindowInsets p0){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          this.a = new u0$k(this, p0);
       }else if(sDK_INT >= 29){
          this.a = new u0$j(this, p0);
       }else if(sDK_INT >= 28){
          this.a = new u0$i(this, p0);
       }else {
          this.a = new u0$h(this, p0);
       }
       return;
    }
    public static b n(b p0,int p1,int p2,int p3,int p4){
       int i = Math.max(0, (p0.a - p1));
       int i1 = Math.max(0, (p0.b - p2));
       int i2 = Math.max(0, (p0.c - p3));
       int i3 = Math.max(0, (p0.d - p4));
       if (i == p1 && (i1 == p2 && (i2 == p3 && i3 == p4))) {
          return p0;
       }
       return b.b(i, i1, i2, i3);
    }
    public static u0 w(WindowInsets p0){
       return u0.x(p0, null);
    }
    public static u0 x(WindowInsets p0,View p1){
       h.g(p0);
       u0 ou0 = new u0(p0);
       if (p1 != null && p1.isAttachedToWindow()) {
          ou0.t(i0.J(p1));
          ou0.d(p1.getRootView());
       }
       return ou0;
    }
    public u0 a(){
       return this.a.a();
    }
    public u0 b(){
       return this.a.b();
    }
    public u0 c(){
       return this.a.c();
    }
    public void d(View p0){
       this.a.d(p0);
    }
    public d e(){
       return this.a.f();
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof u0) {
          return false;
       }
       return d.a(this.a, p0.a);
    }
    public b f(int p0){
       return this.a.g(p0);
    }
    public b g(){
       return this.a.i();
    }
    public int h(){
       return this.a.k().d;
    }
    public int hashCode(){
       u0 ta = this.a;
       int i = (ta == null)? 0: ta.hashCode();
       return i;
    }
    public int i(){
       return this.a.k().a;
    }
    public int j(){
       return this.a.k().c;
    }
    public int k(){
       return this.a.k().b;
    }
    public boolean l(){
       return (this.a.k().equals(b.e) ^ 0x01);
    }
    public u0 m(int p0,int p1,int p2,int p3){
       return this.a.m(p0, p1, p2, p3);
    }
    public boolean o(){
       return this.a.n();
    }
    public boolean p(int p0){
       return this.a.p(p0);
    }
    public u0 q(int p0,int p1,int p2,int p3){
       u0$b uob = new u0$b(this);
       uob.d(b.b(p0, p1, p2, p3));
       return uob.a();
    }
    public void r(b[] p0){
       this.a.q(p0);
    }
    public void s(b p0){
       this.a.r(p0);
    }
    public void t(u0 p0){
       this.a.s(p0);
    }
    public void u(b p0){
       this.a.t(p0);
    }
    public WindowInsets v(){
       u0 ta = this.a;
       u0$g c = (ta instanceof u0$g)? ta.c: null;
       return c;
    }
}
