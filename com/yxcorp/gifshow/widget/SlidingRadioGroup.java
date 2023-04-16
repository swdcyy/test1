package com.yxcorp.gifshow.widget.SlidingRadioGroup;
import com.kwai.library.widget.button.KwaiRadioGroup;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tyc.v4;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.widget.RadioButton;
import java.lang.System;
import ekd.k1;
import com.yxcorp.gifshow.widget.SlidingRadioGroup$a;

public class SlidingRadioGroup extends KwaiRadioGroup	// class@0018c6
{
    public RectF c;
    public SlidingRadioGroup$a d;
    public boolean e;
    public int f;
    public long g;
    public static final int h;

    public void SlidingRadioGroup(Context p0){
       super(p0);
       this.c = new RectF();
       this.e = false;
       this.f = -1;
       this.g = 0;
       this.a();
    }
    public void SlidingRadioGroup(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new RectF();
       this.e = false;
       this.f = -1;
       this.g = 0;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SlidingRadioGroup.class, "1")) {
          return;
       }
       this.setOnCheckedChangeListener(new v4(this));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       SlidingRadioGroup obj = PatchProxy.applyOneRefs(p0, this, SlidingRadioGroup.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e == null) {
          return super.onTouchEvent(p0);
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < this.getChildCount()) {
             RadioButton childAt = this.getChildAt(i1);
             if (childAt != null) {
                int[] ointArray = new int[2];
                childAt.getLocationOnScreen(ointArray);
                int i2 = ointArray[i] + childAt.getWidth();
                int i3 = ointArray[1] + childAt.getHeight();
                this.c.set((float)ointArray[i], (float)ointArray[1], (float)i2, (float)i3);
                if (this.c.contains(p0.getRawX(), p0.getRawY())) {
                   if (!p0.getActionMasked()) {
                      this.f = childAt.getId();
                      this.g = System.currentTimeMillis();
                   }
                   if (childAt.getId() == this.f) {
                      if (k1.t(this.g) - 300 >= 0) {
                         this.check(childAt.getId());
                      }
                   }else {
                      this.check(childAt.getId());
                   }
                   if (p0.getActionMasked() == 1 || p0.getActionMasked() == 3) {
                      this.check(childAt.getId());
                      SlidingRadioGroup td = this.d;
                      if (td != null) {
                         td.a();
                         break ;
                      }
                   }
                   break ;
                }
             }
             i1 = i1 + 1;
          }else if(p0.getActionMasked() == 1 || p0.getActionMasked() == 3){
             obj = this.d;
             if (obj != null) {
                obj.a();
             }
          }
          return super.onTouchEvent(p0);
       }
       return 1;
    }
    public void setEnableSlide(boolean p0){
       if (PatchProxy.isSupport(SlidingRadioGroup.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlidingRadioGroup.class, "2")) {
          return;
       }
       this.e = p0;
       this.setInterceptTouchEvent(p0);
       return;
    }
    public void setOnSlideStatusChangedListener(SlidingRadioGroup$a p0){
       this.d = p0;
    }
}
