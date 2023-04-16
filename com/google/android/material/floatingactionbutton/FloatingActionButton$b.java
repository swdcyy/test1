package com.google.android.material.floatingactionbutton.FloatingActionButton$b;
import gk.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Object;
import android.graphics.Rect;
import android.widget.ImageButton;
import android.graphics.drawable.Drawable;

public class FloatingActionButton$b implements b	// class@00168c
{
    public final FloatingActionButton a;

    public void FloatingActionButton$b(FloatingActionButton p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1,int p2,int p3){
       this.a.n.set(p0, p1, p2, p3);
       FloatingActionButton$b ta = this.a;
       FloatingActionButton k = ta.k;
       ta.setPadding((p0 + k), (p1 + k), (p2 + k), (p3 + k));
    }
    public boolean b(){
       return this.a.m;
    }
    public void e(Drawable p0){
       FloatingActionButton.d(this.a, p0);
    }
    public float getRadius(){
       return ((float)this.a.getSizeDimension() / 2.00f);
    }
}
