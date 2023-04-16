package com.kwai.library.widget.viewpager.VerticalViewPager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.content.res.TypedArray;

public class VerticalViewPager$LayoutParams extends ViewGroup$LayoutParams	// class@000a75
{
    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;

    public void VerticalViewPager$LayoutParams(){
       super(-1, -1);
       this.c = 0;
    }
    public void VerticalViewPager$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, VerticalViewPager.h1);
       this.b = typedArray.getInteger(0, 48);
       typedArray.recycle();
    }
}
