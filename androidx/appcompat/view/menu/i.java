package androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.g;
import android.content.Context;
import androidx.appcompat.view.menu.e;
import android.view.View;
import java.lang.Object;
import androidx.appcompat.view.menu.i$a;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.j;
import v0.c;
import java.lang.String;
import android.view.WindowManager;
import android.view.Display;
import android.graphics.Point;
import java.lang.Math;
import android.content.res.Resources;
import cw9.c;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.l;
import android.widget.PopupWindow$OnDismissListener;
import v0.e;
import java.lang.IllegalStateException;
import a2.i0;
import a2.g;
import android.util.DisplayMetrics;
import android.graphics.Rect;

public class i implements g	// class@0005b2
{
    public final Context a;
    public final e b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public j$a i;
    public c j;
    public PopupWindow$OnDismissListener k;
    public final PopupWindow$OnDismissListener l;

    public void i(Context p0,e p1,View p2,boolean p3,int p4){
       super(p0, p1, p2, p3, p4, 0);
    }
    public void i(Context p0,e p1,View p2,boolean p3,int p4,int p5){
       super();
       this.g = 0x800003;
       this.l = new i$a(this);
       this.a = p0;
       this.b = p1;
       this.f = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
    }
    public void a(j$a p0){
       this.i = p0;
       i tj = this.j;
       if (tj != null) {
          tj.l(p0);
       }
       return;
    }
    public final c b(){
       Point point = new Point();
       this.a.getSystemService("window").getDefaultDisplay().getRealSize(point);
       b uob = (Math.min(point.x, point.y) >= c.b(this.a.getResources(), 0x7f07001c))? 1: null;
       if (uob) {
          b uob1 = new b(this.a, this.f, this.d, this.e, this.c);
       }else {
          l ol = new l(this.a, this.b, this.f, this.d, this.e, this.c);
       }
       uob.n(this.b);
       uob.w(this.l);
       uob.r(this.f);
       uob.l(this.i);
       uob.t(this.h);
       uob.u(this.g);
       return uob;
    }
    public c c(){
       if (this.j == null) {
          this.j = this.b();
       }
       return this.j;
    }
    public boolean d(){
       i tj = this.j;
       boolean b = (tj != null && tj.d())? true: false;
       return b;
    }
    public void dismiss(){
       if (this.d()) {
          this.j.dismiss();
       }
       return;
    }
    public void e(){
       this.j = null;
       i tk = this.k;
       if (tk != null) {
          tk.onDismiss();
       }
       return;
    }
    public void f(View p0){
       this.f = p0;
    }
    public void g(boolean p0){
       this.h = p0;
       i tj = this.j;
       if (tj != null) {
          tj.t(p0);
       }
       return;
    }
    public void h(int p0){
       this.g = p0;
    }
    public void i(PopupWindow$OnDismissListener p0){
       this.k = p0;
    }
    public void j(){
       if (this.l()) {
          return;
       }
       throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    public final void k(int p0,int p1,boolean p2,boolean p3){
       c uoc = this.c();
       uoc.x(p3);
       if (p2) {
          if ((g.b(this.g, i0.B(this.f)) & 0x07) == 5) {
             p0 = p0 - this.f.getWidth();
          }
          uoc.v(p0);
          uoc.y(p1);
          int i = (int)((c.c(this.a.getResources()).density * 48.00f) / 2.00f);
          uoc.s(new Rect((p0 - i), (p1 - i), (p0 + i), (p1 + i)));
       }
       uoc.show();
       return;
    }
    public boolean l(){
       if (this.d()) {
          return true;
       }
       if (this.f == null) {
          return false;
       }
       this.k(false, false, false, false);
       return true;
    }
    public boolean m(int p0,int p1){
       if (this.d()) {
          return true;
       }
       if (this.f == null) {
          return false;
       }
       this.k(p0, p1, true, true);
       return true;
    }
}
