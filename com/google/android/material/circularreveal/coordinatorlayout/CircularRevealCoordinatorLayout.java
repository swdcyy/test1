package com.google.android.material.circularreveal.coordinatorlayout.CircularRevealCoordinatorLayout;
import com.google.android.material.circularreveal.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.b$a;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.c$e;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c	// class@001688
{
    public final b z;

    public void CircularRevealCoordinatorLayout(Context p0){
       super(p0, null);
    }
    public void CircularRevealCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.z = new b(this);
    }
    public void a(){
       this.z.b();
    }
    public void b(Canvas p0){
       super.draw(p0);
    }
    public void c(){
       this.z.a();
    }
    public void draw(Canvas p0){
       CircularRevealCoordinatorLayout tz = this.z;
       if (tz != null) {
          tz.c(p0);
       }else {
          super.draw(p0);
       }
       return;
    }
    public boolean f(){
       return super.isOpaque();
    }
    public Drawable getCircularRevealOverlayDrawable(){
       return this.z.e();
    }
    public int getCircularRevealScrimColor(){
       return this.z.f();
    }
    public c$e getRevealInfo(){
       return this.z.h();
    }
    public boolean isOpaque(){
       CircularRevealCoordinatorLayout tz = this.z;
       if (tz != null) {
          return tz.j();
       }
       return super.isOpaque();
    }
    public void setCircularRevealOverlayDrawable(Drawable p0){
       this.z.k(p0);
    }
    public void setCircularRevealScrimColor(int p0){
       this.z.l(p0);
    }
    public void setRevealInfo(c$e p0){
       this.z.m(p0);
    }
}
