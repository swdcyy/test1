package com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar;
import android.view.ViewGroup;
import lnc.a1;
import android.content.Context;
import android.os.Handler;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$a;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Math;
import android.view.ViewConfiguration;
import java.lang.Float;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$d;
import android.os.Vibrator;
import lnc.ja;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$f;
import ekd.r0;
import e17.i;
import java.lang.Runnable;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$e;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$b;
import android.view.ViewGroup$LayoutParams;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$c;
import android.view.View$OnLayoutChangeListener;
import android.view.View$MeasureSpec;
import java.lang.IllegalArgumentException;

public class CommentEmojiSelectionBar extends ViewGroup	// class@001890
{
    public final Runnable A;
    public final Handler b;
    public boolean c;
    public int d;
    public float e;
    public float f;
    public float[] g;
    public float[] h;
    public float[] i;
    public float j;
    public float k;
    public CommentEmojiSelectionBar$d l;
    public View m;
    public float n;
    public int o;
    public int p;
    public CommentEmojiSelectionBar$e q;
    public CommentEmojiSelectionBar$f r;
    public int s;
    public int t;
    public int u;
    public final int[] v;
    public boolean w;
    public boolean x;
    public float y;
    public boolean z;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    static {
       CommentEmojiSelectionBar.B = a1.e(60.00f);
       CommentEmojiSelectionBar.C = a1.e(28.00f);
       CommentEmojiSelectionBar.D = a1.e(36.00f);
       CommentEmojiSelectionBar.E = a1.e(10.00f);
       CommentEmojiSelectionBar.F = a1.e(10.00f);
       CommentEmojiSelectionBar.G = a1.e(10.00f);
       CommentEmojiSelectionBar.H = a1.e(0x3f800000);
       CommentEmojiSelectionBar.I = 0x7f081ddc;
    }
    public void CommentEmojiSelectionBar(Context p0){
       super(p0);
       this.b = new Handler();
       this.o = 56;
       this.p = 46;
       this.u = -1;
       int[] ointArray = new int[2];
       this.v = ointArray;
       this.y = 0xbf800000;
       this.z = false;
       this.A = new CommentEmojiSelectionBar$a(this);
       this.f();
    }
    public void CommentEmojiSelectionBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Handler();
       this.o = 56;
       this.p = 46;
       this.u = -1;
       int[] ointArray = new int[2];
       this.v = ointArray;
       this.y = 0xbf800000;
       this.z = false;
       this.A = new CommentEmojiSelectionBar$a(this);
       this.f();
    }
    public void CommentEmojiSelectionBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Handler();
       this.o = 56;
       this.p = 46;
       this.u = -1;
       int[] ointArray = new int[2];
       this.v = ointArray;
       this.y = 0xbf800000;
       this.z = false;
       this.A = new CommentEmojiSelectionBar$a(this);
       this.f();
    }
    public View a(int p0){
       if (PatchProxy.isSupport(CommentEmojiSelectionBar.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CommentEmojiSelectionBar.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0++;
       return this.getChildAt(p0);
    }
    public int b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentEmojiSelectionBar.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       while (true) {
          if (i >= this.getFixedChildCount()) {
             return -1;
          }
          if (this.a(i) == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public void c(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentEmojiSelectionBar.class, "8")) {
          return;
       }
       if (this.w != null) {
          this.getLocationOnScreen(this.v);
          this.c = true;
          this.e(p0);
       }
       return;
    }
    public void d(boolean p0){
       CommentEmojiSelectionBar$d obj;
       boolean i;
       float f = this;
       if (PatchProxy.isSupport(CommentEmojiSelectionBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), f, CommentEmojiSelectionBar.class, "10")) {
          return;
       }
       if (f.x != null) {
          f.y = f.e;
          f.x = false;
       }
       CommentEmojiSelectionBar y = f.y;
       if (y >= 0 && Math.abs((f.e - y)) - (float)ViewConfiguration.getTouchSlop() <= 0) {
          return;
       }else {
          f.y = 0;
          if (f.u >= null) {
             return;
          }else {
             CommentEmojiSelectionBar e = f.e;
             CommentEmojiSelectionBar f1 = f.f;
             if (PatchProxy.isSupport(CommentEmojiSelectionBar.class)) {
                obj = PatchProxy.applyTwoRefs(Float.valueOf(e), Float.valueOf(f1), f, CommentEmojiSelectionBar.class, "12");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else {
                label_006c :
                   int i1 = 0;
                   while (true) {
                      if (i1 < this.getFixedChildCount()) {
                         View view = f.a(i1);
                         if (PatchProxy.isSupport(CommentEmojiSelectionBar.class)) {
                            Object obj1 = PatchProxy.applyThreeRefs(Float.valueOf(e), Float.valueOf(f1), view, this, CommentEmojiSelectionBar.class, "11");
                            if (obj1 != PatchProxyResult.class) {
                               i = obj1.booleanValue();
                            }else {
                            label_009b :
                               float f2 = (float)CommentEmojiSelectionBar.E / 2.00f;
                               float f3 = (float)view.getLeft() - f2;
                               if (f3 - e <= 0) {
                                  f3 = (float)view.getRight() + f2;
                                  if (f3 - e >= 0 && (f1 >= 0 && f1 - (float)this.getBottom() <= 0)) {
                                     i = true;
                                  }
                               }
                               i = false;
                            }
                         }else {
                            goto label_009b ;
                         }
                         if (i) {
                            i = i1;
                         }else {
                            i1 = i1 + 1;
                         }
                      }else {
                         i = -1;
                      }
                   }
                }
             }else {
                goto label_006c ;
             }
             CommentEmojiSelectionBar c = f.c;
             if (c != null && f.d != i) {
                f.d = i;
                if (!PatchProxy.isSupport(CommentEmojiSelectionBar.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), f, CommentEmojiSelectionBar.class, "13")) {
                   c = f.l;
                   if (c != null) {
                      c.a();
                   }
                   Context context = this.getContext();
                   if (!PatchProxy.applyVoidOneRefs(context, f, CommentEmojiSelectionBar.class, "20")) {
                      Vibrator systemServic = context.getSystemService("vibrator");
                      if (systemServic != null && systemServic.hasVibrator()) {
                         systemServic.vibrate((long)(ja.a + 5));
                      }
                   }
                   CommentEmojiSelectionBar$d uod = new CommentEmojiSelectionBar$d(f, i);
                   f.l = uod;
                   uod.c();
                }
                c = f.r;
                if (c != null) {
                   c.a(f.a(i), i, true);
                }
             }else if(i == -1 || c == null){
                y = f.d;
                if (y >= null) {
                   if (!PatchProxy.isSupport(CommentEmojiSelectionBar.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(y), Boolean.valueOf(p0), f, CommentEmojiSelectionBar.class, "14")) {
                      c = f.l;
                      if (c != null) {
                         c.a();
                      }
                      if (p0) {
                         if (r0.d(this.getContext())) {
                            f.g(y);
                         }else {
                            i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
                            obj = new CommentEmojiSelectionBar$d(f, -1);
                            f.l = obj;
                            obj.c();
                         }
                      }else {
                         obj = new CommentEmojiSelectionBar$d(f, -1);
                         f.l = obj;
                         obj.c();
                      }
                   }
                   f.d = -1;
                   y = f.r;
                   if (y != null) {
                      y.a(null, -1, false);
                   }
                }
             }
             return;
          }
       }
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentEmojiSelectionBar.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.u >= null) {
          return false;
       }
       this.e(p0);
       super.dispatchTouchEvent(p0);
       return true;
    }
    public final void e(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentEmojiSelectionBar.class, "9")) {
          return;
       }
       int i = p0.getAction() & 0x00ff;
       boolean b = true;
       if (i) {
          if (i != b) {
             if (i != 2) {
                if (i == 3 || (i == 5 || i == 6)) {
                }
             }else {
                this.e = p0.getRawX() - (float)this.v[0];
                this.f = p0.getRawY() - (float)this.v[b];
                this.d(false);
             }
          }else {
          }
       }else {
          this.b.removeCallbacks(this.A);
          this.getLocationOnScreen(this.v);
          this.b.postDelayed(this.A, (long)ViewConfiguration.getLongPressTimeout());
          this.e = p0.getRawX() - (float)this.v[0];
          this.f = p0.getRawY() - (float)this.v[b];
          this.d(false);
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, CommentEmojiSelectionBar.class, "1")) {
          return;
       }
       View view = new View(this.getContext());
       this.m = view;
       this.addView(view);
       this.m.setBackgroundResource(CommentEmojiSelectionBar.I);
       return;
    }
    public void g(int p0){
       View view;
       if (PatchProxy.isSupport(CommentEmojiSelectionBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommentEmojiSelectionBar.class, "15")) {
          return;
       }
       this.u = p0;
       if (this.z != null) {
          view = this.a(p0);
          CommentEmojiSelectionBar tq = this.q;
          if (tq != null) {
             tq.a(view, this.b(view));
          }
          return;
       }else {
          CommentEmojiSelectionBar$b uob = new CommentEmojiSelectionBar$b(this, p0);
          view = this.a(p0);
          if (view.getLayoutParams().height != view.getHeight()) {
             view.requestLayout();
             view.addOnLayoutChangeListener(new CommentEmojiSelectionBar$c(this, uob));
          }else {
             view.post(uob);
          }
          return;
       }
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (!p1) {
          return 0;
       }
       return (p0 - p1);
    }
    public int getFixedChildCount(){
       Object obj = PatchProxy.apply(null, this, CommentEmojiSelectionBar.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.getChildCount() - 1);
    }
    public void h(int p0,int p1){
       if (PatchProxy.isSupport(CommentEmojiSelectionBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CommentEmojiSelectionBar.class, "19")) {
          return;
       }
       this.s = p0;
       this.t = p1;
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, CommentEmojiSelectionBar.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       this.buildLayer();
       this.setChildrenDrawingOrderEnabled(true);
       int d = CommentEmojiSelectionBar.D;
       int e = CommentEmojiSelectionBar.E;
       int g = CommentEmojiSelectionBar.G;
       if (this.getLayoutParams().width < (((this.getFixedChildCount() * d) + ((this.getFixedChildCount() - true) * e)) + (g * 2))) {
          this.getLayoutParams().width = ((this.getFixedChildCount() * d) + ((this.getFixedChildCount() - true) * e)) + (g * 2);
       }
       int f = CommentEmojiSelectionBar.F;
       g = CommentEmojiSelectionBar.B;
       if (this.getLayoutParams().height < (f + g)) {
          this.getLayoutParams().height = g + f;
       }
       this.o = d + (f * 2);
       this.p = CommentEmojiSelectionBar.C + ((f - CommentEmojiSelectionBar.H) * 2);
       this.m.getLayoutParams().width = this.getLayoutParams().width;
       this.m.getLayoutParams().height = this.o;
       this.setPadding(0, 0, 0, 0);
       this.w = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CommentEmojiSelectionBar.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       CommentEmojiSelectionBar tl = this.l;
       if (tl != null) {
          tl.a();
          this.l = null;
       }
       this.w = false;
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(CommentEmojiSelectionBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CommentEmojiSelectionBar.class, "6")) {
             return;
          }
       }
       CommentEmojiSelectionBar tm = this.m;
       p4 = p4 - p2;
       tm.layout(i, (p4 - tm.getMeasuredHeight()), (p3 - p1), p4);
       float f = (float)CommentEmojiSelectionBar.G;
       for (; i < this.getFixedChildCount(); i = i + 1) {
          View view = this.a(i);
          p3 = p4 - view.getMeasuredHeight();
          int f1 = CommentEmojiSelectionBar.F;
          p3 = p3 - f1;
          p3 = p3 + (int)this.j;
          float f2 = (float)view.getMeasuredWidth() + f;
          f1 = p4 - f1;
          f1 = f1 + (int)this.j;
          view.layout((int)f, p3, (int)f2, f1);
          float f3 = this.h[i] + (float)CommentEmojiSelectionBar.E;
          f = f + f3;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CommentEmojiSelectionBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CommentEmojiSelectionBar.class, "3")) {
          return;
       }
       int i = 0x40000000;
       this.m.measure(View$MeasureSpec.makeMeasureSpec(this.m.getLayoutParams().width, i), View$MeasureSpec.makeMeasureSpec(this.m.getLayoutParams().height, i));
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 < this.getFixedChildCount()) {
             View view = this.a(i2);
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams.width == layoutParams.height) {
                view.measure(View$MeasureSpec.makeMeasureSpec(view.getLayoutParams().width, i), View$MeasureSpec.makeMeasureSpec(view.getLayoutParams().width, i));
                i2 = i2 + 1;
             }else {
                throw new IllegalArgumentException("child height != width !");
             }
          }else {
             this.setMeasuredDimension(ViewGroup.getDefaultSize(this.getSuggestedMinimumWidth(), p0), ViewGroup.getDefaultSize(this.getSuggestedMinimumHeight(), p1));
             if (this.h == null) {
                float[] uofloatArray = new float[this.getFixedChildCount()];
                this.h = uofloatArray;
                for (; i1 < this.getFixedChildCount(); i1 = i1 + 1) {
                   uofloatArray[i1] = (float)this.a(i1).getMeasuredWidth();
                }
             }
             break ;
          }
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CommentEmojiSelectionBar.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CommentEmojiSelectionBar.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (p2 != p0) {
          this.x = true;
       }
       return;
    }
    public void setDisableSelectedAnim(boolean p0){
       this.z = p0;
    }
    public void setFlyAnimationListener(CommentEmojiSelectionBar$e p0){
       this.q = p0;
    }
    public void setOnLongPressItemListener(CommentEmojiSelectionBar$f p0){
       this.r = p0;
    }
}
