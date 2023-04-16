package com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class CollapsingToolbarLayout$LayoutParams extends FrameLayout$LayoutParams	// class@001618
{
    public int a;
    public float b;

    public void CollapsingToolbarLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.a = 0;
       this.b = 0x3f000000;
    }
    public void CollapsingToolbarLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       this.b = 0x3f000000;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Q);
       this.a = typedArray.getInt(0, 0);
       this.a(typedArray.getFloat(1, 0x3f000000));
       typedArray.recycle();
    }
    public void CollapsingToolbarLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 0;
       this.b = 0x3f000000;
    }
    public void CollapsingToolbarLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.a = 0;
       this.b = 0x3f000000;
    }
    public void CollapsingToolbarLayout$LayoutParams(FrameLayout$LayoutParams p0){
       super(p0);
       this.a = 0;
       this.b = 0x3f000000;
    }
    public void a(float p0){
       this.b = p0;
    }
}
