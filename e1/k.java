package e1.k;
import e1.l;
import e1.e;
import java.util.HashMap;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import e1.k$a;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import android.graphics.RectF;
import java.lang.Math;
import android.view.View;
import java.lang.Float;
import java.lang.System;
import java.io.PrintStream;
import android.view.ViewParent;
import android.view.ViewGroup;

public class k extends l	// class@001e9a
{
    public String h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public float r;
    public float s;

    public void k(){
       super();
       this.h = null;
       this.i = e.f;
       this.j = 0;
       this.k = Float.NaN;
       this.l = Float.NaN;
       this.m = Float.NaN;
       this.n = Float.NaN;
       this.o = Float.NaN;
       this.p = Float.NaN;
       this.q = 0;
       this.r = Float.NaN;
       this.s = Float.NaN;
       this.d = 2;
    }
    public void a(HashMap p0){
    }
    public void c(Context p0,AttributeSet p1){
       k$a.a(this, p0.obtainStyledAttributes(p1, c$b.x1));
    }
    public void f(String p0,Object p1){
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x93f282e0:
             if (p0.equals("transitionEasing")) {
                i = 0;
             }
             break;
           case 0xbccfbc81:
             if (p0.equals("percentWidth")) {
                i = 1;
             }
             break;
           case 0xc358d9cc:
             if (p0.equals("percentHeight")) {
                i = 2;
             }
             break;
           case 0xceb4c389:
             if (p0.equals("drawPath")) {
                i = 3;
             }
             break;
           case 0xf4104904:
             if (p0.equals("sizePercent")) {
                i = 4;
             }
             break;
           case 0x198424b3:
             if (p0.equals("percentX")) {
                i = 5;
             }
             break;
           case 0x198424b4:
             if (p0.equals("percentY")) {
                i = 6;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.h = p1.toString();
             break;
           case 1:
             this.k = this.h(p1);
             break;
           case 2:
             this.l = this.h(p1);
             break;
           case 3:
             this.j = this.i(p1);
             break;
           case 4:
             float f = this.h(p1);
             this.k = f;
             this.l = f;
             break;
           case 5:
             this.m = this.h(p1);
             break;
           case 6:
             this.n = this.h(p1);
             break;
           default:
       }
       return;
    }
    public void j(int p0,int p1,float p2,float p3,float p4,float p5){
       k tq = this.q;
       if (tq != 1) {
          if (tq != 2) {
             this.o(p2, p3, p4, p5);
             return;
          }else {
             this.q(p0, p1);
             return;
          }
       }else {
          this.p(p2, p3, p4, p5);
          return;
       }
    }
    public float k(){
       return this.r;
    }
    public float l(){
       return this.s;
    }
    public boolean m(int p0,int p1,RectF p2,RectF p3,float p4,float p5){
       this.j(p0, p1, p2.centerX(), p2.centerY(), p3.centerX(), p3.centerY());
       if (Math.abs((p4 - this.r)) - 0x41a00000 < 0 && Math.abs((p5 - this.s)) - 0x41a00000 < 0) {
          return true;
       }
       return false;
    }
    public void n(View p0,RectF p1,RectF p2,float p3,float p4,String[] p5,float[] p6){
       k tq = this.q;
       if (tq != 1) {
          if (tq != 2) {
             this.r(p1, p2, p3, p4, p5, p6);
             return;
          }else {
             this.t(p0, p1, p2, p3, p4, p5, p6);
             return;
          }
       }else {
          this.s(p1, p2, p3, p4, p5, p6);
          return;
       }
    }
    public final void o(float p0,float p1,float p2,float p3){
       p2 = p2 - p0;
       p3 = p3 - p1;
       float f = 0;
       float f1 = (Float.isNaN(this.m))? 0: this.m;
       float f2 = (Float.isNaN(this.p))? 0: this.p;
       float f3 = (Float.isNaN(this.n))? 0: this.n;
       if (!Float.isNaN(this.o)) {
          f = this.o;
       }
       this.r = (float)(int)((p0 + (f1 * p2)) + (f * p3));
       this.s = (float)(int)((p1 + (p2 * f2)) + (p3 * f3));
       return;
    }
    public final void p(float p0,float p1,float p2,float p3){
       p2 = p2 - p0;
       p3 = p3 - p1;
       k tm = this.m;
       k tn = this.n;
       this.r = (p0 + (p2 * tm)) + ((- p3) * tn);
       this.s = (p1 + (p3 * tm)) + (p2 * tn);
    }
    public final void q(int p0,int p1){
       k tm = this.m;
       float f = (float)0;
       this.r = ((float)(p0 - 0) * tm) + f;
       this.s = ((float)(p1 - 0) * tm) + f;
    }
    public void r(RectF p0,RectF p1,float p2,float p3,String[] p4,float[] p5){
       float f = p0.centerX();
       float f1 = p0.centerY();
       float f2 = p1.centerX() - f;
       float f3 = p1.centerY() - f1;
       if (p4[0] != null) {
          if ("percentX".equals(p4[0])) {
             p5[0] = (p2 - f) / f2;
             p5[1] = (p3 - f1) / f3;
          }else {
             p5[1] = (p2 - f) / f2;
             p5[0] = (p3 - f1) / f3;
          }
       }else {
          p4[0] = "percentX";
          p5[0] = (p2 - f) / f2;
          p4[1] = "percentY";
          p5[1] = (p3 - f1) / f3;
       }
       return;
    }
    public void s(RectF p0,RectF p1,float p2,float p3,String[] p4,float[] p5){
       float f = p0.centerX();
       float f1 = p0.centerY();
       float f2 = p1.centerX() - f;
       float f3 = p1.centerY() - f1;
       float f4 = (float)Math.hypot((double)f2, (double)f3);
       if ((double)f4 - 0x3f1a36e2eb1c432d < 0) {
          System.out.println("distance ~ 0");
          p5[0] = 0;
          p5[1] = 0;
          return;
       }else {
          f2 = f2 / f4;
          f3 = f3 / f4;
          f1 = p3 - f1;
          f = p2 - f;
          float f5 = ((f2 * f1) - (f * f3)) / f4;
          f2 = ((f2 * f) + (f3 * f1)) / f4;
          if (p4[0] != null) {
             if ("percentX".equals(p4[0])) {
                p5[0] = f2;
                p5[1] = f5;
             }
          }else {
             p4[0] = "percentX";
             p4[1] = "percentY";
             p5[0] = f2;
             p5[1] = f5;
          }
          return;
       }
    }
    public void t(View p0,RectF p1,RectF p2,float p3,float p4,String[] p5,float[] p6){
       p1.centerX();
       p1.centerY();
       p2.centerX();
       p2.centerY();
       ViewGroup parent = p0.getParent();
       int width = parent.getWidth();
       int height = parent.getHeight();
       if (p5[0] != null) {
          if ("percentX".equals(p5[0])) {
             p6[0] = p3 / (float)width;
             p6[1] = p4 / (float)height;
          }else {
             p6[1] = p3 / (float)width;
             p6[0] = p4 / (float)height;
          }
       }else {
          p5[0] = "percentX";
          p6[0] = p3 / (float)width;
          p5[1] = "percentY";
          p6[1] = p4 / (float)height;
       }
       return;
    }
}
