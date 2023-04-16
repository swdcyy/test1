package com.kwai.library.widget.textview.CharactersFitMarqueeTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import lnc.a1;
import ekd.y0;
import android.os.Looper;
import h27.b;
import java.lang.Runnable;
import android.util.AttributeSet;
import android.widget.TextView;
import android.view.View;
import android.graphics.Canvas;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import java.lang.String;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View$MeasureSpec;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.ViewGroup$LayoutParams;

public class CharactersFitMarqueeTextView extends AppCompatTextView	// class@000a31
{
    public float f;
    public float g;
    public boolean h;
    public int i;
    public String j;
    public float k;
    public float l;
    public Rect m;
    public int n;
    public int o;
    public final y0 p;
    public static int q;

    public void CharactersFitMarqueeTextView(Context p0){
       super(p0);
       this.n = a1.e(50.00f);
       this.o = a1.e(50.00f);
       this.p = new y0(Looper.getMainLooper(), 16, new b(this));
       this.q(p0);
    }
    public void CharactersFitMarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.n = a1.e(50.00f);
       this.o = a1.e(50.00f);
       this.p = new y0(Looper.getMainLooper(), 16, new b(this));
       this.q(p0);
    }
    public void CharactersFitMarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = a1.e(50.00f);
       this.o = a1.e(50.00f);
       this.p = new y0(Looper.getMainLooper(), 16, new b(this));
       this.q(p0);
    }
    public static void p(CharactersFitMarqueeTextView p0){
       float f = p0.l + p0.f;
       p0.l = f;
       float f1 = (float)CharactersFitMarqueeTextView.q + p0.k;
       if (f - f1 > 0) {
          p0.l = f - f1;
       }
       p0.invalidate();
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.s();
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (!TextUtils.x(this.j)) {
          if (this.h != null) {
             float f = - this.l;
             while (f - (float)this.i < 0) {
                p0.drawText(this.j, f, this.g, this.getPaint());
                float f1 = this.k + (float)CharactersFitMarqueeTextView.q;
                f = f + f1;
             }
          }else {
             CharactersFitMarqueeTextView tj = this.j;
             this.getPaint().getTextBounds(tj, 0, tj.length(), this.m);
             p0.drawText(this.j, (float)((this.getMeasuredWidth() / 2) - (this.m.width() / 2)), this.g, this.getPaint());
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.g = (float)(int)((float)(this.getHeight() / 2) - ((this.getPaint().descent() + this.getPaint().ascent()) / 2.00f));
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       View$MeasureSpec.getSize(p0);
       View$MeasureSpec.getMode(p1);
       p0 = View$MeasureSpec.getSize(p1);
       if (View$MeasureSpec.getMode(p0) == Integer.MIN_VALUE) {
          this.setMeasuredDimension(this.n, p0);
       }
       return;
    }
    public final void q(Context p0){
       CharactersFitMarqueeTextView.q = n.c(p0.getApplicationContext(), 20.00f);
       this.f = ((c.c(p0.getResources()).density * 0x41f00000) * 16.00f) / 1000.00f;
       this.m = new Rect();
    }
    public void r(){
       if (this.h != null) {
          this.p.d();
       }
       return;
    }
    public final void s(){
       this.p.e();
       if (this.l) {
          this.l = 0;
          this.invalidate();
       }
       return;
    }
    public void setText(String p0){
       if (TextUtils.x(p0)) {
          return;
       }
       this.j = p0;
       this.k = this.getPaint().measureText(this.j);
       ViewGroup$LayoutParams width = (this.getLayoutParams().width > null)? this.getLayoutParams().width: this.n;
       this.i = width;
       this.h = (this.k - (float)width < 0)? false: true;
       this.setGravity(19);
       this.postInvalidate();
       return;
    }
    public void t(){
       if (this.h != null) {
          this.s();
       }
       return;
    }
}
