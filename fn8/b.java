package fn8.b;
import java.lang.Object;
import java.lang.Float;
import fn8.i;
import android.view.View;
import fn8.d;
import android.view.MotionEvent;
import java.lang.String;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import fn8.c;

public class b	// class@002320
{
    public final int[] a;
    public int b;
    public int c;
    public View d;
    public int e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public float[] j;
    public short k;
    public float l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public int q;
    public d r;
    public i s;
    public c t;
    public int u;
    public boolean v;
    public boolean w;
    public static short A = 0;
    public static int x = 11;
    public static MotionEvent$PointerProperties[] y;
    public static MotionEvent$PointerCoords[] z;

    public void b(){
       super();
       int[] ointArray = new int[b.x];
       this.a = ointArray;
       this.b = 0;
       this.e = 0;
       this.i = true;
       this.q = 0;
    }
    public static boolean n(float p0){
       return (Float.isNaN(p0) ^ 0x01);
    }
    public final void a(){
       b te = this.e;
       if (te == null || te == 2) {
          this.p(4);
       }
       return;
    }
    public final void b(){
       if (this.e == null) {
          this.p(2);
       }
       return;
    }
    public final void c(){
       b te = this.e;
       if (te != 4 && (te == null || te == 2)) {
          this.q();
          this.p(3);
       }
       return;
    }
    public void d(int p0,int p1){
       b ts = this.s;
       if (ts != null) {
          ts.a(this, p0, p1);
       }
       return;
    }
    public final void e(){
       b te = this.e;
       if (te == 2 || te == 4) {
          this.p(5);
       }
       return;
    }
    public final void f(){
       b te = this.e;
       if (te != 4 && (te == null || te == 2)) {
          this.p(1);
       }
       return;
    }
    public float g(){
       return this.l;
    }
    public float h(){
       return this.m;
    }
    public float i(){
       return (this.l - this.n);
    }
    public float j(){
       return (this.m - this.o);
    }
    public int k(){
       return this.e;
    }
    public int l(){
       return this.c;
    }
    public View m(){
       return this.d;
    }
    public boolean o(View p0,float p1,float p2){
       float f4;
       float f = (float)p0.getWidth();
       float f1 = (float)p0.getHeight();
       b tj = this.j;
       int i = 1;
       float f2 = 0;
       if (tj != null) {
          int i1 = tj[0];
          int i2 = tj[i];
          int i3 = tj[2];
          int i4 = tj[3];
          float f3 = (b.n(i1))? f2 - i1: 0;
          if (b.n(i2)) {
             f2 = f2 - i4;
          }
          if (b.n(i3)) {
             f = f + i3;
          }
          if (b.n(i4)) {
             f1 = f1 + i4;
          }
          tj = this.j;
          i2 = tj[4];
          i4 = tj[5];
          if (b.n(i2)) {
             if (!b.n(i1)) {
                f3 = f - i2;
             }else if(!b.n(i3)){
                f = i2 + f3;
             }
          }
          if (b.n(i4)) {
             if (!b.n(f2)) {
                f2 = f1 - i4;
             }else if(!b.n(f1)){
                f1 = f2 + i4;
             }
          }
          f4 = f2;
          f2 = f3;
       }else {
          f4 = 0;
       }
       if (p1 - f2 < 0 || (p1 - f > 0 || (p2 - f4 < 0 || p2 - f1 > 0))) {
          i = false;
       }
       return i;
    }
    public final void p(int p0){
       boolean b;
       b te = this.e;
       if (te == p0) {
          return;
       }
       this.e = p0;
       int i = 4;
       if (p0 == i) {
          short a = b.A;
          b.A = (short)(a + 1);
          this.k = a;
       }
       b tr = this.r;
       tr.k = tr.k + 1;
       if (d.e(p0)) {
          b = false;
          int i1 = 0;
          while (i1 < tr.i) {
             object oobject = tr.e[i1];
             if (d.i(oobject, this)) {
                if (p0 == 5) {
                   oobject.c();
                   oobject.w = b;
                }else {
                   tr.m(oobject);
                }
             }
             i1 = i1 + 1;
          }
          tr.a();
       }
       if (p0 == i) {
          tr.m(this);
       }else if(te == i || te == 5){
          if (this.v != null) {
             this.d(p0, te);
          }
       }else {
          this.d(p0, te);
       }
       i = tr.k - 1;
       tr.k = i;
       if (tr.j != null || i) {
          tr.l = true;
       }else {
          tr.b();
       }
       this.t(p0, te);
       return;
    }
    public void q(){
    }
    public void r(MotionEvent p0){
       this.p(1);
    }
    public void s(){
    }
    public void t(int p0,int p1){
    }
    public String toString(){
       b td = this.d;
       String str = (td == null)? null: td.getClass().getSimpleName();
       return this.getClass().getSimpleName()+"@["+this.c+"]:"+str;
    }
    public b u(float p0,float p1,float p2,float p3,float p4,float p5){
       if (this.j == null) {
          float[] uofloatArray = new float[6];
          this.j = uofloatArray;
       }
       b tj = this.j;
       tj[0] = p0;
       tj[1] = p1;
       tj[2] = p2;
       tj[3] = p3;
       tj[4] = p4;
       tj[5] = p5;
       if (b.n(p4) && (!b.n(p0) || !b.n(p2))) {
          if (b.n(p4) && (b.n(p0) || b.n(p2))) {
             if (b.n(p5) && (!b.n(p3) || !b.n(p1))) {
                if (b.n(p5) && (b.n(p3) || b.n(p1))) {
                   return this;
                }else {
                   throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
                }
             }else {
                throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
             }
          }else {
             throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
          }
       }else {
          throw new IllegalArgumentException("Cannot have all of left, right and width defined");
       }
    }
    public b v(boolean p0){
       this.p = p0;
       return this;
    }
    public void w(int p0){
       this.c = p0;
    }
    public boolean x(b p0){
       if (p0 == this) {
          return false;
       }
       b tt = this.t;
       if (tt != null) {
          return tt.c(this, p0);
       }
       return false;
    }
    public boolean y(b p0){
       if (p0 == this) {
          return true;
       }
       b tt = this.t;
       if (tt != null) {
          return tt.d(this, p0);
       }
       return false;
    }
    public boolean z(b p0){
       if (p0 != this) {
          b tt = this.t;
          if (tt != null) {
             return tt.b(this, p0);
          }
       }
       return false;
    }
}
