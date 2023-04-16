package com.makeramen.roundedimageview.RoundedImageView;
import android.widget.ImageView;
import android.graphics.Shader$TileMode;
import android.widget.ImageView$ScaleType;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.ColorFilter;
import r38.a;
import android.graphics.Paint;
import java.util.HashSet;
import java.lang.Float;
import java.lang.Object;
import java.util.Iterator;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import android.graphics.drawable.LayerDrawable;
import java.lang.Math;
import android.view.View;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import com.makeramen.roundedimageview.RoundedImageView$a;

public class RoundedImageView extends ImageView	// class@001483
{
    public final float[] b;
    public Drawable c;
    public ColorStateList d;
    public float e;
    public ColorFilter f;
    public boolean g;
    public Drawable h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public ImageView$ScaleType m;
    public Shader$TileMode n;
    public Shader$TileMode o;
    public static final Shader$TileMode p;
    public static final ImageView$ScaleType[] q;
    public static final boolean r;

    static {
       RoundedImageView.p = Shader$TileMode.CLAMP;
       ImageView$ScaleType[] scaleTypeArr = new ImageView$ScaleType[]{ImageView$ScaleType.MATRIX,ImageView$ScaleType.FIT_XY,ImageView$ScaleType.FIT_START,ImageView$ScaleType.FIT_CENTER,ImageView$ScaleType.FIT_END,ImageView$ScaleType.CENTER,ImageView$ScaleType.CENTER_CROP,ImageView$ScaleType.CENTER_INSIDE};
       RoundedImageView.q = scaleTypeArr;
    }
    public void RoundedImageView(Context p0){
       super(p0);
       this.b = new float[4]{0,0,0,0};
       this.d = ColorStateList.valueOf(0xff000000);
       this.e = 0;
       this.f = null;
       this.g = false;
       this.i = false;
       this.j = false;
       this.k = false;
       this.m = ImageView$ScaleType.FIT_CENTER;
       Shader$TileMode p = RoundedImageView.p;
       this.n = p;
       this.o = p;
    }
    public void RoundedImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundedImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = 4;
       float[] uofloatArray = new float[i]{0,0,0,0};
       this.b = uofloatArray;
       this.d = ColorStateList.valueOf(0xff000000);
       this.e = 0;
       this.f = null;
       this.g = false;
       this.i = false;
       this.j = false;
       this.k = false;
       this.m = ImageView$ScaleType.FIT_CENTER;
       Shader$TileMode p = RoundedImageView.p;
       this.n = p;
       this.o = p;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.H4, p2, false);
       int i1 = -1;
       p2 = typedArray.getInt(false, i1);
       if (p2 >= 0) {
          this.setScaleType(RoundedImageView.q[p2]);
       }else {
          this.setScaleType(ImageView$ScaleType.FIT_CENTER);
       }
       float f = (float)typedArray.getDimensionPixelSize(3, i1);
       uofloatArray[0] = (float)typedArray.getDimensionPixelSize(6, i1);
       uofloatArray[1] = (float)typedArray.getDimensionPixelSize(7, i1);
       uofloatArray[2] = (float)typedArray.getDimensionPixelSize(5, i1);
       uofloatArray[3] = (float)typedArray.getDimensionPixelSize(i, i1);
       p2 = uofloatArray.length;
       i = 0;
       RoundedImageView roundedImage = null;
       while (i < p2) {
          RoundedImageView tb = this.b;
          if (tb[i] < 0) {
             tb[i] = 0;
          }else {
             roundedImage = 1;
          }
          i = i + 1;
       }
       if (!roundedImage) {
          if (f < 0) {
             f = 0;
          }
          p2 = this.b.length;
          for (i = 0; i < p2; i = i + 1) {
             this.b[i] = f;
          }
       }
       float f1 = (float)typedArray.getDimensionPixelSize(2, i1);
       this.e = f1;
       if (f1 < 0) {
          this.e = 0;
       }
       ColorStateList colorStateLi = typedArray.getColorStateList(1);
       this.d = colorStateLi;
       if (colorStateLi == null) {
          this.d = ColorStateList.valueOf(0xff000000);
       }
       this.k = typedArray.getBoolean(8, false);
       this.j = typedArray.getBoolean(9, false);
       i1 = typedArray.getInt(10, -2);
       if (i1 != -2) {
          this.setTileModeX(RoundedImageView.b(i1));
          this.setTileModeY(RoundedImageView.b(i1));
       }
       i1 = typedArray.getInt(11, -2);
       if (i1 != -2) {
          this.setTileModeX(RoundedImageView.b(i1));
       }
       i1 = typedArray.getInt(12, -2);
       if (i1 != -2) {
          this.setTileModeY(RoundedImageView.b(i1));
       }
       this.f();
       this.e(1);
       typedArray.recycle();
       return;
    }
    public static Shader$TileMode b(int p0){
       if (!p0) {
          return Shader$TileMode.CLAMP;
       }
       if (p0 == 1) {
          return Shader$TileMode.REPEAT;
       }
       if (p0 != 2) {
          return null;
       }
       return Shader$TileMode.MIRROR;
    }
    public final void a(){
       RoundedImageView th = this.h;
       if (th != null && this.g != null) {
          Drawable uDrawable = th.mutate();
          this.h = uDrawable;
          if (this.i != null) {
             uDrawable.setColorFilter(this.f);
          }
       }
       return;
    }
    public void c(float p0,float p1,float p2,float p3){
       RoundedImageView tb = this.b;
       if (!tb[0] - p0 && (!tb[1] - p1 && (!tb[2] - p3 && !tb[3] - p2))) {
          return;
       }
       tb[0] = p0;
       tb[1] = p1;
       tb[3] = p2;
       tb[2] = p3;
       this.f();
       this.e(0);
       this.invalidate();
       return;
    }
    public final void d(Drawable p0){
       int i4;
       if (p0 == null) {
          return;
       }
       int i = 0;
       if (p0 instanceof a) {
          RoundedImageView tm = this.m;
          if (tm == null) {
             tm = ImageView$ScaleType.FIT_CENTER;
          }
          if (p0.t != tm) {
             p0.t = tm;
             p0.d();
          }
          tm = this.e;
          p0.r = tm;
          p0.i.setStrokeWidth(tm);
          tm = this.d;
          if (tm == null) {
             ColorStateList uColorStateL = ColorStateList.valueOf(i);
          }
          p0.s = tm;
          p0.i.setColor(tm.getColorForState(p0.getState(), 0xff000000));
          p0.q = this.j;
          tm = this.n;
          if (p0.l != tm) {
             p0.l = tm;
             p0.n = true;
             p0.invalidateSelf();
          }
          tm = this.o;
          if (p0.m != tm) {
             p0.m = tm;
             p0.n = true;
             p0.invalidateSelf();
          }
          tm = this.b;
          if (tm != null) {
             boolean i1 = tm[i];
             int i2 = tm[1];
             int i3 = tm[2];
             i4 = tm[3];
             HashSet hashSet = new HashSet(4);
             hashSet.add(Float.valueOf(i1));
             hashSet.add(Float.valueOf(i2));
             hashSet.add(Float.valueOf(i3));
             hashSet.add(Float.valueOf(i4));
             hashSet.remove(Float.valueOf(0));
             if (hashSet.size() <= 1) {
                if (!hashSet.isEmpty()) {
                   float f = hashSet.iterator().next().floatValue();
                   if (!Float.isInfinite(f) && (!Float.isNaN(f) && f >= 0)) {
                      p0.o = f;
                   }else {
                      throw new IllegalArgumentException("Invalid radius value: "+f);
                   }
                }else {
                   p0.o = 0;
                }
                a p = p0.p;
                i1 = (i1 > 0)? true: false;
                p[i] = i1;
                i1 = (i2 > 0)? true: false;
                p[1] = i1;
                i1 = (i3 > 0)? true: false;
                p[2] = i1;
                if (i4 > 0) {
                   i = true;
                }
                p[3] = i;
             }else {
                throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
             }
          }
          this.a();
       }else if(p0 instanceof LayerDrawable){
          i4 = p0.getNumberOfLayers();
          for (; i < i4; i = i + 1) {
             this.d(p0.getDrawable(i));
          }
       }
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       this.invalidate();
    }
    public final void e(boolean p0){
       if (this.k != null) {
          if (p0) {
             this.c = a.b(this.c);
          }
          this.d(this.c);
       }
       return;
    }
    public final void f(){
       this.d(this.h);
    }
    public int getBorderColor(){
       return this.d.getDefaultColor();
    }
    public ColorStateList getBorderColors(){
       return this.d;
    }
    public float getBorderWidth(){
       return this.e;
    }
    public float getCornerRadius(){
       return this.getMaxCornerRadius();
    }
    public float getMaxCornerRadius(){
       RoundedImageView tb = this.b;
       int len = tb.length;
       float f = 0;
       for (int i = 0; i < len; i = i + 1) {
          f = Math.max(tb[i], f);
       }
       return f;
    }
    public ImageView$ScaleType getScaleType(){
       return this.m;
    }
    public Shader$TileMode getTileModeX(){
       return this.n;
    }
    public Shader$TileMode getTileModeY(){
       return this.o;
    }
    public void setBackground(Drawable p0){
       this.setBackgroundDrawable(p0);
    }
    public void setBackgroundDrawable(Drawable p0){
       this.c = p0;
       this.e(true);
       super.setBackgroundDrawable(this.c);
    }
    public void setBorderColor(int p0){
       this.setBorderColor(ColorStateList.valueOf(p0));
    }
    public void setBorderColor(ColorStateList p0){
       if (this.d.equals(p0)) {
          return;
       }
       if (p0 == null) {
          p0 = ColorStateList.valueOf(0xff000000);
       }
       this.d = p0;
       this.f();
       this.e(false);
       if (this.e > 0) {
          this.invalidate();
       }
       return;
    }
    public void setBorderWidth(float p0){
       if (!this.e - p0) {
          return;
       }
       this.e = p0;
       this.f();
       this.e(false);
       this.invalidate();
       return;
    }
    public void setBorderWidth(int p0){
       this.setBorderWidth(this.getResources().getDimension(p0));
    }
    public void setColorFilter(ColorFilter p0){
       if (this.f != p0) {
          this.f = p0;
          this.i = true;
          this.g = true;
          this.a();
          this.invalidate();
       }
       return;
    }
    public void setCornerRadius(float p0){
       this.c(p0, p0, p0, p0);
    }
    public void setCornerRadiusDimen(int p0){
       this.c(this.getResources().getDimension(p0), this.getResources().getDimension(p0), this.getResources().getDimension(p0), this.getResources().getDimension(p0));
    }
    public void setImageBitmap(Bitmap p0){
       this.l = 0;
       a uoa = (p0 != null)? new a(p0): null;
       this.h = uoa;
       this.f();
       super.setImageDrawable(this.h);
       return;
    }
    public void setImageDrawable(Drawable p0){
       this.l = 0;
       this.h = a.b(p0);
       this.f();
       super.setImageDrawable(this.h);
    }
    public void setImageResource(int p0){
       if (this.l != p0) {
          this.l = p0;
          Resources resources = this.getResources();
          Drawable uDrawable = null;
          if (resources != null) {
             RoundedImageView tl = this.l;
             if (tl != null) {
                try{
                   uDrawable = resources.getDrawable(tl);
                }catch(java.lang.Exception e0){
                   this.l = 0;
                }
             }
          }
          this.h = uDrawable;
          this.f();
          super.setImageDrawable(this.h);
       }
       return;
    }
    public void setImageURI(Uri p0){
       super.setImageURI(p0);
       this.setImageDrawable(this.getDrawable());
    }
    public void setOval(boolean p0){
       this.j = p0;
       this.f();
       this.e(false);
       this.invalidate();
    }
    public void setScaleType(ImageView$ScaleType p0){
       if (this.m != p0) {
          this.m = p0;
          switch (RoundedImageView$a.a[p0.ordinal()]){
              case 1:
              case 3:
              case 4:
              case 5:
              case 6:
              case 7:
              case 2:
                super.setScaleType(ImageView$ScaleType.FIT_XY);
                break;
              default:
                super.setScaleType(p0);
          }
          this.f();
          this.e(false);
          this.invalidate();
       }
       return;
    }
    public void setTileModeX(Shader$TileMode p0){
       if (this.n == p0) {
          return;
       }
       this.n = p0;
       this.f();
       this.e(false);
       this.invalidate();
       return;
    }
    public void setTileModeY(Shader$TileMode p0){
       if (this.o == p0) {
          return;
       }
       this.o = p0;
       this.f();
       this.e(false);
       this.invalidate();
       return;
    }
}
