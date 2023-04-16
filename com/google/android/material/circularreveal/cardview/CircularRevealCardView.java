package com.google.android.material.circularreveal.cardview.CircularRevealCardView;
import com.google.android.material.circularreveal.c;
import androidx.cardview.widget.CardView;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.b$a;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.c$e;

public class CircularRevealCardView extends CardView implements c	// class@001687
{
    public final b k;

    public void CircularRevealCardView(Context p0){
       super(p0, null);
    }
    public void CircularRevealCardView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = new b(this);
    }
    public void a(){
       this.k.b();
    }
    public void b(Canvas p0){
       super.draw(p0);
    }
    public void c(){
       this.k.a();
    }
    public void draw(Canvas p0){
       CircularRevealCardView tk = this.k;
       if (tk != null) {
          tk.c(p0);
       }else {
          super.draw(p0);
       }
       return;
    }
    public boolean f(){
       return super.isOpaque();
    }
    public Drawable getCircularRevealOverlayDrawable(){
       return this.k.e();
    }
    public int getCircularRevealScrimColor(){
       return this.k.f();
    }
    public c$e getRevealInfo(){
       return this.k.h();
    }
    public boolean isOpaque(){
       CircularRevealCardView tk = this.k;
       if (tk != null) {
          return tk.j();
       }
       return super.isOpaque();
    }
    public void setCircularRevealOverlayDrawable(Drawable p0){
       this.k.k(p0);
    }
    public void setCircularRevealScrimColor(int p0){
       this.k.l(p0);
    }
    public void setRevealInfo(c$e p0){
       this.k.m(p0);
    }
}
