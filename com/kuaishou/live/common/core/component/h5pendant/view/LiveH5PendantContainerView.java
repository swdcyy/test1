package com.kuaishou.live.common.core.component.h5pendant.view.LiveH5PendantContainerView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.common.core.component.h5pendant.view.LiveH5PendantContainerView$InitialPosition;
import ym1.a;
import lnc.a1;
import android.view.ViewConfiguration;
import android.animation.ObjectAnimator;
import android.view.View;
import android.util.Property;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import android.app.Activity;
import e3a.a;
import java.util.Objects;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.MotionEvent;
import java.lang.Boolean;
import a2.i0;

public class LiveH5PendantContainerView extends FrameLayout	// class@00133a
{
    public LiveH5PendantContainerView$InitialPosition b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public boolean g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final ObjectAnimator m;
    public View n;
    public ViewTreeObserver o;
    public ViewTreeObserver$OnGlobalLayoutListener p;
    public static final int q;

    public void LiveH5PendantContainerView(Context p0){
       super(p0, null);
    }
    public void LiveH5PendantContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveH5PendantContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = LiveH5PendantContainerView$InitialPosition.RIGHT_BOTTOM;
       this.g = true;
       this.j = true;
       this.k = false;
       this.l = false;
       this.p = new a(this);
       this.d = a1.d(0x7f0707fd);
       this.c = a1.d(0x7f0707fe);
       this.e = a1.d(0x7f0707fc);
       this.f = ViewConfiguration.get(p0).getScaledTouchSlop() * ViewConfiguration.get(p0).getScaledTouchSlop();
       ObjectAnimator objectAnimat = new ObjectAnimator();
       this.m = objectAnimat;
       objectAnimat.setProperty(View.X);
       objectAnimat.setTarget(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveH5PendantContainerView.class, "3")) {
          return;
       }
       LiveH5PendantContainerView tn = this.n;
       if (tn != null) {
          this.setTranslationY((float)tn.getBottom());
       }
       return;
    }
    public final float b(float p0,float p1,float p2){
       if (PatchProxy.isSupport(LiveH5PendantContainerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, LiveH5PendantContainerView.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return Math.max(Math.min(p0, p2), p1);
    }
    public void c(){
       LiveH5PendantContainerView td;
       if (PatchProxy.applyVoid(null, this, LiveH5PendantContainerView.class, "10")) {
          return;
       }
       if (this.m.isRunning()) {
          this.m.cancel();
       }
       int displayWidth = this.getDisplayWidth();
       displayWidth = ((this.getX() + ((float)this.getWidth() / 2.00f)) - (float)(displayWidth / 2) > 0)? displayWidth - this.getWidth(): this.d;
       float[] uofloatArray = new float[]{this.getX(),(float)displayWidth};
       this.m.setFloatValues(uofloatArray);
       this.m.start();
       return;
    }
    public final int getDisplayHeight(){
       Activity obj = PatchProxy.apply(null, this, LiveH5PendantContainerView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.b(this.getContext());
       Objects.requireNonNull(obj);
       return n.j(obj);
    }
    public final int getDisplayWidth(){
       Activity obj = PatchProxy.apply(null, this, LiveH5PendantContainerView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.b(this.getContext());
       Objects.requireNonNull(obj);
       return n.k(obj);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveH5PendantContainerView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       ViewTreeObserver viewTreeObse = this.getViewTreeObserver();
       this.o = viewTreeObse;
       viewTreeObse.addOnGlobalLayoutListener(this.p);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveH5PendantContainerView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       LiveH5PendantContainerView to = this.o;
       if (to != null) {
          to.removeOnGlobalLayoutListener(this.p);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int actionMasked;
       float x;
       float y;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveH5PendantContainerView.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       int i = 3;
       String str = 2;
       float f = 0;
       boolean b1 = true;
       if (this.j != null) {
          obj = PatchProxy.applyOneRefs(p0, this, LiveH5PendantContainerView.class, "8");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             actionMasked = p0.getActionMasked();
             x = p0.getX();
             y = p0.getY();
             if (actionMasked) {
                if (actionMasked != b1) {
                   if (actionMasked != str) {
                      if (actionMasked == i) {
                         this.h = f;
                         this.i = f;
                         this.k = b;
                         if (this.l != null) {
                            this.c();
                         }
                      }
                   }else {
                      actionMasked = (int)(x - this.h);
                      int i1 = (int)(y - this.i);
                      if (((actionMasked * actionMasked) + (i1 * i1)) > this.f) {
                         this.g = b;
                         float f1 = (float)actionMasked;
                         y = (float)i1;
                         if (!PatchProxy.isSupport(LiveH5PendantContainerView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f1), Float.valueOf(y), this, LiveH5PendantContainerView.class, "12")) {
                            this.setTranslationX(this.b((this.getTranslationX() + f1), (float)this.d, (float)(this.getDisplayWidth() - this.getWidth())));
                            this.setTranslationY(this.b((this.getTranslationY() + y), (float)this.c, (float)((this.getDisplayHeight() - this.getHeight()) - this.e)));
                            LiveH5PendantContainerView to = this.o;
                            if (to != null) {
                               to.removeOnGlobalLayoutListener(this.p);
                               this.o = null;
                            }
                         }
                      }
                   }
                }else {
                   this.h = f;
                   this.i = f;
                   this.k = b;
                   if (this.g != null) {
                      this.performClick();
                   }else if(this.l != null){
                      this.c();
                   }
                }
             }else {
                this.requestDisallowInterceptTouchEvent(b1);
                this.h = x;
                this.i = y;
                this.k = b1;
                this.g = b1;
                if (this.m.isRunning()) {
                   this.m.cancel();
                }
             }
          }
          return b1;
       }else {
          obj = PatchProxy.applyOneRefs(p0, this, LiveH5PendantContainerView.class, "9");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             actionMasked = p0.getActionMasked();
             x = p0.getX();
             y = p0.getY();
             if (actionMasked) {
                if (actionMasked != b1) {
                   if (actionMasked != str) {
                      if (actionMasked == i) {
                         this.h = f;
                         this.i = f;
                      }
                   }else if((((int)(x - this.h) * (int)(x - this.h)) + ((int)(y - this.i) * (int)(y - this.i))) > this.f){
                      this.g = b;
                   }
                }else {
                   this.h = f;
                   this.i = f;
                   if (this.g != null) {
                      this.performClick();
                   }
                }
             }else {
                this.requestDisallowInterceptTouchEvent(b1);
                this.h = x;
                this.i = y;
                this.g = b1;
             }
          }
          return b1;
       }
    }
    public void setInitialPositionTopView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveH5PendantContainerView.class, "5")) {
          return;
       }
       this.n = p0;
       if (i0.Y(p0)) {
          this.a();
       }
       return;
    }
    public void setIsDragEnable(boolean p0){
       this.j = p0;
    }
    public void setIsEdgeSuctionEnable(boolean p0){
       this.l = p0;
    }
}
