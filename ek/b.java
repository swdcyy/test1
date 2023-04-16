package ek.b;
import android.content.Context;
import java.lang.Object;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import ek.a;
import java.lang.String;
import android.graphics.Typeface;
import o1.f;
import android.text.TextPaint;
import o1.f$a;
import ek.b$a;
import android.os.Handler;
import ek.c;

public class b	// class@001f53
{
    public final float a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final ColorStateList i;
    public final float j;
    public final float k;
    public final float l;
    public final int m;
    public boolean n;
    public Typeface o;

    public void b(Context p0,int p1){
       super();
       this.n = false;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.E5);
       this.a = typedArray.getDimension(false, 0);
       this.b = a.a(p0, typedArray, 3);
       this.c = a.a(p0, typedArray, 4);
       this.d = a.a(p0, typedArray, 5);
       this.e = typedArray.getInt(2, false);
       this.f = typedArray.getInt(1, 1);
       int i = a.c(typedArray, 12, 10);
       this.m = typedArray.getResourceId(i, false);
       this.g = typedArray.getString(i);
       this.h = typedArray.getBoolean(14, false);
       this.i = a.a(p0, typedArray, 6);
       this.j = typedArray.getFloat(7, 0);
       this.k = typedArray.getFloat(8, 0);
       this.l = typedArray.getFloat(9, 0);
       typedArray.recycle();
    }
    public void a(){
       if (this.o == null) {
          this.o = Typeface.create(this.g, this.e);
       }
       if (this.o == null) {
          b tf = this.f;
          if (tf != 1) {
             if (tf != 2) {
                this.o = (tf != 3)? Typeface.DEFAULT: Typeface.MONOSPACE;
             }else {
                this.o = Typeface.SERIF;
             }
          }else {
             this.o = Typeface.SANS_SERIF;
          }
          tf = this.o;
          if (tf != null) {
             this.o = Typeface.create(tf, this.e);
          }
       }
       return;
    }
    public Typeface b(Context p0){
       if (this.n != null) {
          return this.o;
       }
       try{
          if (!p0.isRestricted()) {
             Typeface typeface = f.d(p0, this.m);
             this.o = typeface;
             if (typeface != null) {
                this.o = Typeface.create(typeface, this.e);
             }
          }
       label_001f :
          this.a();
          this.n = true;
          return this.o;
       }catch(java.lang.UnsupportedOperationException e0){
       }catch(android.content.res.Resources$NotFoundException e0){
       }catch(java.lang.Exception e0){
       }
    }
    public void c(Context p0,TextPaint p1,f$a p2){
       if (this.n != null) {
          this.f(p1, this.o);
          return;
       }else {
          this.a();
          if (p0.isRestricted()) {
             this.n = true;
             this.f(p1, this.o);
             return;
          }else {
             try{
                f.f(p0, this.m, new b$a(this, p1, p2), null);
                return;
             }catch(java.lang.UnsupportedOperationException e0){
             }catch(android.content.res.Resources$NotFoundException e0){
             }catch(java.lang.Exception e0){
             }
          }
       }
    }
    public void d(Context p0,TextPaint p1,f$a p2){
       this.e(p0, p1, p2);
       b tb = this.b;
       int colorForStat = (tb != null)? tb.getColorForState(p1.drawableState, tb.getDefaultColor()): 0xff000000;
       p1.setColor(colorForStat);
       tb = this.l;
       b tj = this.j;
       b tk = this.k;
       b ti = this.i;
       int colorForStat1 = (ti != null)? ti.getColorForState(p1.drawableState, ti.getDefaultColor()): 0;
       p1.setShadowLayer(tb, tj, tk, colorForStat1);
       return;
    }
    public void e(Context p0,TextPaint p1,f$a p2){
       if (c.a()) {
          this.f(p1, this.b(p0));
       }else {
          this.c(p0, p1, p2);
          if (this.n == null) {
             this.f(p1, this.o);
          }
       }
       return;
    }
    public void f(TextPaint p0,Typeface p1){
       p0.setTypeface(p1);
       int i = (~ p1.getStyle()) & this.e;
       boolean b = (i & 0x01)? true: false;
       p0.setFakeBoldText(b);
       float f = (i & 0x02)? -0.25f: 0;
       p0.setTextSkewX(f);
       p0.setTextSize(this.a);
       return;
    }
}
