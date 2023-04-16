package com.lsjwzh.widget.text.SingleLineTextView;
import com.lsjwzh.widget.text.FastTextLayoutView;
import android.content.Context;
import android.util.AttributeSet;
import android.text.TextPaint;
import q38.c;
import java.lang.CharSequence;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.text.BoringLayout$Metrics;
import android.text.Layout;
import android.view.View$MeasureSpec;
import android.view.View;
import android.text.Layout$Alignment;
import android.text.BoringLayout;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;

public class SingleLineTextView extends FastTextLayoutView	// class@00147e
{
    public CharSequence d;
    public TextPaint e;
    public c f;

    public void SingleLineTextView(Context p0){
       super(p0, null);
    }
    public void SingleLineTextView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void SingleLineTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new TextPaint(1);
       c uoc = new c();
       this.f = uoc;
       uoc.d(p0, p1, p2, -1);
       this.setText(this.f.h);
       TextPaint paint = this.getPaint();
       paint.setColor(this.f.f.getDefaultColor());
       paint.setTextSize((float)this.f.g);
    }
    public int getEllipsize(){
       return this.f.e;
    }
    public int getGravity(){
       return this.f.b();
    }
    public int getMaxLines(){
       return this.f.d;
    }
    public int getMaxWidth(){
       return this.f.c;
    }
    public TextPaint getPaint(){
       return this.e;
    }
    public float getTextSize(){
       return this.e.getTextSize();
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
    }
    public void onMeasure(int p0,int p1){
       if (this.b == null && !TextUtils.isEmpty(this.d)) {
          BoringLayout$Metrics metrics = new BoringLayout$Metrics();
          metrics.width = (int)Layout.getDesiredWidth(this.d, this.e);
          SingleLineTextView tf = this.f;
          this.b = BoringLayout.make(this.d, this.e, View$MeasureSpec.getSize(p0), c.c(this, this.getGravity()), tf.b, (float)tf.a, metrics, true);
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void setEllipsize(int p0){
       SingleLineTextView tf = this.f;
       if (tf.e != p0) {
          tf.e = p0;
          this.setTextLayout(null);
       }
       return;
    }
    public void setGravity(int p0){
       if (this.f.e(p0)) {
          this.setTextLayout(null);
       }
       return;
    }
    public void setMaxLines(int p0){
       SingleLineTextView tf = this.f;
       if (tf.d != p0) {
          tf.d = p0;
          this.setTextLayout(null);
       }
       return;
    }
    public void setMaxWidth(int p0){
       SingleLineTextView tf = this.f;
       if (tf.c != p0) {
          tf.c = p0;
          this.setTextLayout(null);
       }
       return;
    }
    public void setText(CharSequence p0){
       this.d = p0;
    }
    public void setTextSize(float p0){
       this.e.setTextSize(TypedValue.applyDimension(2, p0, c.c(this.getResources())));
    }
}
