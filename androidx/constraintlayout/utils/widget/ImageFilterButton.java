package androidx.constraintlayout.utils.widget.ImageFilterButton;
import androidx.appcompat.widget.AppCompatImageButton;
import android.content.Context;
import androidx.constraintlayout.utils.widget.ImageFilterView$c;
import android.util.AttributeSet;
import android.widget.ImageButton;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import java.lang.Float;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.utils.widget.ImageFilterButton$b;
import android.view.ViewOutlineProvider;
import android.graphics.Path$Direction;
import androidx.constraintlayout.utils.widget.ImageFilterButton$a;
import java.lang.Math;

public class ImageFilterButton extends AppCompatImageButton	// class@0006a7
{
    public ImageFilterView$c d;
    public float e;
    public float f;
    public float g;
    public Path h;
    public ViewOutlineProvider i;
    public RectF j;
    public Drawable[] k;
    public LayerDrawable l;
    public boolean m;

    public void ImageFilterButton(Context p0){
       super(p0);
       this.d = new ImageFilterView$c();
       this.e = 0;
       this.f = 0;
       this.g = Float.NaN;
       this.m = true;
       this.a(p0, null);
    }
    public void ImageFilterButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new ImageFilterView$c();
       this.e = 0;
       this.f = 0;
       this.g = Float.NaN;
       this.m = true;
       this.a(p0, p1);
    }
    public void ImageFilterButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new ImageFilterView$c();
       this.e = 0;
       this.f = 0;
       this.g = Float.NaN;
       this.m = true;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       int i = 0;
       this.setPadding(i, i, i, i);
       if (p1 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.q1);
          int indexCount = typedArray.getIndexCount();
          Drawable drawable = typedArray.getDrawable(i);
          int i1 = 0;
          float f = 0.00f;
          while (i1 < indexCount) {
             int index = typedArray.getIndex(i1);
             if (index == 3) {
                this.e = typedArray.getFloat(index, 0);
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
                this.setOverlay(typedArray.getBoolean(index, this.m));
             }
             i1 = i1 + 1;
          }
          typedArray.recycle();
          if (drawable != null) {
             Drawable[] uDrawableArr = new Drawable[f];
             this.k = uDrawableArr;
             uDrawableArr[i] = this.getDrawable();
             i[1] = drawable;
             LayerDrawable layerDrawabl = new LayerDrawable(this.k);
             this.l = layerDrawabl;
             layerDrawabl.getDrawable(1).setAlpha((int)(this.e * 0x437f0000));
             super.setImageDrawable(this.l);
          }
       }
       return;
    }
    public void draw(Canvas p0){
       super.draw(p0);
    }
    public float getContrast(){
       return this.d.f;
    }
    public float getCrossfade(){
       return this.e;
    }
    public float getRound(){
       return this.g;
    }
    public float getRoundPercent(){
       return this.f;
    }
    public float getSaturation(){
       return this.d.e;
    }
    public float getWarmth(){
       return this.d.g;
    }
    public void setBrightness(float p0){
       ImageFilterButton td = this.d;
       td.d = p0;
       td.c(this);
    }
    public void setContrast(float p0){
       ImageFilterButton td = this.d;
       td.f = p0;
       td.c(this);
    }
    public void setCrossfade(float p0){
       this.e = p0;
       if (this.k != null) {
          float f = 0x437f0000;
          if (this.m == null) {
             this.l.getDrawable(0).setAlpha((int)((0x3f800000 - this.e) * f));
          }
          this.l.getDrawable(1).setAlpha((int)(this.e * f));
          super.setImageDrawable(this.l);
       }
       return;
    }
    public final void setOverlay(boolean p0){
       this.m = p0;
    }
    public void setRound(float p0){
       if (Float.isNaN(p0)) {
          this.g = p0;
          ImageFilterButton tf = this.f;
          this.f = 0xbf800000;
          this.setRoundPercent(tf);
          return;
       }else {
          boolean b = true;
          ImageFilterButton imageFilterB = null;
          int i = (this.g - p0)? 1: 0;
          this.g = p0;
          float f = 0;
          if (p0 - f) {
             if (this.h == null) {
                this.h = new Path();
             }
             if (this.j == null) {
                this.j = new RectF();
             }
             if (this.i == null) {
                ImageFilterButton$b uob = new ImageFilterButton$b(this);
                this.i = uob;
                this.setOutlineProvider(uob);
             }
             this.setClipToOutline(b);
             this.j.set(f, f, (float)this.getWidth(), (float)this.getHeight());
             this.h.reset();
             this.h.addRoundRect(this.j, this.g, this.g, Path$Direction.CW);
          }else {
             this.setClipToOutline(imageFilterB);
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
       int i1 = (this.f - p0)? 1: 0;
       this.f = p0;
       float f = 0;
       if (p0 - f) {
          if (this.h == null) {
             this.h = new Path();
          }
          if (this.j == null) {
             this.j = new RectF();
          }
          if (this.i == null) {
             ImageFilterButton$a uoa = new ImageFilterButton$a(this);
             this.i = uoa;
             this.setOutlineProvider(uoa);
          }
          this.setClipToOutline(b);
          int width = this.getWidth();
          b = this.getHeight();
          this.j.set(f, f, (float)width, (float)b);
          this.h.reset();
          this.h.addRoundRect(this.j, (((float)Math.min(width, b) * this.f) / 2.00f), (((float)Math.min(width, b) * this.f) / 2.00f), Path$Direction.CW);
       }else {
          this.setClipToOutline(i);
       }
       if (i1) {
          this.invalidateOutline();
       }
       return;
    }
    public void setSaturation(float p0){
       ImageFilterButton td = this.d;
       td.e = p0;
       td.c(this);
    }
    public void setWarmth(float p0){
       ImageFilterButton td = this.d;
       td.g = p0;
       td.c(this);
    }
}
