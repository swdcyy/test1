package com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.widget.SeekBar;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import cw9.c;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint$Style;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.kwai.library.widget.seekbar.KwaiSeekBar$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.graphics.Canvas;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import android.graphics.Rect;
import android.widget.AbsSeekBar;
import android.view.View;

public class KwaiSeekBar extends SeekBar	// class@0009f0
{
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public int g;
    public Paint h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public int o;
    public SeekBar$OnSeekBarChangeListener p;
    public Rect q;

    public void KwaiSeekBar(Context p0){
       super(p0, null, 0);
    }
    public void KwaiSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiSeekBar(Context p0,AttributeSet p1,int p2){
       KwaiSeekBar kwaiSeekBar = this;
       super(p0, p1, p2);
       kwaiSeekBar.g = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.f2);
       int i = 0;
       int color = typedArray.getColor(i, i);
       int color1 = typedArray.getColor(10, i);
       int color2 = typedArray.getColor(11, i);
       kwaiSeekBar.i = typedArray.getBoolean(3, i);
       kwaiSeekBar.j = typedArray.getBoolean(5, true);
       kwaiSeekBar.m = typedArray.getBoolean(15, i);
       int dimensionPix = typedArray.getDimensionPixelSize(13, i);
       int dimensionPix1 = typedArray.getDimensionPixelSize(12, c.a(p0.getResources(), R.dimen.arg_RES_7f071100));
       kwaiSeekBar.o = typedArray.getDimensionPixelSize(7, i);
       int i1 = 8;
       int dimensionPix2 = typedArray.getDimensionPixelSize(i1, i);
       int dimensionPix3 = typedArray.getDimensionPixelSize(9, i);
       int dimensionPix4 = typedArray.getDimensionPixelSize(6, i);
       float f = (float)typedArray.getDimensionPixelSize(13, i);
       if (kwaiSeekBar.i != null) {
          Paint paint = new Paint(true);
          kwaiSeekBar.h = paint;
          paint.setTextSize((float)dimensionPix);
          KwaiSeekBar h = kwaiSeekBar.h;
          if (!color2) {
             color2 = color1;
          }
          h.setColor(color2);
       }
       RectF rectF = new RectF(0, 0, 0, 0);
       float[] uofloatArray = new float[i1];
       uofloatArray[i] = f;
       uofloatArray[1] = f;
       uofloatArray[2] = f;
       uofloatArray[3] = f;
       uofloatArray[4] = f;
       uofloatArray[5] = f;
       uofloatArray[6] = f;
       uofloatArray[7] = f;
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, rectF, uofloatArray));
       shapeDrawabl.getPaint().setColor(color);
       shapeDrawabl.getPaint().setStyle(Paint$Style.FILL);
       RoundRectShape roundRectSha = new RoundRectShape(uofloatArray, rectF, uofloatArray);
       ShapeDrawable shapeDrawabl1 = new ShapeDrawable(roundRectSha);
       shapeDrawabl1.getPaint().setColor(color1);
       shapeDrawabl1.getPaint().setStyle(Paint$Style.FILL);
       ClipDrawable uClipDrawabl = new ClipDrawable(shapeDrawabl1, 3, true);
       Drawable[] uDrawableArr = new Drawable[]{shapeDrawabl,uClipDrawabl};
       LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
       layerDrawabl.setId(i, 0x1020000);
       layerDrawabl.setId(true, 0x102000d);
       kwaiSeekBar.setProgressDrawable(layerDrawabl);
       i = 16;
       try{
          uClipDrawabl = 0x7f082560;
          Drawable drawable = typedArray.getDrawable(i);
          kwaiSeekBar.b = drawable;
          if (drawable == null) {
             kwaiSeekBar.b = this.getResources().getDrawable(uClipDrawabl);
          }
       }catch(java.lang.Exception e0){
          e0.b = this.getResources().getDrawable(uClipDrawabl);
       }
       e0.e = typedArray.getDrawable(true);
       e0.f = typedArray.getDrawable(2);
       e0.setThumb(e0.b);
       i = e0.o + (e0.b.getIntrinsicWidth() / 2);
       if (e0.i != null) {
          dimensionPix3 = dimensionPix3 + (dimensionPix1 + dimensionPix);
       }
       e0.setPadding(i, dimensionPix3, (dimensionPix2 + (e0.b.getIntrinsicWidth() / 2)), dimensionPix4);
       typedArray.recycle();
       super.setOnSeekBarChangeListener(new KwaiSeekBar$a(e0));
       return;
    }
    public final void a(Canvas p0){
       if (this.e != null) {
          KwaiSeekBar tg = this.g;
          if (tg >= null && tg <= this.getMax()) {
             if (this.getProgress() > this.g) {
                tg = this.f;
                if (tg != null) {
                label_001e :
                   tg.setVisible(true, true);
                   int i = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
                   int i1 = this.e.getIntrinsicWidth() / 2;
                   int i2 = this.e.getIntrinsicHeight() / 2;
                   int i3 = this.getPaddingLeft() + i1;
                   tg.setBounds(((this.getPaddingLeft() - i1) + ((this.g * i) / this.getMax())), ((this.getPaddingTop() - i2) + (this.b.getIntrinsicWidth() / 2)), (i3 + ((i * this.g) / this.getMax())), ((this.getPaddingTop() + i2) + (this.b.getIntrinsicWidth() / 2)));
                   tg.draw(p0);
                }
             }
             tg = this.e;
             goto label_001e ;
          }
       }
       return;
    }
    public void b(Drawable p0,Drawable p1){
       this.c = p1;
       this.d = p0;
    }
    public int getDefaultIndicatorProgress(){
       return this.g;
    }
    public Paint getProgressTextPaint(){
       return this.h;
    }
    public synchronized void onDraw(Canvas p0){
       String str;
       if (this.i == null || (this.k == null && (this.l != null || this.m != null))) {
          this.l = false;
          if (TextUtils.x(this.n)) {
             int progress = (this.getMax() < 100 || this.j == null)? this.getProgress(): (this.getProgress() * 100) / this.getMax();
             str = String.valueOf(progress);
          }else {
             str = this.n;
          }
          p0.drawText(str, (((float)this.b.getBounds().left + (((float)this.b.getIntrinsicWidth() - this.h.measureText(str)) / 2.00f)) + (float)this.o), this.h.getTextSize(), this.h);
       }
       super.onDraw(p0);
       this.a(p0);
       return;
    }
    public void setDefaultIndicatorProgress(int p0){
       this.g = p0;
       this.invalidate();
    }
    public void setEnabled(boolean p0){
       KwaiSeekBar td;
       Drawable drawable;
       super.setEnabled(p0);
       if (p0) {
          td = this.d;
          if (td == null) {
             td = this.getResources().getDrawable(R.drawable.arg_RES_7f082560);
          }
          this.b = td;
       }else {
          td = this.c;
          if (td == null) {
             drawable = this.getResources().getDrawable(R.drawable.arg_RES_7f082561);
          }
          this.b = drawable;
       }
       this.setThumb(this.b);
       this.postInvalidate();
       return;
    }
    public void setOnSeekBarChangeListener(SeekBar$OnSeekBarChangeListener p0){
       this.p = p0;
    }
}
