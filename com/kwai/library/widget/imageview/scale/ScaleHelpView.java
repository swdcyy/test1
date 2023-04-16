package com.kwai.library.widget.imageview.scale.ScaleHelpView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.view.MotionEvent;
import java.lang.Math;
import android.graphics.PointF;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import android.view.GestureDetector;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.graphics.Bitmap;
import java.util.Collection;
import ekd.q;
import android.app.Activity;
import android.view.Window;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.SystemUtil;
import java.lang.String;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import wz6.b;
import android.animation.Animator$AnimatorListener;

public class ScaleHelpView extends AppCompatImageView	// class@000954
{
    public boolean d;
    public ImageView e;
    public FrameLayout f;
    public ScaleHelpView$a g;
    public PointF h;
    public PointF i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public final List o;
    public boolean p;

    public void ScaleHelpView(Context p0){
       super(p0, null, 0);
    }
    public void ScaleHelpView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ScaleHelpView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = true;
       this.o = new ArrayList();
    }
    public static float i(float p0){
       float f = -340282346638528860000000000000000000000.00f;
       if (p0 - f >= 0 && p0 - Float.MAX_VALUE <= 0) {
          return p0;
       }
       if (p0 - f < 0 || !p0 - 0xff800000) {
          return f;
       }
       if (p0 - Float.MAX_VALUE > 0 || !p0 - Float.POSITIVE_INFINITY) {
          return Float.MAX_VALUE;
       }
       return 0;
    }
    public final float a(MotionEvent p0){
       return ScaleHelpView.i((float)Math.sqrt((double)(((p0.getX(1) - p0.getX(0)) * (p0.getX(1) - p0.getX(0))) + ((p0.getY(1) - p0.getY(0)) * (p0.getY(1) - p0.getY(0))))));
    }
    public void c(boolean p0){
       this.p = p0;
    }
    public final PointF d(MotionEvent p0){
       return new PointF(((p0.getX(1) + p0.getX(0)) / 2.00f), ((p0.getY(1) + p0.getY(0)) / 2.00f));
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       if (!this.isEnabled()) {
          return super.dispatchTouchEvent(p0);
       }
       boolean b = true;
       if (this.d != null) {
          this.getParent().requestDisallowInterceptTouchEvent(b);
       }
       Iterator iterator = this.o.iterator();
       int i = 0;
    label_001e :
       int i1 = 0;
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().onTouchEvent(p0) || i1) {
                i1 = 1;
             }else {
                goto label_001e ;
             }
          }else if(i1 || super.dispatchTouchEvent(p0)){
             b = false;
             break ;
          }
          break ;
       }
       return b;
    }
    public void e(GestureDetector p0){
       if (p0 != null && !this.o.contains(p0)) {
          this.o.add(p0);
       }
       return;
    }
    public void f(MotionEvent p0){
       ScaleHelpView tg = this.g;
       if (tg != null) {
          tg.d(p0);
       }
       if (this.e.getParent() != null) {
          this.f.removeView(this.e);
       }
       if (this.f.getParent() != null) {
          this.f.getParent().removeView(this.f);
       }
       return;
    }
    public final long getDuration(){
       long l = (long)((Math.sqrt((Math.pow((double)(this.i.x - this.h.x), 2.00f) + Math.pow((double)(this.i.y - this.h.y), 2.00f))) / 0x408f400000000000) * 300.00f);
       long l1 = (long)((this.e.getScaleY() / 5.00f) * 300.00f);
       if (l - l1 > 0) {
       }else {
          l = l1;
       }
       if (l - 300 >= 0) {
          l = 300;
       }
       return l;
    }
    public View getParentView(){
       return this.f;
    }
    public View getScaleView(){
       return this.e;
    }
    public void j(GestureDetector p0){
       this.o.remove(p0);
    }
    public void k(Bitmap p0){
       if (this.d != null) {
          ScaleHelpView te = this.e;
          if (te != null) {
             te.setImageBitmap(p0);
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       ScaleHelpView tg;
       Window window;
       float f;
       ViewParent viewParent;
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       if (this.n == null) {
          if (super.onTouchEvent(p0) || !q.f(this.o)) {
             b = true;
          }
          return b;
       }else {
          int actionMasked = p0.getActionMasked();
          int i = 4;
          int i1 = 5;
          int i2 = 3;
          int i3 = 2;
          if (actionMasked != 1) {
             if (actionMasked != i3) {
                if (actionMasked != i2) {
                   if (actionMasked != i1) {
                      if (actionMasked == 6) {
                      label_01f8 :
                         if (this.d != null) {
                            if (!SystemUtil.a(17)) {
                               this.f(p0);
                            }else {
                               float[] uofloatArray = new float[true];
                               uofloatArray[b] = this.l;
                               float[] uofloatArray1 = new float[true];
                               uofloatArray1[b] = this.m;
                               float[] uofloatArray2 = new float[true];
                               uofloatArray2[b] = 0x3f800000;
                               float[] uofloatArray3 = new float[true];
                               uofloatArray3[b] = 0x3f800000;
                               int[] ointArray = new int[true];
                               ointArray[b] = b;
                               AnimatorSet uAnimatorSet = new AnimatorSet();
                               uAnimatorSet.setDuration(this.getDuration());
                               Animator[] uAnimatorArr = new Animator[i1];
                               uAnimatorArr[b] = ObjectAnimator.ofFloat(this.e, "translationX", uofloatArray);
                               uAnimatorArr[1] = ObjectAnimator.ofFloat(this.e, "translationY", uofloatArray1);
                               uAnimatorArr[i3] = ObjectAnimator.ofFloat(this.e, "scaleX", uofloatArray2);
                               uAnimatorArr[i2] = ObjectAnimator.ofFloat(this.e, "scaleY", uofloatArray3);
                               uAnimatorArr[i] = ObjectAnimator.ofInt(this.f, "backgroundColor", ointArray);
                               uAnimatorSet.playTogether(uAnimatorArr);
                               uAnimatorSet.addListener(new b(this, p0));
                               uAnimatorSet.start();
                            }
                            this.d = b;
                         }
                      }
                   }else if(this.d == null && this.g != null){
                      if (this.getContext() instanceof Activity) {
                         window = this.getContext().getWindow();
                      }else if(this.getContext() instanceof ContextWrapper && this.getContext().getBaseContext() instanceof Activity){
                         window = this.getContext().getBaseContext().getWindow();
                      }else {
                      label_013b :
                         viewParent = null;
                      label_013c :
                         if (viewParent) {
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.g.c(p0);
                            this.d = true;
                         }
                      }
                      this.h = this.d(p0);
                      this.i = this.d(p0);
                      f = this.a(p0);
                      this.j = f;
                      this.k = f;
                      Rect rect = new Rect();
                      window.getDecorView().getWindowVisibleDisplayFrame(rect);
                      int[] ointArray1 = new int[i];
                      this.g.a(ointArray1);
                      this.l = (float)(ointArray1[b] - rect.left);
                      this.m = (float)(ointArray1[1] - rect.top);
                      if (this.f == null) {
                         this.f = new FrameLayout(this.getContext());
                      }
                      if (this.e == null) {
                         this.e = new ImageView(this.getContext());
                      }
                      this.e.setImageBitmap(this.g.getBitmap());
                      this.e.setTranslationX(this.l);
                      this.e.setTranslationY(this.m);
                      if (this.e.getParent() != null) {
                         goto label_013b ;
                      }else {
                         this.f.addView(this.e, new ViewGroup$LayoutParams(ointArray1[i3], ointArray1[i2]));
                         this.f.setClickable(true);
                         this.f.setBackgroundColor(b);
                         window.addContentView(this.f, new ViewGroup$LayoutParams(-1, -1));
                         tg = this.h;
                         int[] ointArray2 = new int[i3];
                         this.getLocationOnScreen(ointArray2);
                         this.e.getLocationOnScreen(ointArray2);
                         this.e.setPivotX(((tg.x + (float)ointArray2[b]) - (float)ointArray2[b]));
                         this.e.setPivotY(((tg.y + (float)ointArray2[1]) - (float)ointArray2[1]));
                         viewParent = 1;
                         goto label_013c ;
                      }
                   }
                }else {
                   goto label_01f8 ;
                }
             }else if(p0.getPointerCount() == i3 && (this.g != null && this.d != null)){
                tg = this.e;
                PointF pointF = this.d(p0);
                i2 = 0x40400000;
                if (Math.abs((pointF.x - this.i.x)) - i2 >= 0) {
                   tg.setTranslationX(((pointF.x - this.h.x) + this.l));
                   this.i.x = pointF.x;
                }
                if (Math.abs((pointF.y - this.i.y)) - i2 >= 0) {
                   tg.setTranslationY(((pointF.y - this.h.y) + this.m));
                   this.i.y = pointF.y;
                }
                float f1 = this.a(p0);
                if (this.p != null || (f1 - this.j > 0 && Math.abs((f1 - this.k)) - i2 >= 0)) {
                   f = ScaleHelpView.i((f1 / this.j));
                   tg.setScaleX(f);
                   tg.setScaleY(f);
                   this.k = f1;
                   long l = (long)((f / 4.00f) * 0x4f480000) & -16777216;
                   if (l < 0) {
                      l = 0;
                   }else if(l - 0xc8000000 > 0){
                      l = 0xc8000000;
                   }
                   this.f.setBackgroundColor((int)l);
                }
             }
          }else {
             goto label_01f8 ;
          }
       label_0272 :
          tg = this.g;
          if (tg != null) {
             tg.b(p0, this.d);
             return true;
          }else {
             return b;
          }
       }
    }
    public void setAssistListener(ScaleHelpView$a p0){
       this.g = p0;
    }
    public void setScaleEnabled(boolean p0){
       this.n = p0;
    }
}
