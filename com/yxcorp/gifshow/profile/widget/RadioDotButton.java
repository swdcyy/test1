package com.yxcorp.gifshow.profile.widget.RadioDotButton;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.text.Layout;
import android.graphics.drawable.Drawable;
import java.lang.Number;
import android.graphics.Matrix;
import java.lang.Integer;
import ekd.e0;
import android.view.View$MeasureSpec;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.widget.f;
import java.lang.Exception;
import v2c.e;
import java.lang.Throwable;
import java.util.HashMap;
import v2c.g;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Boolean;

public class RadioDotButton extends AppCompatTextView	// class@001601
{
    public Drawable f;
    public int g;
    public int h;
    public boolean i;
    public static final int j;

    public void RadioDotButton(Context p0){
       super(p0);
       this.p(p0, null);
    }
    public void RadioDotButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.p(p0, p1);
    }
    public void RadioDotButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p(p0, p1);
    }
    public void onDraw(Canvas p0){
       int i1;
       int i2;
       int i3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, RadioDotButton.class, "3")) {
          return;
       }
       super.onDraw(p0);
       Layout layout = this.getLayout();
       if (this.i != null && (layout != null && layout.getLineCount())) {
          RadioDotButton tf = this.f;
          if (tf != null) {
             int intrinsicHei = tf.getIntrinsicHeight();
             int intrinsicWid = this.f.getIntrinsicWidth();
             Object obj = PatchProxy.applyOneRefs(layout, this, RadioDotButton.class, "4");
             int i = 17;
             if (obj != patchProxyRe) {
                i1 = obj.intValue();
             }else {
                i3 = layout.getHeight();
                int i5 = layout.getLineBaseline(0) + layout.getLineDescent(0);
                i1 = (this.getGravity() != i)? i3 - (i5 / 2): (((this.getMeasuredHeight() / 2) + i3) - (i3 / 2)) - (i5 / 2);
             }
             RadioDotButton obj1 = PatchProxy.applyOneRefs(layout, this, RadioDotButton.class, "5");
             if (obj1 != patchProxyRe) {
                i2 = obj1.intValue();
             }else {
                i3 = this.getLineCount() - 1;
                int i4 = (int)layout.getLineRight(i3);
                i2 = (this.getGravity() != i)? i4: ((int)layout.getLineWidth(i3) / 2) + (this.getMeasuredWidth() / 2);
             }
             i2 = (i2 + this.getCompoundDrawablePadding()) + this.g;
             if ((i2 + intrinsicWid) > this.getMeasuredWidth()) {
                i2 = this.getMeasuredWidth() - intrinsicWid;
             }
             intrinsicHei = intrinsicHei / 2;
             obj1 = this.h;
             this.f.setBounds(i2, ((i1 - intrinsicHei) + obj1), (intrinsicWid + i2), ((i1 + intrinsicHei) + obj1));
             p0.setMatrix(null);
             this.f.draw(p0);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(RadioDotButton.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RadioDotButton.class, "1")) {
          return;
       }
       try{
          super.onMeasure(p0, p1);
       }catch(java.lang.Exception e0){
          if (e0.a) {
             throw e0;
          }
          this.setMeasuredDimension(View$MeasureSpec.getSize(p0), View$MeasureSpec.getSize(p1));
          if (this.getText() != null) {
             this.setText(this.getText().toString());
          }
          g.c(f.b, e0.getMessage(), e0, null);
       }
       return;
    }
    public final void p(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RadioDotButton.class, "2")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.v4);
       this.f = typedArray.getDrawable(0);
       this.g = typedArray.getDimensionPixelSize(1, 0);
       this.h = typedArray.getDimensionPixelSize(2, 0);
       typedArray.recycle();
       return;
    }
    public void setDotPaddingLeft(int p0){
       this.g = p0;
    }
    public void setDotPaddingTop(int p0){
       this.h = p0;
    }
    public void setDrawable(Drawable p0){
       this.f = p0;
    }
    public void setShowDot(boolean p0){
       if (PatchProxy.isSupport(RadioDotButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RadioDotButton.class, "6")) {
          return;
       }
       if (this.i != p0) {
          this.i = p0;
          this.invalidate();
       }
       return;
    }
}
