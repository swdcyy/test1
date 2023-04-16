package com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.util.AttributeSet;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h3.a;
import vk9.f;
import java.util.Objects;
import java.lang.Integer;
import java.util.List;
import vk9.c;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager$e;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager$a;
import androidx.viewpager.widget.ViewPager$i;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import xtd.a;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager$b;
import ytd.b;
import java.lang.Float;
import java.lang.Math;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager$c;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager$d;
import com.yxcorp.gifshow.comment.image.viewpager.a;
import android.animation.ValueAnimator;
import vk9.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import vk9.e;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager$f;

public class PreviewViewPager extends ViewPager	// class@0010db
{
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public PreviewViewPager$d j;
    public PreviewViewPager$c k;
    public PreviewViewPager$f l;
    public List m;
    public static final int n;

    public void PreviewViewPager(Context p0){
       super(p0);
       this.b = true;
       this.c = true;
       this.d = true;
       this.g = 10;
       this.m = Lists.b();
       this.j();
    }
    public void PreviewViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = true;
       this.c = true;
       this.d = true;
       this.g = 10;
       this.m = Lists.b();
       this.j();
    }
    public int getCurrentIndex(){
       return this.i;
    }
    public View getCurrentItemView(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, PreviewViewPager.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.getAdapter() instanceof f) {
          obj = this.getAdapter();
          PreviewViewPager ti = this.i;
          Objects.requireNonNull(obj);
          f uof = f.class;
          if (PatchProxy.isSupport(uof)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(ti), obj, uof, "8");
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }
          }
          if (ti < obj.e.size()) {
             objArray = obj.e.get(ti).getView();
          }
       }
       return objArray;
    }
    public void i(PreviewViewPager$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreviewViewPager.class, "1")) {
          return;
       }
       this.m.add(p0);
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, PreviewViewPager.class, "3")) {
          return;
       }
       this.addOnPageChangeListener(new PreviewViewPager$a(this));
       this.h = n.u(this.getContext());
       a uoa = new a(new PreviewViewPager$b(this, this));
       return;
    }
    public final void k(float p0,float p1){
       if (PatchProxy.isSupport(PreviewViewPager.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, PreviewViewPager.class, "7")) {
          return;
       }
       View currentItemV = this.getCurrentItemView();
       if (currentItemV == null) {
          return;
       }
       p0 = p0 - this.e;
       p1 = p1 - this.f;
       currentItemV.setTranslationX(p0);
       currentItemV.setTranslationY(p1);
       float f = Math.abs(p1);
       if (f - 0x3dcccccd >= 0) {
          PreviewViewPager th = this.h;
          if (th > null) {
             float f1 = 0x3f800000 - (f / (float)th);
             if (Float.isNaN(f1) || (f1 - -8388609 > 0 && f1 - Float.MAX_VALUE < 0)) {
                float f2 = Math.min(0x3f800000, Math.max(0, f1));
                currentItemV.setScaleX(f2);
                currentItemV.setScaleY(f2);
                if (PatchProxy.isSupport(PreviewViewPager.class) && (!PatchProxy.applyVoidFourRefs(currentItemV, Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(f2), this, PreviewViewPager.class, "8") && !q.f(this.m))) {
                   Iterator iterator = this.m.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a(currentItemV, p0, p1, f2, f2);
                   }
                }
                p0 = Math.min(0x3f800000, Math.max(0, (0x3f800000 - (f / ((float)this.h * 0x3fc00000)))));
                PreviewViewPager tk = this.k;
                if (tk != null) {
                   tk.a(p0);
                }
             }
          }
       }
       return;
    }
    public void l(PreviewViewPager$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreviewViewPager.class, "2")) {
          return;
       }
       if (this.m.isEmpty()) {
          return;
       }
       this.m.remove(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int action;
       Object obj = PatchProxy.applyOneRefs(p0, this, PreviewViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null) {
          PreviewViewPager previewViewP = 2;
          if (p0.getPointerCount() < previewViewP) {
             action = p0.getAction();
             if (!action) {
                this.e = p0.getRawX();
                this.f = p0.getRawY();
             }else if(action == previewViewP){
                action = (int)Math.abs((p0.getRawX() - this.e));
                int i = (int)(p0.getRawY() - this.f);
                if (this.c != null && (i > 0 && Math.abs(i) > action)) {
                   return true;
                }
             }
          }
       }
       action = false;
       try{
          action = super.onInterceptTouchEvent(p0);
       }catch(java.lang.Exception e4){
          "onInterceptTouchEvent: "+e4;
       }
       return action;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float[] uofloatArray;
       ValueAnimator valueAnimato;
       PreviewViewPager obj = PatchProxy.applyOneRefs(p0, this, PreviewViewPager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          int i = 2;
          float f = 0.00f;
          int i1 = 1;
          if (actionMasked != i1) {
             if (actionMasked != i) {
                if (actionMasked == 3) {
                }
             }else {
                actionMasked = (int)(p0.getRawY() - this.f);
                if (actionMasked < 0 && this.g != f) {
                   return super.onTouchEvent(p0);
                }else {
                   PreviewViewPager tg = this.g;
                   if (tg != i1 && (actionMasked > 0 || tg == f)) {
                      this.d = false;
                      this.g = f;
                      this.k(p0.getRawX(), p0.getRawY());
                      return i1;
                   }
                }
             }
          }else if(this.g != f){
             return super.onTouchEvent(p0);
          }else {
             float rawX = p0.getRawX();
             f = p0.getRawY();
             int i2 = 12;
             if ((f - this.f) - ((float)this.h / 5.00f) >= 0) {
                this.g = i2;
                obj = this.j;
                if (obj != null) {
                   obj.onDismiss();
                }
             }else {
                this.g = i2;
                if (!PatchProxy.isSupport(PreviewViewPager.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(rawX), Float.valueOf(f), this, PreviewViewPager.class, "6")) {
                   View currentItemV = this.getCurrentItemView();
                   if (currentItemV != null) {
                      a uoa = new a(this, currentItemV);
                      if (Math.abs((f - this.f)) - 0x3dcccccd > 0) {
                         uofloatArray = new float[i];
                         uofloatArray[0] = f;
                         uofloatArray[i1] = this.f;
                         valueAnimato = ValueAnimator.ofFloat(uofloatArray).setDuration(300);
                         valueAnimato.addUpdateListener(new d(this, f, rawX));
                         valueAnimato.addListener(uoa);
                         valueAnimato.start();
                      }else if(Math.abs((rawX - this.e)) - 0x3dcccccd > 0){
                         uofloatArray = new float[i];
                         uofloatArray[0] = rawX;
                         uofloatArray[i1] = this.e;
                         valueAnimato = ValueAnimator.ofFloat(uofloatArray).setDuration(300);
                         valueAnimato.addUpdateListener(new e(this, rawX, f));
                         valueAnimato.addListener(uoa);
                         valueAnimato.start();
                      }
                   }
                }
             }
          }
       }else {
          this.e = p0.getRawX();
          this.f = p0.getRawY();
       }
       try{
       label_010e :
          return super.onTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e0){
          return v1;
       }
    }
    public void setBackgroundChangeListener(PreviewViewPager$c p0){
       this.k = p0;
    }
    public void setEnableDragAnimate(boolean p0){
       this.b = p0;
    }
    public void setEnableHorizontalIntercept(boolean p0){
       this.d = p0;
    }
    public void setEnableVerticalIntercept(boolean p0){
       this.c = p0;
    }
    public void setOnDismissListener(PreviewViewPager$d p0){
       this.j = p0;
    }
    public void setOnMoveResetListener(PreviewViewPager$f p0){
       this.l = p0;
    }
}
