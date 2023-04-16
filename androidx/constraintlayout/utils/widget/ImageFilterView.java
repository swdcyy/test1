package androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import androidx.constraintlayout.utils.widget.ImageFilterView$c;
import android.util.AttributeSet;
import android.widget.ImageView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.Canvas;
import android.view.View;
import java.lang.Float;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.utils.widget.ImageFilterView$b;
import android.view.ViewOutlineProvider;
import android.graphics.Path$Direction;
import androidx.constraintlayout.utils.widget.ImageFilterView$a;
import java.lang.Math;

public class ImageFilterView extends AppCompatImageView	// class@0006ab
{
    public ImageFilterView$c d;
    public boolean e;
    public float f;
    public float g;
    public float h;
    public Path i;
    public ViewOutlineProvider j;
    public RectF k;
    public Drawable[] l;
    public LayerDrawable m;

    public void ImageFilterView(Context p0){
       super(p0);
       this.d = new ImageFilterView$c();
       this.e = true;
       this.f = 0;
       this.g = 0;
       this.h = Float.NaN;
       this.a(p0, null);
    }
    public void ImageFilterView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new ImageFilterView$c();
       this.e = true;
       this.f = 0;
       this.g = 0;
       this.h = Float.NaN;
       this.a(p0, p1);
    }
    public void ImageFilterView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new ImageFilterView$c();
       this.e = true;
       this.f = 0;
       this.g = 0;
       this.h = Float.NaN;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (p1 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.q1);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          Drawable drawable = typedArray.getDrawable(i);
          int i1 = 0;
          float f = 0.00f;
          while (i1 < indexCount) {
             int index = typedArray.getIndex(i1);
             if (index == 3) {
                this.f = typedArray.getFloat(index, 0);
             }else if(index == 8){
                this.setWarmth(typedArray.getFloat(index, 0));
             }else if(index == 7){
                this.setSaturation(typedArray.getFloat(index, 0));
             }else if(index == f){
                this.setContrast(typedArray.getFloat(index, 0));
             }else if(index == 0.00f){
                this.setRound(typedArray.getDimension(index, 0));
             }else if(index == 0.00f){
                this.setRoundPercent(typedArray.getFloat(index, 0));
             }else if(index == 4){
                this.setOverlay(typedArray.getBoolean(index, this.e));
             }
             i1 = i1 + 1;
          }
          typedArray.recycle();
          if (drawable != null) {
             Drawable[] uDrawableArr = new Drawable[f];
             this.l = uDrawableArr;
             uDrawableArr[i] = this.getDrawable();
             uDrawableArr[1] = drawable;
             LayerDrawable layerDrawabl = new LayerDrawable(this.l);
             this.m = layerDrawabl;
             layerDrawabl.getDrawable(1).setAlpha((int)(this.f * 0x437f0000));
             super.setImageDrawable(this.m);
          }
       }
       return;
    }
    public void draw(Canvas p0){
       super.draw(p0);
    }
    public float getBrightness(){
       return this.d.d;
    }
    public float getContrast(){
       return this.d.f;
    }
    public float getCrossfade(){
       return this.f;
    }
    public float getRound(){
       return this.h;
    }
    public float getRoundPercent(){
       return this.g;
    }
    public float getSaturation(){
       return this.d.e;
    }
    public float getWarmth(){
       return this.d.g;
    }
    public void setBrightness(float p0){
       ImageFilterView td = this.d;
       td.d = p0;
       td.c(this);
    }
    public void setContrast(float p0){
       ImageFilterView td = this.d;
       td.f = p0;
       td.c(this);
    }
    public void setCrossfade(float p0){
       this.f = p0;
       if (this.l != null) {
          float f = 0x437f0000;
          if (this.e == null) {
             this.m.getDrawable(0).setAlpha((int)((0x3f800000 - this.f) * f));
          }
          this.m.getDrawable(1).setAlpha((int)(this.f * f));
          super.setImageDrawable(this.m);
       }
       return;
    }
    public final void setOverlay(boolean p0){
       this.e = p0;
    }
    public void setRound(float p0){
       if (Float.isNaN(p0)) {
          this.h = p0;
          ImageFilterView tg = this.g;
          this.g = 0xbf800000;
          this.setRoundPercent(tg);
          return;
       }else {
          boolean b = true;
          ImageFilterView imageFilterV = null;
          int i = (this.h - p0)? 1: 0;
          this.h = p0;
          float f = 0;
          if (p0 - f) {
             if (this.i == null) {
                this.i = new Path();
             }
             if (this.k == null) {
                this.k = new RectF();
             }
             if (this.j == null) {
                ImageFilterView$b uob = new ImageFilterView$b(this);
                this.j = uob;
                this.setOutlineProvider(uob);
             }
             this.setClipToOutline(b);
             this.k.set(f, f, (float)this.getWidth(), (float)this.getHeight());
             this.i.reset();
             this.i.addRoundRect(this.k, this.h, this.h, Path$Direction.CW);
          }else {
             this.setClipToOutline(imageFilterV);
          }
          if (i) {
             this.invalidateOutline();
          }
          return;
       }
    }
    public void setRoundPercent(float p0){
       int b = true;
       int i = 0;
       int i1 = (this.g - p0)? 1: 0;
       this.g = p0;
       float f = 0;
       if (p0 - f) {
          if (this.i == null) {
             this.i = new Path();
          }
          if (this.k == null) {
             this.k = new RectF();
          }
          if (this.j == null) {
             ImageFilterView$a uoa = new ImageFilterView$a(this);
             this.j = uoa;
             this.setOutlineProvider(uoa);
          }
          this.setClipToOutline(b);
          int width = this.getWidth();
          b = this.getHeight();
          this.k.set(f, f, (float)width, (float)b);
          this.i.reset();
          this.i.addRoundRect(this.k, (((float)Math.min(width, b) * this.g) / 2.00f), (((float)Math.min(width, b) * this.g) / 2.00f), Path$Direction.CW);
       }else {
          this.setClipToOutline(i);
       }
       if (i1) {
          this.invalidateOutline();
       }
       return;
    }
    public void setSaturation(float p0){
       ImageFilterView td = this.d;
       td.e = p0;
       td.c(this);
    }
    public void setWarmth(float p0){
       ImageFilterView td = this.d;
       td.g = p0;
       td.c(this);
    }
}
