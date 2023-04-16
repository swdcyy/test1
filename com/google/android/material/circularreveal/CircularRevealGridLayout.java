package com.google.android.material.circularreveal.CircularRevealGridLayout;
import com.google.android.material.circularreveal.c;
import android.widget.GridLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.b$a;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.c$e;

public class CircularRevealGridLayout extends GridLayout implements c	// class@00167a
{
    public final b b;

    public void CircularRevealGridLayout(Context p0){
       super(p0, null);
    }
    public void CircularRevealGridLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new b(this);
    }
    public void a(){
       this.b.b();
    }
    public void b(Canvas p0){
       super.draw(p0);
    }
    public void c(){
       this.b.a();
    }
    public void draw(Canvas p0){
       CircularRevealGridLayout tb = this.b;
       if (tb != null) {
          tb.c(p0);
       }else {
          super.draw(p0);
       }
       return;
    }
    public boolean f(){
       return super.isOpaque();
    }
    public Drawable getCircularRevealOverlayDrawable(){
       return this.b.e();
    }
    public int getCircularRevealScrimColor(){
       return this.b.f();
    }
    public c$e getRevealInfo(){
       return this.b.h();
    }
    public boolean isOpaque(){
       CircularRevealGridLayout tb = this.b;
       if (tb != null) {
          return tb.j();
       }
       return super.isOpaque();
    }
    public void setCircularRevealOverlayDrawable(Drawable p0){
       this.b.k(p0);
    }
    public void setCircularRevealScrimColor(int p0){
       this.b.l(p0);
    }
    public void setRevealInfo(c$e p0){
       this.b.m(p0);
    }
}
