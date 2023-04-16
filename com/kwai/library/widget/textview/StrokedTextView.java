package com.kwai.library.widget.textview.StrokedTextView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
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
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.graphics.Bitmap$Config;

public class StrokedTextView extends SizeAdjustableTextView	// class@000a5e
{
    public int q;
    public int r;
    public final Canvas s;
    public final Paint t;
    public Bitmap u;
    public boolean v;

    public void StrokedTextView(Context p0){
       super(p0, null, 0);
    }
    public void StrokedTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void StrokedTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.q = 0;
       this.r = 2;
       this.s = new Canvas();
       Paint paint = new Paint();
       this.t = paint;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.y5);
       this.q = typedArray.getColor(0, this.q);
       this.r = typedArray.getDimensionPixelSize(1, this.r);
       typedArray.recycle();
       this.v = true;
       paint.setAntiAlias(1);
       paint.setTypeface(this.getTypeface());
       paint.setStyle(Paint$Style.FILL_AND_STROKE);
    }
    public int getStrokeSize(){
       return this.r;
    }
    public void invalidate(){
       super.invalidate();
       this.v = true;
    }
    public void onDraw(Canvas p0){
       StrokedTextView strokedTextV = this;
       if (strokedTextV.u != null) {
          if (strokedTextV.v != null) {
             int measuredWidt = this.getMeasuredWidth();
             int measuredHeig = this.getMeasuredHeight();
             String str = this.getText().toString();
             Rect rect = new Rect();
             TextPaint paint = this.getPaint();
             int i = (int)paint.measureText(str) + (strokedTextV.r * 2);
             paint.getTextBounds("x", 0, 1, rect);
             strokedTextV.s.setBitmap(strokedTextV.u);
             strokedTextV.s.drawColor(0, PorterDuff$Mode.CLEAR);
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
                   oobject.draw(strokedTextV.s);
                }
                i1 = i1 + 1;
             }
             StrokedTextView r = strokedTextV.r;
             measuredHeig = ((measuredHeig + rect.height()) / 2) + r;
             strokedTextV.t.setStrokeWidth((float)r);
             strokedTextV.t.setColor(strokedTextV.q);
             strokedTextV.t.setTextSize(this.getTextSize());
             float f = (float)(((measuredWidt - this.getPaddingRight()) - i) - strokedTextV.r);
             float f1 = (float)measuredHeig;
             strokedTextV.s.drawText(str, f, f1, strokedTextV.t);
             strokedTextV.t.setStrokeWidth(0);
             strokedTextV.t.setColor(this.getTextColors().getColorForState(this.getDrawableState(), 0));
             strokedTextV.s.drawText(str, f, f1, strokedTextV.t);
             strokedTextV.v = false;
          }
          p0.drawBitmap(strokedTextV.u, 0, 0, strokedTextV.t);
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
          measuredWidt = measuredWidt + (this.r * 4);
       }
       p0 = this.getMeasuredHeight();
       if (p1 != 0x40000000) {
          p0 = p0 + (this.r * 4);
       }
       if (measuredWidt != this.getMeasuredWidth() || p0 != this.getMeasuredHeight()) {
          super.setMeasuredDimension(measuredWidt, p0);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && p1 > 0) {
          this.v = true;
          this.u = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
       }else {
          this.u = null;
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       super.onTextChanged(p0, p1, p2, p3);
       this.v = true;
    }
    public void setStrokeColor(int p0){
       this.q = p0;
    }
    public void setStrokeSize(int p0){
       this.r = p0;
    }
    public void setTextColor(int p0){
       super.setTextColor(p0);
       this.v = true;
    }
    public void setTypeface(Typeface p0){
       super.setTypeface(p0);
       StrokedTextView tt = this.t;
       if (tt != null) {
          tt.setTypeface(p0);
       }
       return;
    }
}
