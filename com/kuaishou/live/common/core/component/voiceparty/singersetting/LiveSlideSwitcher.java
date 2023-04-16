package com.kuaishou.live.common.core.component.voiceparty.singersetting.LiveSlideSwitcher;
import android.view.View$OnClickListener;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ok.n;
import java.util.List;
import android.view.View;
import com.kuaishou.live.common.core.component.voiceparty.singersetting.LiveSlideSwitcher$b;
import uy1.a;
import java.lang.Runnable;
import java.lang.CharSequence;
import f17.c;
import e17.s;
import ekd.m1;
import android.widget.LinearLayout;
import android.view.ViewPropertyAnimator;
import com.kuaishou.live.common.core.component.voiceparty.singersetting.LiveSlideSwitcher$a;
import android.animation.TimeInterpolator;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import a2.q;
import java.lang.Math;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import a2.i0;
import java.util.Iterator;
import android.view.animation.DecelerateInterpolator;

public class LiveSlideSwitcher extends FrameLayout implements View$OnClickListener, d	// class@0017c3
{
    public View b;
    public LinearLayout c;
    public float d;
    public float e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public LiveSlideSwitcher$b j;
    public List k;
    public View l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public String r;

    public void LiveSlideSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = -1;
       this.k = new ArrayList();
       this.o = true;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.j5);
       this.m = typedArray.getResourceId(0, 0);
       typedArray.recycle();
    }
    public void a(int p0){
       if (PatchProxy.isSupport(LiveSlideSwitcher.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSlideSwitcher.class, "5")) {
          return;
       }
       n.j(this.k);
       boolean b = (p0 >= 0 && p0 < this.k.size())? true: false;
       n.b(b);
       this.m = p0;
       this.n = p0;
       this.l = this.k.get(p0);
       this.o = true;
       this.requestLayout();
       return;
    }
    public final void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideSwitcher.class, "14")) {
          return;
       }
       int id = p0.getId();
       if (id != this.n) {
          LiveSlideSwitcher tj = this.j;
          if (tj != null) {
             tj.a(p0, id);
          }
       }
       this.n = id;
       if (!PatchProxy.applyVoid(null, this, LiveSlideSwitcher.class, "16") && this.p > null) {
          this.setEnabled(false);
          this.postDelayed(new a(this), (long)this.p);
       }
       return;
    }
    public void c(boolean p0,String p1){
       this.q = p0;
       this.r = p1;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveSlideSwitcher.class, "17")) {
          return;
       }
       if (this.r != null) {
          s.s(this.getContext(), this.r, 0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideSwitcher.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a39a9);
       this.b = m1.f(p0, 0x7f0a39b1);
       return;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideSwitcher.class, "6")) {
          return;
       }
       if (this.q == null) {
          this.d();
          return;
       }else {
          this.b(p0);
          this.b.animate().x((float)p0.getLeft()).setInterpolator(new LiveSlideSwitcher$a(this)).setDuration(100);
          return;
       }
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveSlideSwitcher.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.g = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
       int i = 0;
       while (i < this.c.getChildCount()) {
          View childAt = this.c.getChildAt(i);
          childAt.setOnClickListener(this);
          this.k.add(childAt);
          LiveSlideSwitcher tm = this.m;
          if (childAt.getId() == tm) {
             this.l = childAt;
             this.n = tm;
          }
          i = i + 1;
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       LiveSlideSwitcher obj = PatchProxy.applyOneRefs(p0, this, LiveSlideSwitcher.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       int actionMasked = p0.getActionMasked();
       boolean b1 = true;
       if (actionMasked) {
          if (actionMasked != b1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
             }else {
                obj = this.f;
                if (obj == -1) {
                   return b;
                }else {
                   actionMasked = q.a(p0, obj);
                   if (actionMasked < 0) {
                      return b;
                   }else if(this.h == null){
                      return b;
                   }else if(Math.abs((q.f(p0, actionMasked) - this.d)) - (float)this.g > 0){
                      return b1;
                   }
                }
             }
          }else {
          }
       }else {
          this.d = p0.getX();
          this.e = this.b.getX();
          float f = (float)a1.e(3.00f);
          if (this.d - (this.b.getX() + f) <= 0 || this.d - ((this.b.getX() + (float)this.b.getWidth()) - f) >= 0) {
             b1 = false;
          }
          this.h = b1;
          this.f = q.e(p0, b);
       }
    label_0094 :
       return super.onInterceptTouchEvent(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveSlideSwitcher.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveSlideSwitcher.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.o != null) {
          LiveSlideSwitcher tl = this.l;
          if (tl != null) {
             this.b.setTranslationX((float)tl.getLeft());
             this.o = false;
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveSlideSwitcher.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveSlideSwitcher.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = (!this.k.size())? 1: this.k.size();
       this.b.measure(View$MeasureSpec.makeMeasureSpec((this.getMeasuredWidth() / p0), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, LiveSlideSwitcher.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       if (this.q == null) {
          this.d();
          return b;
       }else {
          int i = q.c(p0);
          boolean b1 = true;
          if (i != b1) {
             if (i != 2) {
                if (i == 3) {
                label_0057 :
                   obj = null;
                   if (!PatchProxy.applyVoid(obj, this, LiveSlideSwitcher.class, "9")) {
                      f = 0x4f000000;
                      Iterator iterator = this.k.iterator();
                      while (iterator.hasNext()) {
                         View view = iterator.next();
                         int i1 = view.getWidth() / 2;
                         float f1 = view.getX() + (float)i1;
                         int i2 = this.b.getWidth() / 2;
                         float f2 = this.b.getX() + (float)i2;
                         f1 = f1 - f2;
                         if (Math.abs(f1) - Math.abs(f) < 0) {
                            View view1 = view;
                            f = f1;
                         }
                      }
                      this.b(obj);
                      this.b.animate().x((float)obj.getLeft()).setInterpolator(new DecelerateInterpolator()).setDuration(60);
                   }
                   this.f = -1;
                   return b;
                }
             }else {
                f = (p0.getX() - this.d) + this.e;
                float f3 = (float)this.b.getWidth() + f;
                if (f >= 0 && f3 - (float)this.getWidth() < 0) {
                   i0.R0(this.b, f);
                }
             }
             return b1;
          }else {
             goto label_0057 ;
          }
       }
    }
    public void setIndicatorBackground(int p0){
       if (PatchProxy.isSupport(LiveSlideSwitcher.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSlideSwitcher.class, "15")) {
          return;
       }
       this.b.setBackgroundResource(p0);
       return;
    }
    public void setMinSwitchInterval(int p0){
       this.p = p0;
    }
    public void setOnSlideSwitchListener(LiveSlideSwitcher$b p0){
       this.j = p0;
    }
}
