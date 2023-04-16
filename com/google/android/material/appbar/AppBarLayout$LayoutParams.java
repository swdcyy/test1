package com.google.android.material.appbar.AppBarLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.animation.Interpolator;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class AppBarLayout$LayoutParams extends LinearLayout$LayoutParams	// class@001612
{
    public int a;
    public Interpolator b;

    public void AppBarLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.a = 1;
    }
    public void AppBarLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       int i = 1;
       this.a = i;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.o);
       this.a = typedArray.getInt(0, 0);
       if (typedArray.hasValue(i)) {
          this.b = AnimationUtils.loadInterpolator(p0, typedArray.getResourceId(i, 0));
       }
       typedArray.recycle();
       return;
    }
    public void AppBarLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 1;
    }
    public void AppBarLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.a = 1;
    }
    public void AppBarLayout$LayoutParams(LinearLayout$LayoutParams p0){
       super(p0);
       this.a = 1;
    }
    public void AppBarLayout$LayoutParams(AppBarLayout$LayoutParams p0){
       super(p0);
       this.a = 1;
       this.a = p0.a;
       this.b = p0.b;
    }
    public int a(){
       return this.a;
    }
    public Interpolator b(){
       return this.b;
    }
    public boolean c(){
       AppBarLayout$LayoutParams ta = this.a;
       boolean b = true;
       if ((ta & 0x01) != b || !(ta & 0x0a)) {
          b = false;
       }
       return b;
    }
    public void d(int p0){
       this.a = p0;
    }
}
