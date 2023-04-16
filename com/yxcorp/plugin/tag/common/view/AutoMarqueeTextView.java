package com.yxcorp.plugin.tag.common.view.AutoMarqueeTextView;
import androidx.appcompat.widget.AppCompatTextView;
import lnc.a1;
import android.content.Context;
import ekd.e0;
import com.yxcorp.utility.n;
import ekd.y0;
import android.os.Looper;
import rhd.a;
import java.lang.Runnable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.graphics.Paint;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.yxcorp.utility.TextUtils;
import rhd.b;

public class AutoMarqueeTextView extends AppCompatTextView	// class@000943
{
    public float f;
    public float g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public String l;
    public float m;
    public float n;
    public int o;
    public y0 p;
    public static final int q;

    static {
       AutoMarqueeTextView.q = a1.e(20.00f);
    }
    public void AutoMarqueeTextView(Context p0){
       super(p0);
       this.o = n.z(e0.b) - a1.e(210.00f);
       this.p = new y0(Looper.getMainLooper(), 16, new a(this));
       this.r(p0);
    }
    public void AutoMarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.o = n.z(e0.b) - a1.e(210.00f);
       this.p = new y0(Looper.getMainLooper(), 16, new a(this));
       this.r(p0);
    }
    public void AutoMarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = n.z(e0.b) - a1.e(210.00f);
       this.p = new y0(Looper.getMainLooper(), 16, new a(this));
       this.r(p0);
    }
    public static void p(AutoMarqueeTextView p0){
       float f = p0.n + p0.f;
       p0.n = f;
       float f1 = (float)AutoMarqueeTextView.q + p0.m;
       if (f - f1 > 0) {
          p0.n = f - f1;
       }
       p0.invalidate();
       return;
    }
    public static void q(AutoMarqueeTextView p0){
       if (p0.m - (float)p0.o < 0) {
          super.setText(p0.l);
          p0.h = false;
          p0.i = (int)((p0.m + (float)p0.j) + (float)p0.k);
       }else {
          int width = p0.getWidth();
          p0.i = width;
          AutoMarqueeTextView o = p0.o;
          if (width < o) {
             p0.i = o;
          }
          super.setText("");
          p0.h = true;
          p0.setGravity(19);
          p0.postInvalidate();
          if (!PatchProxy.applyVoid(null, p0, AutoMarqueeTextView.class, "6")) {
             AutoMarqueeTextView p = p0.p;
             if (p != null) {
                p.d();
             }
          }
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = p0.i;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AutoMarqueeTextView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       if (!PatchProxy.applyVoid(objArray, this, AutoMarqueeTextView.class, "7")) {
          AutoMarqueeTextView tp = this.p;
          if (tp != null) {
             tp.e();
          }
          if (this.n) {
             this.n = 0;
             this.invalidate();
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoMarqueeTextView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.h != null) {
          p0.drawText(this.l, (- this.n), this.g, this.getPaint());
          AutoMarqueeTextView tn = this.n;
          AutoMarqueeTextView tm = this.m;
          int q = AutoMarqueeTextView.q;
          if (((float)this.i + tn) - ((float)q + tm) > 0) {
             p0.drawText(this.l, ((tm + (float)q) - tn), this.g, this.getPaint());
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(AutoMarqueeTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AutoMarqueeTextView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.g = (float)(int)((float)(this.getHeight() / 2) - ((this.getPaint().descent() + this.getPaint().ascent()) / 2.00f));
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AutoMarqueeTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AutoMarqueeTextView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (View$MeasureSpec.getMode(p0) == Integer.MIN_VALUE) {
          this.setMeasuredDimension(this.o, p1);
       }
       return;
    }
    public final void r(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoMarqueeTextView.class, "1")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(new int[2]{0x10100d6,0x10100d8});
       this.j = typedArray.getDimensionPixelSize(0, 0);
       this.k = typedArray.getDimensionPixelSize(1, 0);
       this.f = ((c.c(p0.getResources()).density * 0x41f00000) * 16.00f) / 1000.00f;
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoMarqueeTextView.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.l = p0;
       this.m = this.getPaint().measureText(this.l);
       this.post(new b(this));
       return;
    }
}
