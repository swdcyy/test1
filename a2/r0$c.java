package a2.r0$c;
import a2.r0$e;
import android.view.animation.Interpolator;
import a2.u0;
import p1.b;
import java.lang.Object;
import a2.r0$a;
import java.lang.Math;
import android.view.View;
import a2.r0$b;
import android.view.View$OnApplyWindowInsetsListener;
import a2.r0$c$a;
import a2.r0;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.List;
import a2.u0$b;

public class r0$c extends r0$e	// class@00009f
{

    public void r0$c(int p0,Interpolator p1,long p2){
       super(p0, p1, p2);
    }
    public static int e(u0 p0,u0 p1){
       int i = 1;
       int i1 = 0;
       while (i <= 256) {
          if (!p0.f(i).equals(p1.f(i))) {
             i1 = i1 | i;
          }
          i = i << 1;
       }
       return i1;
    }
    public static r0$a f(u0 p0,u0 p1,int p2){
       b uob = p0.f(p2);
       b uob1 = p1.f(p2);
       return new r0$a(b.b(Math.min(uob.a, uob1.a), Math.min(uob.b, uob1.b), Math.min(uob.c, uob1.c), Math.min(uob.d, uob1.d)), b.b(Math.max(uob.a, uob1.a), Math.max(uob.b, uob1.b), Math.max(uob.c, uob1.c), Math.max(uob.d, uob1.d)));
    }
    public static View$OnApplyWindowInsetsListener g(View p0,r0$b p1){
       return new r0$c$a(p0, p1);
    }
    public static void h(View p0,r0 p1){
       r0$b uob = r0$c.m(p0);
       if (uob != null) {
          uob.b(p1);
          if (!uob.a()) {
             return;
          }
       }
       if (p0 instanceof ViewGroup) {
          for (int i = 0; i < p0.getChildCount(); i = i + 1) {
             r0$c.h(p0.getChildAt(i), p1);
          }
       }
       return;
    }
    public static void i(View p0,r0 p1,WindowInsets p2,boolean p3){
       r0$b uob = r0$c.m(p0);
       int i = 0;
       if (uob != null) {
          uob.a = p2;
          if (!p3) {
             p3 = (!uob.a())? true: false;
          }
       }
       if (p0 instanceof ViewGroup) {
          for (; i < p0.getChildCount(); i = i + 1) {
             r0$c.i(p0.getChildAt(i), p1, p2, p3);
          }
       }
       return;
    }
    public static void j(View p0,u0 p1,List p2){
       r0$b uob = r0$c.m(p0);
       if (uob != null) {
          p1 = uob.c(p1, p2);
          if (!uob.a()) {
             return;
          }
       }
       if (p0 instanceof ViewGroup) {
          for (int i = 0; i < p0.getChildCount(); i = i + 1) {
             r0$c.j(p0.getChildAt(i), p1, p2);
          }
       }
       return;
    }
    public static void k(View p0,r0 p1,r0$a p2){
       r0$b uob = r0$c.m(p0);
       if (uob != null) {
          uob.d(p1, p2);
          if (!uob.a()) {
             return;
          }
       }
       if (p0 instanceof ViewGroup) {
          for (int i = 0; i < p0.getChildCount(); i = i + 1) {
             r0$c.k(p0.getChildAt(i), p1, p2);
          }
       }
       return;
    }
    public static WindowInsets l(View p0,WindowInsets p1){
       if (p0.getTag(0x7f0a3d09) != null) {
          return p1;
       }
       return p0.onApplyWindowInsets(p1);
    }
    public static r0$b m(View p0){
       p0 = p0.getTag(R.id.tag_window_insets_animation_callback);
       r0$c$a b = (p0 instanceof r0$c$a)? p0.b: null;
       return b;
    }
    public static u0 n(u0 p0,u0 p1,float p2,int p3){
       u0$b uob = new u0$b(p0);
       int i = 1;
       while (i <= 256) {
          int i1 = p3 & i;
          if (!i1) {
             uob.b(i, p0.f(i));
          }else {
             b uob1 = p0.f(i);
             b uob2 = p1.f(i);
             int i2 = uob1.a - uob2.a;
             float f = 0x3f800000 - p2;
             float f1 = (float)i2 * f;
             double d = (double)f1 + 0x3fe0000000000000;
             i2 = (int)d;
             int i3 = uob1.b - uob2.b;
             float f2 = (float)i3 * f;
             d = (double)f2 + 0x3fe0000000000000;
             int i4 = uob1.c - uob2.c;
             float f3 = (float)i4 * f;
             double d1 = (double)f3 + 0x3fe0000000000000;
             i4 = (int)d1;
             int i5 = uob1.d - uob2.d;
             float f4 = (float)i5 * f;
             d1 = (double)f4 + 0x3fe0000000000000;
             uob.b(i, u0.n(uob1, i2, (int)d, i4, (int)d1));
          }
          i = i << 1;
       }
       return uob.a();
    }
    public static void o(View p0,r0$b p1){
       Object tag = p0.getTag(R.id.tag_on_apply_window_listener);
       if (p1 == null) {
          p0.setTag(R.id.tag_window_insets_animation_callback, null);
          if (tag == null) {
             p0.setOnApplyWindowInsetsListener(null);
          }
       }else {
          View$OnApplyWindowInsetsListener onApplyWindo = r0$c.g(p0, p1);
          p0.setTag(R.id.tag_window_insets_animation_callback, onApplyWindo);
          if (tag == null) {
             p0.setOnApplyWindowInsetsListener(onApplyWindo);
          }
       }
       return;
    }
}
