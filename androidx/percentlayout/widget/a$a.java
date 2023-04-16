package androidx.percentlayout.widget.a$a;
import java.lang.Object;
import androidx.percentlayout.widget.a$c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import android.view.View;
import a2.o;
import a2.i0;
import java.lang.String;
import java.lang.Float;

public class a$a	// class@000862
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final a$c j;

    public void a$a(){
       super();
       this.a = 0xbf800000;
       this.b = 0xbf800000;
       this.c = 0xbf800000;
       this.d = 0xbf800000;
       this.e = 0xbf800000;
       this.f = 0xbf800000;
       this.g = 0xbf800000;
       this.h = 0xbf800000;
       this.j = new a$c(0, 0);
    }
    public void a(ViewGroup$LayoutParams p0,int p1,int p2){
       a$a tj = this.j;
       ViewGroup$LayoutParams width = p0.width;
       tj.width = width;
       ViewGroup$LayoutParams height = p0.height;
       tj.height = height;
       int i = 0;
       width = (tj.b != null || (width == null && this.a < 0))? 1: 0;
       if (tj.a != null || (height == null && this.b < 0)) {
          i = 1;
       }
       tj = this.a;
       if (tj >= 0) {
          p0.width = Math.round(((float)p1 * tj));
       }
       a$a tb = this.b;
       if (tb >= 0) {
          p0.height = Math.round(((float)p2 * tb));
       }
       tb = this.i;
       if (tb >= 0) {
          if (width) {
             p0.width = Math.round(((float)p0.height * tb));
             tb.b = true;
          }
          if (i) {
             p0.height = Math.round(((float)p0.width / this.i));
             p0.a = true;
          }
       }
       return;
    }
    public void b(View p0,ViewGroup$MarginLayoutParams p1,int p2,int p3){
       this.a(p1, p2, p3);
       a$a tj = this.j;
       tj.leftMargin = p1.leftMargin;
       tj.topMargin = p1.topMargin;
       tj.rightMargin = p1.rightMargin;
       tj.bottomMargin = p1.bottomMargin;
       o.e(tj, o.b(p1));
       o.d(this.j, o.a(p1));
       tj = this.c;
       int i = 0;
       if (tj - i >= 0) {
          p1.leftMargin = Math.round(((float)p2 * tj));
       }
       tj = this.d;
       if (tj - i >= 0) {
          p1.topMargin = Math.round(((float)p3 * tj));
       }
       tj = this.e;
       if (tj - i >= 0) {
          p1.rightMargin = Math.round(((float)p2 * tj));
       }
       tj = this.f;
       if (tj - i >= 0) {
          p1.bottomMargin = Math.round(((float)p3 * tj));
       }
       float f = 0;
       tj = this.g;
       float f1 = Float.MIN_VALUE;
       if (tj - i >= 0) {
          o.e(p1, Math.round(((float)p2 * tj)));
          f = 1;
       }
       tj = this.h;
       if (tj - i >= 0) {
          o.d(p1, Math.round(((float)p2 * tj)));
       }else {
          f1 = f;
       }
       if (f1) {
          o.c(p1, i0.B(p0));
       }
       return;
    }
    public void c(ViewGroup$LayoutParams p0){
       a$a tj = this.j;
       if (tj.b == null) {
          p0.width = tj.width;
       }
       if (tj.a == null) {
          p0.height = tj.height;
       }
       tj.b = false;
       tj.a = false;
       return;
    }
    public void d(ViewGroup$MarginLayoutParams p0){
       this.c(p0);
       a$a tj = this.j;
       p0.leftMargin = tj.leftMargin;
       p0.topMargin = tj.topMargin;
       p0.rightMargin = tj.rightMargin;
       p0.bottomMargin = tj.bottomMargin;
       o.e(p0, o.b(tj));
       o.d(p0, o.a(this.j));
    }
    public String toString(){
       Object[] objArray = new Object[]{Float.valueOf(this.a),Float.valueOf(this.b),Float.valueOf(this.c),Float.valueOf(this.d),Float.valueOf(this.e),Float.valueOf(this.f),Float.valueOf(this.g),Float.valueOf(this.h)};
       return String.format("PercentLayoutInformation width: %f height %f, margins \(%f, %f,  %f, %f, %f, %f\)", objArray);
    }
}
