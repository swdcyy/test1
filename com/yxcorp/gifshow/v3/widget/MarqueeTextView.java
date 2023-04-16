package com.yxcorp.gifshow.v3.widget.MarqueeTextView;
import androidx.appcompat.widget.AppCompatTextView;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import ekd.y0;
import android.os.Looper;
import axc.l;
import java.lang.Runnable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;

public class MarqueeTextView extends AppCompatTextView	// class@001652
{
    public float f;
    public boolean g;
    public boolean h;
    public int i;
    public String j;
    public float k;
    public float l;
    public int m;
    public int n;
    public final y0 o;
    public static final int p;

    static {
       MarqueeTextView.p = n.c(a.a().a(), 20.00f);
    }
    public void MarqueeTextView(Context p0){
       super(p0);
       this.g = false;
       this.m = n.z(a.a().a()) - a1.e(210.00f);
       this.n = a1.e(50.00f);
       this.o = new y0(Looper.getMainLooper(), 16, new l(this));
       this.q(p0);
    }
    public void MarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = false;
       this.m = n.z(a.a().a()) - a1.e(210.00f);
       this.n = a1.e(50.00f);
       this.o = new y0(Looper.getMainLooper(), 16, new l(this));
       this.q(p0);
    }
    public void MarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = false;
       this.m = n.z(a.a().a()) - a1.e(210.00f);
       this.n = a1.e(50.00f);
       this.o = new y0(Looper.getMainLooper(), 16, new l(this));
       this.q(p0);
    }
    public static void p(MarqueeTextView p0){
       float f = p0.l + p0.f;
       p0.l = f;
       float f1 = (float)MarqueeTextView.p + p0.k;
       if (f - f1 > 0) {
          p0.l = f - f1;
       }
       p0.invalidate();
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, MarqueeTextView.class, "7")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.g != null) {
          this.r();
          this.g = false;
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, MarqueeTextView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       this.s();
       if (this.o.c()) {
          this.g = true;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarqueeTextView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (this.h != null) {
          float f = - this.l;
          while (f - (float)this.i < 0) {
             float f1 = - this.getPaint().getFontMetrics().ascent;
             p0.drawText(this.j, f, f1, this.getPaint());
             f1 = this.k + (float)MarqueeTextView.p;
             f = f + f1;
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MarqueeTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MarqueeTextView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (mode == Integer.MIN_VALUE && mode1 == Integer.MIN_VALUE) {
          this.setMeasuredDimension(this.m, this.n);
       }else if(mode == Integer.MIN_VALUE){
          this.setMeasuredDimension(this.m, p1);
       }else if(mode1 == Integer.MIN_VALUE){
          this.setMeasuredDimension(p0, this.n);
       }
       return;
    }
    public final void q(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarqueeTextView.class, "1")) {
          return;
       }
       this.f = ((c.c(p0.getResources()).density * 0x41f00000) * 16.00f) / 1000.00f;
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, MarqueeTextView.class, "5")) {
          return;
       }
       this.o.d();
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, MarqueeTextView.class, "6")) {
          return;
       }
       this.o.e();
       this.g = false;
       if (this.l) {
          this.l = 0;
          this.invalidate();
       }
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarqueeTextView.class, "4")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.s();
       this.j = p0;
       this.k = this.getPaint().measureText(this.j);
       ViewGroup$LayoutParams width = (this.getLayoutParams().width > null)? this.getLayoutParams().width: this.m;
       this.i = width;
       if (this.k - (float)width < 0) {
          this.h = false;
          super.setText(this.j);
          return;
       }else {
          this.h = true;
          this.setGravity(3);
          super.setText("");
          this.postInvalidate();
          this.r();
          return;
       }
    }
}
