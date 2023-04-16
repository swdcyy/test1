package com.kwai.library.widget.textview.KwaiStrokeTextView;
import com.kwai.library.widget.textview.KwaiBaseTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.widget.TextView;
import android.graphics.Paint$Style;
import android.view.View;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.String;
import android.graphics.Rect;
import android.text.TextPaint;
import android.graphics.Bitmap;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.view.View$MeasureSpec;
import android.graphics.Bitmap$Config;

public class KwaiStrokeTextView extends KwaiBaseTextView	// class@000a54
{
    public int n;
    public int o;
    public final Canvas p;
    public final Paint q;
    public Bitmap r;
    public boolean s;

    public void KwaiStrokeTextView(Context p0){
       super(p0, null, 0);
    }
    public void KwaiStrokeTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiStrokeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = 0;
       this.o = 2;
       this.p = new Canvas();
       Paint paint = new Paint();
       this.q = paint;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.y5);
       this.n = typedArray.getColor(0, this.n);
       this.o = typedArray.getDimensionPixelSize(1, this.o);
       typedArray.recycle();
       this.s = true;
       paint.setAntiAlias(1);
       paint.setTypeface(this.getTypeface());
       paint.setStyle(Paint$Style.FILL_AND_STROKE);
    }
    public int getStrokeSize(){
       return this.o;
    }
    public void invalidate(){
       super.invalidate();
       this.s = true;
    }
    public void onDraw(Canvas p0){
       KwaiStrokeTextView kwaiStrokeTe = this;
       if (kwaiStrokeTe.r != null) {
          if (kwaiStrokeTe.s != null) {
             int measuredWidt = this.getMeasuredWidth();
             int measuredHeig = this.getMeasuredHeight();
             String str = this.getText().toString();
             Rect rect = new Rect();
             TextPaint paint = this.getPaint();
             int i = (int)paint.measureText(str) + (kwaiStrokeTe.o * 2);
             paint.getTextBounds("x", 0, 1, rect);
             kwaiStrokeTe.p.setBitmap(kwaiStrokeTe.r);
             kwaiStrokeTe.p.drawColor(0, PorterDuff$Mode.CLEAR);
             int paddingLeft = this.getPaddingLeft();
             int paddingTop = this.getPaddingTop();
             Drawable[] compoundDraw = this.getCompoundDrawables();
             int len = compoundDraw.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = compoundDraw[i1];
                if (oobject != null) {
                   int i2 = oobject.getIntrinsicWidth() + paddingLeft;
                   int i3 = oobject.getIntrinsicHeight() + paddingTop;
                   oobject.setBounds(paddingLeft, paddingTop, i2, i3);
                   oobject.draw(kwaiStrokeTe.p);
                }
                i1 = i1 + 1;
             }
             KwaiStrokeTextView o = kwaiStrokeTe.o;
             measuredHeig = ((measuredHeig + rect.height()) / 2) + o;
             kwaiStrokeTe.q.setStrokeWidth((float)o);
             kwaiStrokeTe.q.setColor(kwaiStrokeTe.n);
             kwaiStrokeTe.q.setTextSize(this.getTextSize());
             float f = (float)(((measuredWidt - this.getPaddingRight()) - i) - kwaiStrokeTe.o);
             float f1 = (float)measuredHeig;
             kwaiStrokeTe.p.drawText(str, f, f1, kwaiStrokeTe.q);
             kwaiStrokeTe.q.setStrokeWidth(0);
             kwaiStrokeTe.q.setColor(this.getTextColors().getColorForState(this.getDrawableState(), 0));
             kwaiStrokeTe.p.drawText(str, f, f1, kwaiStrokeTe.q);
             kwaiStrokeTe.s = false;
          }
          p0.drawBitmap(kwaiStrokeTe.r, 0, 0, kwaiStrokeTe.q);
       }else {
          super.onDraw(p0);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       p1 = View$MeasureSpec.getMode(p1);
       int measuredWidt = this.getMeasuredWidth();
       if (View$MeasureSpec.getMode(p0) != 0x40000000) {
          measuredWidt = measuredWidt + (this.o * 4);
       }
       p0 = this.getMeasuredHeight();
       if (p1 != 0x40000000) {
          p0 = p0 + (this.o * 4);
       }
       if (measuredWidt != this.getMeasuredWidth() || p0 != this.getMeasuredHeight()) {
          super.setMeasuredDimension(measuredWidt, p0);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && p1 > 0) {
          this.s = true;
          this.r = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
       }else {
          this.r = null;
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       super.onTextChanged(p0, p1, p2, p3);
       this.s = true;
    }
    public void setStrokeColor(int p0){
       this.n = p0;
    }
    public void setStrokeSize(int p0){
       this.o = p0;
    }
    public void setTextColor(int p0){
       super.setTextColor(p0);
       this.s = true;
    }
    public void setTypeface(Typeface p0){
       super.setTypeface(p0);
       KwaiStrokeTextView tq = this.q;
       if (tq != null) {
          tq.setTypeface(p0);
       }
       return;
    }
}
