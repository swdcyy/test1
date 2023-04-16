package a2.l;
import android.os.Build$VERSION;
import a2.l$k;
import a2.l$l;
import java.lang.Object;
import a2.l$j;
import a2.l$i;
import a2.l$h;
import a2.l$g;
import android.view.WindowInsets;
import p1.b;
import java.lang.Math;
import android.view.View;
import z1.h;
import a2.i0;
import a2.j;
import a2.d;
import z1.d;

public class l	// class@000089
{
    public final l$l a;
    public static final l b;

    static {
       l.b = (Build$VERSION.SDK_INT >= 30)? l$k.q: l$l.b;
    }
    public void l(l p0){
       super();
       if (p0 != null) {
          p0 = p0.a;
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 30 && p0 instanceof l$k) {
             this.a = new l$k(this, p0);
          }else if(sDK_INT >= 29 && p0 instanceof l$j){
             this.a = new l$j(this, p0);
          }else if(sDK_INT >= 28 && p0 instanceof l$i){
             this.a = new l$i(this, p0);
          }else if(p0 instanceof l$h){
             this.a = new l$h(this, p0);
          }else if(p0 instanceof l$g){
             this.a = new l$g(this, p0);
          }else {
             this.a = new l$l(this);
          }
          p0.e(this);
       }else {
          this.a = new l$l(this);
       }
       return;
    }
    public void l(WindowInsets p0){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          this.a = new l$k(this, p0);
       }else if(sDK_INT >= 29){
          this.a = new l$j(this, p0);
       }else if(sDK_INT >= 28){
          this.a = new l$i(this, p0);
       }else {
          this.a = new l$h(this, p0);
       }
       return;
    }
    public static b h(b p0,b p1){
       return b.b(Math.max(p0.a, p1.a), Math.max(p0.b, p1.b), Math.max(p0.c, p1.c), Math.max(p0.d, p1.d));
    }
    public static l n(WindowInsets p0){
       return l.o(p0, null);
    }
    public static l o(WindowInsets p0,View p1){
       h.g(p0);
       l ol = new l(p0);
       if (p1 != null && i0.X(p1)) {
          ol.k(j.a(p1));
          ol.d(p1.getRootView());
       }
       return ol;
    }
    public l a(){
       return this.a.a();
    }
    public l b(){
       return this.a.b();
    }
    public l c(){
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
       if (!p0 instanceof l) {
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
    public int hashCode(){
       l ta = this.a;
       int i = (ta == null)? 0: ta.hashCode();
       return i;
    }
    public void i(b[] p0){
       this.a.o(p0);
    }
    public void j(b p0){
       this.a.p(p0);
    }
    public void k(l p0){
       this.a.q(p0);
    }
    public void l(b p0){
       this.a.r(p0);
    }
    public WindowInsets m(){
       l ta = this.a;
       l$g c = (ta instanceof l$g)? ta.c: null;
       return c;
    }
}
