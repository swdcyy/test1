package com.yxcorp.gifshow.widget.c;
import java.lang.Object;
import android.text.TextPaint;
import java.lang.CharSequence;
import android.graphics.Paint;
import java.lang.Math;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.text.Layout;

public class c	// class@001959
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;

    public void c(){
       super();
       this.a = 0xbf800000;
       this.b = 10.00f;
       this.c = 0x3f800000;
       this.d = 0;
       this.e = 0x3f800000;
    }
    public float a(TextPaint p0,int p1,CharSequence p2){
       float f1;
       if (p1 <= 0) {
          return p0.getTextSize();
       }
       TextPaint textPaint = new TextPaint(p0);
       c ta = this.a;
       if (ta <= 0) {
          f1 = textPaint.getTextSize();
       }
       float f = this.c(p2, textPaint, ta);
       while (f - (float)p1 > 0) {
          c tb = this.b;
          if (ta - tb > 0) {
             f1 = ta - this.e;
             f1 = Math.max(f1, tb);
             f = this.c(p2, textPaint, f1);
          }else {
             break ;
          }
       }
       return ta;
    }
    public final int b(CharSequence p0,TextPaint p1,int p2,float p3){
       p1.setTextSize(p3);
       StaticLayout staticLayout = new StaticLayout(p0, p1, p2, Layout$Alignment.ALIGN_NORMAL, this.c, this.d, true);
       return p3.getHeight();
    }
    public float c(CharSequence p0,TextPaint p1,float p2){
       p1.setTextSize(p2);
       return Layout.getDesiredWidth(p0, p1);
    }
    public c d(float p0){
       this.a = p0;
       return this;
    }
    public c e(float p0){
       this.b = p0;
       return this;
    }
    public c f(float p0){
       this.e = p0;
       return this;
    }
}
