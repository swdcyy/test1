package com.kwai.library.slide.base.widget.SlidePlayConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kwai.library.slide.base.widget.SlidePlayConstraintLayout$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import bz6.c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.view.View$MeasureSpec;

public class SlidePlayConstraintLayout extends ConstraintLayout	// class@0008ee
{
    public static final SlidePlayConstraintLayout$a B;

    static {
       SlidePlayConstraintLayout.B = new SlidePlayConstraintLayout$a(null);
    }
    public void SlidePlayConstraintLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void SlidePlayConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void SlidePlayConstraintLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void SlidePlayConstraintLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void L(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayConstraintLayout.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       return;
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayConstraintLayout.class, "3")) {
          return;
       }
       c a = c.a;
       ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): null;
       a.a(this, layoutParams);
       super.addView(p0);
       return;
    }
    public void addView(View p0,int p1){
       if (PatchProxy.isSupport(SlidePlayConstraintLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SlidePlayConstraintLayout.class, "4")) {
          return;
       }
       c a = c.a;
       ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): null;
       a.a(this, layoutParams);
       super.addView(p0, p1);
       return;
    }
    public void addView(View p0,int p1,int p2){
       if (PatchProxy.isSupport(SlidePlayConstraintLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SlidePlayConstraintLayout.class, "5")) {
          return;
       }
       c a = c.a;
       ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): null;
       a.a(this, layoutParams);
       super.addView(p0, p1, p2);
       return;
    }
    public void addView(View p0,ViewGroup$LayoutParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayConstraintLayout.class, "6")) {
          return;
       }
       c.a.a(this, p1);
       super.addView(p0, p1);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SlidePlayConstraintLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SlidePlayConstraintLayout.class, "2")) {
          return;
       }
       this.L("onMeasure: "+"w:"+View$MeasureSpec.toString(p0)+" h:"+View$MeasureSpec.toString(p1));
       super.onMeasure(p0, p1);
       this.L("measured: "+"w:"+this.getMeasuredWidth()+" h:"+this.getMeasuredHeight());
       return;
    }
}
