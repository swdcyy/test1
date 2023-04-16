package com.yxcorp.gifshow.lelink.floatbutton.a;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView$a;
import java.lang.Math;
import java.lang.Integer;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import yza.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class a implements View$OnTouchListener	// class@001a43
{
    public final FloatWindowView b;

    public void a(FloatWindowView p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       a tb;
       FloatWindowView e;
       int i1;
       FloatWindowView p;
       FloatWindowView g;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int action = p1.getAction();
       if (action) {
          Object[] objArray = null;
          float f = 0.00f;
          if (action != 1) {
             if (action == f) {
                action.i = p1.getRawX();
                tb = this.b;
                action.j = p1.getRawY() - (float)tb.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(objArray, tb, FloatWindowView.class, "5")) {
                   action = (int)(tb.i - tb.m);
                   int i = (int)(tb.j - tb.n);
                   e = tb.e;
                   i1 = e - tb.r;
                   if (action > i1) {
                      i1 = (tb.c - tb.g.width) - e;
                      if (action < i1) {
                      label_0068 :
                         e = tb.f;
                         i1 = e - tb.b;
                         if (i > i1) {
                            i1 = (tb.d - tb.g.height) - e;
                            if (i < i1) {
                            label_007d :
                               e = tb.g;
                               if (e.x != action || e.y != i) {
                                  e.x = action;
                                  e.y = i;
                                  tb.h.updateViewLayout(tb, e);
                                  p = tb.p;
                                  if (p != null) {
                                     g = tb.g;
                                     p.a(g.x, g.y);
                                  }
                               }
                            }
                         }
                         i = i1;
                         goto label_007d ;
                      }
                   }
                   action = i1;
                   goto label_0068 ;
                }
             }
          }else {
             a tb1 = this.b;
             g = 0x40a00000;
             if (Math.abs((tb1.k - tb1.i)) - g < 0) {
                tb1 = this.b;
                if (Math.abs((tb1.l - tb1.j)) - g < 0) {
                   p = this.b.p;
                   if (p != null) {
                      p.onClick();
                   }
                }
             }
             tb1 = this.b;
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoid(objArray, tb1, FloatWindowView.class, "6")) {
                g = tb1.g;
                WindowManager$LayoutParams x = g.x;
                WindowManager$LayoutParams width = g.width;
                FloatWindowView r = tb1.r;
                FloatWindowView c = tb1.c;
                i1 = ((((double)x + ((double)width / 2.00f)) + (double)r) - ((double)c / 2.00f) <= 0)? tb1.e - r: (c - width) - tb1.e;
                if (i1 != x) {
                   e = tb1.p;
                   if (e != null) {
                      e.a(i1, g.y);
                   }
                   WindowManager$LayoutParams x1 = tb1.g.x;
                   if (!PatchProxy.isSupport(FloatWindowView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(x1), Integer.valueOf(i1), tb1, FloatWindowView.class, "7")) {
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      int[] ointArray = new int[f];
                      ointArray[0] = x1;
                      ointArray[1] = i1;
                      ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
                      valueAnimato.addUpdateListener(new g(tb1));
                      valueAnimato.setDuration(300);
                      valueAnimato.start();
                   }
                }
             }
          }
       }else {
          action.m = p1.getX();
          action.n = p1.getY();
          action.k = p1.getRawX();
          tb = this.b;
          action.l = p1.getRawY() - (float)tb.b;
          tb.i = p1.getRawX();
          action.j = p1.getRawY() - (float)this.b.b;
       }
    label_0185 :
       return true;
    }
}
