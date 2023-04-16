package com.yxcorp.widget.selector.view.RoundedRelativeLayout$b;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$d;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout;
import java.lang.Object;
import android.graphics.Rect;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$b$a;
import android.widget.RelativeLayout;
import android.view.ViewOutlineProvider;
import android.graphics.Canvas;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$c;

public final class RoundedRelativeLayout$b implements RoundedRelativeLayout$d	// class@0009e8
{
    public final Rect a;
    public int b;
    public final ViewOutlineProvider c;
    public final RoundedRelativeLayout d;

    public void RoundedRelativeLayout$b(RoundedRelativeLayout p0){
       this.d = p0;
       super();
       this.a = new Rect();
       this.c = new RoundedRelativeLayout$b$a(this);
    }
    public void a(int p0,int p1){
       this.a.set(0, 0, p0, p1);
       this.f(this.b);
       this.d.setClipToOutline(true);
       this.d.setOutlineProvider(this.c);
    }
    public void b(Canvas p0,boolean p1){
    }
    public void c(Canvas p0,boolean p1){
    }
    public void d(float p0){
       this.d.invalidateOutline();
    }
    public void e(int p0){
       this.b = p0;
       this.f(p0);
       this.d.invalidateOutline();
    }
    public void f(int p0){
       RoundedRelativeLayout$b ta;
       if (p0 == RoundedRelativeLayout$c.c) {
          ta = this.a;
          ta.set(ta.left, ta.top, ta.right, (int)((float)ta.bottom + this.d.d));
       }else if(p0 == RoundedRelativeLayout$c.d){
          ta = this.a;
          ta.set(ta.left, (int)((float)ta.top - this.d.d), ta.right, ta.bottom);
       }else if(p0 == RoundedRelativeLayout$c.b){
          ta = this.a;
          ta.set(ta.left, ta.top, (int)((float)ta.right + this.d.d), ta.bottom);
       }else if(p0 == RoundedRelativeLayout$c.e){
          ta = this.a;
          ta.set((int)((float)ta.left - this.d.d), ta.top, ta.right, ta.bottom);
       }
       return;
    }
    public void init(){
       this.d.setClipToOutline(true);
       this.d.setOutlineProvider(this.c);
    }
}
