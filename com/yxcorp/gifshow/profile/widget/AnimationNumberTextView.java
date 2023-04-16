package com.yxcorp.gifshow.profile.widget.AnimationNumberTextView;
import android.widget.TextView;
import java.lang.String;
import android.content.Context;
import com.yxcorp.gifshow.profile.widget.AnimationNumberTextView$a;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Float;
import java.lang.Long;
import java.lang.CharSequence;
import java.lang.Runnable;
import android.view.View;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;

public class AnimationNumberTextView extends TextView	// class@0015eb
{
    public int b;
    public int[] c;
    public int[] d;
    public int[] e;
    public long f;
    public Paint g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int[] k;
    public float l;
    public int m;
    public int n;
    public final Runnable o;
    public static final String[] p;

    static {
       String[] stringArray = new String[]{"0","1","2","3","4","5","6","7","8","9"};
       AnimationNumberTextView.p = stringArray;
    }
    public void AnimationNumberTextView(Context p0){
       super(p0);
       this.b = 0;
       this.f = 1000;
       this.h = true;
       this.i = true;
       this.j = false;
       this.o = new AnimationNumberTextView$a(this);
    }
    public void AnimationNumberTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.f = 1000;
       this.h = true;
       this.i = true;
       this.j = false;
       this.o = new AnimationNumberTextView$a(this);
    }
    public void AnimationNumberTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.f = 1000;
       this.h = true;
       this.i = true;
       this.j = false;
       this.o = new AnimationNumberTextView$a(this);
    }
    public final void a(Canvas p0,String p1,float p2,float p3,Paint p4){
       if (PatchProxy.isSupport(AnimationNumberTextView.class)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, AnimationNumberTextView.class, "9")) {
             return;
          }
       }
       AnimationNumberTextView tn = this.n;
       if (p3 - (float)(- tn) >= 0 && p3 - (float)(tn * 2) <= 0) {
          p0.drawText(p1, p2, p3, p4);
       }
       return;
    }
    public final int b(int p0){
       if (!p0) {
          p0 = 10;
       }
       return p0;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, AnimationNumberTextView.class, "5")) {
          return;
       }
       int[] ointArray = new int[this.b];
       this.c = ointArray;
       for (int i = 0; i < this.b; i = i + 1) {
          int i1 = this.m * this.b(this.k[i]);
          long l = this.f / 20;
          i1 = i1 / (int)l;
          this.c[i] = i1;
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, AnimationNumberTextView.class, "3")) {
          return;
       }
       long l = 1000;
       if (!PatchProxy.isSupport(AnimationNumberTextView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, AnimationNumberTextView.class, "4")) {
          this.j = true;
          this.setAnimationDuration(l);
          String str = this.getText().toString();
          int i = str.length();
          this.b = i;
          int[] ointArray = new int[i];
          this.d = ointArray;
          int[] ointArray1 = new int[i];
          this.e = ointArray1;
          if (!PatchProxy.applyVoidOneRefs(str, this, AnimationNumberTextView.class, "6")) {
             ointArray1 = new int[this.b];
             this.k = ointArray1;
             l = Long.parseLong(str);
             int i1 = this.b - 1;
             while (l - null > 0 && i1 >= 0) {
                int i2 = i1 - 1;
                long l1 = 10;
                long l2 = l % l1;
                this.k[i1] = (int)l2;
                l = l / l1;
                i1 = i2;
             }
          }
          this.c();
          this.postDelayed(this.o, 17);
          this.i = true;
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, AnimationNumberTextView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       if (!PatchProxy.applyVoid(null, this, AnimationNumberTextView.class, "7")) {
          this.i = false;
          this.j = false;
          this.removeCallbacks(this.o);
       }
       return;
    }
    public void onDraw(Canvas p0){
       int measuredHeig;
       AnimationNumberTextView te;
       float f;
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimationNumberTextView.class, "1")) {
          return;
       }
       if (this.h != null) {
          this.h = false;
          super.onDraw(p0);
          TextPaint paint = this.getPaint();
          this.g = paint;
          Paint$FontMetricsInt fontMetricsI = paint.getFontMetricsInt();
          measuredHeig = this.getMeasuredHeight();
          this.n = measuredHeig;
          fontMetricsI = fontMetricsI.top;
          this.m = (((measuredHeig - fontMetricsI.bottom) + fontMetricsI) / 2) - fontMetricsI;
          float[] uofloatArray = new float[4];
          this.g.getTextWidths("9999", uofloatArray);
          this.l = uofloatArray[0];
          this.c();
          this.invalidate();
          return;
       }else if(this.j == null){
          super.onDraw(p0);
          return;
       }else if(PatchProxy.applyVoidOneRefs(p0, this, AnimationNumberTextView.class, "2")){
          int i = 0;
          while (i < this.b) {
             int i1 = this.b(this.k[i]);
             int i2 = 0;
             while (i2 <= i1) {
                int i3 = 1;
                if (i2 == i1) {
                   measuredHeig = i2 + 1;
                   AnimationNumberTextView tm = this.m;
                   measuredHeig = measuredHeig * tm;
                   measuredHeig = measuredHeig + this.d[i];
                   if (measuredHeig <= tm) {
                      this.c[i] = false;
                      te = this.e;
                      te[i] = i3;
                      if (!te.length) {
                         f = 0;
                      }else {
                         int len = te.length;
                         f = 0;
                         for (int i4 = 0; i4 < len; i4 = i4 + 1) {
                            f = f + te[i4];
                         }
                      }
                      measuredHeig = this.b * 2;
                      measuredHeig = measuredHeig - i3;
                      if (f == measuredHeig) {
                         this.removeCallbacks(this.o);
                         if (this.i != null) {
                            this.invalidate();
                         }
                         this.i = false;
                      }
                   }
                }
                te = this.e;
                float f1 = 0;
                if (!te[i]) {
                   measuredHeig = i2 % 10;
                   f2 = this.l * (float)i;
                   f1 = f1 + f2;
                   i3 = i2 + 1;
                   i3 = i3 * this.m;
                   i3 = i3 + this.d[i];
                   f = (float)i3;
                   this.a(p0, AnimationNumberTextView.p[measuredHeig], f1, f, this.g);
                }else if(te[i] == i3){
                   te[i] = 2;
                   f2 = this.l * (float)i;
                   f1 = f1 + f2;
                   this.a(p0, AnimationNumberTextView.p[this.k[i]], f1, (float)this.m, this.g);
                }
                i2 = i2 + 1;
             }
             i = i + 1;
          }
       }
       return;
    }
    public void setAnimationDuration(long p0){
       this.f = p0;
    }
    public void setEnableAnimation(boolean p0){
       this.j = p0;
    }
}
